import model.Cartoon;
import model.MovieCartoon;
import repository.CartoonRepository;

public class Main {
    public static void main(String[] args) {

        CartoonRepository repo = new CartoonRepository();

        Cartoon cartoon = new MovieCartoon(0, "Stranger Things", 9,  90);

        repo.create(cartoon);
        repo.getAll();
    }

}