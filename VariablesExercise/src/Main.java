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
    }
}