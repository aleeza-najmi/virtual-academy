import java.util.*;

public class AssignmentTest {
    public static void main(String[] args) {
        Car car1 = new Car("tesla", 2022);
        Car car2 = new Car("bugatti", 2000);
        Car car3 = new Car("lambo", 2014);

        Dog dog1 = new Dog("what", 5);
        Dog dog2 = new Dog("the", 0);
        Dog dog3 = new Dog("sigma", 5);

        Student student1 = new Student("six", "seven", 67676);
        Student student2 = new Student("ts", "pmo", 76767);
        Student student3 = new Student("unem", "ployed", 67777);

        System.out.println("Car1 Make: " + car1.make);
        System.out.println("Car1 Year: " + car1.year);
        System.out.println("Car2 Make: " + car2.make);
        System.out.println("Car2 Year: " + car2.year);
        System.out.println("Car3 Make: " + car3.make);
        System.out.println("Car3 Year: " + car3.year);

        System.out.println("Dog1 Name: " + dog1.name);
        System.out.println("Dog1 Age: " + dog1.age);
        System.out.println("Dog2 Name: " + dog2.name);
        System.out.println("Dog2 Age: " + dog2.age);
        System.out.println("Dog3 Name: " + dog3.name);
        System.out.println("Dog3 Age: " + dog3.age);

        System.out.println("Student1 First Name: " + student1.firstName);
        System.out.println("Student1 Last Name: " + student1.lastName);
        System.out.println("Student1 ID: " + student1.studentId);
        System.out.println("Student2 First Name: " + student2.firstName);
        System.out.println("Student2 Last Name: " + student2.lastName);
        System.out.println("Student2 ID: " + student2.studentId);
        System.out.println("Student3 First Name: " + student3.firstName);
        System.out.println("Student3 Last Name: " + student3.lastName);
        System.out.println("Student3 ID: " + student3.studentId);
        System.out.println("ik i was supposed to put methods but i was crashing out too much so i gave up on finishing");
        
    }
}