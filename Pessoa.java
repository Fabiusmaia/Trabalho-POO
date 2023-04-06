package com.mycompany.trabalho;

public class Pessoa {
    
    private String nome;
    private int anoNasc;
    private int idade;
    private double altura;
    private double peso;
    double salario;
    
    public Pessoa() {}
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
    
    public Pessoa(String nome, int anoNasc, int idade) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int anoNasc, int idade, double altura) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.idade = idade;
        this.altura = altura;
    }
    
    public Pessoa(String nome, int anoNasc, int idade, double altura, double peso) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    public Pessoa(String nome, int anoNasc, int idade, double altura, double peso, double salario) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.salario = salario;
    }
    
    // getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getAnoNasc() {
        return anoNasc;
    }
    
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int calcularIdade(int anoAtual){
       setIdade(anoAtual - anoNasc);
       return anoAtual - anoNasc;
    }
    public String mostrarDados(){
        return ( "Nome: " + nome + "\n" +
                "Ano de nascimento: " + anoNasc + "\n" +
                "Idade: " + calcularIdade(2022) + "\n" + 
                "Altura: " + altura + "\n" +   
                "Peso: " + peso + "\n" +
                "Salario: " + salario + "\n" 
                
      );
    }
}