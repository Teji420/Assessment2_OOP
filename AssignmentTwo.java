public class AssignmentTwo {
    public static void main(String[] args) {

         partSeven();
    }

    public static void partSeven() {
        // THE RIDE INSTANCE
        Ride rollerCoaster = new Ride();

      // HERE IS THE IMPORTANT OR CRUCIAL STEP WHILE  GETTING THE DATA FROM THE CSV FILE WE HAVE CREATED THE PART7.CSV.
        rollerCoaster.importVisitorsFromCSV("PART7.CSV");
        // IN THE LINKED LIST JUST TO MAKE SURE THE NUMBER OF PEOPLE IN VISITOR LIST ARE CORRECT OR NOT.
        System.out.println("COUNT OF THE VISITOR WE HAVE IS =  " + rollerCoaster.getRideHistory().size());
        // CONFIRMATION OF THE PRINTING THE ALL DETAILS OF THE VISITORS WHILE DOING STORING IN THE LINKED LIST.
        rollerCoaster.printRideHistory();
    }
}
