public class Employee extends Person {
    private String employeeId;
    private String position;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String firstName, String lastName, int id, String employeeId, String position) {
        super(firstName, lastName, id);
        this.employeeId = employeeId;
        this.position = position;
    }

    // Getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Employee [First Name: %s, Last Name: %s, ID: %d, Employee ID: %s, Position: %s]",
                getFirstName(), getLastName(), getId(), employeeId, position);
    }
}
