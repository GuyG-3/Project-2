package project2;

import java.util.ArrayList;

public class DataManager  {
    public static ArrayList<Property> properties() {//I copied from someone who used chatGPT with no shame
        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new Plot("Herzliya - Beachfront Avenue", 900000.0, 600.0, Plot.TYPE.URBAN));
        properties.add(new Plot("Arava - Desert Land", 130000.0, 1200.0, Plot.TYPE.AGRICULTURAL));

        // Adding 2 Residential Apartments
        properties.add(new Apartment("Jerusalem - King George Street 15", 2000000.0, 95.0, 3, 5));
        properties.add(new Apartment("Ashdod - Marina District 8", 1700000.0, 110.0, 2, 4));

        // Adding 2 Villas
        properties.add(new Villa("Zichron Yaakov - Wine Road 9", 5200000.0, 800.0, 4, 3));
        properties.add(new Villa("Ra'anana - Herzl Street 10", 4700000.0, 750.0, 3, 2));

        // Adding 2 Vacation Apartments
        properties.add(new Vacation("Dead Sea - Salt Shore 4", 1100000.0, 65.0, 1, 4));
        properties.add(new Vacation("Netanya - Cliff View 7", 1500000.0, 85.0, 2, 6));

        // Adding 2 Commercial Properties
        properties.add(new Commercial("Haifa - Matam High-Tech Park", 14000000.0, 2500.0, 6.0));
        properties.add(new Commercial("Be'er Sheva - Innovation District", 8000000.0, 1800.0, 4.0, true));

        // Adding 2 Offices
        properties.add(new Office("Kfar Saba - Green Business Park", 3200000.0, 170.0));
        properties.add(new Office("Eilat - Coral Business Hub", 2600000.0, 130.0));

        return properties;
    }
}
