public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Bow wow");
    }

    // toString method
    public String toString() {
        return super.toString() + ", Breed: " + this.breed;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }
}