package tn.esprit.gestionzoo.main;


import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
       Animal lion= new Animal("dfdg","sdxf",55,true);
       Zoo myZoo = new Zoo("ffff","ghh",5);
        Animal lion2= new Animal("llll","dddd",56,true);
        Animal lion3= new Animal("hhhh","jjj",3,true);
        /// ///////////////////////////////
        Aquatic fish = new Aquatic();
        Terrestrial lion5 = new Terrestrial();
        Dolphin D1 = new Dolphin();
        Penguin P11 = new Penguin();

        System.out.println(fish);
        System.out.println(D1);
        System.out.println(P11);

        fish.swim();
        D1.swim();
        P11.swim();




        /*//myZoo.displayZoo();
        //System.out.println("//////////////////////////////////////////////////");
        //lion.displayAnimal();
        System.out.println("////////////animal//////////////////////////////");
        System.out.println(lion);
        System.out.println("////////////zoo/////////////////////////////////");
        System.out.println(myZoo);*/
        //----------------prosit2----------------------------------------------
        // Ajout dans le zoo
       /* System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion2));
        System.out.println(myZoo.addAnimal(lion3));
        // Test : remplir le zoo de manière forcée
        for (int i = 0; i < 30; i++) {
            boolean added = myZoo.addAnimal(new tn.esprit.gestionzoo.entities.Animal("Test", "tn.esprit.gestionzoo.entities.Animal" + i, i, true));
            System.out.println("Ajout de tn.esprit.gestionzoo.entities.Animal" + i + " : " + added);
        }*/
        //-------------------------------prosit3------------------------------------


        /*Zoo myZoo1 = new Zoo("Esprit tn.esprit.gestionzoo.entities.Zoo", "Tunis", 20);
        Animal lion11 = new Animal("Félins", "Lion", 5, true);
        // Ajout de l’animal dans le zoo
        myZoo1.addAnimal(lion);

        // Affichage
        myZoo1.displayAnimals();

        // Recherche du lion
        int index = myZoo1.searchAnimal(lion11);
        System.out.println("Indice du lion 11 : " + index);
        // Suppression du tigre
        myZoo.removeAnimal(lion);

        System.out.println("Après suppression :");
        myZoo.displayAnimals();

        // Ajouter quelques animaux
        for (int i = 0; i < 25; i++) {
            myZoo.addAnimal(new Animal("tn.esprit.gestionzoo.entities.Animal" + i, "Espèce" + i, i, true));
        }

        // Vérifier si le zoo est plein
        if (myZoo.isZooFull()) {
            System.out.println(" Le zoo est plein !");
        } else {
            System.out.println(" Il reste encore de la place !");
        }
        // Essai d’ajouter un 26e animal
        myZoo.addAnimal(new Animal("Extra", "Test", 1, true));*/






    }
}


