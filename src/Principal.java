public class Principal {
    public static void main(String[] args) {

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Conversor valorMoeda = consultaMoeda.buscaConversorMoeda();
        System.out.println(valorMoeda);
    }
}
