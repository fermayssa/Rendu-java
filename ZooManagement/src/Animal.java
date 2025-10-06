public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family,String name, int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        setAge(age);// Utilise le setter pour vérifier la validité
        this.isMammal=isMammal;
    }
    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return family;
    }

    public void setSpecies(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("❌ L'âge ne peut pas être négatif !");
            this.age = 0; // Valeur par défaut
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }


   public void displayAnimal()
    {
        System.out.println("name: "+name );
        System.out.println("age: "+age);
        System.out.println("isMammal: "+isMammal);
        System.out.println("family: "+family);
    }
    @Override
    public String toString()
    {
       return "name: "+name + " age: "+age + " isMammal: "+isMammal;
    }
}
