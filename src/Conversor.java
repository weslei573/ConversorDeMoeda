public class Conversor {
    private String base_code;
    private String target_code;
    private double conversion_rate;

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public Conversor(double conversion_rate, String target_code, String base_code) {
        this.conversion_rate = conversion_rate;
        this.target_code = target_code;
        this.base_code = base_code;
    }

    public double conversaoEmMoedaLocal(double valor) {
        return valor * conversion_rate;
    }

    @Override
    public String toString() {
        return "Conversor{" +
                "base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_rate=" + conversion_rate +
                '}';
    }
}
