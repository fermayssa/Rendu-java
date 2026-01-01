import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class AffectationHashMap {
    Map<Employe , Departement> Mape = new HashMap<>();


    public void ajouterEmployeDepartement(Employe e, Departement d){
        Mape.put(e,d);
    }
    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employe , Departement> entry : Mape.entrySet()) {
            System.out.println(entry.getKey()+ "-> " + entry.getValue());
        }
    }
    public void supprimerEmploye(Employe e){
        Mape.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if(Mape.containsKey(e)&& Mape.get(e).equals(d))
            Mape.remove(e);
    }

    public void afficherEmployes(){
        for (Employe e : Mape.keySet())
            System.out.println(e);
    }
    public void afficherDepartements(){
        for (Departement d : Mape.values())
            System.out.println(d);
    }
    public boolean rechercherEmploye(Employe e){
        return Mape.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d){
        return Mape.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe , Departement> TreeMape = new TreeMap<>();
        for(Map.Entry<Employe, Departement> E : Mape.entrySet())
            TreeMape.put(E.getKey(),E.getValue());
        return TreeMape;
    }



}
