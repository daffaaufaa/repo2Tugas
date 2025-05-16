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
 class Duck extends Animal {
     String beakColor;
     
 // Konstruktor
    public Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }
 // Metode untuk berenang
    public void swim() {
        System.out.println("Duck is swimming.");
    }
 // Metode untuk quack
    public void quack() {
        System.out.println("Duck says quack.");
    }
}
