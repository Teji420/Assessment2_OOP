
public class Visitor {
    // here are the instance variable for the person classs
    private String firstName;
    private String lastName;
    private int id;
    private int ticketNum;
    private String date;

    // here i have declared the constructor in which the insttance variables have been passed.
    public Visitor(String firstName, String lastName, int id, int ticketNum, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.ticketNum = ticketNum;
        this.date = date;
    }

    // Getters and Setters for the variables i have declared/ intialized above in the code.
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

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
