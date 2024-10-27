package dz.biskra.info.ex2;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String specialite;
    private String adresse;
    private List<Etudiant> etudiantsInscrits;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    public double getMoyennePromo() {
        if (etudiantsInscrits.isEmpty()) return 0.0;

        double sommeMoyennes = 0.0;
        for (Etudiant etudiant : etudiantsInscrits) {
            sommeMoyennes += etudiant.calculerMoyenne();
        }

        return sommeMoyennes / etudiantsInscrits.size();
    }
}
