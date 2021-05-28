public class ColorPointMain {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"입니다. ");
        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
        cp2.setXY(5,5);
        cp2.setColor("RED");
        System.out.println(cp2.toString()+"입니다.");
    }
}
