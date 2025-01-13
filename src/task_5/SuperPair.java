package src.task_5;

public class SuperPair<K, V, I extends Number> {

    private K x;
    private V y;
    private I z;

    public SuperPair(K x, V y, I z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
