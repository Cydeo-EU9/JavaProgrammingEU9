package week13;

public class Person {
    private String firstName,lastName;
    private int age;
    private static String planet = "Earth";

    public Person() {   // Default NO parameter constructor
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }

    public Person(String firstName, String lastName, int age) { // constructor with 3 parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public static String getPlanet(){
        return planet;
    }

    public static void main(String[] args) {
        Person personOne = new Person("Michael","Scolfield",30);

     //   personOne.setFirstName()----DOES NOT EXIST
      /*
      Can I call the constructor to change the name?
      NO
       */
        System.out.println("personOne.getPlanet() = " + personOne.getPlanet());
        System.out.println("Person.getPlanet() = " + Person.getPlanet());
    }
}
