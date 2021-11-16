package td6.nouveau_sujet.exercice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public abstract class BRDecorator extends BufferedReader {

    private BufferedReader br;

    public BRDecorator(Reader in) {
        super(in);
        this.br = new BufferedReader(in);
    }


    public String readLine() {
        try {
            return this.traite(this.br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    protected abstract String traite(String s);

}
