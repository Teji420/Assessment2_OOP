public class Person {

   // same as from the part 1 class person content is taken in this part4.
    private String firstName;
    private String lastName;
    private int id;

    // Default constructor of the class person
    public Person() {}

    // Parameterized constructor with different data type in the following content.
    public Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    
    // Getters and setters
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

    @Override
    public String toString() {
        return String.format("Person [First Name: %s, Last Name: %s, ID: %d]", firstName, lastName, id);
    }
}
