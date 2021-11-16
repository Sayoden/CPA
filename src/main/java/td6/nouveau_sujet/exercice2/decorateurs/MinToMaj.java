package td6.nouveau_sujet.exercice2.decorateurs;

import td6.nouveau_sujet.exercice2.BRDecorator;

import java.io.Reader;

public class MinToMaj extends BRDecorator {

    public MinToMaj(Reader in) {
        super(in);
    }

    @Override
    protected String traite(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toLowerCase(c);
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
