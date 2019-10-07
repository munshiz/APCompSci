import java.util.Scanner;

public class FlipNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be flipped: ");
        int num = sc.nextInt();
        
        if (num < 1000){
            System.out.println("Calculated number is: " + calculate(num));
        }

        else{
            System.out.println("Cannot flip a number more than 1000!");
        }
    }

    public static int calculate(int num){
        int onesPlace = num % 10;
        int tensPlace = num % 100 - onesPlace;
        return (num - num % 100) + onesPlace * 10 + tensPlace / 10;
    }
}