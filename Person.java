public class Person {
    // this class is already declared and used in the part 1 task.
    private String firstName;
    private String lastName;
    private int id;

    // Default constructor with name as person class
    public Person() {}

    // Parameterized constructor in which i have declared the  instance variables
    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Getters and setters for the first, last name and id
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


    public void printDetails() {
        System.out.println("PERSON INFO  = ");
        System.out.println("  FIRST NAME = " + firstName);
        System.out.println("  LAST NAME= " + lastName);
        System.out.println("  IDENTIFICATION =  " + id);
    }
}
