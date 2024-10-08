package enumeradores;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA", "Maranhão");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusulo(){
        return nome.toUpperCase();
    }
}
