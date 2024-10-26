import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> etudiantsInscrits;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departement{\n");
        sb.append("specialite='").append(specialite).append("'\n");
        sb.append("adresse='").append(adresse).append("'\n");
        sb.append("Etudiants inscrits:\n");
        for (Etudiant e : etudiantsInscrits) {
            sb.append(e).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.removeIf(e -> e.equals(etudiant));
    }
}
