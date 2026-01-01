import java.util.HashSet;
import  java.util.List;

public class Main {
    public static void main(String[] args) {

       /* SocieteArrayList s = new SocieteArrayList();
        s.ajouterEmploye(new Employe(1, "Ali", "Ahmed", "Informatique", 2));
        s.ajouterEmploye(new Employe(2, "Sami", "Ben", "Finance", 3));
        s.ajouterEmploye(new Employe(3, "Nour", "Zahra", "Informatique", 1));

        List<Employe> info = s.rechercheParDepartement("Informatique");

        for (Employe e : info) {
            System.out.println(e);
        }*/

        // 1️⃣ Création des départements
        Departement d1 = new Departement(3, "Informatique", 20);
        Departement d2 = new Departement(1, "RH", 10);
        Departement d3 = new Departement(2, "Informatique", 15);
        Departement d4 = new Departement(4, "Finance", 25);

        // 2️⃣ Création de la société (HashSet)
        DepartementHashSet dhs = new DepartementHashSet();

        // 3️⃣ Ajout des départements
        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);
        dhs.ajouterDepartement(d4);

        // 4️⃣ Affichage sans tri (HashSet)
        System.out.println("=== Affichage normal (HashSet) ===");
        dhs.afficherDepartements();

        // 5️⃣ Tri par ID (Comparable)
        System.out.println("\n=== Tri par ID (Comparable) ===");
        dhs.trierDepartementsParId();

        // 6️⃣ Tri par Nom + Nombre d'employés (Comparator)
        System.out.println("\n=== Tri par Nom et Nombre d'employés (Comparator) ===");
        dhs.trierDepartementsParNomEtNombreEmployes();



    }
}