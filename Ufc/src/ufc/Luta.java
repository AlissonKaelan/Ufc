/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufc;

import java.util.Random;

/**
 *
 * @author alisson
 */
public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovado = false;
    
    // Metodos publicos
    
    
    public void marcaLuta(Lutador lutador1, Lutador lutador2){
        if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
            this.aprovado = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar(){
        if(this.aprovado){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            System.out.println("==========RESULTADO DA LUTA===========");
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empataLuta();
                    this.desafiante.empataLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=================================");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
        
    }
    // Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
