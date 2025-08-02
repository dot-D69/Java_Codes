class User{
    String username;
    String email;
    int age;

    // Overloaded Constructor are very much same to overloaded method

    User(String username){
        this.username = username;
        this.email = "not provided";
        this.age =  0;
    }

    User (String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User (String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
    User(){
        this.username = "Guest";
        this.email = "not provided";
        this.age =  0;
    }

    void display(){
        System.out.println("Name: "+ username);
        System.out.println("EMAIL: "+ email);
        System.out.println("AGE: "+ age);
    }
}


public class overloaded_constructor {
    public static void main(String[] args) {
        
        User u1 = new User("Drexv");
        User u2 = new User("Dhurv", "dark99@gmail.com");
        User u3 = new User("Dhurv", "dark99@gmail.com", 24);
        User u4 = new User();

        u1.display();
        u2.display();
        u3.display();
        u4.display();
    }
}
