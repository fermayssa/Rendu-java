public interface IGestion<T> {
    public void ajouterEmploye(T t);
    public boolean rechercherEmploye(String nom);
    public boolean rechercherEmploye(T t);
    public void SupprimerEmploye(T t);
    public void displayEmploye();
    public void trierEmployeOarId();//Comparable
    public void trierEmployeParNomDepartementEtDrade();//comparator



}
