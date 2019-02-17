package pbo3_remed_10116049_m.ibad.guthwara_soal2;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 */
public class Soal2 {
    public static int saldo;
    public static int jumlah;
    
    
    public static void main(String[] args) {
       Scanner baca = new Scanner(System.in);
        
       System.out.println("====PROGRAM PENARIKAN UANG ====");
       System.out.print("Masukan Saldo Awal : ");
       saldo = baca.nextInt();
       
       Tabungan tabungan = new Tabungan(saldo);
      
       System.out.println("Saldo Anda Sekarang : " 
                           + tabungan.ambilUang(jumlah));
    }
}
