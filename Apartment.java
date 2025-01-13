package project2;

public class Apartment extends Residential{
    private int rooms=1;
    public Apartment(String address, Double area, Double price, int parkingLots,int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return super.toString()+"Apartment{" +
                "rooms=" + rooms +
                '}';
    }
    @Override
    public void taxIt() {
        System.out.println("Apartment Tax: " + (int)(getPrice() * 0.08) + "$");
    }
}
