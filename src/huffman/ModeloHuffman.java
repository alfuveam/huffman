/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author pc
 */
public class ModeloHuffman {
    String sValor; 
    int iSoma;
    int iDireita;
    int iEsquerda;
    
    public int getiSoma() {
        return iSoma;
    }

    public void setiSoma(int iSoma) {
        this.iSoma = iSoma;
    }
    
    public String getsValor() {
        return sValor;
    }

    public void setsValor(String sValor) {
        this.sValor = sValor;
    }

    public int getiDireita() {
        return iDireita;
    }

    public void setiDireita(int iDireita) {
        this.iDireita = iDireita;
    }

    public int getiEsquerda() {
        return iEsquerda;
    }

    public void setiEsquerda(int iEsquerda) {
        this.iEsquerda = iEsquerda;
    }

    public ModeloHuffman(String sValor, int iDireita, int iEsquerda) {
        this.sValor = sValor;
        this.iDireita = iDireita;
        this.iEsquerda = iEsquerda;
    }  
}
