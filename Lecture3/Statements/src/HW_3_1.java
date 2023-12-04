public class HW_3_1 {

    public static void main(String[] args) {
        // You need to create two integer variables (a, b),
        // assign arbitrary values to the variables of your choice
        // and output the following strings:
        // a == b - if the variables are equal
        // a < b - if variable a is less than b
        // a > b - if variable b is less than a

        int a = 17;
        int b = 16;

        if (a == b) {
            System.out.println("a == b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }
        }
    }
}
