package exercicios.ex4;

public enum TipoTelefone {
    tefone(8, "xxxx-xxxx"),
    tefoneDDD(10, "xx","xxxx-xxxx"),
    celular(9, "xxxxx-xxxx"),
    celularDDD(11, "xx", "xxxxx-xxxx");

    private  int quantidadeDigitos;
    private  String DDD;
    private  String numero;

    TipoTelefone(int quantidadeDigitos, String DDD, String numero) {
        this.quantidadeDigitos = quantidadeDigitos;
        this.numero = numero;
        this.DDD = DDD;
    }

    TipoTelefone(int quantidadeDigitos, String numero) {
        this.quantidadeDigitos = quantidadeDigitos;
        this.numero = numero;
    }

    public int getQuantidadeDigitos() {
        return quantidadeDigitos;
    }

    public String getDDD() {
        return DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setQuantidadeDigitos(int quantidadeDigitos) {
        this.quantidadeDigitos = quantidadeDigitos;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return
                "-----"+ name().replace("DDD", "") + "-----"+
                        "\nquantidadeDigitos =" + quantidadeDigitos +
                        (DDD != null ? "\nDDD='" + DDD + '\'' : "") +
                        "\nnumero = " + numero  ;
    }
}