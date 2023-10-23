package org.example;

public class Soldier {
    private int codigo;
    private String nome;


    // Constutres
    public Soldier() {
    }

    public Soldier(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // Getters and Setters
    public int getcodigo() {return codigo;}
    public String getnome() {return nome;}


    public void setcodigo(int codigo) {this.codigo = codigo;}
    public void setnome(String nome) {this.nome = nome;}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{" + codigo + ", " + nome + "}");
        return sb.toString();
    }

}
