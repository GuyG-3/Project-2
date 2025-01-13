package project2;

public class Plot extends Property{

    public enum TYPE {URBAN, AGRICULTURAL, INDUSTRIAL}
    private TYPE type;

    public Plot(String address, Double area, Double price,TYPE type) {
        super(address, area, price);
        setType(type);
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString()+"Plot{" +
                "type=" + type +
                '}';
    }
    @Override
    public void taxIt() {
        if(type == TYPE.URBAN)
            System.out.println("URBAN Tax: " + (int)(getPrice() * 0.1) + "$");
        else if (type == TYPE.AGRICULTURAL) {
            System.out.println("AGRICULTURAL Tax: " + (int)(getPrice() * 0.02) + "$");
        } else if (type == TYPE.INDUSTRIAL) {
            System.out.println("INDUSTRIAL Tax: " + (int)(getPrice() * 0.05) + "$");
        }
    }
}
