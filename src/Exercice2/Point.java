package Exercice2;

public class Point {

    public char nom;
    double abscisse;
    public Point(){

    }
    public void initialiser(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void initialiser(Point point){
        this.nom = point.nom;
        this.abscisse = point.abscisse;
    }
    public void affiche(){
        System.out.println("Nom: " + nom +"\nAbscisse: " + abscisse);
    }
    public void translate(double arg){
        this.abscisse += arg;
    }
    public static void main(String[] args){
        Point point = new Point();
        point.initialiser('A', 3);
        point.affiche();
        point.translate(4);
        point.affiche();
    }
}
