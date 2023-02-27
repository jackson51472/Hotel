public class QuartoHotel extends Hotel {
    private Integer camas;
    private Integer capacidade;
    private Integer numeroQuarto;
    private Integer tipoQuarto;
    public QuartoHotel(Integer camas, Integer capacidade, Integer numeroQuarto,Integer tipoQuarto, String nomeHotel, String cnpjHotel){
        this.setTipoQuarto(tipoQuarto);
        this.setNumeroQuarto(numeroQuarto);
        this.setCamas(camas);
        this.setCapacidade(capacidade);
        this.setCnpj(cnpjHotel);
        this.setNome(nomeHotel);
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Integer getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(Integer tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
}
