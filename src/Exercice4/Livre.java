package Exercice4;

public class Livre {
    String titre;
    String auteur;
    int nombreDePages;
    double prix = -1;
    boolean prixFixe;
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
        this.prix = prix;
        this.prixFixe = true;
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
            return titre + " est un livre ecrit par " + auteur + ". Il contient " +nombreDePages+ "pages, et son prix est " + prix + "DH.";
        }
        else{
            return titre + " est un livre ecrit par " + auteur + ". Il contient " +nombreDePages+ "pages. " + "\nPrix pas encore donné";
        }
    }
    //4. Écrivez une méthode « prixFixe » qui renvoie si le prix a déjà été fixé.
    public void prixFixe(){
        if (prixFixe) System.out.println("Le prix est fixe! \nPrix: " + prix);
        else System.out.println("Le prix n'est pas encore fixe!");
    }
    public int comparer(Livre livre){
        if(livre.nombreDePages > this.nombreDePages ) return -1;//System.out.println("Le livre " + a.titre + "contient plus de pages que " + b.titre);
        else if(livre.nombreDePages < this.nombreDePages ) return 1;//System.out.println("Le livre " + b.titre + "contient plus de pages que " + a.titre);
        else return 0; //System.out.println("Les deux livres " + a.titre + "et" + b.titre + "contient le meme nombre de pages");
    }

    //6. Créez une classe Etagere pour représenter une étagère qui peut contenir un certain
    //nombre de livres (fixe pour chaque étagère). Vous utiliserez pour cela un tableau.
    //7. Le constructeur prendra en paramètre le nombre de livres que pourra contenir
    //l’étagère.
    //8. Vous ajouterez des méthodes pour :
    //a. Donner le nombre de livres que peut contenir l’étagère, et le nombre de livres
    //qu’elle contient.
}
