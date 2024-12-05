package Classesandobjects;

public class Mainforobject {
    /*Object- an object is an instance of a class
              it has specific characteristics(initialized attributes)
              it is considered a complex variable
    */
    public static void main(String[] args){
        //Creating objects
        classes object1=new classes("Karanei");
        classes object2=new classes("Kimutai",0717266635,'M',300000);

        //Using set methods
        object1.setNumber(0717266635);
        object1.setSalary(300000);
        object1.setSex('M');


        //Using other methods
        /*Abstraction-hiding the unnecessary parts/implementation details of code and providing a simple interface for users
        Abstraction in object-oriented programming is the process of hiding the implementation details of a system and exposing only the essential features.
        It allows you to focus on what an object does, rather than how it does it.
        */
        object1.showdetails();
        object2.showdetails();





    }
}
