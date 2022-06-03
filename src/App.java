import java.util.Scanner;
import bangunruang.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int pilihan = 0;
        String ulang = "y";
        while(ulang.equalsIgnoreCase("y")){
            pilihan = pilihMenu(keyboard);
            bersihkanLayar();
            if(pilihan==1){
                volumeBalok(keyboard);
            }else if(pilihan==2){
                volumeKerucut(keyboard);
            }else if(pilihan==3){
                volumeTabung(keyboard);
            }else if(pilihan==4){
                volumePrismaSegitiga(keyboard);
            }else if(pilihan==5){
                volumeLimasSegitiga(keyboard);
            }else{
                bersihkanLayar();
                System.out.print("Sampai Jumpa!");
                break;
            }
            System.out.print("Apakah anda ingin mengulang program menghitung bangun ruang(y/n) = ");
            ulang = keyboard.next();
            if (ulang.equalsIgnoreCase("n")) {
                bersihkanLayar();
                System.out.print("Sampai Jumpa!");
            }
        }
    }

    public static int pilihMenu(Scanner keyboard){
        int pilihan;
        System.out.println("=====================================================================================================");
        System.out.println("Program Menghitung Bangun Ruang");
        System.out.println("=====================================================================================================");
        System.out.println("1.Balok");
        System.out.println("2.Kerucut");
        System.out.println("3.Tabung");
        System.out.println("4.Prisma Segitiga");
        System.out.println("5.Limas Segitiga");
        System.out.println("6.Keluar");
        System.out.print("Masukkan Pilihan (1-6) = ");
        pilihan = keyboard.nextInt();
        return pilihan;
    }

    public static void bersihkanLayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void volumeBalok(Scanner keyboard){
        Balok balok = new Balok();
        //Input Panjang, Lebar, Tinggi
        System.out.println("=====================================================================================================");
        System.out.println("Menghitung Volume Balok");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan Panjang(cm) = ");
        balok.panjang = keyboard.nextInt();
        System.out.print("Masukkan Lebar(cm) = ");
        balok.lebar = keyboard.nextInt();
        System.out.print("Masukkan Tinggi(cm) = ");
        balok.tinggi = keyboard.nextInt();
        //Tampilkan Volume Balok
        balok.tampilkanVolumeBalok();
    }

    public static void volumeKerucut(Scanner keyboard){
        Kerucut kerucut = new Kerucut();
        System.out.println("=====================================================================================================");
        System.out.println("Menghitung Volume Kerucut");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan jari-jari kerucut (cm) = ");
        kerucut.r = keyboard.nextInt();
        System.out.print("Masukkan tinggi kerucut (cm) = ");
        kerucut.t = keyboard.nextInt();

        kerucut.hitungVolumeKerucut();
        kerucut.tampilkanVolumeKerucut();
    }

    public static void volumeTabung(Scanner keyboard){
        Tabung tabung = new Tabung();
        System.out.println("=====================================================================================================");
        System.out.println("Menghitung Volume Tabung");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan jari-jari bagian alas atau tutup tabung (cm) = ");
        tabung.r = keyboard.nextInt();
        System.out.print("Masukkan tinggi tabung (cm) = ");
        tabung.t = keyboard.nextInt();
        tabung.tampilkanVolumeTabung();
    }

    public static void volumePrismaSegitiga(Scanner keyboard){
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        System.out.println("=====================================================================================================");
        System.out.println("Menghitung Volume Prisma Segitiga");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan Alas (a) (cm): ");
        prismaSegitiga.a = keyboard.nextInt();
        System.out.print("Masukkan Tinggi (t) (cm): ");
        prismaSegitiga.t = keyboard.nextInt();
        System.out.print("Masukkan TInggi Prisma (cm): ");
        prismaSegitiga.tinggi = keyboard.nextInt();
        prismaSegitiga.tampilkanVolumePrismaSegitiga();
    }

    public static void volumeLimasSegitiga(Scanner keyboard){
        LimasSegitiga limassegitiga = new LimasSegitiga();
        System.out.println("=====================================================================================================");
        System.out.println("Menghitung Volume Limas Segitiga");
        System.out.println("=====================================================================================================");
        System.out.print("Masukkan Luas Alas(cm) : ");
        limassegitiga.alas = keyboard.nextInt();
        System.out.print("Masukkan Tinggi(cm) : ");
        limassegitiga.tinggi = keyboard.nextInt();
        limassegitiga.tampilkanVolumeLimas();

    }
    
}
