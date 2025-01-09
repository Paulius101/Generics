package src.task_3;

public class DnsServer <K, V> {
    private K ip1;
    private V ip2;

    public DnsServer(K ip1, V ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    @Override
    public String toString() {
        return "DnsServer{" +
                "ip1=" + ip1 +
                ", ip2=" + ip2 +
                '}';
    }
}
