package bangunruang;

public class LimasSegitiga {
    public int alas;
    public int tinggi;
    public float volume;

    public void hitungVolumeLimas(){
        volume = 1.0f/3.0f * alas * tinggi;
    }

    public void tampilkanVolumeLimas(){
        hitungVolumeLimas();
        System.out.println("=====================================================================================================");
        System.out.println("Rumus Volume Limas : 1/3 * Alas * Tinggi");
        System.out.println("Hasil dari volume limas = " + volume + " cm3 ");
        System.out.println("=====================================================================================================");
    }  
}
