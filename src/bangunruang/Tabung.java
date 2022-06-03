package bangunruang;

public class Tabung {
    public final float PI = 22.0f/7;
    public int r = 10;
    public int t = 0;
    public float volume = 0;

    public void hitungVolumeTabung(){
        volume = PI * r * r * t;
    }

    public void tampilkanVolumeTabung(){
        System.out.println("=====================================================================================================");
        System.out.println("PI = 22/7");
        System.out.println("Jari-jari = " + r + "cm");
        System.out.println("tinggi = " + t + "cm");
        System.out.println("=====================================================================================================");
        hitungVolumeTabung();
        System.out.println("Volume Tabung = PI * r * r * t = 22/7 * " + r + " * " + r + " * " + t + " = " + volume + " cm3");
        System.out.println("=====================================================================================================");   
    }
}
