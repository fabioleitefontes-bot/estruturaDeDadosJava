package exercicios.ex1;

public class temperatura {
    private double temp;
    private String mes;

    public temperatura(String mes, double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "temperatura{" +
                "temp=" + temp +
                ", mes='" + mes + '\'' +
                '}';
    }
}
