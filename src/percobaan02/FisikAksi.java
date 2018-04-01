package percobaan02;

public class FisikAksi {
    public static void main(String[] args) {
        Fisik r1 = new Fisik();
        r1.berat = 50;
        r1.tinggi = 175;
        
        r1.FisikInfo();
        System.out.println("Ideal Fisik ="+r1.FisikIdeal());
        r1.cetakIdeal();
        
        Fisik r2 = new Fisik();
        r2.cetakIdeal();
        
        Fisik r3 = new Fisik();
        r3.cetakIdeal();
    }
}
