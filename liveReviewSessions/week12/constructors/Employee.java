package week12.constructors;

public class Employee {
    public String name,jobTitle;
    public int ID;
    public double salary;             // instance variable, belongs to Object
    public static String companyName; // static field belongs to Class

    static {
        companyName="Microsoft"; // this value is same for all the objects of this class
    }

    public Employee() {
        salary = 10000;  // when I create an Employee object with default constructor, their salary will be 10000 as default.
  }

    public Employee(String n, String jobTitle, int ID, double salary) {
        name = n;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ",company Name=" + companyName+
                '}';
    }

    public static void someStaticMethod(){  // the static method can be called with class name
      //  System.out.println(name);  // which name do I have to print out? there are more than one copies
        System.out.println(companyName);
    }
}
