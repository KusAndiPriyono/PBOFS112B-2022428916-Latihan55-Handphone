package pbofs112b.pkg2022428916.latihan55.handphone;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 */
public class Android extends Handphone {
    private String keyStore;
    
    public Android (String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getKeyStore() {
        return keyStore;
    }
    public void setKeyStrore(String keyStore) {
        this.keyStore = keyStore;
    }
}
