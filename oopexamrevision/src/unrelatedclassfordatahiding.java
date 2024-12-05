import datahiding.exampleclass2;
public class unrelatedclassfordatahiding {
    public static void main(String[] args){
        //attributes from an unrelated class are accessed by creating an object of the unrelated class
        exampleclass2 object1=new exampleclass2();
        System.out.println("Name:"+object1.name);
        //Only name can be accessed since it is public
    }
}
