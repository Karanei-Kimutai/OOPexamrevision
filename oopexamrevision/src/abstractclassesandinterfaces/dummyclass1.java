package abstractclassesandinterfaces;

public class dummyclass1 extends abstractclass{
    //Attributes
    private String shopname;

    //constructor
    public dummyclass1(String item_name,int quantity,float unit_price,String shopname){
        super(item_name,quantity,unit_price);
        this.shopname=shopname;
    }


    @Override
    public float computetotal(){
        float total=getQuantity()*getUnit_price();
        return total;
    }
    @Override
    public void showdetails(){
        super.showdetails();
        System.out.println("Total price:"+computetotal());
    }
}
