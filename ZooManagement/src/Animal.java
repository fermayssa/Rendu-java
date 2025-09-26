public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    Animal(String family,String name, int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }


    void displayAnimal()
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
