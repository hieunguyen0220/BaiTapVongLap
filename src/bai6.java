import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        System.out.printf("Nhập chiều cao của tam giác: ");
        height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
