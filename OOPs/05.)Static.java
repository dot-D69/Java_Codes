class Friend{
    String name;
    static int numofFriends; 
// Static variable, shared across all instances of the class, if we remove static, it will be only shared as copy to itsown object and the numoffriends will always be 1.
    Friend(String name){
        this.name = name;
        numofFriends++;
    }
    static void Display(){
            System.out.println("You have total of " + numofFriends + " friends.");
        }
}

public class Static {
    public static void main(String[] args) {
        // Static = Makes a varibale or method belong to the class, rather than to any single object.

        // Here when we create the first object, numofFriends is 1.
        // But when we again create the second object, numofFriends is still 1.
        // This is because numofFriends is not static, so each object has its own copy.
        // So it will always be 1, no matter how many objects(friends) we create.
        // Once we add the static keyword to he numofFriends variable, It now belongs to the class and can be shared across all instances.
        // Now numofFriends will be 2, because it is shared across all instances.


        Friend f1  = new Friend("Drex");
        Friend f2  = new Friend("goor");

        System.out.println(Friend.numofFriends + " friends.");
        
        // To access static variables, we use the class name, not the object name.

        Friend.Display(); // This will call the static method Display which will print the number of friends.


        // Output :
        // 1 friends.
        // 1 friends.
        // After adding static keyword to numofFriends
        // 2 friends.
        // 2 friends.
    }
}
