package menu;

import java.time.LocalDate;

public class Menu {
    public static void exibirCabecalho() {
        String cabecalho = """
                *************************************************************************
                                SEJA BEM-VINDO/A AO CONVERSOR DE MOEDA v1.0
                                      Dados atualizados em: %s
                *************************************************************************
                """.formatted(java.time.LocalDate.now());
        System.out.println(cabecalho);
    }

    public static void exibirMenu() {
        System.out.println("""
                                        CODIGOS DE MOEDA SUPORTADOS:
                                  AUD, ATS, BEF, BRL, CAD, CHF, CNY, DEM
                                  DKK, ESP, EUR, FIM, FRF, GBP, GRD, HKD
                                  IEP, INR, IRR, ITL, JPY, KRW, LKR, MXN
                                  MYR, NOK, NLG, NZD, PTE, SEK, SGD, THB
                                            TWD, USD, ZAR
                -------------------------------------------------------------------------
                """);
    }

    public static void encerrarMensagemPrograma() {
        System.out.println("\nOperação finalizada. Obrigado por usar nosso conversor!");
    }
}
