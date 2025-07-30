public class varargs {
    public  static void main(String[] args){
        // varargs = allow a method to accept a varying number of argument
        //           it makes metjods more felxible , no need for overloaded methods
        //  
        
        System.out.println(add(2,4,5));
        System.out.println(average(3,5,9,10));
    }

    static int add(int... numbers){
        int sum =0;

        for(int num : numbers){
            sum+=num;
        }

        return sum;
    }

    static double average( double ... numbers){
        double sum = 0;
        if(numbers.length == 0){
            return 0;
        }
        for(double num : numbers){
            sum+=num;
        }

        return sum/numbers.length;
    }
}
