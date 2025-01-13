package project2;

public class Office extends Property{
    public Office(String address, Double area, Double price) {
        super(address, area, price);
    }

    @Override
    public String toString() {
        return "Office{"+super.toString()+"}";
    }
    @Override
    public void taxIt() {
        System.out.println("Apartment Tax: " + (int)(getPrice() * 0.05) + "$");
    }
}
