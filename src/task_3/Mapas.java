package src.task_3;

import java.util.ArrayList;

public class Mapas<K, V> {
    public ArrayList<Pora<K, V>> sarasasPoru = new ArrayList<>();

    public void ideti(K raktas, V reiksme) {
        Pora pora = new Pora();
        pora.setRaktas(raktas);
        pora.setReiksme(reiksme);
        sarasasPoru.add(pora);
    }

    public V gauti(K raktas) {
        V reiksme = null;
        for (Pora p : sarasasPoru) {
            if (p.getRaktas() == raktas) {
                reiksme = (V) p.getReiksme();
            }
        }
        return reiksme;
    }
}
