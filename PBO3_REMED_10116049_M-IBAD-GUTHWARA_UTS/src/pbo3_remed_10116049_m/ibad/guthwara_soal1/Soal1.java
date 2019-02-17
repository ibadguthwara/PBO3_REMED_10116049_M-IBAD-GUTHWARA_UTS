package pbo3_remed_10116049_m.ibad.guthwara_soal1;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 */
public class Soal1 {
    private static int yearBirth;
    static int umur;   
    
    public static void main(String[] args) {
       
        
       Scanner baca = new Scanner(System.in);
       
       Usia objUsia = new Usia(2018);       // perhitungan saat tahun 2018
       System.out.print("Masukan Tahun Lahir Anda : ");
       yearBirth = baca.nextInt();
       objUsia.setYearBirth(yearBirth);
      
       System.out.println("");
       System.out.println("");
       System.out.println("=====HASIL PERHITUNGAN UMUR====");
       System.out.println("Tahun Lahir Anda : " + objUsia.getYearBirth());
       System.out.println("Hari ini Tahun : " + objUsia.getYearNow());
       System.out.println("Umur kamu sampai hari ini adalah " + objUsia.hitungUmur() + " tahun");
       System.out.println("Tandanya Kamu " + objUsia.tandanyaKamu(umur));
    }
}