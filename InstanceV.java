public class InstanceV {
    public static void main(String[] args){
        Area.manual();
        //Area.triangle();
        //Area.rectangle();

        Area ar = new Area();
        ar.manual();
        System.out.println(ar.triangle(3,5));
        System.out.println(ar.rectangle(3,4));


    }
}

class Area{
    static void manual(){
        System.out.println("현재 사용 가능한 함수 목록");
        System.out.println("tangle: 삼각형의 넓이");
        System.out.println("rectangle: 사각형의 넓이");
        System.out.println("입니다");
    }

    double triangle(int a, int b){
        return (double)a*b/2;
    }

    int rectangle(int a, int b){
        return a*b;
    }
}