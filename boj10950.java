import java.util.Scanner;

public class boj10950 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a+b);
        }

        scanner.close();
    }
}
