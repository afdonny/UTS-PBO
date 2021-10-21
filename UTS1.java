import java.util.Scanner;
public class UTS1 {
    static void tugasUts(String inputWaktu){
        String Waktu = inputWaktu;
        System.out.println( Waktu );
    }
    public static void main(String[] args){
        Scanner Jam = new Scanner(System.in);
        System.out.println("Masukkan Jam Awal ");
        String jamAwalAnda = Jam.nextLine();
        
        Scanner Menit = new Scanner(System.in);
        System.out.println("Masukkan Menit Awal ");
        String menitAwalAnda = Menit.nextLine();
        
        Scanner Detik = new Scanner(System.in);
        System.out.println("Masukkan Detik Awal ");
        String detikAwalAnda = Detik.nextLine();

        tugasUts( jamAwalAnda +" Jam,"+ 
        menitAwalAnda +" Menit,"+
        detikAwalAnda +" Detik" );
    }
}
