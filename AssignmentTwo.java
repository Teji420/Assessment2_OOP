public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partEight();
    }

    public void partEight() {
        // Create a new Ride object
        Employee operator = new Employee("John", "Doe", 1, "Operator", 3000);
        Ride rollerCoaster = new Ride("Roller Coaster", 5, operator);

        // Create and add visitors to the ride using addVisitorToRide
        rollerCoaster.addVisitorToRide(new Visitor("HARSH", "JATT", 1, 11, "21th DECEMBER"));
        rollerCoaster.addVisitorToRide(new Visitor("SEEMA", "SAINI", 2, 22, "20th Jan"));
        rollerCoaster.addVisitorToRide(new Visitor("REMMA", "AJIMAL", 3, 23, "12th Nov"));
        rollerCoaster.addVisitorToRide(new Visitor("SINGH", "KAHOLN", 4, 44, "31st SEPTEMBER"));
        rollerCoaster.addVisitorToRide(new Visitor("SIMRAN", "DHILLION", 5, 1010, "9-Aug"));

    }
}
