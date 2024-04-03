package Exercice1;

public class Personne {
    public String CIN;
    public String Nom;
    public String Prenom;
    public String Email;
    public int age;
    public Personne() {
    }
    public void initialiser(String CIN, String Nom, String Prenom, String Email, int age) {
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.age = age;
    }
    public void afficherPersonne() {
        System.out.println("CIN: " + CIN + "\nNom: " + Nom + "\nPrenom: "+ Prenom + "\nEmail: "+ Email+ "\nAge: " + age);
    }
    public static void main(String[] args) {
        Personne p = new Personne();
        p.initialiser("HH90255", "Laaraich", "Lina", "laaraichlina@gmail.com", 22);
        p.afficherPersonne();
    }
}
