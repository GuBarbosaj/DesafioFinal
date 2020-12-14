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
public class Tempo {
    public int hora, min, seg;

    public Tempo(){
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public void passaSegundo(){
        if(this.seg != 59){
            this.seg++;
        }else if(this.min != 59){
            this.min++;
            this.seg = 0;
        }else{
            this.hora++;
            this.min = 0;
            this.seg = 0;
        }
    }
    
}
