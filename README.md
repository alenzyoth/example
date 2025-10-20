# 🧮 Simple Calculator

Program kalkulator sederhana berbasis Java untuk operasi matematika dasar.

---

## 📖 Deskripsi

Simple Calculator adalah aplikasi console yang dapat melakukan operasi matematika dasar seperti:
- Penjumlahan (+)
- Pengurangan (-)
- Perkalian (×)
- Pembagian (÷)
- Modulus (%)
- Perpangkatan (^)
- Akar Kuadrat (√)

Program ini dibuat untuk memenuhi **Codelab 1 & 2** dari Modul 3 - Pemrograman Lanjut.

---

## 🎯 Tujuan

- Memahami dasar-dasar Git dan version control
- Membuat dokumentasi kode dengan JavaDoc
- Praktik commit dan push ke GitHub
- Membuat dokumentasi README yang baik

---

## 📁 Struktur File

```
SimpleCalculator/
├── SimpleCalculator.java    # File utama program
└── README.md               # Dokumentasi ini
```

---

## 🔧 Instalasi

### Prerequisites
- Java Development Kit (JDK) 11 atau lebih tinggi
- Git (untuk version control)

### Langkah Instalasi

1. Clone repository
```bash
git clone https://github.com/username/SimpleCalculator.git
cd SimpleCalculator
```

2. Compile program
```bash
javac SimpleCalculator.java
```

3. Jalankan program
```bash
java SimpleCalculator
```

---

## 🚀 Cara Menggunakan

### Menjalankan Program

```bash
# Compile terlebih dahulu
javac SimpleCalculator.java

# Jalankan program
java SimpleCalculator
```

### Contoh Output

```
=================================
   KALKULATOR SEDERHANA v1.0
=================================

Angka pertama: 10.0
Angka kedua: 5.0

Hasil Penjumlahan: 15.0
Hasil Pengurangan: 5.0
Hasil Perkalian: 50.0
Hasil Pembagian: 2.0
Hasil Modulus: 0.0

=================================
   Program Selesai
=================================
```

---

## 📚 Dokumentasi Method

### Class: Calculator

| Method | Parameter | Return | Deskripsi |
|--------|-----------|--------|-----------|
| `add(num1, num2)` | double, double | double | Menjumlahkan dua angka |
| `subtract(num1, num2)` | double, double | double | Mengurangkan dua angka |
| `multiply(num1, num2)` | double, double | double | Mengalikan dua angka |
| `divide(num1, num2)` | double, double | double | Membagi dua angka |
| `modulus(num1, num2)` | double, double | double | Menghitung sisa bagi |
| `power(base, exp)` | double, double | double | Menghitung perpangkatan |
| `squareRoot(num)` | double | double | Menghitung akar kuadrat |

---

## 💡 Contoh Penggunaan Kode

```java
// Membuat objek Calculator
Calculator calc = new Calculator();

// Melakukan operasi
double hasil1 = calc.add(10, 5);        // 15.0
double hasil2 = calc.multiply(4, 3);     // 12.0
double hasil3 = calc.divide(20, 4);      // 5.0
double hasil4 = calc.power(2, 3);        // 8.0

System.out.println(hasil1);
```

---

## 🔍 Fitur

✅ Operasi matematika dasar (tambah, kurang, kali, bagi)  
✅ Operasi advanced (modulus, pangkat, akar kuadrat)  
✅ Dokumentasi JavaDoc lengkap  
✅ Exception handling untuk pembagian dengan 0  
✅ Code yang clean dan mudah dipahami  

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa**: Java 11+
- **IDE**: IntelliJ IDEA / Eclipse / VS Code
- **Version Control**: Git & GitHub
- **Documentation**: JavaDoc

---

## 📝 Changelog

### Version 1.0 (2025-10-20)
- ✨ Initial release
- ✅ Implementasi operasi dasar (add, subtract, multiply, divide)
- ✅ Implementasi operasi advanced (modulus, power, sqrt)
- ✅ Tambah JavaDoc documentation
- ✅ Buat README.md

---

## 👨‍💻 Author

Susilo Adi Nugroho
- NIM: 202410370110001
- Email: adispt334@gmail.com
- GitHub: @alenzyoth (https://github.com/alenzyoth) 

**Informasi Tugas:**
- Mata Kuliah: Pemrograman Lanjut
- Modul: Modul 3 - Codelab 1 & 2
- Universitas: Universitas Muhammadiyah Malang
- Tahun: 2025

---

## 📄 License

Project ini dibuat untuk keperluan pembelajaran.

---

## 🙏 Terima Kasih

Terima kasih kepada:
- Dosen Pengampu: Ir. Wildan Suharso, M.Kom.
- Asisten Laboratorium Informatika UMM
- Teman-teman yang telah membantu

---

**⭐ Jika project ini membantu, jangan lupa beri star di GitHub! ⭐**
