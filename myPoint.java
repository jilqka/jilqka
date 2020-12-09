public class myPoint {
    private double x;
    private double y;
    public myPoint(){
      setX(0);
      setY(0);
    }
    public myPoint(double a, double b){
    setX(a);
    setY(b);
    }
    public double distance(myPoint random){
        return Math.sqrt((random.x-x)*(random.x-x)+(random.y-y)*(random.y-y));
    }
    public double distance(double a, double b){
        return Math.sqrt((this.x-a)*(this.x-a)+(this.y-b)*(this.y-b));
    }
    public static double distance(myPoint n, myPoint m){
        return n.distance(m.x,m.y);
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
