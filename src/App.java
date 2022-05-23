public class App {
    public static void main(String[] args) throws Exception {
    // Organism organism = new Organism(20, 30);
    // System.out.println(organism);
    // organism.move(-10, 5);
    // System.out.println(organism);
    // organism.move(50, 20);
    // System.out.println(organism);

    // Herd herd = new Herd();
    // herd.addToHerd(new Organism(57, 66));
    // herd.addToHerd(new Organism(73, 56));
    // herd.addToHerd(new Organism(46, 52));
    // herd.addToHerd(new Organism(19, 107));
    // System.out.println(herd);

    // Dog dog = new Dog();
    // dog.bark();
    // dog.eat();

    // Dog fido = new Dog("Fido");
    // fido.bark();

    // Cat cat = new Cat();
    // cat.purr();
    // cat.eat();

    // Cat garfield = new Cat("Garfield");
    // garfield.purr();

    NoiseCapable dog = new Dog();
    dog.makeNoise();

    NoiseCapable cat = new Cat("Garfield");
    cat.makeNoise();
    Cat c = (Cat) cat;
    c.purr();
    }

    
}
