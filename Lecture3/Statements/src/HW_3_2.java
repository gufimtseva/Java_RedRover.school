public class HW_3_2 {

    public static void main(String[] args) {
        // You need to create an integer variable,
        // assign an arbitrary value to a variable of your choice and output the following strings:
        // greater than 10 - if the variable is greater than 10
        // less than 100 - if the variable is less than 100
        // the result of division by 2 is greater than 20 - if true
        // the value of the variable between 5 and 40 inclusive - if true
        // the value of the variable is less than 5 or greater than 40 - if the previous conditions are false

        int a = 95;

        if (a > 10) {
            System.out.println("greater than 10");
        }

        if (a < 100) {
            System.out.println("less than 100");
        }

        if ((a / 2.0) > 20 ) {
            System.out.println("the result of division by 2 (" + a / 2.0 + ") is greater than 20");
        }

        if (a >= 5 && a <= 40) {
            System.out.println("the value of the variable between 5 and 40 inclusive");
        } else {
            System.out.println("the value of the variable is less than 5 or greater than 40");
        }
    }
}
