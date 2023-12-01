public class HW_2_1 {
    // TASK: You need to create integer variables a and b, assign arbitrary values
    // to the variables of your choice and output the results of the following operations
    // with these variables: addition, multiplication, subtraction, division and remainder of division.
    // Also do a parity check on these variables and output the result.

    public static void main(String[] args) {
        int a = 15;
        int b = 6;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int multiplication = a * b;
        System.out.println("a * b = " + multiplication);

        int sub = a - b;
        System.out.println("a - b = " + sub);

        System.out.println("a / b =  " + a * 1.0 / b);
        System.out.println("integer part of the division a on b: " + a / b);
        System.out.println("remainder of the division a on b: " + a % b);

        System.out.println("\n---parity check---");
        System.out.println("remainder of the division 'a' on 2 is: " + a % 2);
        System.out.println("Is \"a\" an even number? " + (a % 2 == 0));
        System.out.println("remainder of the division 'b' on 2 is: " + b % 2);
        System.out.println("Is \"b\" an even number? " + (b % 2 == 0));

    }
}
