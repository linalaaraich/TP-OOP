package Exercice4;

public class Etagere {
    Livre[] livres;
    int etageMax;
    int nombreDeLivres;
    Etagere(int etageMax){
        this.etageMax = etageMax;
    }
    //a. Donner le nombre de livres que peut contenir l’étagère, et le nombre de livres qu’elle contient.
    int[] nombreLivres(){
        return new int[]{etageMax, nombreDeLivres};
    }
    //ajouterez les livres « à la fin» de l’étagère. Il devra être impossible d’ajouter des livres dans une étagère pleine.
    void ajouter(Livre livre){
        if(etageMax > nombreDeLivres) {
            livres[nombreDeLivres] = livre;
            nombreDeLivres++;
        }
    }
    //c
    Livre getLivre(int position){
        return livres[position-1];
    }
    //d.Chercher sur l’étagère un livre repéré par son titre et son auteur. La méthode
    //renverra la position du livre dans l’étagère (ou 0 si le livre n’y est pas). Le
    //profil de la méthode sera.

    //e. Supprimer des livres.
}
