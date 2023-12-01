import javax.accessibility.AccessibleRole;

public class HW_2_2 {
    // TASK: Create a program to divide the booty on a pirate ship.
    // By custom, half of the booty goes to the owner of the ship,
    // half of the rest goes to the captain, and the rest is divided
    // equally among all shipmates, including the captain.
    //
    //The size of the booty (for example, in piastres) and the number
    // of pirates on the ship should be set as variables.
    //
    //Print on the screen who gets how many piastres.
    //
    //Additional task with an asterisk:
    //Try to figure out how the program can check if the division is correct.

    public static void main(String[] args){
        int totalLoot = 10; //piastres
        int crewSize = 2;  //pirates (including the captain)

        // VERSION 1 (we can't crush piastres):
        int ownersShare = totalLoot / 2;
        int captainsShare = (totalLoot - ownersShare) / 2;
        int commonShare = (totalLoot - ownersShare - captainsShare) / crewSize;

        int totalDistributed = ownersShare + captainsShare + commonShare * crewSize;

        System.out.println("\nTo owner: " + ownersShare);
        System.out.println("To captain: " + (captainsShare + commonShare));
        System.out.println("To ordinary pirate: "  + commonShare);

        System.out.println("TOTAL: " + totalDistributed);
        System.out.println("REST: " + (totalLoot - totalDistributed));

        // Tests:
        System.out.println("\n---TESTS---");
        // 1. The booty given away cannot be greater than the loot
        System.out.println("Did we give away less than the total loot? "
                            + (totalDistributed <= totalLoot) + ", " + totalDistributed + "<=" + totalLoot);
        // 2. The rest can't be less than the crew size
        System.out.println("Is the rest of the piastres less than the pirates? "
                            + ((totalLoot - totalDistributed) < crewSize) + ", piastres left: " + (totalLoot - totalDistributed));

        /*
        // VERSION 2 (we can crush piastres):
        double halfBooty = totalLoot * 1.0 / 2;
        System.out.println("The ship's owner will have: " + halfBooty);

        double halfRest = halfBooty / 2;
        double perPirate = halfRest / crewSize;
        System.out.println("The each pirate will have: " + perPirate);
        System.out.println("The captain will have: " + (halfRest + perPirate));

        // Test:
        // The booty given away should be equal the loot
        double distributed = halfBooty + (halfRest + perPirate) + perPirate*(crewSize-1);
        if (distributed == totalLoot) {
            System.out.println("\nTest is pass!");
        } */
    }
}
