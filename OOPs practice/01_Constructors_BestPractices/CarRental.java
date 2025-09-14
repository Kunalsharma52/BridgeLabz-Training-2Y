class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateCost();
    }

    private void calculateCost() {
        totalCost = rentalDays * 50.0;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total: $" + totalCost);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Alice", "Sedan", 3);
        cr.display();
    }
}
