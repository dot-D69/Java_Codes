
class Student{
    String name;
    int age;
    double gpa;
    double fees;
    boolean isEnrolled;

    // Constructor
    // To set up a constructor, we define a method with the same name as the class
    Student(String name, int age, double gpa){
        this.name = name; // this keyword refers to the current object
        this.age = age;
        this.gpa = gpa;
        this.fees = 5000; // default value for fees
        this.isEnrolled = true; // default value for isEnrolled
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Enrolled: " + isEnrolled);
    }


}

public class constructor {
    public static void main(String[] args){

        Student s1 = new Student("Dhruv",21,8.04);
        Student s2 = new Student("Anurag",21,7.83);//  when using constructor, we can pass values directly to the object
        // IF WE  USE THE CONSTRUCTOR THEN WE CANNOT LEAVE THE OBJECT WITHTOUT VALUES

        s1.displayInfo();
        System.out.println(s1.fees);
        s2.displayInfo();
        System.out.println(s1.fees);

    }
}
