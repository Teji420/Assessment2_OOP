public class Employee extends Person {
    private String workTitle;
    private int workerNumber;
 // just change the
    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(String fN, String lN, int id, String workTitle, int workereNumber) {
        super(fN, lN, id);
        this.workTitle = workTitle;
        this.workerNumber = workerNumber;
    }

    // Getters and setters
    public String workerTitle() {
        return workTitle;
    }

    public void setworkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public int getworkerNumber() {
        return workerNumber;
    }

    public void setworkerNumber(int workerNumber) {
        this.workerNumber = workerNumber;
    }
}
