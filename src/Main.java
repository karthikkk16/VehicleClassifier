abstract class Vehicle{
    abstract public String start();
    abstract public String stop();
}

class Car extends Vehicle{
    public String start(){
        return "Car started";
    }
    public String stop(){
        return "Car stopped";
    }
}
class Motorcycle extends Vehicle{
    public String start(){
        return "Motorcycle started";
    }
    public String stop(){
        return "Motorcycle stopped";
    }
}

class Main{
    public static void main(String[] args) {

        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();

        System.out.println(car.start());
        System.out.println(car.stop());
        System.out.println(motorcycle.start());
        System.out.println(motorcycle.stop());
    }
}