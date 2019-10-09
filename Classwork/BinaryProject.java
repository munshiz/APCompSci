import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class BinaryProject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to convert Binary, Enter 2 to convert a Decimal, and Enter 3 to convert Hexadecimal: ");
        int mode = sc.nextInt();
        
        String convertedDecimal;
        String convertedHex;
        String convertedBinary;

        System.out.print("Enter your number: ");
        
        switch (mode){
            case 1:
                String binary = sc.next();
                convertedDecimal = convertToDecimal(binary);
                convertedHex = convertToHex(convertedDecimal);
                System.out.println("Decimal: " + convertedDecimal + " Hex: 0x" + convertedHex);
                break;
            case 2:
                String Decimal = sc.next();
                convertedHex = convertToHex(Decimal);
                convertedBinary = convertToBinary(convertedHex);
                System.out.println("Hex: 0x" + convertedHex + " Binary: 0b" + convertedBinary);
                break;
            case 3:
                String Hex = sc.next();
                convertedBinary = convertToBinary(Hex);
                convertedDecimal = convertToDecimal(convertedBinary);
                System.out.println("Binary: 0b" + convertedBinary + " Decimal: " + convertedDecimal);
                break;
            default:
                System.out.println("Invalid input!");
                break;
            
        }   
    }
    
    public static String convertToDecimal(String Binary){
        int Exponent = Binary.length();
        
        int currentValue = 0;
        for (char c : Binary.toCharArray()){
           Exponent--;
           currentValue += Integer.parseInt(Character.toString(c)) * Math.pow(2, Exponent);
       }
       return String.valueOf(currentValue);
    }

    public static String convertToHex(String Decimal){
        ArrayList<String> remainders = new ArrayList<String>();
        int Decimalbutnot = Integer.parseInt(Decimal);
        
        while (Decimalbutnot > 16){
            Decimalbutnot = Decimalbutnot  / 16;
            remainders.add(String.valueOf(Decimalbutnot % 16));
        }
        String finalp = "";
        for (String s : remainders){
            finalp = finalp + s;
        }
        return finalp;
    }

    public static String convertToBinary(String Hex){
        return Integer.toBinaryString(Integer.parseInt(Hex, 16));
    }
}