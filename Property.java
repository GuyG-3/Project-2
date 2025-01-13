package project2;

public abstract class Property {
    private String address = "Na";
    private Double area = 0.0;
    private Double price = 0.0;

    public Property(String address,Double area,Double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }

    public abstract void taxIt();
}
