public class Dog{
    private int Age;
    private String Name;

    public Dog(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public int convertToHumanAge(){
        return 13 + 7 * (Age - 1);
    }


}