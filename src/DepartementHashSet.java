import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> depart = new HashSet<>();

    public void ajouterDepartement(Departement t){
        depart.add(t);
    }
    public boolean rechercherDepartement(String nomDepartement){
        for (Departement d : depart){
            if(d.getNomDepartement().equals(nomDepartement)) return true;
        }
        return false;
    }
    public boolean rechercherDepartement(Departement t){
        return depart.contains(t);
    }
    public void supprimerDepartement(Departement t){
        depart.remove(t);
    }
    public void afficherDepartements(){
        for(Departement d : depart)
            System.out.println(d.toString());
    }

    public void trierDepartementsParId(){
        List<Departement> list = new ArrayList<>(depart);
        Collections.sort(list);
        for(Departement d : list)
            System.out.println(d.toString());
    }
    public void trierDepartementsParNomEtNombreEmployes(){
        List<Departement> list = new ArrayList<>(depart);
        Collections.sort(list,new  Comparator<Departement>(){
            @Override
            public int compare(Departement o1, Departement o2) {
                int name = o1.getNomDepartement().compareTo(o2.getNomDepartement());
                if(name != 0) return name;
                return o1.getNombreEmployes() - o2.getNombreEmployes();

            }
        });
        for (Departement d : list) {
            System.out.println(d);
        }
    }
}
