
public class AssignmentTwo {
    public static void main(String[] args) {
        // Create Employees with their own different operator
        Employee operator1 = new Employee("SINGH", "DEOL", 2, "OPERATOR", 420);
        Employee operator2 = new Employee("RANDY ORTEN", "UNDERTAKER", 3, "OPERATOR", 520);

        // Create Rides with junglesafari, watercraft , without  thinking any thing about the ride
        // i declared these name just for the explanantions.
        Ride jungleSafari = new Ride("JUNGLE SAFARI", operator1, 5);
        Ride waterCraft = new Ride("WATER CRAFT", operator2, 4);

        //  here are the five visitors which i will update and they will gonna updated in the current file i have
        // saved PART.csv .
        Visitor visitor1 = new Visitor("HARSH", "JATT", 1, 11, "21th  DECEMBER");
        Visitor visitor2 = new Visitor("SEEMA", "SAINI", 2, 22, "20th January");
        Visitor visitor3 = new Visitor("REMMA", "AJIMAL", 3, 23, "12th November");
        Visitor visitor4 = new Visitor("SINGH", "KAHOLN", 4, 44, "31st  SEPTEMBER");
        Visitor visitor5 = new Visitor("SIMRAN", "DHILLION", 5, 1010, "9 Auguest");

        //  here is the adding of the vistors to the ride which i declared as the jjunglesaafari in the code
        jungleSafari.getRideHistory().add(visitor1);
        jungleSafari.getRideHistory().add(visitor2);
        jungleSafari.getRideHistory().add(visitor3);
        jungleSafari.getRideHistory().add(visitor4);
        jungleSafari.getRideHistory().add(visitor5);

        //  last but not least the main important thing which is know for this code is  to Export ride history to CSV
        jungleSafari.exportVisitorsToCSV("PART6.csv");
    }
}
