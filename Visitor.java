public class Visitor extends Person {
    private int ticketNum;
    private String visitDate;
    // all of the code is same as it is used in the previous class
    // Default   constructor without passing anything in parameter.
    public Visitor() {

    }

    // Parameterized constructor in which i have declared the  instance variables
    public Visitor(String firstName, String lastName, int id, int ticketNum, String visitDate) {
        super(firstName, lastName, id);
        this.ticketNum = ticketNum;
        this.visitDate = visitDate;
    }

    // Getters and setters same as previous class
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
    public void printDetails() {
        super.printDetails();
        System.out.println("  TICKET NUMBER =  " + ticketNum);
        System.out.println("  VISIT DATE =  " + visitDate);
    }
}
