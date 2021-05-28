

class Circle{
    class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    int radius;
    Point center;
    public Circle(int rad,int x, int y){
        this.radius = rad;
        this.center = new Point(x,y);
    }

    double calArea(){
        return 3.14 * radius * radius;
    }
}

public class Innertest05015 {
    public static void main(String[] args) {
        Circle obj = new Circle(10, 0, 0);
        System.out.println("원의 면적: " + obj.calArea());
    }
}