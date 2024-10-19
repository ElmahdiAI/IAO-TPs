public class Etudiant extends Person {
    private Integer numero;


    public Etudiant(String nom, String prenom, Integer numero) {
        super(nom, prenom);
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
