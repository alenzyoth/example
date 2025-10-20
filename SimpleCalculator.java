/**
 * Program Kalkulator Sederhana
 * Program ini melakukan operasi matematika dasar
 *
 * @author Susilo Adi Nugroho
 * @version 1.0
 */
public class SimpleCalculator {

    /**
     * Method utama untuk menjalankan program
     *
     * @param args argumen command line
     */
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("   KALKULATOR SEDERHANA v1.0");
        System.out.println("=================================\n");

        // Membuat objek Calculator
        Calculator calc = new Calculator();

        // Test operasi matematika
        double a = 10;
        double b = 5;

        System.out.println("Angka pertama: " + a);
        System.out.println("Angka kedua: " + b);
        System.out.println();

        // Melakukan berbagai operasi
        System.out.println("Hasil Penjumlahan: " + calc.add(a, b));
        System.out.println("Hasil Pengurangan: " + calc.subtract(a, b));
        System.out.println("Hasil Perkalian: " + calc.multiply(a, b));
        System.out.println("Hasil Pembagian: " + calc.divide(a, b));
        System.out.println("Hasil Modulus: " + calc.modulus(a, b));

        System.out.println("\n=================================");
        System.out.println("   Program Selesai");
        System.out.println("=================================");
    }
}