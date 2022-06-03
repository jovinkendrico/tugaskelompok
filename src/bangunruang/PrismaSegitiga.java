package bangunruang;

public class PrismaSegitiga {
    public int a = 0;
    public int t = 0;
    public int tinggi = 0;
    public float volume = 0;

    public void hitungVolumePrismaSegitiga(){
        volume = ((float)1/2 * a * t) * tinggi;
    }

    public void tampilkanVolumePrismaSegitiga(){
        hitungVolumePrismaSegitiga();
        System.out.println("=====================================================================================================");
        System.out.println("Volume (V) Prisma Segitiga: " + volume + " cm3");
        System.out.println("=====================================================================================================");
    }
}
