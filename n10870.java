import java.util.Scanner;

public class n10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fn(num));
    }

    static public int fn(int a){
        if(a == 1){
            return 1;
        }else if(a == 0){
            return 0;
        }else{
            return fn(a-1) + fn(a-2);
        }
    }
}
