package tn.esprit.gestionzoo.exceptions;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
        super("Âge d’animal invalide : l’âge ne peut pas être négatif.");
    }


}
