public abstract class Person {
    // abstract  class gives the opportunity to the coder to create the functionally that subclass
    // implement or override.
    private int age;
    private String address;
    private String name;

  //The Person class is made abstract because it is intended to serve as a base class
  // for other specific types of people  in my further classs such as the
  // Employee and Visitor.
    // constrcutor in which i have passsed my values in the  parameter according to the
    // task requirement.
    public Person(String name, int age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Getter and Setter methods usage in the person classs

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }


}
