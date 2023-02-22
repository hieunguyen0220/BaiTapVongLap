import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
       int height;
       int width;
       int i;
       Scanner sc = new Scanner(System.in);

        System.out.println("height = ");
        height = sc.nextInt();
        System.out.println("width = ");
        width = sc.nextInt();

        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("+ ");
            }
            System.out.println("");
        }
    }
}
