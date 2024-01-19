public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance() {
        double d = Math.sqrt(x * x + y * y);
        return d;
    }

    public double distance(int x, int y){
        double d = Math.sqrt((this.x - x)* (this.x - x) + (this.y - y)* (this.y - y));
        return d;
    }
    public double distance(Point P){
        double d = Math.sqrt((this.x - P.x)* (this.x - P.x) + (this.y - P.y)* (this.y - P.y));
        return d;
    }


}
