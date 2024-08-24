public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", "Toyota", 50.0, 5);
        Vehicle bike = new Bike("XYZ456", "Yamaha", 20.0, true);

        Customer customer1 = new Customer("Tharun", "L123456");
        Customer customer2 = new Customer("Ronaldo", "L654321");

        Rental rental1 = new Rental(car, customer1, 3);
        Rental rental2 = new Rental(bike, customer2, 5);

        rental1.displayInfo();
        System.out.println();
        rental2.displayInfo();
    }
}
