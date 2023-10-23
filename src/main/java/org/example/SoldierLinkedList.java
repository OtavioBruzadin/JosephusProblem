package org.example;

class SoldierLinkedList {
    private SoldierNode head;
    private int count;

    public SoldierLinkedList() {
        head = null;
        count = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        SoldierNode aux = new SoldierNode();
        return aux == null;
    }

    public int getCount() {
        return count;
    }


    public boolean insertHead(Soldier soldier){
        SoldierNode aux;
        if (!isFull()){
            aux = new SoldierNode(soldier, null);
            if (isEmpty()){ // Lista está vazia
                aux.setProx(head);
                head = aux;
            }else { // Insere no começo e atualiza os ponteiros

                aux.setProx(head);
                head = aux;
            }
            count++;
            return true;
        }
        else return false;
    };

    public SoldierNode search(Soldier soldier){
        SoldierNode pAnda;

        if (isEmpty()) {
            return null; // Lista vazia
        }else{
            pAnda = head;
            // procura a posição do elemento na lista
            while ((pAnda.getProx() != head) && (pAnda.getSoldado() != soldier))
                pAnda = pAnda.getProx();
            if (pAnda.getSoldado() == soldier)
                return pAnda; // Retorna a referência para o No
            return null; // elemento não encontrado
        }
    }


    public boolean remove(Soldier soldier){
        SoldierNode pAnt = null, pAnda;
        if (isEmpty()) return false; // Lista vazia
        else{
            pAnda = head;
            int contador = 0;
            // procura a posição do elemento na lista
            while ((contador != count) && (pAnda.getSoldado() != soldier)){
                pAnt = pAnda;
                pAnda = pAnda.getProx();
                contador++;
            }
            if ((contador == count) && (pAnda.getSoldado() != soldier))
                return false; // Se não encontrou o elemento
                // Se elemento encontrado remove da lista
            else {
                // se o elemento encontrado está na cabeça da lista
                // e tem somente um elemento
                if ((head == pAnda && count == 1)) {
                    head = null;
                    // está no cabeça e tem mais elementos
                } else if ((head == pAnda && count != 1)){
                    head = head.getProx();
                }else {// remove elemento do meio/fim
                    // Se o elemento estiver no fim
                    if (pAnda.getProx() == null)
                        pAnt.setProx(head);
                }
                count--;
                return true;
            }
        }
    }
    Soldier determineSoldier(int num){
        SoldierNode pAnda;
        pAnda = head;
        int counter = 0;
        while(count!=1) {
            while (counter != num && count != 1) {

                pAnda = pAnda.getProx();
                if (pAnda == null) {
                    pAnda = head;
                }
                counter++;
            }
            remove(pAnda.getSoldado());
            print();
            System.out.println("\n");
        }
        return survivingSoldier();
    }


    public void print(){
        SoldierNode pAnda;
        System.out.print("L: [ ");
        if (!isEmpty()) {
            pAnda = head;
            while (pAnda.getProx() != head && pAnda.getProx() != null) {
                System.out.print(pAnda.getSoldado()+" ");
                pAnda = pAnda.getProx();
            }
            System.out.print(pAnda.getSoldado()+" ");
        }
        System.out.print("], Qtde.: " + count + ".\n");
    }

    public Soldier survivingSoldier(){
        return head.getSoldado();
    }

    public void clear(){
        SoldierNode pAnt, pAnda = head;

        while(pAnda.getProx() != head){
            pAnt = pAnda;  // Libera o nó
            pAnda = pAnda.getProx();
            pAnt.setProx(null);
            pAnt = null;
        }
        count = 0;
        head = null;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        int qtde = 0;
        sb.append("\n[Lista]\n");

        sb.append("L: [ ");
        SoldierNode pAnda = head;
        while (qtde != count) {
            sb.append(pAnda.getSoldado()+" ");

            pAnda = pAnda.getProx();
            qtde++;
        }
        sb.append("]\n");

        sb.append("Qtde.: " + count);
        if (count != 0) {
            sb.append("\nPrimeiro: " + head.getSoldado());
        }

        sb.append("\n");
        return sb.toString();
    }

}

