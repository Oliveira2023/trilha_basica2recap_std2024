package enumeradores;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
//            System.out.println(estado.getSigla() + " - " + estado.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;
        System.out.println(eb.getSigla() + " - " + eb.getNome());
        System.out.println(eb.getNomeMaiusulo());
    }
}
