 public class GreenEnergyBill extends EnergyBill {
    private double solarEnergyContribution; // in kWh

    // Constructor
    public GreenEnergyBill(String customerName, String address, double electricityUsage, double gasUsage, double solarEnergyContribution) {
        super(customerName, address, electricityUsage, gasUsage);
        this.solarEnergyContribution = solarEnergyContribution;
    }

    // Getter
    public double getSolarEnergyContribution() {
        return solarEnergyContribution;
    }

    // Override method to calculate total bill with solar contribution deduction
    @Override
    public double calculateTotalBill() {
        double electricityBill = (getElectricityUsage() - solarEnergyContribution) * 0.12;
        if (electricityBill < 0) electricityBill = 0; // Ensure no negative bill
        double gasBill = getGasUsage() * 0.08;
        return electricityBill + gasBill;
    }

    // Override method to display bill with solar energy details
    @Override
    public void displayBill() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Address: " + getAddress());
        System.out.println("Electricity Usage: " + getElectricityUsage() + " kWh");
        System.out.println("Solar Energy Contribution: " + solarEnergyContribution + " kWh");
        System.out.println("Gas Usage: " + getGasUsage() + " units");
        System.out.println("Total Bill: $" + calculateTotalBill());
    }
}
