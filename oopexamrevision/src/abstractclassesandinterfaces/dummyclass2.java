package abstractclassesandinterfaces;

public class dummyclass2 implements interfaces{
    //Attributes
    private int Salary;

    //Constructor
    public dummyclass2(int Salary){
        this.Salary=Salary;
    }





    @Override
    public double compute(){
        double result=Salary*salaryconstant;
        return result;
    }
    public void shownetsalary(){
        System.out.println("Net salary:"+compute());
    }
}
