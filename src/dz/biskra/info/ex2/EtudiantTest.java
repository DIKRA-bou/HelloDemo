package dz.biskra.info.ex2;
//import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtudiantTest {
    public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note() {
        Etudiant etudiant = new Etudiant("Dupont", "Laurent");
        assertEquals(0.0, etudiant.calculerMoyenne(), 1e-6);
    }

    
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note() {
        Etudiant etudiant = new Etudiant("Dupont", "Laurent");
        Matiere matiere = new Matiere("Math", 1.0);
        etudiant.noter(matiere, 15.0);
        assertEquals(15.0, etudiant.calculerMoyenne(), 1e-6);
    }

    
    public void test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient() {
        Etudiant etudiant = new Etudiant("Dupont", "Laurent");
        Matiere matiere = new Matiere("Math", 2.0);
        etudiant.noter(matiere, 15.0);
        assertEquals(15.0, etudiant.calculerMoyenne(), 1e-6);
    }

    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        Etudiant etudiant = new Etudiant("Dupont", "Laurent");
        Matiere math = new Matiere("Math", 2.0);
        Matiere info = new Matiere("Info", 3.0);
        etudiant.noter(math, 15.0);
        etudiant.noter(info, 10.0);
        assertEquals(12.0, etudiant.calculerMoyenne(), 1e-6);
    }
}
