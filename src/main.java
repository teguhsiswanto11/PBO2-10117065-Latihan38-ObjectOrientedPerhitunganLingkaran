/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Melakukan validasi agar input diameter yang masuk
 * adalah bilangan/angka kemudian menghitung jari-jari, luas, dan keliling lingkaran
 * dengan konsep OOP
 *
 */
public class main {

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
}
