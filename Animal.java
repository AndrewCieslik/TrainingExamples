abstract class Animal {
    private final String family;
    private final String environment;

    public Animal(String family, String environment) {
        this.family = family;
        this.environment = environment;
    }
    abstract void sound();
}
