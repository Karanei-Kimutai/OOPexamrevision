package abstractclassesandinterfaces;

public abstract class abstractclass {
    //An abstract class is a class that cannot be used to instantiate objects
    //Any class that contains an abstract method is an abstract class
    //Abstract methods are methods that don't have implementations(have no body)
    //Abstract classes are mostly used as parent classes to provide a common basic functionality to subclasses
    //A class can only inherit from one abstract class at a time
    //Abstract classes can have both abstract and concrete methods
    //Concrete methods are methods that have implementation
    //Concrete classes are classes that can be used to instantiate objects


    //Attributes
    private String item_name;
    private int quantity;
    private float unit_price;

    //Constructor
    public abstractclass(String item_name,int quantity,float unit_price){
        this.item_name=item_name;
        this.quantity=quantity;
        this.unit_price=unit_price;
    }


    //Methods
    public void setItem_name(String item_name){this.item_name=item_name;}
    public void setQuantity(int quantity){this.quantity=quantity;}
    public void setUnit_price(float unit_price){this.unit_price=unit_price;}

    public String getItem_name(){return item_name;}
    public int getQuantity(){return quantity;}
    public float getUnit_price(){return unit_price;}

    public abstract float computetotal();
    public void showdetails(){
        System.out.println("Item name:"+getItem_name());
        System.out.println("Quantity:"+getQuantity());
        System.out.println("Unit price:"+getUnit_price());
    }



}
