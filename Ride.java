//ExecutorService pool = Executors.newFixedThreadPool(3);
//        pool.execute(new TestThread("thread 1"));
//        pool.execute(new TestThread("thread 2"));
//        pool.execute(new TestThread("thread 3"));
//        pool.execute(new TestThread("thread 4"));
//        pool.execute(new TestThread("thread 5"));
//        pool.execute(new TestThread("thread 6"));
//        pool.execute(new TestThread("thread 7"));
//        pool.execute(new TestThread("thread 8"));
//        pool.shutdown();
//    }public static void fixedThreadPool() {

//import java.util.LinkedList;
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

//import java.io.IOException;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Ride {
    private String name;
    private int capacity;
    private Employee operator;
    private LinkedList<Visitor> visitors;
    private final ReentrantLock lock = new ReentrantLock();

    // to have the concurrent lock there is the need of the reentrantlock.
    public Ride() {
        this.name = "";
        this.capacity = 0;
        this.operator = null;
        this.visitors = new LinkedList<>();
    }

    public Ride(String name, int capacity, Employee operator) {
        this.name = name;
        this.capacity = capacity;
        this.operator = operator;
        this.visitors = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void addVisitorToRide(Visitor visitor) {
        lock.lock();  // adding lock before execution
        try {
            if (visitors.size() < capacity) {
                visitors.add(visitor);
                System.out.println(" VISITOR = " + visitor.getFirstName() + "  THEY HAVE BEEN ADDED IN QUEUE ");
            } else {
                System.out.println(" SORRY BABY NO RIDE LEFT KNOW BYE " + visitor.getFirstName() + ".");
            }
        } catch (Exception e) {
            System.out.println("OOPS ERROR WE HAVE   " + e.getMessage());
        } finally {
            lock.unlock();  // Releasing the lock when it will executed.
        }
    }
}

