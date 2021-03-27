package pbofs112b.pkg2022428916.latihan55.handphone;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class BlackBerry extends Handphone {
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getPinBB() {
        return pinBB;
    }
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
