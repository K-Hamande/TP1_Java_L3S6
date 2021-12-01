public class Rectangle
{
    double Longueur ;
    double Largeur ;
    double Longueur1 ;
    double Largeur1 ;
    public Points donnee;
    static int compteur = 0 ;

    public Rectangle(Points donnee, double Longueur , double Largeur)
    {
        this.Longueur = Longueur;
        this.Largeur = Largeur;
        this.Longueur1 = Longueur;
        this.Largeur1 = Largeur;
        this.donnee = donnee;
      
    }

    public Rectangle(Points donnee , double Longueur , double Largeur ,double Longueur1 , double Largeur1) 
    {
        this.donnee = donnee;
        this.Longueur =  Longueur;
        this.Largeur = Largeur;
        this.Longueur1 =  Longueur1;
        this.Largeur1 = Largeur1;
    }

    public Rectangle(Points donnee , Points donnee1)
    {
        this.Longueur = Math.abs(donnee.x - donnee1.x);
        this.Longueur = Math.abs(donnee.y - donnee1.y);
        this.Longueur1 = Math.abs(donnee.x - donnee1.x);
        this.Longueur1 = Math.abs(donnee.y - donnee1.y);
    }

    public double Surface() // methode pour le calcule de la surface 
    {
        return (Longueur*Largeur);
    }

    public void translate(double valeur1 , double valeur2) // methode pour translater le rectangle 
    {
        donnee.x += valeur1;
        donnee.y += valeur1;
    }
     
    public boolean contains(Points valeur) // verifier si un point appartient au rectangle 
     {
        return (valeur.x >= donnee.x && valeur.y >= donnee.y &&  donnee.x + Longueur >= valeur.x &&  donnee.x + Largeur >= valeur.y);
    }

     public boolean contains(Rectangle Rect) // verifier si un rectangle est dans un autre 
      {
        return (( Rect.donnee.x - donnee.x) + Rect.Longueur <=  Longueur && (Rect.donnee.y - donnee.y) + Rect.Largeur <= Largeur);
      }
      public boolean SameAs( Rectangle Rect) // verifier si deux rectangle sont identique 
      {
          return(Rect.donnee.x == donnee.x && Rect.donnee.y == donnee.y);
      }
     
}