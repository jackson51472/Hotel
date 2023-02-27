import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reserva {
    private Calendar dataEntrada;
    private Calendar dataSaida;
    private QuartoHotel quartoHospede;
    private Cliente hospede;

    public Reserva(Calendar dataEntrada, Calendar dataSaida, QuartoHotel quartoHospede, Cliente hospede){
        this.setDataSaida(dataSaida);
        this.setDataEntrada(dataEntrada);
        this.setHospede(hospede);
        this.setQuartoHospede(quartoHospede);
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public QuartoHotel getQuartoHospede() {
        return quartoHospede;
    }

    public void setQuartoHospede(QuartoHotel quartoHospede) {
        this.quartoHospede = quartoHospede;
    }

    public Cliente getHospede() {
        return hospede;
    }

    public void setHospede(Cliente hospede) {
        this.hospede = hospede;
    }

    public String verificarCheckin(Calendar dataEntrada){
        if(dataEntrada != null){
            return "=========================================================="+
                    "\n" + "Bem vindo ao " + quartoHospede.getNome() +
                    "\n" + "Check in feito no dia: " + formatarData(getDataEntrada())+
                    "\n" + "Seu quarto: " + quartoHospede.getNumeroQuarto() +
                    "\n" + "Com capacidade: " + quartoHospede.getCapacidade()+ " Pessoas" +
                    "\n" + "Valor diaria: " + valorDiaria(quartoHospede) +
                    "\n" + "==========================================================";


        }else {
            return "Cliente" + hospede.getNomeHospede() + " não fez checkin" ;
        }
    }
    public String verificarCheckout(Calendar dataSaida){
        if(dataSaida != null){
          return "Inicio do check out: " + formatarData(getDataSaida()) +
                  "\n Valor a pagar pela estadia: R$" + (valorDiaria(quartoHospede) * hospede.getDiasHospedado()) +
                  "\n Check out feito com sucesso, volte sempre" ;

        }
        return null;
    }
    public String formatarData (Calendar data){
        Date y = data.getTime();
        DateFormat i = DateFormat.getDateInstance();

        return i.format(y);
    }
    public Double valorDiaria(QuartoHotel quarto){

        if (quarto.getTipoQuarto() == 1 ){
            return 75.;
        }
        if (quarto.getTipoQuarto() == 2){
            return 100.;
        }
        if (quarto.getTipoQuarto() == 3){
            return 150.;
        }
        return null;
    }
}

