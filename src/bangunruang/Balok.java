package bangunruang;

public class Balok {
    public int panjang = 0;
    public int lebar = 0;
    public int tinggi = 0;
    public int volume = 0;

    public void hitungVolumeBalok(){
        volume = panjang * lebar * tinggi;
    }
    
    public void tampilkanVolumeBalok(){
        hitungVolumeBalok();
        System.out.println("=====================================================================================================");
        System.out.println("Volume Balok = " + volume + " cm3");
        System.out.println("=====================================================================================================");
    }
    
}
