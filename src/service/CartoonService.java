package service;

import model.Cartoon;
import repository.interfaces.CrudRepository;
import exception.*;

import java.util.List;

public class CartoonService {

    private final CrudRepository<Cartoon> repository;

    public CartoonService(CrudRepository<Cartoon> repository) {
        this.repository = repository;
    }

    public void createCartoon(Cartoon cartoon) {

        if (cartoon.getName() == null || cartoon.getName().isEmpty()) {
            throw new InvalidInputException("Cartoon name cannot be empty");
        }

        if (cartoon.getEpisodes() <= 0) {
            throw new InvalidInputException("Episodes must be more than 0");
        }

        repository.create(cartoon);
    }

    public List<Cartoon> getAllCartoons() {
        return repository.getAll();
    }

    public Cartoon getById(int id) {
        Cartoon cartoon = repository.findById(id);

        if (cartoon == null) {
            throw new ResourceNotFoundException(
                    "Cartoon with id " + id + " not found"
            );
        }
        return cartoon;
    }

    public void updateCartoon(int id, Cartoon cartoon) {
        getById(id); // validation
        repository.update(id, cartoon);
    }

    public void deleteCartoon(int id) {
        getById(id); // validation
        repository.delete(id);
    }
}
