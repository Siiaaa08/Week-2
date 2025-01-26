package assistedProbems.animalhierarchy;

public class AnimalHierarchyMain {
    public static void main(String[]args){
        Animal animal = new Animal();
        System.out.println("Parent class:");
        animal.makeSound();

        System.out.println(".............");

        Dog dog = new Dog();
        System.out.println("Dog sound:");
        dog.makeSound();

        System.out.println(".............");

        Cat cat = new Cat();
        System.out.println("Cat sound:");
        cat.makeSound();

        System.out.println(".............");

        Bird bird = new Bird();
        System.out.println("Bird sound:");
        bird.makeSound();
    }

}
