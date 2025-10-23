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
