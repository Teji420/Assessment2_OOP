public class Employee extends Person {
    private String employeeId;
    private String position;
    // EXTEND THE  PERSON CLASS WITH THE USE OF THE EMPLOYEE SO THERE COULD BE THE USE OF THE
    // SUPER  TO EXTRACT OR GET THE INSTANCE VARIABLE OF THE PARENT CLASS.
    // Default   constructor without passing anything in parameter.
    public Employee()
    {

    }

    // INSTANCE VARIABLE ARE INITIALIZED IN THE EMPLOYEE
    public Employee(String firstName, String lastName, int id, String employeeId, String position) {
        super(firstName, lastName, id);
        this.employeeId = employeeId;
        this.position = position;
    }

    // Getters and setters same as the previous class
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
    public void printDetails() {
        super.printDetails();
        System.out.println("  WORKER ID  = " + employeeId);
        System.out.println("  POSITION = " + position);
    }
}
