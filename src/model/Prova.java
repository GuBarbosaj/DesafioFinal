/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Micro
 */


public class Prova extends Tempo{
    public static Prova instance;
    private String nome, email, senha;
    private String respostas[] = new String[4];
    public Tempo tempo[] = new Tempo[4];
    public boolean revisao[] = new boolean[4];
    public int acertos;
            
    public void limpar(){
        instance = null;
    }
    
    public int somaTempoMin(){
        int min = 0;
        for(int i=0; i<4; i++){
            min += tempo[i].min;
        }
        return min;
    }
    
    public int somaTempoHora(){
        int hora = 0;
        for(int i=0; i<4; i++){
            hora += tempo[i].hora;
        }
        return hora;
    }
    
    
    public static Prova getInstance(){
        if(instance == null){
            instance = new Prova();
        }
        return instance;
    }

    public Prova(){
        for(int i=0; i<4; i++){
            this.respostas[i] = "X";
            this.revisao[i] = false;
            this.tempo[i] = new Tempo();
            this.acertos = 0;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    
    public int getSeg(int pos) {
        return tempo[pos].seg;
    }
    
    public int getMin(int pos) {
        return tempo[pos].min;
    }
    
    public int getHor(int pos) {
        return tempo[pos].hora;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas, int pos) {
        this.respostas[pos] = respostas;
    }
}
