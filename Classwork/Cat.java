public class Cat extends Dog{
    private int Age;
    public Cat(String name, int Age){
        super (name, Age);
        this.Age = Age;
    }
   // @Override
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
}