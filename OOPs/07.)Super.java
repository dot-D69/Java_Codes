class Person{
    String First;
    String Last;

    Person(String First, String Last){
        this.First = First;
        this.Last = Last;
    }

    void display(){
        System.out.println("The Person's Name is: " + this.First + " " + this.Last);
    }
}

class Student extends Person{
        double GPA;
        int ID;

        Student(String First, String Last, double GPA, int ID){
            super(First,Last);
            this.GPA = GPA;
            this.ID = ID; 
        }

        void showInfo(){
            System.out.println(this.First + "'s GPA is " + this.GPA + " and ID is " + this.ID);
        }
}

class Teacher extends Person{
        String Subject;
        int Salary;

        Teacher(String First, String Last, String Subject, int Salary){
            super(First, Last);
            this.Subject = Subject;
            this.Salary = Salary;
        }

        void showInfo(){
            System.out.println(this.First + " teaches " + this.Subject + " and earns " + this.Salary);
        }
}

public class Super {
    public static void main(String[] args) {
        
        Person p1 = new Person("Harry", "Potter");
        p1.display();

        Student s1 = new Student ("Ben","Tennison", 3.8, 12345);
        s1.display();
        s1.showInfo();

        Teacher t1 = new Teacher("Albus", "Dumbledore", "Transfiguration", 100000);
        t1.showInfo();
    }
}
