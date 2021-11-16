package td6.nouveau_sujet.exercice2.decorateurs;

import td6.nouveau_sujet.exercice2.BRDecorator;

import java.io.Reader;

public class ROT13 extends BRDecorator {

    public ROT13(Reader in) {
        super(in);
    }


    @Override
    protected String traite(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c+= 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }

            sb.append(c);

        }

        return sb.toString();
    }
}
