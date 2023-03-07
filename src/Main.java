import java.lang.reflect.Member;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Konsumsi>listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan,Minuman> lunch = new Konsumsi<>();
        Konsumsi<Makanan,Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.getNamaHidangan("roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidanganZ("susu sa[i");
        breakfast.setKonsumsi(roti,susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidanganZ("nasi putih");
        Minuman air= new Minuman() ();
        air.setNamaHidanganZ("Air Putih");

        lunch.setkondumsi(nasi,air);
        listKonsumsi.add(lunch)
        System.out.println(Menu Konsumsi): listKonsumsi();
        for (Konsumsi<Makanan,Minuman>Konsumsi: listKonsumsi){
            Makanan makanan=Konsumsi.getM();
            Minuman minuman=Konsumsi.getI()

          System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }

    }
}
