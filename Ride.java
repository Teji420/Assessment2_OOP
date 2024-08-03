import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {

    private int numOfCycles; // Track number of cycles run
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;
    private Employee operator;
    private String riderName;
    private int maxRiders;
    public Ride() {
        this.riderName = "";
        this.operator = null;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRiders = 4;
        this.numOfCycles = 0;
    }

    public Ride(String riderName, Employee operator, int maxRiders) {
        this.riderName = riderName;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycles = 0;
        this.maxRiders = maxRiders;

    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println("GUEST = " + visitor.getfN() + "  THEY HAVE ADDED IN LINE.");
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) {
            System.out.println("VISITOR " + visitor.getfN() + " REMOVED FROM LINE/QUEUE.");
        } else {
            System.out.println("VISITOR = " + visitor.getfN() + "  VISITOR IS NOT FOUND / AVAILABLE IN THE QUEUE.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("QUEUE = ");
        for (Visitor v : queue) {
            System.out.println(v.getfN() + " " + v.getlN() + ", IDENTIFICATION =  " + v.getId());
        }
    }

    @Override
    public void printRideHistory() {
        System.out.println(" HISTORY =");
        for (Visitor v : rideHistory) {
            System.out.println(v.getfN() + " " + v.getlN() + ", IDENTIFICATION  " + v.getId());
        }
    }

    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No ride operator assigned. The ride cannot be run.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println(" NOTHING IS FOUND EMPTY ONE ");
            return;
        }

        int riders = 0;
        while (riders < maxRiders && !queue.isEmpty()) {
            Visitor visitor = queue.poll();
            rideHistory.add(visitor);
            riders++;
        }

        numOfCycles++;
        System.out.println("COUNT OF THE NUMBER OF THE CYCLE = " + numOfCycles);
    }
}
