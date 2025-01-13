package project2;

public class Commercial extends Property {
    private boolean storeroom=false;
    private double yield=0.0;

    public Commercial(String address, Double area, Double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }
    public Commercial(String address, Double area, Double price, double yield,boolean storeroom) {
        super(address, area, price);
        setYield(yield);
        setStoreroom(storeroom);
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }
    public double expectedMonthlyYield() {
        return getYield()/100*getPrice()/12;
    }
    @Override
    public String toString() {
        return super.toString()+"Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield +
                ",expected monthly yield="+expectedMonthlyYield()+
                '}';
    }
    public void taxIt() {
        System.out.println("Apartment Tax: " + (int)(getPrice() * 0.05) + "$");
    }
}
