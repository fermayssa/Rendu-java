package tn.esprit.gestionzoo.exceptions;

public class ZooFullException extends RuntimeException {


    public ZooFullException() {
        super("Le zoo est plein, impossible d’ajouter un nouvel animal !");
    }

    public ZooFullException(String message) {
        super(message);
    }


}
