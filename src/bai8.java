import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập n: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int dem = 0;
        for (int j = 1; j < n; j++) {
            if (1 % j == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            System.out.println("" + i);
        }
        }

    }
}
