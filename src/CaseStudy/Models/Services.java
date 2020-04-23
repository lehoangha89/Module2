package CaseStudy.Models;

public abstract class Services{
    private String id;
    private String nameSevices;
    private double arenaUsed;
    private int rental;
    private int maxNumberOfPeople;
    private String typeOfRent;
    public Services() {
    }

    public Services(String id, String nameSevices, double arenaUsed, int rental, int maxNumberOfPeople, String typeOfRent) {
        this.id = id;
        this.nameSevices = nameSevices;
        this.arenaUsed = arenaUsed;
        this.rental = rental;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameSevices() {
        return nameSevices;
    }

    public void setNameSevices(String nameSevices) {
        this.nameSevices = nameSevices;
    }

    public double getArenaUsed() {
        return arenaUsed;
    }

    public void setArenaUsed(double arenaUsed) {
        this.arenaUsed = arenaUsed;
    }

    public int getRental() {
        return rental;
    }

    public void setRental(int rental) {
        this.rental = rental;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }
    public abstract String showInfor();
}
