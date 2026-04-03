// Class: This is a blueprint. It defines what a "Car" is.
public class Car {

    // Attributes (fields) shared by all Car objects
    String color;
    int speed;

    // Method to display car details
    void displayInfo() {
        System.out.println("Color: " + color + ", Speed: " + speed + " mph");
    }
}

public class Main {
    public static void main(String[] args) {

        // Objects: These are actual instances created from the Car class.
        // Each object has its own unique data stored in memory.

        Car car1 = new Car();   // First object
        car1.color = "Red";
        car1.speed = 50;

        Car car2 = new Car();   // Second object
        car2.color = "Blue";
        car2.speed = 70;

        // Displaying object data
        System.out.println("Car 1 Details:");
        car1.displayInfo();

        System.out.println("Car 2 Details:");
        car2.displayInfo();

        // This demonstrates that the class defines structure,
        // but objects hold actual values and behave independently.
    }
}
