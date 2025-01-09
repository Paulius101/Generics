package src.task_2.medzio_tipai.spygliuotis;

import src.task_2.Medis;

public abstract class Spygliuotis extends Medis {

    @Override
    public void turi() {
        super.turi();
        System.out.println("spyglius");
    }
}
