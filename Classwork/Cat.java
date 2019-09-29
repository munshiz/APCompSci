public class Cat {
     private String name;
     private int Age;
    public Cat(String name, int Age){
        this.name = name;
        this.Age = Age;

    }
   
    public int convertToHumanAge(){
        if (Age == 1){
            return 15;
        }
        if (Age == 2){
            return 24;
        }
        else{
            return 24 + (4 * (Age - 2));
        }
    }
    public String getName(){
        return this.name;
    }
   
}