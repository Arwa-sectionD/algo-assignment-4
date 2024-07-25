import java.util.Scanner;

public class EnergyBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for customer details
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter electricity usage in kWh: ");
        double electricityUsage = scanner.nextDouble();
        System.out.println("Enter gas usage in units: ");
        double gasUsage = scanner.nextDouble();

        // Prompt to check if the customer uses green energy
        System.out.println("Does the customer use green energy? (yes/no): ");
        scanner.nextLine(); // consume newline
        String greenEnergy = scanner.nextLine();

        if (greenEnergy.equalsIgnoreCase("yes")) {
            System.out.println("Enter solar energy contribution in kWh: ");
            double solarContribution = scanner.nextDouble();
            GreenEnergyBill greenEnergyBill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarContribution);
            greenEnergyBill.displayBill();
        } else {
            EnergyBill energyBill = new EnergyBill(name, address, electricityUsage, gasUsage);
            energyBill.displayBill();
        }

        scanner.close();
    }
}
