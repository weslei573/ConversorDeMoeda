import menu.Menu;
import services.Validar;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu.exibirCabecalho();

        int operado;
        do {
            Menu.exibirMenu();

            String base_code = Validar.lerCodigoMoeda(scanner, "CONVERTE DE: ");
            String target_code = Validar.lerCodigoMoeda(scanner, "PARA: ");
            double valor = Validar.lerValor(scanner);

            ConsultaMoeda consultaMoeda = new ConsultaMoeda();
            Conversor valorMoeda = consultaMoeda.buscaConversorMoeda(base_code, target_code);

            System.out.printf(
                    "Valor %.2f [%s] corresponde ao valor final de => %.2f [%s]%n",
                    valor, base_code, valorMoeda.conversaoEmMoedaLocal(valor), target_code
            );

            operado = Validar.lerOpcaoContinuar(scanner);
        } while (operado != 1);

        encerrarPrograma(scanner);
    }

    private static void encerrarPrograma(Scanner scanner) {
        Menu.encerrarMensagemPrograma();
        scanner.close();
    }

}
