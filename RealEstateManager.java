package project2;

import java.util.ArrayList;

public class RealEstateManager
{
    public static class PriceException extends Exception{//price exception if price is negative
        public PriceException(String message){
            super(message);
        }
    }
    private String name;
    private ArrayList<Property> properties;

    public RealEstateManager(String name) {
        setName(name);
        this.properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return this.properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
    public void addProperty(Property property){
        this.properties.add(property);
    }
    public ArrayList<Property> arrayOfPropertiesPriceSmaller(int price) throws PriceException{
        if(price < 0.0)
            throw new PriceException("Illegal price-enter positive number for a legal price");
        ArrayList<Property> P=new ArrayList<>();
        for(Property p:properties)
        {
            if(p.getPrice()<price)
            {
                P.add(p);
            }
        }
        return P;
    }
    public int SumPrices(){
        int sum=0;
        for(Property p:properties)
        {
            sum+=p.getPrice();
        }
        return sum;
    }
}
