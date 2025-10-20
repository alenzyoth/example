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

/**
 * Kelas Calculator untuk operasi matematika
 * Menyediakan method dasar aritmatika
 */
class Calculator {

    /**
     * Menjumlahkan dua angka
     *
     * @param num1 angka pertama
     * @param num2 angka kedua
     * @return hasil penjumlahan
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Mengurangkan dua angka
     *
     * @param num1 angka pertama
     * @param num2 angka kedua
     * @return hasil pengurangan
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Mengalikan dua angka
     *
     * @param num1 angka pertama
     * @param num2 angka kedua
     * @return hasil perkalian
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Membagi dua angka
     *
     * @param num1 angka pertama (pembilang)
     * @param num2 angka kedua (penyebut)
     * @return hasil pembagian
     * @throws ArithmeticException jika pembagi adalah 0
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan 0");
        }
        return num1 / num2;
    }

    /**
     * Menghitung sisa hasil bagi (modulus)
     *
     * @param num1 angka pertama
     * @param num2 angka kedua
     * @return sisa hasil bagi
     */
    public double modulus(double num1, double num2) {
        return num1 % num2;
    }

    /**
     * Menghitung pangkat
     *
     * @param base bilangan dasar
     * @param exponent pangkat
     * @return hasil perpangkatan
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Menghitung akar kuadrat
     *
     * @param num angka yang akan diakarkan
     * @return hasil akar kuadrat
     */
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
