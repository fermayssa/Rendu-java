import java.util.Objects;

public class Departement implements   Comparable<Departement>{
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    Departement(){}
    Departement(int id, String nomDepartement, int nombreEmployes){
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id, nomDepartement);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Departement)) return false;
        Departement d = (Departement) o;
        return id == d.id &&  nomDepartement.equals(d.nomDepartement);
    }

    @Override
    public  String toString() {
        return nomDepartement + " " + nombreEmployes;
    }
    @Override
    public int compareTo(Departement d){
        return this.id - d.getId();
    }


}
