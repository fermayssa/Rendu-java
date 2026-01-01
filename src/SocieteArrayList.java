import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe>{
    private ArrayList<Employe> employes = new ArrayList<>();
    private List<Employe> employeeDepart = new ArrayList<>();


    @Override
    public void ajouterEmploye(Employe t){
        employes.add(t);

    }
    @Override
    public boolean rechercherEmploye( String nom) {
        for (Employe e : employes){
            if (e.getNom().equals(nom)){
                return  true;
            }
        }

        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe t){
        return employes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t){
        employes.remove(t);

    }
    @Override
    public void displayEmploye(){
        for (Employe e : employes){
            System.out.println(e);
        }

    }
    @Override
    public void trierEmployeParId(){
        Collections.sort(employes);
        //comparable
    }
    @Override
    public void trierEmployeParNomDepartementEtGrade(){
        //comparator
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                int dep = o1.getNomDepartement().compareTo(o2.getNomDepartement());
                if(dep != 0)
                    return dep;
                int grad =o1.getGrade() - o2.getGrade();
                if(grad != 0)
                    return  grad;
                return o1.getNom().compareTo(o2.getNom());
            }
        });
    }
    @Override
    public List<Employe> rechercheParDepartement(String nomDepartement){
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : employes)
        {
            if (e.getNomDepartement().equals(nomDepartement))
                resultat.add(e);
        }
        return resultat;

    }

}
