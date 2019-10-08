public class SwapNum{
    public static void main(String[] args) {
        int num = 315;
        System.out.println(Calculate(num));
    }
    public static double Calculate(int num){
        
        int ones = (num % 10);
        int tens = (num / 10);
        System.out.println(ones);
        System.out.println(tens);
        return (num - tens * 10 - ones) + ones * 10 + tens;
    }
    

}