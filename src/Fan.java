//
/*         Fan         /*
/ * --------------------*
/ * +SLOW: int          *
/ * ----------          *
/ * +MEDIUM: int        *
/ * ------------        *
/ * +FAST: int          *
/ * ----------          *
/ * -speed: int         *
/ * -on: boolean        *
/* -radius: double      *
/* +color: String       *
/* +Fan()               *
/* +setSpeed(int)       *
/* +turnOn()            *
/* +turnOff()           *
/* +setRadius(double):  *
/* +setColor(String):   *
/* +getSpeed(): String  *
/* +isOn(): boolean     *
/* +getRadius(): double *
/* +getColor(): String  *
/* +toString(): String  */

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;

    private boolean on;

    private double radius;
    String color;

    //Constructor
    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //Speed
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    //Turning fan on
    public void turnOn() {
        on = true;
    }

    //Turning fan off
    public void turnOff() {
        on = false;
    }

    //Color of the fan
    public void setColor(String newColor) {
        color = newColor;
    }

    //Radius of the fan
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    //Returns fan speed
    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW"; break;
            case MEDIUM: s = "MEDIUM"; break;
            case FAST: s = "FAST";
        }
        return s;
    }

    //Returns if fan is On
    public boolean isOn() {
        return on;
    }

    //Returns Radius of the fan
    public double getRadius() {
        return radius;
    }

    //Returns the color of the fan
    public String getColor() {
        return color;
    }

    //Returns complete description of the fan
    public String toString() {
        if (on == true) {
            return "\nFan speed: " + getSpeed() + ", color: " + color +
                    ", radius: " + radius + "\n";
        }
        else{
            return "\nFan color: " + color + ", radius: " + radius +
                    "\nfan is off\n";
        }
    }
}
