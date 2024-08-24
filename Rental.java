class Rental {
    private static Vehicle vehicle;
    private static Customer customer;
    private static int rentalDays;

    public Rental(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateRentalCost() {
        return vehicle.getprice() * rentalDays;
    }

    public void displayInfo() {
        System.out.println("Rental Details:");
        vehicle.displayInfo();
        customer.displayInfo();
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateRentalCost());
    }
}