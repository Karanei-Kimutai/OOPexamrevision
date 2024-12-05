package datahiding;

public class exampleclass2 extends exampleclass{
    //StudentID number is inherited but cannot be accessed
    @Override
    public void showdetails(){
        System.out.println("Name:"+name);
        System.out.println("University:"+university);

    }

}
