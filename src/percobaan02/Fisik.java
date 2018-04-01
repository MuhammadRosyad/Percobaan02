package percobaan02;
public class Fisik {
    double berat;
    double tinggi;
    
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
        System.out.printIn("Idealnya adalah: "+Fisikideal());
    }
}
