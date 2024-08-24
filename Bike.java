class Bike extends Vehicle {
    private static boolean hasGear;

    public Bike(String bikeno, String brand, double priceperhour, boolean hasGear) {
        super(bikeno, brand, priceperhour);
        this.hasGear = hasGear;
    }

    public boolean isHasGear() {
        return hasGear;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }
    @Override
    public void displayInfo() {
        System.out.println("Bike - License Plate: " + getbikeno() + ", Brand: " + getBrand() +
                ", Model: " + ", Rental Rate: " + getprice() + 
                ", Has Gear: " + hasGear);
    }
}