package pbofs112b.pkg2022428916.latihan55.handphone;

/**
 *
 * @author Kus Andi Priyono
 */
public class WindowsPhone extends Handphone {
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getWpKeyStore() {
        return wpKeyStore;
    }
    public void setWpKeyStore(String wpKeyString) {
        this.wpKeyStore = wpKeyString;
    }
}
