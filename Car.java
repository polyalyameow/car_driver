public class Car extends Vehicle {

    public Car() {
        System.out.println("Car created. 100 miles to go!");
    }

    protected Driver driver = null;
    protected int counter = 100;

    @Override
    public void drive() {
        if (driver == null) {
            System.out.println("Car didn't drive - there's no driver!");
        } else {
            if (counter >= 10) {
                counter -= 10;
                System.out.println("Car drove 10 miles - " + counter + " miles to go");
            } else {
                System.out.println("No miles left");
            }

        }
    }

    @Override
    public void setDriver(Driver person) {
        if (person.age < 18) {
            System.out.println("Driver not changed! " + person.name + " is " + person.age
                    + ", but must be 18 or older to drive car");
        } else {
            driver = person;
            System.out.println("Driver changed to " + person.name);
        }
    }

}
