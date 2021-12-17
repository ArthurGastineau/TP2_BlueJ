import java.util.*;
/**
 * Cette classe permet de définir un type Joueur comportant un nom et un score. Il contient des méthodes permettant de modifier son score, de récupérer son score et son nom.
 *
 * @author GASTINEAU Arthur & LAMOUR Guillaume
 * @version v0.5
 */
public class Joueur
{
    // déclaration des variables d'instance
    private String nom;
    private int score;
    private Vector<Integer> stats;
    /**
     * Constructeurs des objets de la classe Joueur
     * @param  nom  chaîne de caractères du nom de Joueur
     */
    public Joueur(String nom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        score = 0;
        stats = new Vector<>();
    }
    
    /**
     * méthode ajoutPoints permettant d'ajouter des points au score d'un joueur
     *
     * @param  points entier correspondant aux points à ajouter au score du joueur
     */
    public void ajoutPoints(int points)
    {
        score += points;   // on ajoute au score du joueur le nombre de points
        stats.set(points-1,stats.get(points-1)+1);
    }
    
    /**
     * méthode getNom permettant de récupérer le nom d'un joueur
     *
     * @return la méthode retourne une chaîne de caractères comportant le nom du joueur
     */
    public String getNom()
    {
        return nom;    // on retourne le nom du joueur
    }
    
    /**
     * méthode getScore permettant de récupérer le score d'un joueur
     *
     * @return la méthode retourne un entier correspondant au nom du joueur
     */
    public int getScore()
    {
        return score;    // on retourne le score du joueur
    }
    
    /**
     * méthode Reset permettant la remise à zéro du score d'un joueur
     *
     */
    public void Reset()
    {
        score = 0;    // on remet à zéro le score du joueur
    }
    
    public void ResetStats(int nb_faces)
    {
        stats.removeAllElements();
        for (int id_face=0; id_face < nb_faces; id_face++)
        {
            stats.add(0);
        }
    }
    
    public void ShowStats()
    {
        for (int id_face=0; id_face < stats.size(); id_face++)
        {
            System.out.println("Atteint la valeur " + (id_face+1) +  " : " + stats.get(id_face) + " fois");
        }
    }
}