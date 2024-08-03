import java.io.BufferedReader;
// IN ORDER TO READ DATA FROM LINE TO LINE
import java.io.FileReader;
// CREATE THE CONNECTION WITH FILE WHICH ASSIST TO READ
import java.io.IOException;
// IN ORDER TO HANDLE THE EXCEPTION WHILE READING
import java.util.LinkedList;
// USE FOR THE  STORAGE OF THE VISITOR AS LINKED LIST.

public class Ride {
    private final LinkedList<Visitor> rideHistory; // KIND OF THE HISTORY TO SHOW THAT THE VISITOR ARE DONE WITH RIDE.
// LinkedList<Visitor> HAS STORED ALL THE DETAILS OF THE VISITORS WHO HAVE DONE WITH RIDING IN THEME PARK.
    public Ride() {
        this.rideHistory = new LinkedList<>();
    }
// THIS IS CONSTRUCTOR FOR THE RIDE CLASS, THIS IS INITIALIZE THE RIDE HISTORY WITH EMPTY LINKEDLIST.
    //  MEHTOD FOR IMPORTING VISITORRS FROM CSV PART7 FILE.
    public void importVisitorsFromCSV(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // WHILE LOOP WITH NULL CONDITION, OBVIOUSLY THERE WILL BE SOMETHING IN
            // CODE  SO THE NULL CONDITION APPLIES HERE.
            while ((line = reader.readLine()) != null) {
                // WHEN THERE IS NO LINE LEFT THEN THIS  LOOP WILL TERMINATE.
                String[] details = line.split("#");
                // THIS SLIP THE CURRENT LINE WITH #. HASH
                if (details.length == 5) {
                    // CONDITION TO CHECK IF IT MEETS OR NOT IF IT WILL THEN IT WILL RUN.
                    String firstName = details[0].trim();
                    String lastName = details[1].trim();
                    int id = Integer.parseInt(details[2].trim());
                    int ticketNum = Integer.parseInt(details[3].trim());
                    String visitDate = details[4].trim();
                    Visitor visitor = new Visitor(firstName, lastName, id, ticketNum, visitDate);
                    rideHistory.add(visitor);
                }
            }
            // THE ABOVE LOGIC IS DONE HERE IS ANOTHER MORE IMPORTANT THING IS THE IOException AND  NumberFormatException
            // WHICH TELLS ABOUT THE ERROR WHILE EXECUTING AND OR OTHER ERROR WHILE READING.
            System.out.println(" VISITORS ARE TAKEN =  " + fileName);
        } catch (IOException e) {
            System.out.println(" THERE IS THE ERROR WHILE IMPORTING PLEASE CHECK YOUR CODE AGAIN " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(" ERROR BABY WITH DOING PARSING: " + e.getMessage());
        }
    }

    // Method to print ride history
    public void printRideHistory() {
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor);
        }
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }
}
