public class Fish extends Animal{
    String sound = "default";
    public Fish(String family, String environment) {
        super(family, environment);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }
}
