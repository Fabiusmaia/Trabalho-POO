/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho;

/**
 *
 * @author toranvor
 */
public class Trabalho {

    public static void main(String[] args) {
        Tecnico t = new Tecnico("Pedro", 5, 2);
        t.calcularSalario(3000, 2);
        System.out.println(t.mostrarDados());
        
        Jogador j = new Jogador("Joãozinho", "Atacante", 60);
        j.calcularSalario(5000,200);
        System.out.println(j.mostrarDados());
       
}
}
