public class Employee extends Person {
    private String position;
    private String employeeID;


    public Employee(String name, int age, String address, String employeeID, String position) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.position = position;
    }

    // Getter and Setter methods
    // GETTERS REFER TO ACCESS THE PRIVATE ATTRIBUTES OF THE CLASS MEANWHHILE, THE SETTERS ARE THE
    // ONE WHO HELPS TO SET THE VALUES TO PRIATE ATTRIBUTES IN THE CLASS.

    public String getEmployeeID() {
        return employeeID;
    }

    public String getPosition() {
        return position;
    }
}
