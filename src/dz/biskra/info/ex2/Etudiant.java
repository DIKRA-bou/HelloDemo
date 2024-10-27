package dz.biskra.info.ex2;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String nom;
    private String prenom;
    private List<Note> notes;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new ArrayList<>();
    }

    public void noter(Matiere matiere, double valeur) {
        notes.add(new Note(matiere, valeur));
    }

    public double calculerMoyenne() {
        if (notes.isEmpty()) return 0.0;

        double sommePonderee = 0.0;
        double sommeCoefficients = 0.0;

        for (Note note : notes) {
            sommePonderee += note.getValeur() * note.getMatiere().getCoefficient();
            sommeCoefficients += note.getMatiere().getCoefficient();
        }

        return sommeCoefficients == 0 ? 0 : sommePonderee / sommeCoefficients;
    }
}

