package com.mycompany.trabalho;

class Tecnico extends Pessoa {
    private String apelido;
    private int anosExperiencia;
    private int tempoContrato;
    private int salario;
    public Tecnico(){
        
    } 
    public Tecnico(String nome, int peso, int anoNasc, int idade, double altura) {
        super(nome, anoNasc, idade, altura, peso);
    }
    
    public Tecnico(String apelido) {
        this.apelido = apelido;
    }
    
    public Tecnico(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public Tecnico(int anosExperiencia, int tempoContrato) {
        this.anosExperiencia = anosExperiencia;
        this.tempoContrato = tempoContrato;
    }
    
    public Tecnico(String apelido, int anosExperiencia) {
        this.apelido = apelido;
        this.anosExperiencia = anosExperiencia;
    }
    
    public Tecnico(String apelido, int anosExperiencia, int tempoContrato) {
        this.apelido = apelido;
        this.anosExperiencia = anosExperiencia;
        this.tempoContrato = tempoContrato;
    }
    
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }

    public void calcularSalario(double salarioBase, int horasExtras){
        super.salario = (salarioBase + 350 * horasExtras);
    }
    @Override
    public String mostrarDados(){
        
        return(
                "Apelido: " + getApelido() + "\n" +
                "Anos de experiência: " + getAnosExperiencia() + "\n" +
                "Tempo de contrato: " + getTempoContrato() + "\n" +
                "Salario: " + getSalario() + "\n" 
                );
    }
    
}