package util;

import java.util.Scanner;

public class InterfaceUsuario {

    Scanner input = new Scanner(System.in);

    public double pedirValorImovel() {
        double valorImovel;
        do {
            System.out.print("Digite o valor do imóvel (mínimo 150.000): ");
            valorImovel = input.nextDouble();
            if (valorImovel < 150000) {
                System.out.println("O valor informado é inválido. Tente novamente.");
            }
        } while (valorImovel < 150000);
        return valorImovel;
    }

    public double pedirPrazoFinanciamento() {
        double prazoFinanciamento;
        do {
            System.out.print("Digite o prazo do financiamento (mínimo 36 meses): ");
            prazoFinanciamento = input.nextDouble();
            if (prazoFinanciamento < 36) {
                System.out.println("O prazo informado é inválido. Tente novamente.");
            }
        } while (prazoFinanciamento < 36);
        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros;
        do {
            System.out.print("Digite a taxa de juros anual (mínimo 3.5%): ");
            taxaJuros = input.nextDouble();
            if (taxaJuros < 3.5) {
                System.out.println("A taxa de juros informada é inválida. Tente novamente.");
            }
        } while (taxaJuros < 3.5);
        return taxaJuros;
    }


    public double pedirTamanhoAreaConstruida() {
        System.out.print("Digite o tamanho da área construída (m²): ");
        return input.nextDouble();
    }

    public double pedirTamanhoTerreno() {
        System.out.print("Digite o tamanho do terreno (m²): ");
        return input.nextDouble();
    }

    public int pedirNumeroVagasGaragem() {
        System.out.print("Digite o número de vagas na garagem: ");
        return input.nextInt();
    }

    public int pedirNumeroAndar() {
        System.out.print("Digite o número do andar: ");
        return input.nextInt();
    }

    public String pedirTipoZona() {
        System.out.print("Digite o tipo de zona (residencial/comercial): ");
        input.nextLine(); // Limpar o buffer
        return input.nextLine();
    }
}
