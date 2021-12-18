import java.util.*;

/**
 * Cette classe permet de définir un type Joueur comportant un nom, un score et les statistiques de ses lancers. 
 * Il contient des méthodes permettant de modifier, réinitialiser ou récupérer son score ; de récupérer son nom ; de réinitialiser ou récupérer les stats de ses lancers.
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
     * Méthode ajoutPoints permettant d'ajouter des points au score d'un joueur
     * @param  points entier correspondant aux points à ajouter au score du joueur
     */
    public void ajoutPoints(int points)
    {
        // on ajoute au score du joueur le nombre de points
        score += points;   
        // on incrémente l'occurence de la valeur (du dé) dans les stats du joueur       
        stats.set(points-1,stats.get(points-1)+1);
    }
    
    /**
     * Méthode getNom permettant de récupérer le nom d'un joueur
     *
     * @return la méthode retourne une chaîne de caractères comportant le nom du joueur
     */
    public String getNom()
    {
        // on retourne le nom du joueur
        return nom;    
    }
    
    /**
     * Méthode getScore permettant de récupérer le score d'un joueur
     *
     * @return la méthode retourne un entier correspondant au nom du joueur
     */
    public int getScore()
    {
        // on retourne le score du joueur
        return score;    
    }
    
    /**
     * Méthode Reset permettant la remise à zéro du score d'un joueur
     */
    public void Reset()
    {
        // on remet à zéro le score du joueur
        score = 0;   
    }
    
    /**
     * Méthode ResetStats permettant d'initaliser le tableau des stats du joueur
     * @param  nb_faces entier correspondant au nombre de face du dé
     */
    public void ResetStats(int nb_faces)
    {
        //On supprime tout le tableau, il devient de dimension 0
        stats.removeAllElements();
        //On ajoute des cases initialisées à 0 pour chaque face du dé dans le tableau de stats du joueur
        for (int id_face=0; id_face < nb_faces; id_face++)
        {
            stats.add(0);
        }
    }
    
    /**
     * Méthode ShowStats permettant d'afficher le nombre de fois que chaque valeur du dé a été obtenu par le joueur.
     */
    public void ShowStats()
    {
        //On affiche l'occurence de chaque valeur du dé
        for (int id_face=0; id_face < stats.size(); id_face++)
        {
            System.out.println("Atteint la valeur " + (id_face+1) +  " : " + stats.get(id_face) + " fois");
        }
    }
}