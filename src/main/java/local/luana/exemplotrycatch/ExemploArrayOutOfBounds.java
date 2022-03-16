/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.luana.exemplotrycatch;

/**
 *
 * @author devsys-b
 */
public class ExemploArrayOutOfBounds {

    public static void main(String[] args) {
        int[] matrizA = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= matrizA.length; i++) {
                System.out.println(matrizA[i]);
            }
        } catch (ArrayIndexOutOfBoundsException erro) {
         
            System.out.println("Erro na matriz.\n\n");
            System.out.println(erro.getMessage());
        }
    }
}
