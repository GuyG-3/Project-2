package project2;

public class Villa extends  Residential{
    private int levels=1;
    public Villa(String address, Double area, Double price, int parkingLots,int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public String toString() {
        return super.toString()+"Villa{" +
                "levels=" + levels +
                '}';
    }
    @Override
    public void taxIt() {
        System.out.println("Apartment Tax: " + (int)(getPrice() * 0.08) + "$");
    }
}
