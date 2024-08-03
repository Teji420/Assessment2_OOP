
public class Person {
    // here are the instance variable for the person classs
    private String firstName;
    private String lastName;
    private int id;


    public Person(String firstName, String lastName, int id) {
        // here i have declared the constructor in which the insttance variables have been passed.
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Getters and Setters for the first name, last name, and Identification.
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
}
