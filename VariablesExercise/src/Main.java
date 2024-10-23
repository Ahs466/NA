// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String firstName, lastName;
        firstName = "Nanika";
        lastName = "Husslayes";
        String name = firstName + " " + lastName;
        System.out.printf("%s\n", name);

        int num1, num2;
        num1 = 5;
        num2 = 4;
        System.out.printf("%s\n", num1 + num2);

        double result = num1 / num2;
        System.out.printf("%s\n", result);

        int num3 = 8;
        System.out.printf("%s %s %s\n", num3++, num3, ++num3);

        int x = 3, y = 5;
        if (x >= 0)
            if (y < x)
                System.out.println("y is less than x");
            else // added in alternative conditionsS
                if (y > x)
                    System.out.println("y is greater than x");
                else
                    System.out.println("y is equal to x");
        else
            System.out.println("x is negative");

        int x2 = 7;
        if (x2 == 0) // used ==
            System.out.println("x is 0");
        else
            System.out.println("x is not 0");

        int x3 = 15, y3 = 24;
        if (x3 % 2 == 0 && y3 % 2 == 0) // removed semicolon
            System.out.println("x and y are even numbers");

        int x4 = 10;
        while (x4 > 0) // removed semicolon
            System.out.println(x4--);
        System.out.println("We have lift off!");

        int x5 = 10;
        while (x5 > 0) {
            System.out.println("x is " + x5);
            x5--; // decremented x5 at end of loop
        }

        int sum = 0;
        for (int i = 0; i < 10; sum += i++ ) // declared and assigned i
            System.out.println("Sum is " + sum);

    }
}