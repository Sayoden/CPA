package td5.exercice2;

public class QuotidienTest {

    public static void main(String[] args) {
        Quotidien quotidien = new Quotidien();

        quotidien.addListener(new AbonnePapier());

        quotidien.setNumero(1);
    }
}
