/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufc;

/**
 *
 * @author alisson
 */
public class Lutador {
    //Atributos
    private String nome, nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //Metodos Especiais
    
    //Construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if(this.peso < 52.2 || this.peso > 120.2){
          this.categoria = "Invalido"; 
       }else if(this.peso <= 70.3){
           this.categoria = "Leve";
       }else if(this.peso <= 83.9){
           this.categoria = "Medio";
       } else {
           this.categoria ="Pesado";
       }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
   
    
    

    public void apresentar() {
        System.out.println("-------------Apresentacao------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println( getAltura()+ " m de altura");
        System.out.println("Pesando " + getPeso()+"Kg");
        System.out.println("wins: " + getVitorias());
        System.out.println("defeats: " + getDerrotas());
        System.out.println("draws: " + getEmpates());
        System.out.println("-------------------------------------");
    }
    
    public void status(){
        System.out.println("----------Status----------------");
        System.out.println(getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println( getVitorias() + " wins");
        System.out.println(getDerrotas() + " defeats");
        System.out.println(getEmpates() + " draws");
        System.out.println("---------------------------------");
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    public void empataLuta(){
        this.setEmpates(this.getEmpates() + 1);
        
    }
}
