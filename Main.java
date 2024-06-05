import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambahkan buku");
            System.out.println("2. Hapus buku");
            System.out.println("3. Cetak daftar buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukan Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukan Tahun Terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine();  
                    Buku buku = new Buku(judul, penulis, tahunTerbit);
                    System.out.println("Tambahkan di awal atau akhir list? (a/e): ");
                    String posisi = scanner.nextLine();
                    if (posisi.equalsIgnoreCase("a")) {
                        list.addFirst(buku);
                    } else {
                        list.addLast(buku);
                    }
                    break;
                case 2:
                    System.out.println("Hapus dari awal atau akhir list? (a/e): ");
                    String posisiHapus = scanner.nextLine();
                    if (posisiHapus.equalsIgnoreCase("a")) {
                        list.deleteFirst();
                    } else {
                        list.deleteLast();
                    }
                    break;
                case 3:
                    list.printList();
                    break;
                case 4:
                    System.out.println("Keluar.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
