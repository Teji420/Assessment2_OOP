public interface RideInterface {

    // Method to add a visitor to the ride queue
    void addVisitorToQueue(Visitor visitor);

    // Method to remove a visitor from the  queue
    void removeVisitorFromQueue(Visitor visitor);

    // Method to print the  queue of visitors
    void printQueue();

    // Method to print the history of visitors who had  ride in the theme park.
    void printRideHistory();
}
