public class HW_3_3 {

    public static void main(String[] args) {
        // You need to create two integer variables (a, b),
        // assign arbitrary values to the variables of your choice and print the following lines:
        // maybe a and b are even - if the sum of the variables is even
        // some variable is odd - if the sum of variables is odd

        int a = 17;
        int b = 16;

        int sum = a + b;

        if (sum % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}
