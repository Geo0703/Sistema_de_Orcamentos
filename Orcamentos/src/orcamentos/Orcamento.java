/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package orcamentos;

import java.util.Scanner;

/**
 *
 * @author geova_16fe4ev
 */
public class Orcamento {

    public static void main(String[] args) {
        int Cod = 0;
        String Produto = "";
        String Industria = "Univipax Comercios";
        int Qtde = 0;
        float valorUN = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o Codigo do Produto");
        Cod = leitor.nextInt();
        System.out.println("Qual o produto");
        Produto = leitor.next();
        System.out.println("Quantas unidades");
        Qtde = leitor.nextInt();
        System.out.println("Qual Valor da Unidade");
        valorUN = leitor.nextFloat();
        float Total = Qtde * valorUN;
        System.out.println("Cod|Produto|Industria|Qtde|Valor Unitário|TOTAL\n"
                + Cod + "|" + Produto + "|" + Industria + "|" + Qtde + "|" + valorUN + "|" + Total);

    }
}
