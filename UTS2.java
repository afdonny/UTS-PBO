import java.util.Scanner;
public class UTS2 {
    public static void main(String[] args) {
        Scanner Berat = new Scanner(System.in);
        System.out.println("Masukkan Berat Badan ");
        String beratAnda = Berat.nextLine();

        Scanner Tinggi = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Badan ");
        String beratAnda = Tinggi.nextLine();

        if (Berat() > Tinggi){
            System.out.println("Anda Ideal");
        }
    }
    
}