public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;


    Zoo(String name,String city,int nbrCages){
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
    void displayZoo(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("NbrCages: "+nbrCages);
    }

    @Override
    public String toString() {
        return getClass().getName() +"Name: "+name + " City: "+city +" NbrCages: "+nbrCages;


    }




}

