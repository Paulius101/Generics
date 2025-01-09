package src.task_3;

public class Main {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMap = new Mapas<>();
        dnsMap.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8.", "8.8.4.4"));
        dnsMap.ideti(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1.", "1.0.0.1"));

        DnsServer googleDns = dnsMap.gauti(DnsProvider.GOOGLE);
        System.out.println(googleDns);
        Mapas<String, String> zodynoMapas = new Mapas<>();
        zodynoMapas.ideti("Labas", "Hello");
        zodynoMapas.ideti("Pasaulis", "World");

        String labas = zodynoMapas.gauti("Labas");
        System.out.println(labas);
    }
}
