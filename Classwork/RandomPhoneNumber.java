import java.lang.Math;

public class RandomPhoneNumber{
    static String firstthree, numfour,numfive, numsix, lastthree;

    public static void main(String[] args) {
        firstthree = String.valueOf(getRand(0,8)) + String.valueOf(getRand(0,8)) + String.valueOf(getRand(0,8)); 
        numfour = String.valueOf(getRand(0,7));
        
        if (numfour.equals("7")){
            numfive = String.valueOf(getRand(0, 4));
            if (numfive.equals("4")){
                numsix = String.valueOf(getRand(0,2));
            }
        }

        numfive = String.valueOf(getRand(0,9));
        numsix = String.valueOf(getRand(0,9));
        lastthree = String.valueOf(getRand(0,9)) + String.valueOf(getRand(0,9)) + String.valueOf(getRand(0,9)); 
        System.out.println(firstthree + "-" + numfour + numfive + numsix + "-" + lastthree);

    }


    public static int getRand(int min,int max){
        int rand = (int)(Math.random() * (max - min + 1) + min); 
        return rand;
    }
}