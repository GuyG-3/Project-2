package project2;

public class Vacation extends Residential{
    private int guests=1;

    public Vacation(String address, Double area, Double price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return super.toString()+"Vacation{" +
                "guests=" + guests +
                '}';
    }
    @Override
    public void taxIt() {
        System.out.println("Apartment Tax: " + (int)(getPrice() * 0.25) + "$");
    }
}
