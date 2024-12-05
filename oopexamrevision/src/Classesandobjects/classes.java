package Classesandobjects;

public class classes {
    /*Class-a class is a blueprint used to create objects.
            it consists of general characteristics(non initialized variables)
            It is considered a user defined data type as it determines the characteristics of the objects created from it)
     */

    private String name;
    private int number;
    private char sex;
    private int salary;

    /*Constructor- a special method used to initialize attributes when creating objects
                   it can be used to initialize more than one attribute at a time
                   it has no return type
                   it is used when creating objects*/
    public classes(String name,int number,char sex,int salary){
        this.name=name;
        this.number=number;
        this.sex=sex;
        this.salary=salary;
    }
    //Constructor overloading
    public classes(String name){
        this.name=name;
    }

    /*Set methods-functions used to initialize/modify the value of an attribute
                  can only be used to initialize/modify one attribute at a time
                  they have a void return type
      Get methods-functions used to retrieve the value stored by an attribute
                  have a return type similar to the data type of the value they are retrieving
                  have no parameters
    */
    /*Encapsulation- hiding the internal details of a class and providing access to them through methods
                   - this is done by declaring attributes as private and accessing them using public methods
                     eg using public getter and setter methods
                   - this limits access to attributes
    */
    public void setName(String name){
        this.name=name;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void setSex(char sex){
        this.sex=sex;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public int getSalary(){
        return salary;
    }
    public char getSex(){
        return sex;
    }


    //Other methods
    public void showdetails(){
        System.out.println("Name:"+getName());
        System.out.println("Number:"+getNumber());
        System.out.println("Sex:"+getSex());
        System.out.println("Salary:"+getSalary());
    }

}
