public class Rectangle
{
    double Longueur ;
    double Largeur ;
    double Longueur1 ;
    double Largeur1 ;
    public Points donnee;

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


     
}