public class logical_operators {
    public static void main(String [] args){

        // && == AND
        // || == OR
        // ! == NOT

        boolean a = true;
        boolean b = false;
        boolean c = true;

        // AND operator
        boolean andResult = a && b;
        System.out.println("AND Result: " + andResult); // false
        // OR operator
        boolean orResult = a || b;
        System.out.println("OR Result: " + orResult); // true
        // NOT operator
        boolean notResult = !c;
        System.out.println("NOT Result: " + notResult); // false
        // Combining operators
        boolean combinedResult = (a && b) || (!c);
        System.out.println("Combined Result: " + combinedResult); // false

         
    }
}
