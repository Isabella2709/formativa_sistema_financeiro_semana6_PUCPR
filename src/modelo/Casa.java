package modelo;

public class Casa extends Financiamento {
    private double tamanhoAreaConstruida;
    private double tamanhoTerreno;

    public Casa(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros, double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaMensal = taxadejuros / 12;
        int meses = prazoFinanciamentoAnos * 12;
        double valorTotal = (valordesejadoimovel * taxaMensal * Math.pow(1 + taxaMensal, meses))
                / (Math.pow(1 + taxaMensal, meses) - 1);
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tamanho da área construída=" + tamanhoAreaConstruida +
                ", tamanho do terreno=" + tamanhoTerreno +
                ", " + super.toString() +
                '}';

    }
}
