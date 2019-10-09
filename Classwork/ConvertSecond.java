import java.util.Scanner;
public class ConvertSecond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours, Minutes and Seconds in a format specifically like this: ");
        System.out.println("5 hours, 4 minutes, 32 seconds \n");
        String input = sc.nextLine();
        String[] responses = input.split(" ");
        int answer = Integer.parseInt(responses[0]) * 3600 + Integer.parseInt(responses[2]) * 60 + Integer.parseInt(responses[4]);
        System.out.println("In seconds: " + answer);
        }
}