public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean switchedON;
    private double radius;
    private String color;

    public Fan() {
        this.speed=SLOW;
        this.switchedON=false;
        this.radius=5;
        this.color="blue";
    }

    public void on(){
        this.switchedON=true;
    }
    public void off(){
        this.switchedON=false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSwitchedON() {
        return switchedON;
    }

    public void setSwitchedON(boolean switchedON) {
        this.switchedON = switchedON;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void ToString(){
        if (isSwitchedON()){
            System.out.printf("Speed: %d%nColor:%s%nRadius%.2f%n",getSpeed(),getColor(),getRadius());
        }
        else {
            System.out.printf("Color%s%nRadius%.2f%nThe fan is switched off",getColor(),getRadius());
        }

    }
}
