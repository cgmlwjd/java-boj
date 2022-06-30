import java.util.*;

public class boj2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H == 0){
            if(M < 45){
                H = 23;
                M = M + 60 - 45;
                System.out.printf("%d %d", H, M);
            }
            else{
                if(M >= 45){
                    M = M - 45;
                    System.out.printf("%d %d", H, M);
                }
            }
        }

        else {
            if(H <= 23){
                if(M < 45){
                    H = H - 1;
                    M = M + 60 - 45;
                    System.out.printf("%d %d", H, M);
                }
                else{
                    if(M >= 45){
                        M = M - 45;
                        System.out.printf("%d %d", H, M);
                    }
                }
            }
        }

        sc.close();
    }
}
