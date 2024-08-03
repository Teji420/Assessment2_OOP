public class Visitor extends Person {
    private int visitNumber;
    private String visitDate;

    // Default constructor with super ().
    public Visitor() {
        super();
    }

    // Parameterized constructor with Parameter of instance variable in it.
    public Visitor(String fN, String lN, int id, int visitNumber, String visitDate) {
        super(fN, lN, id);
        this.visitNumber = visitNumber;
        this.visitDate = visitDate;
    }

    // Getters and setters of visitor class
    public int getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(int visitNumber) {
        this.visitNumber = visitNumber;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}
