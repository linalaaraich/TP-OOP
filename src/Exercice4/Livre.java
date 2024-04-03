package Exercice4;

public class Livre {
    String titre;
    String auteur;
    int nombreDePages;
    double prix;
    public Livre(String titre, String auteur, int nombreDePages){
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
    }
    public Livre(String titre, String auteur, int nombreDePages, double prix){
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.prix = prix;
    }
    //2. Des méthodes d’accès et d’altération (get et set) pour les différents attributs.
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
        this.prix = prix;
    }

    //3. Une méthode toString() qui renvoie une chaîne de caractères qui décrit le livre. Si le
    //prix d’un livre n’a pas été donné, la description du livre (toString()) devra indiquer
    //«Prix pas encore donné ».
    //Un livre peut être gratuit (0 est une valeur possible pour un prix) ; la valeur -1 indiquera que
    //le prix n’a pas encore été donné. On bloque complètement les prix : un prix ne peut être donné
    //qu’une seule fois et ne peut être modifié ensuite (une tentative pour changer le prix ne fait
    //qu’afficher un message d’erreur). Vous ajouterez une variable booléenne prixFixe qui
    //indiquera que le prix ne peut plus être modifié.
}
