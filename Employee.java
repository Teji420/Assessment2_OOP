
public class Employee {
    // here are the instance variable for the employee classs
    private String firstName;
    private String lastName;
    private int id;
    private String place;
    private double revenue;

    // here i have declared the constructor in which the insttance variables have been passed
    public Employee(String firstName, String lastName, int id, String place, double revenue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.place = place;
        this.revenue = revenue;
    }

    // Getters and Setters first name, last name , revenue, id.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
}
