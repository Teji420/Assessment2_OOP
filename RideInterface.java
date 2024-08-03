public interface RideInterface {
    // An interface only allows us  to define functionality, not implement it
    // it is clearly seen in this code. that tells about the allowance of the code funcationality
    // not the implementation.
// here here the void function for adding, removing , printing, run one cycle and we can add further according to requirement.

    void PrintQueue();
    void AddVisitorToQueue(Visitor visitor);
    void RemoveVisitorFromQueue(Visitor visitor);
    void RunOneCycle();
    void PrintRideHistory();
}
