import java.util.Scanner;

class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}
class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bushra 24csu265");
        System.out.println("Enter no. of tyres:");
        int tyres = sc.nextInt();
        Vehicle v;
        switch (tyres) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }
        v.display();
    }
}