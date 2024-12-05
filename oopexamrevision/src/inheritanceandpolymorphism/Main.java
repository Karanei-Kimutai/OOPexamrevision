package inheritanceandpolymorphism;

public class Main {
    public static void main(String[] args){
        Person objectofperson= new Person("Bing Chilling",0717266635,11111111);
        objectofperson.showdetails();
        Student objectofstudent=new Student("Karanei",0717266635,11111111,"Strathmore",183523);
        objectofstudent.showdetails();
    }
}
