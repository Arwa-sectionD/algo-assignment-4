public class EnergyBill {
    private String customerName;
    private String address;
    private double electricityUsage; // in kWh
    private double gasUsage; // in units

    // Define rates
    private static final double ELECTRICITY_RATE = 0.12; // per kWh
    private static final double GAS_RATE = 0.08; // per unit

    // Constructor
    public EnergyBill(String customerName, String address, double electricityUsage, double gasUsage) {
        this.customerName = customerName;
        this.address = address;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public double getGasUsage() {
        return gasUsage;
    }

    // Method to calculate total bill
    public double calculateTotalBill() {
        double electricityBill = electricityUsage * ELECTRICITY_RATE;
        double gasBill = gasUsage * GAS_RATE;
        return electricityBill + gasBill;
    }

    // Method to display bill
    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Electricity Usage: " + electricityUsage + " kWh");
        System.out.println("Gas Usage: " + gasUsage + " units");
        System.out.println("Total Bill: $" + calculateTotalBill());
    }
}
