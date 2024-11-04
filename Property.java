/*
 * Class: CMSC203 21586
 * Instructor: Farnaz Eivazi
 * Description:The Property class represents an individual property with attributes such as name,
 * location, rent amount, and owner, along with methods to manage its details and dimensions.
 * Due: 11/03/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Hassane Bagayoko
*/

public class Property {
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;
    private Plot plot;

    public Property() {
        propertyName = "";
        city = "";
        rentAmount = 0.0;
        owner = "";
        plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property(Property otherProperty) {
        propertyName = otherProperty.propertyName;
        city = otherProperty.city;
        rentAmount = otherProperty.rentAmount;
        owner = otherProperty.owner;
        plot = new Plot(otherProperty.plot);
    }

    public Plot getPlot() {
        return plot;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getCity() {
        return city;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}
