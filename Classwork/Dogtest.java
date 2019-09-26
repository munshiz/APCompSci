public class Dogtest{
    public static void main(String[] args) {
        Dog Rufus = new Dog("Rufus", 1);
        System.out.println(Rufus.convertToHumanAge());
        Cat cat = new Cat("Cat", 3);
        System.out.println(cat.convertToHumanAge());
    }
}