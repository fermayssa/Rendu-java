public class Employe implements Comparable<Employe>{
    private int id;
    private  String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    Employe(){}
    Employe(int id, String nom, String prenom, String nomDepartement, int grade){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getNomDepartement(){
        return nomDepartement;
    }
    public int getGrade(){
        return grade;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setNomDepartement(String nomDepartement){
        this.nomDepartement = nomDepartement;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    @Override
    public int compareTo(Employe e){
        return this.id - e.id;
    }




    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe e = (Employe) o;
        return id == e.id;
    }
    @Override
    public String toString(){
        return "Employe :  id= " + id +"nom=" + nom + "prenom= " + prenom + "nom departement = " + nomDepartement + "grade = " + grade;
    }

}
