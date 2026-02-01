import model.Cartoon;
import model.MovieCartoon;
import repository.CartoonRepository;
import service.CartoonService;

public class Main {
    public static void main(String[] args) {

        CartoonRepository repository = new CartoonRepository();
        CartoonService service = new CartoonService(repository);

        if (service.getAllCartoons().isEmpty()) {

            Cartoon cartoon1 = new MovieCartoon(
                    0,
                    "Stranger Things",
                    "Netflix",
                    90.0
            );

            Cartoon cartoon2 = new MovieCartoon(
                    0,
                    "Spider-Man",
                    "IDK",
                    117.0
            );

            service.createCartoon(cartoon1);
            service.createCartoon(cartoon2);
        }

        service.getAllCartoons()
                .forEach(System.out::println);
    }
}
