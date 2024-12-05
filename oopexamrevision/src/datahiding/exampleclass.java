package datahiding;
/*Data hiding-a mechanism that limits or allows the visibility of attributes and methods in other classes using access modifiers
             -there are three types of access modifiers:public,private and protected
             -public attributes and methods can be accessed in any class
             -private attributes and methods can only be accessed in the current class
             -protected attributes and attributes can only be accessed in the current class , its subclasses and in the same package
*/

public class exampleclass {
    //Attributes
    public String name="Karanei";
    protected String university="Strathmore";
    private int StudentIDnumber= 183523;

    public void showdetails(){
        System.out.println("Name:"+name);
        System.out.println("University:"+university);
        System.out.println("ID:"+StudentIDnumber);
    }

}


/*How data hiding affects inheritance and polymorphism
  Data hiding does not stop inheritance but it affects the accessibility of inherited attributes
  In terms of polymorphism- private functions cannot be overriden in a different class, they can only be modified in the current class
                            protected functions can only be overriden in subclasses or in the same package
                            public functions can be overriden in any class
*/




