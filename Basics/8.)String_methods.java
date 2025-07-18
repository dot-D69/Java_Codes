public class String_methods {
    public static void main(String[] args){

        String name = "Benjamin Tennyson";

        int length = name.length(); // gives the length of the string
        System.out.println(length);

        char c = name.charAt(0); //  gives the letter at the positiong mentioned.
        System.out.println(c);

        int index = name.indexOf("n"); // gives the first occurence of the provided letter
        System.out.println(index); 

        int lastindex = name.lastIndexOf("n");// gives the last occurence of the provided letter
        System.out.println(lastindex);

        name = name.replace("n" ,"3"); // Replaces the arget with the provided character
        // name= name.toUpperCase();
        // name= name.toLowerCase();

        // check if the String is empty use isEmpty();
        System.out.println(name.isEmpty());

        // to check if the string contains any specific character
        if(name.contains("e")){
            System.out.println("True");
        }
        else{System.out.println("False");
            
        }
        

        String name2 = "   BEN 10    ";
        // To remove all the white spaces from the name2 use trim
        name2 = name2.trim();

        // TO check if the string are same
        if (name.equals(name2)){
            System.out.println("they are the same");
        }
        else{
            System.out.println("They are not same");
        }

        // .equals method is  case sensitive i.e it will give false when matching Password and password
        // to ignore for case sensitivity

        if("Password".equalsIgnoreCase("password")){
            System.out.println("Both are the same");
        }else{
            System.out.println("Both are not the same");
        }


        // How to use substring method.
        // substring() = a method used to extract a portion of a string.
        // substirng(start,end)

        String Email = "Drexcgn345@gmail.com";

        String username = Email.substring(0,7); // the last index is exclusive
        System.out.println(username);

        String domain = Email.substring(11);
        System.out.println(domain);

        // but for different emails of different lenght we would have enter the indices again.
        // so we make it more flexible by using indexOf method

        String Email2= "Dhruv356@gmail.com";
        String user = Email2.substring(0,Email2.indexOf("@"));
        String domain2 = Email2.substring(Email2.indexOf("@"));
        System.out.println(user);
        System.out.println(domain2);





    }
}
