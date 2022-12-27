
// Student subclass that extends Person
public class Student extends Person {
    private String department;
  
    // Constructor to initialize fields
    public Student(String firstName, String lastName, int age, String department) {
      super(firstName, lastName, age); // Call super class constructor
      this.department = department;
    }
  
    // Getters and setters for the private field
    public String getDepartment() {
      return department;
    }
  
    public void setDepartment(String department) {
      this.department = department;
    }
  }
  