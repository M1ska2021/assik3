import model.Cartoon;
import model.MovieCartoon;
import service.CartoonService;

public class Main {
    public static void main(String[] args) {

        CartoonService service = new CartoonService();

        Cartoon cartoon = new MovieCartoon(
                0,
                "Stranger Things",
                "Netflix",
                90.0
        );

        service.createCartoon(cartoon);

        service.getAllCartoons()
                .forEach(System.out::println);
    }
}
