package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SoldierLinkedList soldierList = new SoldierLinkedList();
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1. Criar lista de soldados\n " +
                "2. Inserir Soldados a lista\n" +
                "3. visualizar Lista \n" +
                "4. Retirar soldado \n" +
                "5. Encerrar Programa"

        );
        try {
            while (option != 5) {
                System.out.println("Qual opcao deseja acessar?: ");
                option = scanner.nextInt();

                if (option == 1) {
                    Soldier defaultSoldier = new Soldier(12345, "JohnDoe");
                    soldierList.insertHead(defaultSoldier);
                    System.out.println("Lista criada com sucesso!");
                    soldierList.remove(defaultSoldier);

                }

                if (option == 2) {
                    int decisao = 1;
                    while (decisao == 1) {
                        System.out.println("Nome do soldado: ");
                        String name = scanner.next();
                        System.out.println("Id do soldado: ");
                        int id = scanner.nextInt();
                        Soldier newSoldier = new Soldier(id, name);
                        soldierList.insertHead(newSoldier);

                        System.out.println("Deseja adicionar novamente ? SIM:1 | NAO:0");
                        decisao = scanner.nextInt();
                    }
                }
                if (option == 3) {
                    soldierList.print();
                }
                if (option == 4) {
                    Soldier deadSoldier = soldierList.determineSoldier(6);
                    System.out.println(deadSoldier.getnome());

                }
                System.out.println("Obrigado por usar nosso programa :)");
            }

        }catch (Exception exception){
            System.out.println("Epa algo deu errado");
        }
        System.out.println("Obrigado por usar nosso programa :)");
        }
    }



