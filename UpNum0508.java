import java.util.Scanner;

public class UpNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(double j = 0;j<Math.pow(10,n);j++){
            boolean result = check(j);
            if (result){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean check(double num){
        int remember = 9;
        do{
            int a = (int) num%10;
            if(a<=remember){
                remember = a;
                num = (num - (double) a) * 0.1;
            }else{
                return false;
            }
        }while(num != 0);
        return true;
    }
}
