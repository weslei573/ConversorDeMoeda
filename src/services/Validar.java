package services;

import java.util.Scanner;
import java.util.Set;

public class Validar {
    private static final Set<String> CODIGOS_MOEDAS = Set.of(
            "AUD", "ATS", "BEF", "BRL", "CAD", "CHF", "CNY", "DEM",
            "DKK", "ESP", "EUR", "FIM", "FRF", "GBP", "GRD", "HKD",
            "IEP", "INR", "IRR", "ITL", "JPY", "KRW", "LKR", "MXN",
            "MYR", "NOK", "NLG", "NZD", "PTE", "SEK", "SGD", "THB",
            "TWD", "USD", "ZAR"
    );

    public static String lerCodigoMoeda(Scanner scanner, String mensagem){
        String codigo;
        do {
            System.out.println(mensagem);
            codigo = scanner.nextLine().trim().toUpperCase();
            if (!CODIGOS_MOEDAS.contains(codigo)){
                System.out.println("Codigo invalido!");
            }
        } while (!CODIGOS_MOEDAS.contains(codigo));
        return codigo;
    }

    public static int lerOpcaoContinuar(Scanner scanner){
        while (true){
            System.out.println("Digite (1) para SAIR ou (0) para CONTINUAR: ");
            String input = scanner.nextLine().trim();
            if (input.equals("1")) {
                return 1;
            } else if (input.equals("0")) {
                return 0;
            } else {
                System.out.println("Opção invalida!");
            }
        }
    }

    public static double lerValor(Scanner scanner) {
        while (true) {
            System.out.print("VALOR: ");
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.err.println("Valor inválido! Use números (ex: 100.50).");
            }
        }
    }
}
