public class AssignmentTwo {

    public static void main(String[] args) {
        //  we can  call the methods here to demonstrate functionality of given tsak to us.
        AssignmentTwo assessment = new AssignmentTwo();
        assessment.partThree();
        assessment.partFourA();
        assessment.partFourB();
        assessment.partFive();
        //assessment.partSix();
        //assessment.partSeven();

    }

    public void partThree() {
        // Implementation for part 3
        Ride ride = new Ride();
        Visitor v1 = new Visitor("Tejinder Singh", 203, "surfers", "430.com", "one year");
        Visitor v2 = new Visitor("JOJO", 225, "BRISBANE", "FS332", "two year");
        Visitor v3 = new Visitor("OLD SINGH", 40, "SOUTHPORT", "123D", " one year");
        Visitor v4 = new Visitor("HELLO", 335, "OSLEN ELVE", "2033", "five year");
        Visitor v5 = new Visitor("SUNNY SINGH DEOL ", 128, " PIMPAMA", "322", "two year");

        ride.AddVisitorToQueue(v1);
        ride.AddVisitorToQueue(v2);
        ride.AddVisitorToQueue(v3);
        ride.AddVisitorToQueue(v4);
        ride.AddVisitorToQueue(v5);

        ride.RemoveVisitorFromQueue(v3);

        ride.PrintQueue();
    }

    public void partFourA() {
        // Implementation for part 4A
        Ride ride = new Ride();
        Visitor v1 = new Visitor(" TEJINDER", 32, "SURFERS", "1", " ONE YEAR");
        Visitor v2 = new Visitor("BOBO", 215, " SURFERS", "2", "TWO YEAR");
        Visitor v3 = new Visitor("CHEEMA SINGH", 23, " BROADBEACH", "3", "TWO YEAR");
        Visitor v4 = new Visitor("DEOL SINGH", 33, " MIAMAI ", "4", "ONE YEAR");
        Visitor v5 = new Visitor("HARSH SINGH", 22, "FLORIDA", "5", "ONE YEAR");

        ride.AddVisitorToQueue(v1);
        ride.AddVisitorToQueue(v2);
        ride.AddVisitorToQueue(v3);
        ride.AddVisitorToQueue(v4);
        ride.AddVisitorToQueue(v5);

        ride.RunOneCycle();

        ride.PrintRideHistory();
    }

    public void partFourB() {
        // Implementation for part 4B
        Ride ride = new Ride();
        Visitor v1 = new Visitor("TEJINDER ", 50, "SURFERS", "1", "ONE YAER");
        Visitor v2 = new Visitor("BOBY SINGH", 15, "SURFERS", "2", "ONE YAER");
        Visitor v3 = new Visitor("CHARNA SINGH", 22, "MIAMI", "3", "SIX YEAR");
        Visitor v4 = new Visitor("SINGH SINGH", 33, "CAVIL AVE", "4", "FIVE YAER");
        Visitor v5 = new Visitor("ELVISH YADAV", 23, "KAHLON STREET", "5", "ONE YAER");

        ride.AddVisitorToQueue(v1);
        ride.AddVisitorToQueue(v2);
        ride.AddVisitorToQueue(v3);
        ride.AddVisitorToQueue(v4);
        ride.AddVisitorToQueue(v5);

        ride.RunOneCycle();

        // SORTING AND RPINTING  WITH THIS MEATHOD
        ride.sortVisitorsByNameAndAge();
        ride.PrintRideHistory();
    }

    public void partFive() {
        // Implementation for part 5 for the assessment two
        Ride ride = new Ride("ROLERCOASTER", 10, new Employee("TEJINDER SINGH AJIMAL", 20, " SURFERS PARADISE", "3033", "OPERATER"));

        Visitor v1 = new Visitor("TEJJI", 32, "SURFERS", "1", "ONE YEAR");
        Visitor v2 = new Visitor("BOBO", 25, "SOUTHPORT", "2", "TWO YEAR");
        Visitor v3 = new Visitor("CHEEMA Y", 20, "BRISBANE", "3", "FOUR YEAR");
        Visitor v4 = new Visitor("GUR SIDHU", 35, "GOLD COAST", "4", "SIX YEAR");
        Visitor v5 = new Visitor("ARJUN DHILLION", 28, "NEWSOUTH WALES", "5", "TWO YEAR");


        ride.AddVisitorToQueue(v1);
        ride.AddVisitorToQueue(v2);
        ride.AddVisitorToQueue(v3);
        ride.AddVisitorToQueue(v4);
        ride.AddVisitorToQueue(v5);


        System.out.println(" BEFORE RUNNING THE CYCLE BY VISITOR");

        ride.PrintQueue();

        ride.RunOneCycle();

        System.out.println("PEOPLE WHO GOT THE RIDE:");
        ride.PrintRideHistory();

        System.out.println(" PEOPLE AFTER HAVING ONE CYCLE RIDE:");
        ride.PrintQueue();


    }


}
