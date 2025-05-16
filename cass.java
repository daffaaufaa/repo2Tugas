/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal1;

import animal.fish.Fish;
import animal.zebra;

/**
 *
 * @author daffa
 */
public class cass {
    public static void main(String[] args) {
     Duck duck = new Duck(2, "Male", "Yellow");
        duck.swim();
        duck.quack();
        
    fish Fish = new fish(1, "Female", 2, true);
        Fish.swim();

    Zebra zebra = new Zebra(5, "Male", true);
        zebra.run();

    // Memanggil metode dari kelas Animal
   zebra.mate();
}
}

