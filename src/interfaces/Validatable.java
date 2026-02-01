package interfaces;

public interface Validatable {

    void validate();

    default boolean isValidName(String name) {
        return name != null && !name.isBlank();
    }
    static boolean isPositive(int value) {
        return value > 0;
    }
}
