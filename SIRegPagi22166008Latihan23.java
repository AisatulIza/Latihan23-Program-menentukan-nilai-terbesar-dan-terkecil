package pkgLatihan23;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan perhitungan nilai terbesar dan terkecil menggunakan perulangan for
*/
public class SIRegPagi22166008Latihan23 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("====Program Nilai Terbesar dan Terkecil====");
    //input nama
    System.out.print("Masukkan Nama Petugas : ");
    String nama = input.nextLine();
    //input nilai mahasiswa
    System.out.print("Masukkan Banyaknya Nilai Mahasiswa = ");
    int banyaknyanilai = input.nextInt();
    int nilai[] = new int[banyaknyanilai];
    //vatiabel
    int max,min;
    //perulangan for 
    for(int i = 0; i <banyaknyanilai; i++) {
        //Masukan nilai 
        System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1) +" : ");
        nilai[i]= input.nextInt();
    }
    max = nilai[0];
    min = nilai[0];
    System.out.println("====Hasil Nilai Mahasiswa====");
    //perulangan for 
    for(int i = 0; i<banyaknyanilai; i++) {
        //Menghitung nilai max dan min
        if(nilai[i] > max)
            max = nilai[i];
        if(nilai[i] < min)
            min = nilai[i];
        //output nilai
        System.out.println("Nilai Mahasiswa ke-" + (i+1) + " : " + nilai[i] );
    }
    //output nilai terbesar
    System.out.println("Nilai Terbesar : " +max );
    //output nilai terkecil
    System.out.println("Nilai Terkecil : " + min);
  }
}
