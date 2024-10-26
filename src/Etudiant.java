import java.time.LocalDate;
import java.util.Objects;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String adressePostale;

    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String email, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.adressePostale = adressePostale;
    }

    @Override
    public String toString() {
        return "Etudiant{nom='" + nom + "', prenom='" + prenom + 
               "', dateNaissance=" + dateNaissance + 
               ", email='" + email + 
               "', adressePostale='" + adressePostale + "'}";
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Etudiant etudiant = (Etudiant) obj;
        return nom.equals(etudiant.nom) && prenom.equals(etudiant.prenom) &&
               dateNaissance.equals(etudiant.dateNaissance) && 
               email.equals(etudiant.email) && adressePostale.equals(etudiant.adressePostale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, dateNaissance, email, adressePostale);
    }
}
