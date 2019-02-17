package pbo3_remed_10116049_m.ibad.guthwara_soal2;
import java.util.Scanner;
/**
 *
 * @author ibadguthwara
 */
public class Tabungan {
    
   Scanner baca = new Scanner(System.in);
   private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
   
    public int ambilUang(int jumlah) { 
        System.out.print("Jumlah Uang Yang Diambil : ");
        jumlah = baca.nextInt();
    return saldo - jumlah;   
   }
}
