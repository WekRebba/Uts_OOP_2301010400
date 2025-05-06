class Animal {
    private String name;
    private int age;

    // Constructor default
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor overloading
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {
    private String breed;

    // Constructor default
    public Dog() {
        super();
        this.breed = "Unknown";
    }

    // Constructor overloading
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public String getBreed() {
        return breed;
    }
}

public class Main {
    public static void main(String[] args) {
        // Array untuk menyimpan objek Dog
        Dog[] dogList = new Dog[3];

        // Inisialisasi objek
        dogList[0] = new Dog("Buddy", 3, "Golden Retriever");
        dogList[1] = new Dog("Max", 2, "Beagle");
        dogList[2] = new Dog("Charlie", 5, "Bulldog");

        // Menampilkan data dan suara
        for (Dog dog : dogList) {
            System.out.println("Nama: " + dog.getName());
            System.out.println("Umur: " + dog.getAge() + " tahun");
            System.out.println("Ras: " + dog.getBreed());
            dog.makeSound();
            System.out.println("----------------------");
        }
    }
}
