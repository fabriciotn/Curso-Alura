package logistica;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiaraju Mathyas Guerreiro
 */
public class Quadrado {

    private int custoG = 0;
    private int custoH = 9999;
    private int x = 0;
    private int y = 0;
    private Quadrado pai = null;

    public Quadrado(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getCustoF() {
        return custoG + custoH;
    }

    public int getCustoG() {
        return custoG;
    }

    public void setCustoG(int custoG) {
        this.custoG = custoG;
    }

    public int getCustoH() {
        return custoH;
    }

    public void setCustoH(int custoH) {
        this.custoH = custoH;
    }

    public int getX() {
        return x;
    }

    public void setPosicaoX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setPosicaoY(int y) {
        this.y = y;
    }

    public Quadrado getPai() {
        return pai;
    }

    public void setPai(Quadrado pai) {
        this.pai = pai;
    }

    @Override
    public boolean equals(Object obj) {
        return (((Quadrado)obj).getX() == x && ((Quadrado)obj).getY()==y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.x;
        hash = 97 * hash + this.y;
        return hash;
    }
    
    
}