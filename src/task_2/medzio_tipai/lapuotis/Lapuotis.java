package src.task_2.medzio_tipai.lapuotis;

import src.task_2.Medis;

public abstract class Lapuotis extends Medis {

    @Override
    public void turi() {
        super.turi();
        System.out.println("lapus");
    }
}
