package ajedrez;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        int con = 0;

        try {
            archivo = new File("src\\ajedrez\\table3.txt");
            fr = new FileReader(archivo);
            Scanner scn = new Scanner(archivo);

            String[][] linea = new String[8][8];

            while (scn.hasNextLine()) {
                for (int i = 0; i < 8; i++) {
                    String sr = scn.next();
                    linea[con][i] = sr;
                }
                con++;
            }

            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(linea[i][j] + " ");
                }
                System.out.println();
            }

            int y = 0, x = 0;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ("C".equals(linea[i][j])) {
                        x = j;
                        y = i;
                        System.out.println("Esta es la posicion: X: " + x + " Y: " + y);
                        break;
                    }
                }
            }

            if ((x - 2) >= 0 && (y - 1) >= 0) {
                if (!"*".equals(linea[x - 2][y - 1])) {
                    mostrar(x - 2, y - 1);
                }
            }

            if ((x - 2) >= 0 && (y + 1) < 8) {
                if (!"*".equals(linea[x - 2][y + 1])) {
                    mostrar(x - 2, y + 1);
                }
            }

            if ((x - 1) >= 0 && (y - 2) >= 0) {
                if (!"*".equals(linea[x - 1][y - 2])) {
                    mostrar(x - 1, y - 2);
                }
            }

            if ((x - 1) >= 0 && (y + 2) < 8) {
                if (!"*".equals(linea[x - 1][y + 2])) {
                    mostrar(x - 1, y + 2);
                }
            }

            if ((x + 2) < 8 && (y - 1) >= 0) {
                if (!"*".equals(linea[x + 2][y - 1])) {
                    mostrar(x + 2, y - 1);
                }
            }

            if ((x + 2) < 8 && (y + 1) < 8) {
                if (!"*".equals(linea[x + 2][y + 1])) {
                    mostrar(x + 2, y + 1);
                }
            }

            if ((x + 1) < 8 && (y + 2) < 8) {
                if (!"*".equals(linea[x + 1][y + 2])) {
                    mostrar(x + 1, y + 2);
                }
            }

            if ((x + 1) < 8 && (y - 2) >= 0) {
                if (!"*".equals(linea[x + 1][y - 2])) {
                    mostrar(x + 1, y - 2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void mostrar(int x, int y) {
        System.out.println("Se puede mover a la posicion X: " + x + " Y: " + y);
    }
}