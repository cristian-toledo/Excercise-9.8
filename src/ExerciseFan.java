//* Exercise 9.8
//  (The Fan class) Design a class named Fan to represent a fan. The class contains:
//
// Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
//denote the fan speed.
//A private int data field named speed that specifies the speed of the fan (the
//default is SLOW).
//A private boolean data field named on that specifies whether the fan is on
//(the default is false).
//A private double data field named radius that specifies the radius of the fan
//(the default is 5).
//A string data field named color that specifies the color of the fan
//(the default is blue).
//The accessor and mutator methods for all four data fields.
//A no-arg constructor that creates a default fan.
//A method named toString() that returns a string description for the fan. If
//the fan is on, the method returns the fan speed, color, and radius in one
//combined string. If the fan is not on, the method returns the fan color and
//radius along with the string “fan is off” in one combined string.
// Cristian Toledo
//Due: 10-1-17
public class ExerciseFan {
    public static void main(String[] args) {
        final int SLOW = 1;       // Fan speed slow
        final int MEDIUM = 2;  // Fan speed medium
        final int FAST = 3;       // Fan speed fast

        //Fans
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // speed, radius and color of the first fan
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        // speed, radius and color of the second fan
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
