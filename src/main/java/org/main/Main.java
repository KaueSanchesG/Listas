package org.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++) {
            System.out.println("Digite seu nome:");
            String nome = sc.next();
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o endereço " + (j + 1));
                enderecos.add(new Endereco(sc.next(), sc.nextInt()));
            }
            pessoas.add(new Pessoa(nome, idade, enderecos));
            enderecos.clear();
        }
        }
    }
