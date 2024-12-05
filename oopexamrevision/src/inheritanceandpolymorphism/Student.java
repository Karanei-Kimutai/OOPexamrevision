package inheritanceandpolymorphism;

public class Student extends Person{
    //Inheritance-inheritance allows a class(subclass) to inherit attributes and methods from an already existing class(superclass)
    //Attributes
    private String university;
    private int studentIDnumber;
    //constructor
    public Student(){}
    public Student(String name,int phonenumber,int IDnumber,String university,int studentIDnumber){
        super(name,phonenumber,IDnumber);
        this.university=university;
        this.studentIDnumber=studentIDnumber;
    }

    public void setUniversity(String university){
        this.university=university;
    }
    public void setStudentIDnumber(int studentIDnumber){
        this.studentIDnumber=studentIDnumber;
    }
    public int getStudentIDnumber(){
        return studentIDnumber;
    }
    public String getUniversity(){
        return university;
    }

    /*polymorphism- when a subclass modifies an inherited function
                    allows a single function to have different implementations
                    in different classes
    */
    @Override
    public void showdetails(){
        super.showdetails();
        System.out.println("University:"+getUniversity());
        System.out.println("StudentId:"+getStudentIDnumber());
    }
}
