public class Zoo {
    Animal[] animals;
    String name;
    String city;
    //int nbrCages;
    final int NBR_CAGES = 25;


    Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        //this.nbrCages=nbrCages;
        this.animals=new Animal[25];
    }
    void displayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        //System.out.println("NbrCages: "+nbrCages);
    }

    @Override
    public String toString() {
        return getClass().getName() +"Name: "+name + " City: "+city;


    }

    boolean addAnimal(Animal animal) {
        // Vérifier si le zoo est plein
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
            }
        }
        if (count >= NBR_CAGES) {
            System.out.println(" Impossible d'ajouter : zoo plein !");
            return false;
        }

        // Vérifier si l’animal existe déjà (même nom)
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                System.out.println(" Animal déjà présent : " + animal.name);
                return false;
            }
        }

        // Ajouter dans la première case libre
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(" Animal ajouté : " + animal.name);
                return true;
            }
        }

        return false; // par sécurité
    }





    void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " :");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i; // on retourne l’indice trouvé
            }
        }
        return -1; // non trouvé
    }
    boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                animals[i] = null; // on supprime
                System.out.println(" Animal supprimé : " + animal.name);
                return true;
            }
        }
        System.out.println(" Animal introuvable : " + animal.name);
        return false;
    }
    boolean isZooFull() {
        int count = 0;

        // Compter le nombre d’animaux non nuls dans le tableau
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
            }
        }

        // Comparer avec le nombre maximal de cages
        return count >= NBR_CAGES;
    }
    Zoo comparerZoo(Zoo z1, Zoo z2) {
        int count1 = 0;
        int count2 = 0;

        // Compter les animaux du premier zoo
        for (int i = 0; i < z1.animals.length; i++) {
            if (z1.animals[i] != null) {
                count1++;
            }
        }

        // Compter les animaux du second zoo
        for (int i = 0; i < z2.animals.length; i++) {
            if (z2.animals[i] != null) {
                count2++;
            }
        }

        // Comparer et retourner le zoo qui a le plus d’animaux
        if (count1 > count2) {
            System.out.println(z1.name + " a plus d’animaux (" + count1 + ")");
            return z1;
        } else if (count2 > count1) {
            System.out.println(z2.name + " a plus d’animaux (" + count2 + ")");
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d’animaux (" + count1 + ")");
            return null; // égalité
        }
    }









}

