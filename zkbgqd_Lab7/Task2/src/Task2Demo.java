public class Task2Demo {
    public static void main(String[] args)
    {
        //create new objects
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        //print the .say() functions
        System.out.println("Cat says:");
        System.out.println(cat.say());
        System.out.println(" ");
        System.out.println("Dog says:");
        System.out.println(dog.say());
        System.out.println(" ");
        System.out.println("Duck says:");
        System.out.println(duck.say());
    }
}