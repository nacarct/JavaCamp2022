public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!");

        String ortaMetin = "İlginizi Çekebilir.";
        String altMetin = "Vade Süresi.";

        System.out.println(ortaMetin);

        //integer
        int vade = 12;

        //double
        double dolarDun = 18.20;
        double dolarBugun = 18.20;

        //boolean
        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            dolarDustuMu = true;
            okYonu = "down.svg";
        }
        else if(dolarBugun > dolarDun) {
            dolarDustuMu = false;
            okYonu = "up.svg";
        }
        else {
            dolarDustuMu = false;
            okYonu = "equal.svg";
        }

        System.out.println(okYonu);

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Kredi X";
        String kredi3 = "Kredi Y";

        String[] krediler = {"Hızlı Kredi","Mutlu Emekli", "Maaşını Halkbanktan"};

        //System.out.println(krediler[0]);
        //System.out.println(krediler[1]);
        //System.out.println(krediler[2]);

        //For
        for (int i = 0; i < krediler.length; i++) {
            System.out.println("for " + krediler[i]);
        }

        //Foreach
        for (String kredi : krediler) {
            System.out.println("foreach " + kredi);
        }
    }
}