package pbofs112b.pkg2022428916.latihan55.handphone;

/**
 *
 * @author Kus Andi Priyono
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
