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
 class Animal {
     int age;
     String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
    public boolean isMammal() {
        return false;  // Default return value
    }

    public void mate() {
        System.out.println("Animal is mating");
    }
    
}
