package Exercice4;

public class Etagere {
    private final Livre[] livres;
    private final int etageMax;
    private int nombreDeLivres;

    Etagere(int etageMax, Livre[] livres) {
        this.etageMax = etageMax;
        this.nombreDeLivres = livres.length;
        this.livres = new Livre[etageMax];
        System.arraycopy(livres, 0, this.livres, 0, livres.length);
    }

    Etagere(int etageMax) {
        this.etageMax = etageMax;
        this.livres = new Livre[etageMax];
        this.nombreDeLivres = 0;
    }

    //a. Donner le nombre de livres que peut contenir l’étagère, et le nombre de livres qu’elle contient.
    int[] nombreLivres() {
        return new int[]{etageMax, nombreDeLivres};
    }

    //ajouterez les livres « à la fin» de l’étagère. Il devra être impossible d’ajouter des livres dans une étagère pleine.
    public void ajouter(Livre livre) {
        if (nombreDeLivres < etageMax) {
            livres[nombreDeLivres] = livre;
            nombreDeLivres++;
        } else {
            System.out.println("L'étagère est pleine.");
        }
    }

    //c
    Livre getLivre(int position) {
        return livres[position - 1];
    }

    //d.Chercher sur l’étagère un livre repéré par son titre et son auteur.
    public int chercher(String titre, String auteur) {
        for (int i = 0; i < nombreDeLivres; i++) {
            if (livres[i].getTitre().equals(titre) && livres[i].getAuteur().equals(auteur)) {
                System.out.println("Livre existe a la position " + i);
                return i + 1;
            }
        }
        System.out.println("Livre n'existe pas dans l'etagere");
        return 0;
    }

    //e. Supprimer des livres.
    public void supprimer(Livre livre) {
        int j = etageMax;
        for (int i = 0; i < nombreDeLivres; i++) {
            if(livres[i].equals(livre)){
                livres[i] = null;
                j = i;
                break;
            }
        }
        for (int i = j; i < nombreDeLivres - 1 ; i++) livres[i] = livres[i + 1];
        nombreDeLivres--;
    }
    //affichage
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("L'etage contient " + nombreDeLivres + "/" + etageMax + ":\n");
        for(int i = 0; i < nombreDeLivres; i++){
            s.append("   - ").append(livres[i].toString());
            s.append("\n");
        }
        return s.toString();
    }


    //main pour tester
    public static void main(String[] args){
        Livre livre1 = new Livre("Words of Radiance", "Brandon Sanderson", 1087, 400);
        Livre livre2 = new Livre("The Ocean at the End of the Lane", "Neil Gaiman", 178);
        Livre livre3 = new Livre("The Da Vinci Code", "Dan Brown", 489);
        Livre livre4 = new Livre("Kings of the Wyld", "Nicholas Eames", 502);
        Livre livre5 = new Livre();
        Livre livre6 = new Livre("The Well of Ascension", "Brandon Sanderson", 590);
        Livre livre7 = new Livre("The Well of Ascension", "Brandon Sanderson", 590, 190);

        livre5.setTitre("Spinning Silver");
        livre5.setAuteur("Naomi Novik");
        livre5.setNombreDePages(480);
        livre5.setPrix(200);

        System.out.println("Resultat de comparaison de " + livre1.getTitre() + " et "+ livre6.getTitre() +" est "+ livre1.comparer(livre6));
        System.out.println("Resultat de comparaison de " + livre6.getTitre() + " et "+ livre7.getTitre() +" est "+ livre7.comparer(livre7));
        System.out.println("Resultat de comparaison de " + livre2.getTitre() + " et "+ livre6.getTitre() +" est "+ livre2.comparer(livre6));
        livre4.prixFixe();
        livre4.setPrix(220);
        livre4.prixFixe();

        Livre[] livres1, livres2;
        livres1 = new Livre[]{livre1, livre2, livre3, livre4, livre5, livre6};
        livres2 = new Livre[]{livre2, livre3, livre4, livre5};
        Etagere etagere1 = new Etagere(6, livres1);
        Etagere etagere2 = new Etagere(6, livres2);
        System.out.println(etagere1);
        etagere1.ajouter(livre7);
        etagere1.chercher("Oathbringer", "Brandon Sanderson");
        etagere1.chercher("Words of Radiance", "Brandon Sanderson");
        System.out.println(etagere1);
        System.out.println(etagere2);
        etagere2.ajouter(livre1);
        System.out.println(etagere2);
        etagere2.ajouter(livre6);
        System.out.println(etagere2);
        etagere2.supprimer(livre2);
        System.out.println(etagere2);
    }
}
