import java.util.LinkedList;
// Linked List is a part of the Collection framework present in java.util package.
// ITS STRCUTURE IS IN THE LINEAR FORM AND THEY DO NOT STORE IN THE  CONTIGIOUS FORM OR LOCATION
// THE EVERY ELEMENT HAS THE SEPERATE OBJECT  WITH DATA PART AND ADDRESS PART.
import java.util.Queue;
// THE QUEUE IS  THE OJECT WHICH HAS CAPABILITY TO PRESENT THE DATA STRUCTURE DESIGN THAT INSERT ELEMENTS
// IN THE  END OF THE QUEUE AND REMOVE FROM THE BEGINNING.
import java.util.Iterator;
// The iterator() method can be used to get an Iterator for any collection:
public class Ride implements RideInterface {
    private int numOfCycle;
    private Employee rideOperator;
    private LinkedList<Visitor> rideHistory;
    private String rideName;
    private int maxRider;
    private Queue<Visitor> visitorQueue;


    public Ride() {
        this.rideName = "NO NAME RIDER IN THEME PARK";
        this.maxRider = 6;
        this.numOfCycle = 0;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, int maxRider, Employee rideOperator) {
        this.rideName = rideName;
        this.rideOperator = rideOperator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycle = 0;

    }

    @Override
    public void AddVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " nMAES GONNA DISPLAY ONCE ALL WILL ADDED .");
    }

    @Override
    public void RemoveVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.remove(visitor)) {
            System.out.println(visitor.getName() + "  THIS ONE IS REMOVED FROM THE QUEUE.");
        } else {
            System.out.println(visitor.getName() + " HE/ SHE IS NOT IN THE QUEUE");
        }
    }

    @Override
    public void PrintQueue() {
        System.out.println("VISITOR IN THE LIST/ QUEUE:");
        for (Visitor visitor : visitorQueue) {
            System.out.println(visitor);
        }
    }

    @Override
    public void RunOneCycle() {
        if (rideOperator == null) {
            System.out.println(" IF THE RIDER IS NOT THE OPERATOR THEN THEY DO NOT HAVE THE ACCESS.");
            return;
        }
        if (visitorQueue.isEmpty()) {
            System.out.println(" VISITOR   YOU CAN NOT RIDE HERE SORRY .");
            return;
        }
        int count = 0;
        while (!visitorQueue.isEmpty() && count < maxRider) {
            Visitor visitor = visitorQueue.poll();
            rideHistory.add(visitor);
            count++;
        }
        numOfCycle++;
        System.out.println(" THE COUNT OF THE RIDE : " + numOfCycle);
    }

    @Override
    public void PrintRideHistory() {
        System.out.println(" VISITOR COUNT THOSE WHO GOT THE RIDE :");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sortVisitorsByNameAndAge() {
        rideHistory.sort((v1, v2) -> {
            int nameComparison = v1.getName().compareTo(v2.getName());
            if (nameComparison == 0) {
                return Integer.compare(v1.getAge(), v2.getAge());
            } else {
                return nameComparison;
            }
        });
    }

    // Getter and Setter methods
    public Queue<Visitor> getVisitorQueue() {
        return visitorQueue;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }
    public int getMaxRider() {
        return maxRider;
    }

    public int getNumOfCycle() {
        return numOfCycle;
    }
    public String getRideName() {
        return rideName;
    }



    public Employee getRideOperator() {
        return rideOperator;
    }


}
