import java.util.*;

public class boj1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int cnt = 0;

        int n = sc.nextInt();
        num = n;

        while(true){
            int a = n / 10;
            int b = n % 10;
            int c = (a + b) % 10;
            int d = (b * 10) + c;

            n = d;
            cnt++;
            
            if(num == d){
                break;
            }
        }

        System.out.println(cnt);

        sc.close();

    }
}
