public class RegularPolygon {
    private int n;
    private double sideLength;
    private double x;
    private double y;
    public RegularPolygon(){
        this.n=3;
        this.sideLength=1;
        this.x=0;
        this.y=0;
    }
    public RegularPolygon(int n,double sideLength){
        this.n=n;
        this.sideLength=sideLength;
        this.x=0;
        this.y=0;
    }
    public RegularPolygon(int n,double sideLength,double x,double y){
        this.n=n;
        this.sideLength=sideLength;
        this.x=x;
        this.y=y;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
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
    public double getPerimeter(){
         double perimeter=this.n*this.sideLength;
         return perimeter;
    }
    public double getArea(){
        double area=this.n*(this.sideLength*this.sideLength)/(4*Math.tan(Math.PI/this.n));
        return area;
    }

}
