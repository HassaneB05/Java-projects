/*
 * Class: CMSC203 21586
 * Instructor: Farnaz Eivazi
 * Description: The ManagementCompany class manages a collection of properties,
 *  allowing for operations such as adding, removing, and retrieving properties,
 *  while also calculating total rents and verifying management fees.
 * Due: 11/03/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Hassane Bagayoko
*/

public class ManagementCompany {
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    private String name;
    private String taxID;
    private double mgmFee;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    public ManagementCompany() {
        name = "";
        taxID = "";
        mgmFee = 0.0;
        plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
        numberOfProperties = 0;
    }

    public ManagementCompany(String name, String taxID, double mgmFee) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
        plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        properties = new Property[MAX_PROPERTY];
        numberOfProperties = 0;
    }

    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
        plot = new Plot(x, y, width, depth);
        properties = new Property[MAX_PROPERTY];
        numberOfProperties = 0;
    }

    public ManagementCompany(ManagementCompany otherCompany) {
        name = otherCompany.name;
        taxID = otherCompany.taxID;
        mgmFee = otherCompany.mgmFee;
        plot = new Plot(otherCompany.plot);
        properties = new Property[MAX_PROPERTY];
        numberOfProperties = otherCompany.numberOfProperties;
        for (int i = 0; i < otherCompany.numberOfProperties; i++) {
            properties[i] = otherCompany.properties[i]; // Use the same reference
        }
    }

    public int addProperty(String name, String city, double rent, String owner) {
        if (isPropertiesFull()) {
            return -1;
        }

        Property newProperty = new Property(name, city, rent, owner);

        if (newProperty == null) {
            return -2;
        }

        if (!plot.encompasses(newProperty.getPlot())) {
            return -3;
        }

        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(newProperty.getPlot())) {
                return -4;
            }
        }

        properties[numberOfProperties] = newProperty; // Store the same reference
        numberOfProperties++;

        return numberOfProperties - 1;
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        if (isPropertiesFull()) {
            return -1;
        }

        Property newProperty = new Property(name, city, rent, owner, x, y, width, depth);

        if (newProperty == null) {
            return -2;
        }

        if (!plot.encompasses(newProperty.getPlot())) {
            return -3;
        }

        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(newProperty.getPlot())) {
                return -4;
            }
        }

        properties[numberOfProperties] = newProperty; // Store the same reference
        numberOfProperties++;

        return numberOfProperties - 1;
    }

    public int addProperty(Property property) {
        if (isPropertiesFull()) {
            return -1;
        }

        if (property == null) {
            return -2;
        }

        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }

        for (int i = 0; i < numberOfProperties; i++) {
            if (properties[i].getPlot().overlaps(property.getPlot())) {
                return -4;
            }
        }

        properties[numberOfProperties] = property; // Store the same reference
        numberOfProperties++;

        return numberOfProperties - 1;
    }

    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;
            numberOfProperties--;
        }
    }

    public boolean isPropertiesFull() {
        return numberOfProperties >= MAX_PROPERTY;
    }

    public int getPropertiesCount() {
        return numberOfProperties;
    }

    public double getTotalRent() {
        double totalRent = 0.0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRentAmount();
        }
        return totalRent;
    }

    public Property getHighestRentPropperty() {
        if (numberOfProperties == 0) {
            return null;
        }

        Property highestRentProperty = properties[0];
        for (int i = 1; i < numberOfProperties; i++) {
            if (properties[i].getRentAmount() > highestRentProperty.getRentAmount()) {
                highestRentProperty = properties[i];
            }
        }
        return highestRentProperty;
    }

    public boolean isMangementFeeValid() {
        return mgmFee >= 0 && mgmFee <= 100;
    }

    public String getName() {
        return name;
    }

    public String getTaxID() {
        return taxID;
    }

    public Property[] getProperties() {
        return properties;
    }

    public double getMgmFeePer() {
        return mgmFee;
    }

    public Plot getPlot() {
        return plot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for ").append(name)
          .append(", taxID: ").append(taxID).append("\n")
          .append("______________________________________________________\n");

        for (int i = 0; i < numberOfProperties; i++) {
            sb.append(properties[i].toString()).append("\n");
        }

        sb.append("______________________________________________________\n");
        sb.append("Total management Fee: ").append(getTotalRent() * mgmFee / 100).append("\n");

        return sb.toString();
    }
}

