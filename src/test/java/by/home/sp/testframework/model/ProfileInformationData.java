package by.home.sp.testframework.model;

public class ProfileInformationData {
    private final String name;
    private final String country;
    private final String town;

    public ProfileInformationData(String name, String country, String town) {
        this.name = name;
        this.country = country;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }
}
