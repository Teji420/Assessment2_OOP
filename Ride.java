import java.util.LinkedList;
import java.util.Iterator;

public class Ride {
    private String rideName;
    private String rideType;
    private int capacity;
    private Employee operator;
    private LinkedList<Visitor> visitors;  // Collection of visitors who have taken the ride

    // Default constructor
    public Ride() {
        this.visitors = new LinkedList<>();
    }

    // Parameterized constructor
    public Ride(String rideName, String rideType, int capacity, Employee operator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.capacity = capacity;
        this.operator = operator;
        this.visitors = new LinkedList<>();
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // Method to add a visitor to the collection
    public void addVisitor(Visitor visitor) {
        this.visitors.add(visitor);
        System.out.println("Visitor added: " + visitor);
    }

    // Method to get the number of visitors in the collection
    public int getNumberOfVisitors() {
        return this.visitors.size();
    }

    // Method to print all visitors using Iterator
    public void printRideHistory() {
        System.out.println("Ride History:");
        Iterator<Visitor> iterator = visitors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public String toString()
    {
        return String.format("Ride [Name: %s, Type: %s, Capacity: %d, Operator: %s]", rideName, rideType, capacity, operator);
    }
}
