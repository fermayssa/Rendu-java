import  java.util.List;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList s = new SocieteArrayList();
        s.ajouterEmploye(new Employe(1, "Ali", "Ahmed", "Informatique", 2));
        s.ajouterEmploye(new Employe(2, "Sami", "Ben", "Finance", 3));
        s.ajouterEmploye(new Employe(3, "Nour", "Zahra", "Informatique", 1));

        List<Employe> info = s.rechercheParDepartement("Informatique");

        for (Employe e : info) {
            System.out.println(e);
        }


    }
}