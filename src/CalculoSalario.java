import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        System.out.println("CÁLCULO DE SALÁRIO");
        System.out.println("Este programa calcula o salário de 5 funcionários após descontos de INSS e Imposto de Renda.");

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("\nDigite o salário bruto do funcionário " + i + ": R$");
            double salarioBruto = teclado.nextDouble();

            double descontoINSS = 0;
            if (salarioBruto <= 1212.00) {
                descontoINSS = salarioBruto * 0.075;
            } else if (salarioBruto >= 1212.01 && salarioBruto <= 2427.35) {
                descontoINSS = salarioBruto * 0.09;
            } else if (salarioBruto >= 2427.36 && salarioBruto <= 3641.03) {
                descontoINSS = salarioBruto * 0.12;
            } else {
                descontoINSS = salarioBruto * 0.14;
            }

            double descontoIR;
            if (salarioBruto <= 1903.98) {
                descontoIR = 0;
            } else if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
                descontoIR = salarioBruto * 0.075;
            } else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
                descontoIR = salarioBruto * 0.15;
            } else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
                descontoIR = salarioBruto * 0.225;
            } else {
                descontoIR = salarioBruto * 0.275;
            }

            double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

            System.out.println("INFORMAÇÕES FINAL DO SALÁRIO DO FUNCIONÁRIO " + i);
            System.out.printf("Salário bruto: R$%.2f", salarioBruto);
            System.out.printf("\nQuanto pagou ao INSS: R$%.2f", descontoINSS);
            System.out.printf("\nQuanto pagou de Imposto de Renda: R$%.2f", descontoIR);
            System.out.printf("\nSalário líquido final após descontos: R$%.2f", salarioLiquido);
            System.out.println();
        }
    }
}
