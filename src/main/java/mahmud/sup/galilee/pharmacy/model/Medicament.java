package mahmud.sup.galilee.pharmacy.model;

public class Medicament {

    private Long id;
    private String nom;
    private String description;
    private int quantite;
    public Medicament() {
    }

    public Medicament(Long id, String nom, String description, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.quantite = quantite;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}