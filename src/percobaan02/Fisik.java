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
        System.out.printIn("==================");
        System.out.printIn("Berat :"+berat);
        System.out.printIn("Tinggi :"+tinggi);
        System.out.printIn("==================");
    }
    
    double FisikIdeal(){
        double Ideal;
        Ideal=berat-tinggi;
        return Ideal;
    }
    
    void cetakIdeal(){
        System.out.printIn("Idealnya adalah: "+FisikIdeal());
    }
}
