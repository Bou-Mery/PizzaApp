package ma.ensa.tp2.classes;
public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo ;
    private String durre;
    private String detaisIngred ;
    private String descreption;
    private String preparation;

    private static int comp;

    public Produit() {
    }

    public Produit( String nom, int nbrIngredients, int photo, String durre, String detaisIngred, String descreption, String preparation) {
        this.id =comp++;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.durre = durre;
        this.detaisIngred = detaisIngred;
        this.descreption = descreption;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDurre() {
        return durre;
    }

    public void setDurre(String durre) {
        this.durre = durre;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", durre='" + durre + '\'' +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", descreption='" + descreption + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
