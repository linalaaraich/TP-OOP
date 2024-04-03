package Exercice3;

public class Point {
    public char nom;
    double abscisse;
    public Point(){

    }
    public Point(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void affiche(){
        System.out.println("Nom: " + nom +"\nAbscisse: " + abscisse);
    }
    public void translate(double arg){
        this.abscisse += arg;
    }
    public static void main(String[] args){
        Point point = new Point('B', 15.3);
        point.affiche();
        point.translate(0.7);
        point.affiche();
    }
}


