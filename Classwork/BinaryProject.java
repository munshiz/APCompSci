import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class BinaryProject{
    final static ArrayList<String> HEXCODE = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"));
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String convertedDecimal, convertedHex, convertedBinary;

        System.out.print("Enter 1 to convert Binary, Enter 2 to convert a Decimal, and Enter 3 to convert Hexadecimal: ");
        int mode = sc.nextInt();
        System.out.print("Enter your number: ");
        
        switch (mode){
            case 1:
                String binary = sc.next();
                convertedDecimal = BaseToDecimal(binary, 2);;
                convertedHex = DecimalToBase(convertedDecimal, 16);;
                System.out.println("Decimal: " + convertedDecimal + " Hex: 0x" + convertedHex);
                break;
            case 2:
                String Decimal = sc.next();
                convertedHex = DecimalToBase(Decimal, 16);
                convertedBinary = DecimalToBase(Decimal, 2);
                System.out.println("Hex: 0x" + convertedHex + " Binary: 0b" + convertedBinary);
                break;
            case 3:
                String Hex = sc.next();
                convertedDecimal = BaseToDecimal(Hex, 16);
                convertedBinary = DecimalToBase(convertedDecimal, 2);
                System.out.println("Binary: 0b" + convertedBinary + " Decimal: " + convertedDecimal);
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }   
        sc.close();
    }
    
    public static String BaseToDecimal(String toConvert, int base){
        int Exponent = toConvert.length();
        int currentValue = 0;
        
        for (String c : toConvert.split("")){
           Exponent--;
           currentValue += (HEXCODE.indexOf(c)) * Math.pow(base, Exponent);
        }
        
        return String.valueOf(currentValue);
    }

    public static String DecimalToBase(String toConvert, int base){
        ArrayList<String> remainders = new ArrayList<String>();
        int Quotient = Integer.parseInt(toConvert);
        String finalp = "";

        while (Quotient >= base){
            remainders.add(String.valueOf(Quotient % base));
            Quotient = Quotient  / base;
        }
        
        remainders.add(String.valueOf(Quotient));
        
        for (String s : remainders){
            finalp = HEXCODE.get(Integer.parseInt(s)) + finalp;
        }
        
        return finalp;
    }
}