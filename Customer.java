class Customer {
    private static String name;
    private static String licenseNumber;

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void displayInfo() {
        System.out.println("Customer - Name: " + name + ", License Number: " + licenseNumber);
    }
}