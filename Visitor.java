public class Visitor {
    private String firstName;
    private String lastName;
    private int id;
    private int ticketNum;
    private String visitDate;

    public Visitor(String firstName, String lastName, int id, int ticketNum, String visitDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.ticketNum = ticketNum;
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", ticketNum=" + ticketNum +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }
}
