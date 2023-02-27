public class Cliente {
    private Integer quantidaPessoas;
    private String numeroTelefone;
    private String nomeHospede;
    private Integer diasHospedado;

    public Cliente (Integer diasHospedado, Integer quantidaPessoas, String numeroTelefone, String nomeHospede){
        this.setDiasHospedado(diasHospedado);
        this.setQuantidaPessoas(quantidaPessoas);
        this.setNomeHospede(nomeHospede);
        this.setNumeroTelefone(numeroTelefone);
    }

    public Integer getQuantidaPessoas() {
        return quantidaPessoas;
    }

    public void setQuantidaPessoas(Integer quantidaPessoas) {
        this.quantidaPessoas = quantidaPessoas;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public Integer getDiasHospedado() {
        return diasHospedado;
    }

    public void setDiasHospedado(Integer diasHospedado) {
        this.diasHospedado = diasHospedado;
    }
}
