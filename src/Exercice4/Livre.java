package Exercice4;

public class Livre {
    private String titre;
    private String auteur;
    private int nombreDePages;
    private double prix = -1;
    private boolean prixFixe;
    public Livre (){
        this.prixFixe = false;
    }
    public Livre(String titre, String auteur, int nombreDePages){
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.prixFixe = false;
    }
    public Livre(String titre, String auteur, int nombreDePages, double prix){
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.setPrix(prix);
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    String getTitre(){
        return titre;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    String getAuteur(){
        return auteur;
    }
    public void setNombreDePages(int nombreDePages){
        this.nombreDePages = nombreDePages;
    }
    int getNombreDePages(){
        return nombreDePages;
    }
    public void setPrix(double prix){
        if(!prixFixe){
            this.prix = prix;
            this.prixFixe = true;
        }
        else{
            System.out.println("Impossible! Le prix est deja fixe");
        }
    }
    double getPrix(){
        return prix;
    }

    @Override
    public String toString(){
        if (prix != -1){
            return titre + " est un livre ecrit par " + auteur + ". Il contient " +nombreDePages+ " pages, et son prix est " + prix + "DH.";
        }
        else{
            return titre + " est un livre ecrit par " + auteur + ". Il contient " +nombreDePages+ " pages.Le Prix pas encore donné";
        }
    }
    //4. Écrivez une méthode « prixFixe » qui renvoie si le prix a déjà été fixé.
    public void prixFixe(){
        if (prixFixe) System.out.println("Le prix de "+ this.titre + " ecrit par " + this.auteur+" est fixe! \nPrix: " + prix);
        else System.out.println("Le prix de "+ this.titre + " ecrit par " + this.auteur+ " n'est pas encore fixe!");
    }
    public int comparer(Livre livre){
        return Integer.compare(this.nombreDePages, livre.nombreDePages);
    }

}
