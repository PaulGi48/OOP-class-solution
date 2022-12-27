
// Teacher subclass that extends Person
public class Teacher extends Person {
    private String course;
  
    // Constructor to initialize fields
    public Teacher(String firstName, String lastName, int age, String course) {
      super(firstName, lastName, age); // Call super class constructor
      this.course = course;
    }
  
    // Getters and setters for the private field
    public String getCourse() {
      return course;
    }
  
    public void setCourse(String course) {
      this.course = course;
    }
  }