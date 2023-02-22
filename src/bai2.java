import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double tien_gui=1.0;
        int thang=1;
        double lai_suat=1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money: ");
        tien_gui = input.nextDouble();
        System.out.println("Enter months: ");
        thang = input.nextInt();
        System.out.println("Enter lai_suat: ");
        lai_suat = input.nextDouble();
        double tien_lai = 0;
        for (int i = 0; i < thang; i++) {
            tien_lai += tien_gui * (lai_suat/100)/12 * thang;
        }
        System.out.println("Total of interest: " + tien_lai);
    }
}
