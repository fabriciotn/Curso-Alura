package logistica;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiaraju
 */
public class TesteAStar {

    public static void main(String[] args) {

        Quadrado[][] grade = new Quadrado[10][10];
        for (int i = 0; i < grade.length; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                grade[i][j] = new Quadrado(i, j);
            }
        }

        //configura grade 
        Quadrado origem = grade[1][5];
        Quadrado destino = grade[9][5];

        AStar aStar = new AStar(grade, origem, destino);
        aStar.addBloqueio(grade[4][3]);
        aStar.addBloqueio(grade[4][4]);
        aStar.addBloqueio(grade[4][5]);
        aStar.addBloqueio(grade[4][6]);
        aStar.addBloqueio(grade[4][7]);
        aStar.addBloqueio(grade[8][4]);
        aStar.addBloqueio(grade[9][4]);

        long tempo1 = System.nanoTime();
        boolean pesquisaOk = aStar.iniciarPesquisa();
        long tempo2 = System.nanoTime();
        System.out.println("Tempo de pesquisa: " + (tempo2 - tempo1) + "ns");

        if (pesquisaOk) {
            System.out.println("Caminho:");
            System.out.println("X\tY");

            //lista caminho encontrado
            for (int i = 0; i < aStar.getListaCaminho().size(); i++) {
                System.out.println(aStar.getListaCaminho().get(i).getX()
                        + "\t" + aStar.getListaCaminho().get(i).getY());
            }
        } else {
            System.out.println("Caminho nao foi encontrado.");
        }

        //imprime em forma de matriz
        for (int i = 0; i < grade.length; i++) {
            System.out.println("");
            for (int j = 0; j < grade[i].length; j++) {
                if (origem.getX() == j && origem.getY() == i) {
                    System.out.print("[O]");
                } else if (destino.getX() == j && destino.getY() == i) {
                    System.out.print("[D]");
                } else {
                    boolean isCaminho = false;
                    for (int k = 0; k < aStar.getListaCaminho().size(); k++) {
                        if (aStar.getListaCaminho().get(k).getX() == j && aStar.getListaCaminho().get(k).getY() == i) {
                            System.out.print("[*]");
                            isCaminho = true;
                            break;
                        }
                    }
                    boolean isBloqueio = false;
                    for (int k = 0; k < aStar.getListaBloqueios().size(); k++) {
                        if (aStar.getListaBloqueios().get(k).getX() == j && aStar.getListaBloqueios().get(k).getY() == i) {
                            System.out.print("[X]");
                            isBloqueio = true;
                            break;
                        }
                    }
                    if (!isCaminho && !isBloqueio) {
                        System.out.print("[ ]");
                    }
                }

            }
        }
        System.out.println("");
    }
}