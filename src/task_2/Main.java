package src.task_2;

import src.task_2.interfaces.Medis;
import src.task_2.medzio_tipai.lapuotis.medziai.Azuolas;
import src.task_2.medzio_tipai.lapuotis.medziai.Berzas;
import src.task_2.medzio_tipai.spygliuotis.Spygliuotis;
import src.task_2.medzio_tipai.spygliuotis.medziai.Egle;
import src.task_2.medzio_tipai.spygliuotis.medziai.Kadagys;
import src.task_2.medzio_tipai.spygliuotis.medziai.Pusis;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Berzas berzas = new Berzas();
        Azuolas azuolas = new Azuolas();
        Kadagys kadagys = new Kadagys();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();

        ArrayList<Medis> ivairiuMedziuSarasas = new ArrayList<>();
        Collections.addAll(ivairiuMedziuSarasas, berzas, azuolas, kadagys, egle, pusis);

        ArrayList<Spygliuotis> spygliuociuSarasas = new ArrayList<>();
        Collections.addAll(spygliuociuSarasas, kadagys, egle, pusis);

        Berzas berzas1 = new Berzas();
        Berzas berzas2 = new Berzas();
        Berzas berzas3 = new Berzas();
        ArrayList<Berzas> berzuSarasas = new ArrayList<>();
        Collections.addAll(berzuSarasas, berzas1, berzas2, berzas3);

        ivairusMiskas(ivairiuMedziuSarasas);
        spygliuociuMiskas(spygliuociuSarasas);
        berzuMiskas(berzuSarasas);
    }

    private static void ivairusMiskas(ArrayList<Medis> list) {
        System.out.println("Ivairus miskas:");
        for (Medis item : list) {
            item.turi();
        }
    }

    private static void spygliuociuMiskas(ArrayList<Spygliuotis> list) {
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis item : list) {
            item.turi();
        }
    }

    private static void berzuMiskas(ArrayList<Berzas> list) {
        System.out.println("Berzu miskas:");
        for (Berzas item : list) {
            item.turi();
        }
    }
}
