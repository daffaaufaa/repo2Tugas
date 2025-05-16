/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal1;

/**
 *
 * @author daffa
 */
 class Zebra extends Animal {
     boolean isWild;
     
 // Konstruktor
    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }
    
 // Metode untuk berlari
    public void run() {
        System.out.println("Zebra is running.");
    }
    
}
