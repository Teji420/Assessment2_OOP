public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partFourA();
    }

    public void partFourA() {
        // Create a new Ride object
        Ride ride = new Ride("Ferris Wheel", "Family", 20, new Employee("John", "Doe", 35, "E123", "Operator"));

        // Add visitors
        ride.addVisitor(new Visitor("Alice", "Smith", 25, 1001, "15th Sep"));
        ride.addVisitor(new Visitor("Bob", "Brown", 22, 1002, "12th Sep"));
        ride.addVisitor(new Visitor("Charlie", "Johnson", 28, 1003, "10th Sep"));
        ride.addVisitor(new Visitor("David", "Wilson", 30, 1004, "20th Sep"));
        ride.addVisitor(new Visitor("Eve", "Davis", 24, 1005, "18th Sep"));

        // Print number of visitors in the collection
        System.out.println("Number of visitors in ride history: " + ride.getNumberOfVisitors());

        // Print all visitors in the collection
        ride.printRideHistory();
    }
}
