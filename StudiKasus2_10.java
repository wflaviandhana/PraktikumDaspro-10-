import java.util.Scanner;

public class StudiKasus2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;

        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = input.nextInt();

        System.out.print("Peringkat juara : ");
        peringkatJuara = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            if (jumlahDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + (4 - jumlahDokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan.");
                }
            }
        }

        input.close();
    }
}