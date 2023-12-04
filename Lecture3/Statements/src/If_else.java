public class If_else {

    public static void main(String[] args) {
        int personAge = 10;
        int maxAge = 50;
        int minAge = 10;

        System.out.println("Are you " + minAge + " years old or younger, or are you older than " + maxAge + " years old?");

        // && - and
        // || - or
        // == - equal
        // != - not equal

        if (personAge <= minAge || personAge > maxAge) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
