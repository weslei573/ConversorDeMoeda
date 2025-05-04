import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operacao = "";

        String menu = """
                *************************************************************************
                SEJA BEM-VINDO/A AO CONVERSOR DE MOEDA
                OFERECEMOS DADOS PARA A SEGUINTE LISTA MENOR DE CODIGO DE MOEDA:
                
                AUD	ATS	BEF	BRL	CAD	CHF	CNY	DEM
                DKK	ESP	EUR	FIM	FRF	GBP	GRD	HKD
                IEP	INR	IRR	ITL	JPY	KRW	LKR	MXN
                MYR	NOK	NLG	NZD	PTE	SEK	SGD	THB
                TWD	USD	ZAR
                
                OBS: Para sair coloque (sair) em [CONVERTE DE: ]
                *************************************************************************
                """;
        while (!operacao.equalsIgnoreCase("sair")) {
            System.out.println(menu);
            System.out.println("CONVERTE DE: ");
            operacao = scanner.nextLine();
            if (operacao.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("PARA: ");
            var target_code = scanner.nextLine();
            System.out.println("VALOR: ");
            int valor = scanner.nextInt();

            ConsultaMoeda consultaMoeda = new ConsultaMoeda();
            Conversor valorMoeda = consultaMoeda.buscaConversorMoeda(operacao, target_code);
            System.out.println(valorMoeda.conversaoEmMoedaLocal(valor));
        }


    }
}
