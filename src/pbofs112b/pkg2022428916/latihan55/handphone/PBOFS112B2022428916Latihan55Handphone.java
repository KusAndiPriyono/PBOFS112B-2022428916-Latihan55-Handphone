package pbofs112b.pkg2022428916.latihan55.handphone;

/**
 *
 * @author Kus Andi Priyono
 */
public class PBOFS112B2022428916Latihan55Handphone {

    protected static String manufacture, operatingSystem, model;
    protected static int harga;
    
    public static void main(String[] args) {
        Handphone h = new Handphone(manufacture, operatingSystem, model, harga);
        h.displayProduct();
    }
    
}
