public class ClassAndObjectCreation{
    public static void main(String[] args) {
        Car firstCar = new Car("Toyota", "Camry", 2022);
        Car secondCar = new Car("Honda", "City", 2023);

        firstCar.displayDetails();
        secondCar.displayDetails();
    }
}

class Car {
    String make;
    String model;
    int year;

    Car(String mk, String md, int yr) {
        make = mk;
        model = md;
        year = yr;
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}