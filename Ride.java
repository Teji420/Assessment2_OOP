

import java.io.FileWriter;
// the first library fuction is linked with the exportVisitorsToCSV which is in the end of this code.
//FileWriter object is created to write the ride history to a CSV file.
import java.io.IOException;
// this one is used when we do some eroor or problem while doing input or output operators.
import java.io.PrintWriter;
// this class assist to write the data in the best way so the data outside could be in suitable form.
import java.util.LinkedList;
import java.util.Queue;
// above all the librabry fuction are necessory for the task beacuse the filwwriter is know from
// it's name to write and rest of the library functions are already explained in the previous parts.
public class Ride {
    private Employee operator;
    private String riderName;
    private int maxRiders;
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;

    // constructor with intializing the names.
    public Ride() {
        this.riderName = "";
        this.operator = null;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = 1;
    }

    // Constructor with parameters
    public Ride(String riderName, Employee operator, int maxRiders) {
        this.riderName = riderName;
        this.operator = operator;
        this.maxRiders = maxRiders;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getters and Setters as same the prvious classses.
    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public Queue<Visitor> getQueue() {
        return queue;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    // Methods for RideInterface checkup
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println("Visitor " + visitor.getFirstName() + " added to the queue.");
    }
// here is the method which is used to remove the visitor if the acceptable or not there
    // then this will gonna remove the visitor/
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getFirstName() + " removed from the queue.");
        } else {
            System.out.println("Visitor " + visitor.getFirstName() + " not found in the queue.");
        }
    }
//  in order to print the queue the code is here
    public void printQueue() {
        System.out.println("Queue:");
        for (Visitor v : queue) {
            System.out.println(v.getFirstName() + " " + v.getLastName() + ", ID: " + v.getId());
        }
    }
// now we gonna print the ride history for the visitor
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor v : rideHistory) {
            System.out.println(v.getFirstName() + " " + v.getLastName() + ", ID: " + v.getId());
        }
    }
   // the first library function which is imported for the csv file i have created in the document.
    public void exportVisitorsToCSV(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Visitor visitor : rideHistory) {
                writer.println(visitor.getFirstName() + "," + visitor.getLastName() + "," +
                        visitor.getId() + "," + visitor.getTicketNum() + "," + visitor.getDate());
            }
            System.out.println("Ride history successfully exported to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while exporting the ride history.");
            e.printStackTrace();
        }
    }
}
