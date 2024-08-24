class Car extends Vehicle {
    private static int seatingCapacity;

    public Car(String bikeno, String brand, double priceperhour, int seatingCapacity) {
        super(bikeno, brand, priceperhour);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayInfo() {
        System.out.println("Car - License Plate: " + getbikeno() + ", Brand: " + getBrand() +
                ", Model: " + ", Rental Rate: " + getprice() + 
                ", Seating Capacity: " + seatingCapacity);
    }
}