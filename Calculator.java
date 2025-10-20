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