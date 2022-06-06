public class Fish extends Animal{
    private int length;
    private String sound = "aaaHRRRRR";

    Fish(String family, String environment, int length) {
        super(family, environment);
        this.length = length;
    }

    public void sound() {
        System.out.println(sound);
    }
}
