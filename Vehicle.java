abstract class Vehicle {
    private static String bikeno;
    private static String brand;
    private static double priceperhour;

    public Vehicle(String bikeno, String brand, double priceperhour) {
        this.bikeno = bikeno;
        this.brand = brand;
        this.priceperhour = priceperhour;
    }

    public String getbikeno() {
        return bikeno;
    }

    public void setbikeno(String bikeno) {
        this.bikeno = bikeno;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getprice() {
        return priceperhour;
    }

    public void setprice(double priceperhour) {
        this.priceperhour = priceperhour;
    }

    public abstract void displayInfo();
}