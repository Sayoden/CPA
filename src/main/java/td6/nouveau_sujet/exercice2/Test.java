package td6.nouveau_sujet.exercice2;

import td6.nouveau_sujet.exercice2.decorateurs.MinToMaj;
import td6.nouveau_sujet.exercice2.decorateurs.ROT13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) {
        BufferedReader br = new ROT13(
                new MinToMaj(
                        new InputStreamReader(
                                System.in
                        )
                )
        );

        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
