public class For {

    public static void main(String[] args) {

        // infinite loop
        for (int i = 0; i < 5 || i == 101; i++) {
            i = 100;
            System.out.println(i);
        }
        System.out.println("End!");
    }
}
