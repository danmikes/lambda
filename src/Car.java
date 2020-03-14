class Car implements Vehicle, Alarm {

    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.speedDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        System.out.println(Vehicle.getHorsePower(2500, 480));
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "Car is accelerating";
    }

    @Override
    public String speedDown() {
        return "Car is decelerating";
    }

    @Override
    public String turnAlarmOn() {
        return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
    }

}

interface Vehicle {

    String getBrand();

    String speedUp();

    String speedDown();

    default String turnAlarmOn() {
        return "Turning vehicle alarm on";
    }

    default String turnAlarmOff() {
        return "Turning vehicle alarm off";
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}

interface Alarm {

    default String turnAlarmOn() {
        return "Turning alarm on";
    }

    default String turnAlarmOff() {
        return "Turning alarm off";
    }
}
