public class Visitor extends Person {
    private String visitorID;
    private String membershipLevel;

    public Visitor(String name, int age, String address, String visitorID, String membershipLevel) {
        super(name, age, address);
        this.membershipLevel = membershipLevel;
        this.visitorID = visitorID;
    }



    // Getter and Setter methods

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public String getVisitorID() {
        return visitorID;
    }


    @Override
    //method overriding occurs when a subclass (child class) has the same method as the parent class.
    // we will use this in upcming codes.
    public String toString() {
        return "VISITOR = " +
                "NAME=" + getName() + '\'' +
                ", AGE=" + getAge() +
                ",LOCATION=" + getAddress() + '\'' +
                ", IDENTIFICATION=" + visitorID + '\'' +
                ",MEMBERSHIP TYPE =" + membershipLevel + '\'' +
                '}';
    }
}
