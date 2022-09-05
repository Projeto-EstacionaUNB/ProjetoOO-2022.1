package model;

public class Evento extends Acesso{
    private double valorEvento;
    private String dataEvento;

    public Evento() {
    }

    public Evento(String horaEntrada, String horaSaida, String dataInicial, String dataFinal, Veiculo veiculoCliente, double valorEvento, String dataEvento) {
        super(horaEntrada, horaSaida, dataInicial, dataFinal, veiculoCliente);
        this.valorEvento = valorEvento;
        this.dataEvento = dataEvento;
    }

    // Vericar Correção

    @Override
    public double calculaValorAcesso() {
        return 0;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "valorEvento=" + valorEvento +
                ", dataEvento='" + dataEvento + '\'' +
                ", horaEntrada='" + horaEntrada + '\'' +
                ", horaSaida='" + horaSaida + '\'' +
                ", dataInicial='" + dataInicial + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                ", veiculoCliente=" + veiculoCliente +
                '}';
    }
}
