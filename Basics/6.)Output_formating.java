public class Output_formating {
    public static void main(String[] args){
        // printf() =  method used to format output
        // %[flags][width][.precision]specific-character
        // %d = decimal integer
        // %f = floating point number
        // %s = string
        // %c = character
        // %b = boolean
        // %n = new line
        
        String name =" Benjamin tennyson";
        int age = 23;
        double height = 188.5;
        boolean isHero = true;

        System.out.printf("Hi!! %s\n", name);
        System.out.printf("He is %d\n",age);
        System.out.printf("%s is %f cm tall\n",name,height);
        System.out.printf("Is he a superhero: %b\n ",isHero);

        // now to set the precision of the number being displayed such as a double

        double price1= 99.61;
        double price2 = 100.3356;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n",price2);

        // Now to format the output in a table like manner
        System.out.printf("%-20s %-10s %-10s %-10s\n", "name", "age", "height", "Hero");
        System.out.printf("%-20s %-10d %-10.2f %-10b\n", name, age, height, isHero);


        // now for flags
        // + = display the sign of the number
        // , = display the number with commas
        //( = display the number in parentheses if it is negative)
        // space = display a space before the number if it is positive

        int num1 = 10000;
        int num2 = -1000;

        System.out.printf("%+d\n", num1); // +10000
        System.out.printf("%,d\n", num1); // 1,000
        System.out.printf("%(d\n", num2); // (1000)
        System.out.printf("% d\n", num1); // 10000 (with a space before the number)

        // Now for width
        // 0 = pad with zeros
        // number = right justified padding with spaces
        // -number = left justified padding with spaces

        int num3 = 1;
        int num4 = 23;
        int num5 = 456;
        int num6 = 7890;

        System.out.printf("%05d\n", num3); // 00001 (padded with zeros)
        System.out.printf("%05d\n", num4); // 00001 (padded with zeros)
        System.out.printf("%05d\n", num5); // 00001 (padded with zeros)
        System.out.printf("%05d\n", num6); // 00001 (padded with zeros)

        System.out.printf("%5d\n", num3); //    1 (right justified with spaces)
        System.out.printf("%5d\n", num4); //   23 (right justified with spaces)
        System.out.printf("%5d\n", num5); //  456 (right justified with spaces)
        System.out.printf("%5d\n", num6); // 7890 (right justified with spaces)
        
        System.out.printf("%-5d\n", num3); // 1    (left justified with spaces)
        System.out.printf("%-5d\n", num4); // 23   (left justified with spaces)
        System.out.printf("%-5d\n", num5); // 456  (left justified with spaces)
        System.out.printf("%-5d\n", num6); // 7890 (left justified with spaces)

        
    }

}
