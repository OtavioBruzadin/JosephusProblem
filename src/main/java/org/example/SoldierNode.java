package org.example;


public class SoldierNode {
    private Soldier soldier;
    private SoldierNode prox;

    public SoldierNode() {
        this(null, null);
    }


    public SoldierNode(Soldier soldier, SoldierNode prox) {
        this.soldier = soldier;
        this.prox = prox;
    }

    public SoldierNode getProx() { return prox;}
    public Soldier getSoldado(){ return soldier;}

    public void setProx(SoldierNode prox) { this.prox = prox; }
    public void setSoldado(Soldier soldier) { this.soldier = soldier;};

}
