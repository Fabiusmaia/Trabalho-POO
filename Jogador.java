package com.mycompany.trabalho;

public class Jogador extends Pessoa {
    private String nomeDaCamisa;
    private String posicaoJoga;
    private int numGolsCarreira;

    public Jogador() {
        
    }
     
    public Jogador(String nome, int peso, int anoNasc, int idade, double altura) {
        super(nome, anoNasc, idade, altura, peso);
    }
    
    public Jogador(String nomeDaCamisa) {
        this.nomeDaCamisa = nomeDaCamisa;
    }
    
    public Jogador(int numGolsCarreira) {
        this.numGolsCarreira = numGolsCarreira;
    }
    
    public Jogador(String nomeDaCamisa, int numGolsCarreira) {
        this.nomeDaCamisa = nomeDaCamisa;
        this.numGolsCarreira = numGolsCarreira;
    }
    
    public Jogador(String nomeDaCamisa, String posicaoJoga) {
            this.nomeDaCamisa = nomeDaCamisa;
            this.posicaoJoga = posicaoJoga;
    }
        
    public Jogador(String nomeDaCamisa, String posicaoJoga, int numGolsCarreira) {
        this.nomeDaCamisa = nomeDaCamisa;
        this.posicaoJoga = posicaoJoga;
        this.numGolsCarreira = numGolsCarreira;
    }
  
    

    public String getNomeDaCamisa() {
        return nomeDaCamisa;
    }

    public void setNomeDaCamisa(String nomeDaCamisa) {
        this.nomeDaCamisa = nomeDaCamisa;
    }

    public String getPosicaoJoga() {
        return posicaoJoga;
    }

    public void setPosicaoJoga(String posicaoJoga) {
        this.posicaoJoga = posicaoJoga;
    }

    public int getNumGolsCarreira() {
        return numGolsCarreira;
    }

    public void setNumGolsCarreira(int numGolsCarreira) {
        this.numGolsCarreira = numGolsCarreira;
    }

    public void calcularSalario(double salarioBase, double bonus){
        super.salario = (salarioBase + 5 * bonus);
    }

    @Override
    public String mostrarDados(){
        return(
                "Nome da camisa: " + getNomeDaCamisa() + "\n" +
                "Posição em que joga: " + getPosicaoJoga() + "\n" +
                "Número de gols na carreira: " + getNumGolsCarreira() + "\n" +
                "Salario: " + getSalario() + "\n"
        );
    }

}