package project2;

public abstract class Residential extends Property {

    private int parkingLot=0;
    public Residential(String address, Double area, Double price,int parkingLots) {
        super(address, area, price);
        setParkingLot(parkingLots);
    }

    public int getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(int parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public String toString() {
        return super.toString()+"Residential{" +
                "parkingLot=" + parkingLot +
                '}';
    }
}
