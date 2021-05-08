import java.util.Scanner;

public class Stone0508{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turn = sc.nextInt();
        if(turn%2){System.out.println("SK");}
        else{System.out.println("CY");}
    }
}