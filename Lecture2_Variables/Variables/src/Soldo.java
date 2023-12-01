public class Soldo {

    public static void main(String[] args) {
        int lancers = 120;
        int doppelsoldners = 30;
        int leutenants = 2;
        int capitans = 1;

        int baseSalary = 4;
        int lancerSalary = baseSalary;
        int doppelSalary = 2 * lancerSalary;

        System.out.print("Total Salary: ");
        System.out.println(lancers * baseSalary
                            + doppelsoldners * doppelSalary
                            + leutenants * 10*baseSalary
                            + capitans * 100*baseSalary);
    }
}
