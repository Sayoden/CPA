package td2;

public class TestCalcul {

    public static void main(String[] args) {
        System.out.println(new Multiplication(new Constante(10), new Constante(20)).eval());

        System.out.println(new Addition(new Constante(10), new Constante(20)));

    }
}
