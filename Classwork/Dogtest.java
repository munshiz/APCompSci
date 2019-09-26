import java.util.Scanner;


public class Dogtest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dog Name? ");
        String dogName = sc.next();
        System.out.print("Dog Age? ");
        int dogAge = sc.nextInt();
        Dog Rufus = new Dog(dogName, dogAge);
        
        System.out.println("Dog " + Rufus.getName() +  " is " + Rufus.convertToHumanAge() + " in human years.");
        
        System.out.print("Cat Name? ");
        String catName = sc.next();
        System.out.print("Cat Age? ");
        int catAge = sc.nextInt();
        Cat Potato = new Cat(catName, catAge);
        
        System.out.println("Dog " + Potato.getName() +  " is " + Potato.convertToHumanAge() + "i n human years.");
    }
}