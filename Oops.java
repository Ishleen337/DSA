public class Oops {

    abstract class Vehicle {

        private String number;   // Encapsulation

        public Vehicle(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        abstract void park();    // Abstraction
    }

    class Car extends Vehicle {

        public Car(String number) {
            super(number);
        }

        @Override
        void park() {
            System.out.println("Car " + getNumber() + " parked.");
        }
    }

    class Bike extends Vehicle {

        public Bike(String number) {
            super(number);
        }

        @Override
        void park() {
            System.out.println("Bike " + getNumber() + " parked.");
        }
    }

    class Truck extends Vehicle {

        public Truck(String number) {
            super(number);
        }

        @Override
        void park() {
            System.out.println("Truck " + getNumber() + " parked.");
        }
    }

    class Bus extends Vehicle {

        public Bus(String number) {
            super(number);
        }

        @Override
        void park() {
            System.out.println("Bus " + getNumber() + " parked.");
        }
    }

    public static void main(String[] args) {

        Oops obj = new Oops();

        Vehicle v1 = obj.new Car("CH01AU5679");
        Vehicle v2 = obj.new Bike("CHS0008");
        Vehicle v3 = obj.new Truck("HR02AX0006");
        Vehicle v4 = obj.new Bus("PB39M1365");

        v1.park();
        v2.park();
        v3.park();
        v4.park();
    }
}