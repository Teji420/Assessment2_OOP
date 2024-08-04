public class Visitor extends Person {
    private int ticketNum;
    private String visitDate;

    // Default constructor
    public Visitor() {}

    // Parameterized constructor
    public Visitor(String firstName, String lastName, int id, int ticketNum, String visitDate) {
        super(firstName, lastName, id);
        this.ticketNum = ticketNum;
        this.visitDate = visitDate;
    }

    // Getters and setters
    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return String.format("Visitor [First Name: %s, Last Name: %s, ID: %d, Ticket Number: %d, Visit Date: %s]",
                getFirstName(), getLastName(), getId(), ticketNum, visitDate);
    }
}
