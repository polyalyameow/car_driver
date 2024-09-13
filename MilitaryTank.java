public class MilitaryTank extends Vehicle {

    public MilitaryTank() {
        System.out.println("Tank created. 2000 miles to go!");
    }

    protected Driver driver = null;
    protected int counter = 2000;

    @Override
    public void drive() {
        if (driver == null) {
            System.out.println("Tank didn't drive - there's no driver!");
        } else {
            if (counter >= 5) {
                counter -= 5;
                System.out.println("Tank drove 5 miles - " + counter + " miles to go");
            } else {
                System.out.println("No miles left");
            }

        }
    }

    @Override
    public void setDriver(Driver person) {
        if (person.age < 25) {
            System.out.println("Driver not changed! " + person.name + " is " + person.age
                    + ", but must be 25 or older to drive car");
        } else {
            driver = person;
            System.out.println("Driver changed to " + person.name);
        }
    }

}
