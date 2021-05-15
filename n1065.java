import java.util.Scanner;

public class n1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=input;i++){
            if(checkNum(i)){count +=1;}
        }
        System.out.println(count);
    }

    static public boolean checkNum(int a){
        double num = a;
        int n1 = (int) num % 10;
        int cha = 11;
        while (num >= 10){
            num = (int) num *0.1;
            int n2 = (int) num % 10;

            if(cha != 11){
                if (n1-n2 != cha) {return false;}
            }
            cha = n1 - n2;
            n1 = n2;
        }
        return true;
    }
}


