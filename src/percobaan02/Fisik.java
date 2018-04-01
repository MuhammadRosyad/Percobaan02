package percobaan02;
public class Fisik {
    double berat;
    double tinggi;

    public Fisik() {
    berat=50;
    tinggi=165;
    }

    public Fisik(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    
    
    void FisikInfo(){
        System.out.println("==================");
        System.out.println("Berat :"+berat);
        System.out.println("Tinggi :"+tinggi);
        System.out.println("==================");
    }
    
    double FisikIdeal(){
        double Ideal;
        Ideal=berat-tinggi;
        return Ideal;
    }
    
    void cetakIdeal(){
        System.out.println("Idealnya adalah: "+FisikIdeal());
    }
}
