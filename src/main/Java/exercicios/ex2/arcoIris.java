package exercicios.ex2;

import java.util.Objects;

public class arcoIris {

    private String cor;

    public arcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        arcoIris arcoIris = (arcoIris) o;
        return Objects.equals(cor, arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cor);
    }

    @Override
    public String toString() {
        return "arcoIris{" +
                "cor='" + cor + '\'' +
                '}';
    }
    public Integer compareTo(arcoIris cor2) {
        return this.cor.compareToIgnoreCase(cor2.getCor());

    }
}
