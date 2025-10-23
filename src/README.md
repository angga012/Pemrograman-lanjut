Berikut contoh **README.md** yang cocok untuk kode Java tersebut 👇

---

# 🧩 Program Sapa Pengguna (Java)

Repositori ini berisi program sederhana menggunakan bahasa pemrograman **Java** yang meminta pengguna untuk memasukkan **nama** dan **umur**, kemudian menampilkan sapaan serta keterangan apakah pengguna sudah dewasa atau masih remaja.
Program ini merupakan latihan dasar untuk memahami **input/output**, **struktur kontrol**, dan **penggunaan class `Scanner`** pada Java.

---

## 📚 1. Deskripsi Program

Program ini meminta input berupa:

* **Nama** (tipe data `String`)
* **Umur** (tipe data `int`)

Setelah data dimasukkan, program akan menampilkan:

* Sapaan dengan menyebut nama pengguna.
* Pesan tambahan:

    * “Kamu sudah dewasa.” jika umur ≥ 18
    * “Kamu masih remaja.” jika umur < 18

---

## 🧠 2. Konsep yang Dipelajari

* **Input menggunakan `Scanner`**
* **Operator ternary (`?:`)**
* **Percabangan logika (if-else sederhana)**
* **Output dengan `System.out.println`**

---

## 💻 3. Kode Program

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = in.nextLine();

        System.out.print("Umur: ");
        int umur = in.nextInt();

        System.out.println("\nHalo, " + nama + "!");
        System.out.println(umur >= 18 ? "Kamu sudah dewasa." : "Kamu masih remaja.");

        in.close();
    }
}
```

---

## ▶️ 4. Cara Menjalankan Program

1. Simpan kode di atas dengan nama **Main.java**
2. Buka terminal atau command prompt
3. Jalankan perintah berikut:

```bash
javac Main.java
java Main
```

4. Masukkan nama dan umur saat diminta.

---

## 🧾 5. Contoh Output

```
Nama: Anggara
Umur: 17

Halo, Anggara!
Kamu masih remaja.
```

---