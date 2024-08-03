public abstract class Person {
   // all of the code is the same just in the RIDE code ther  there are some changes
    // according to the task requirement.
    // fN first name
    //lN last Name
    private String fN;
    private String lN;
    private int id;

    // Default constructor

    public Person() {
    }

    // Constructor with parameters of int , fN, lN, and id.
    public Person(String fN, String lN, int id) {
        this.fN = fN;
        this.lN = lN;
        this.id = id;
    }

    // Getters and setters  of person class
    public String getfN() {
        return fN;
    }

    public void setf(String fN) {
        this.fN = fN;
    }

    public String getlN() {
        return lN;
    }

    public void setlN(String lN) {
        this.lN = lN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
