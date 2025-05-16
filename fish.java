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
 class fish extends Animal {
     int sizeInFt;
     boolean canEat;
     
    // Konstruktor
    public fish(int age, String gender, int sizeInFt , boolean canEat) {
        super (age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
        

    }// Metode untuk berenang
    public void swim () {
        System.out.println("Fish is swimming.");
    }
    }
     
     
     
     
     
    

