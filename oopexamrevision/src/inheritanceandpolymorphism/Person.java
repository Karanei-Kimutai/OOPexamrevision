package inheritanceandpolymorphism;

public class Person {
    //Attributes
    public String name;
    protected int phonenumber;
    private int IDnumber;

    //Constructor
    public Person(){}
    public Person(String name,int phonenumber,int IDnumber){
        this.name=name;
        this.phonenumber=phonenumber;
        this.IDnumber=IDnumber;
    }

    //Methods
    public void setName(String name){
        this.name=name;
    }
    public void setPhonenumber(int phonenumber){
        this.phonenumber=phonenumber;
    }
    public void setIDnumber(int IDnumber){
        this.IDnumber=IDnumber;
    }
    public String getName(){
        return name;
    }
    public int getPhonenumber(){
        return phonenumber;
    }
    public int getIDnumber(){
        return IDnumber;
    }

    //Other methods
    public void showdetails(){
        System.out.println("Name:"+getName());
        System.out.println("Phone number:"+getPhonenumber());
        System.out.println("ID number:"+getIDnumber());
    }
}
