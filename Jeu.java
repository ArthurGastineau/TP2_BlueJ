import java.util.*;

/**
 * Cette classe permet la modélisation du jeu sans dé entre deux joueurs.
 *
 * @author GASTINEAU Arthur et LAMOUR Guillaume
 * @version v0.7
 */
public class Jeu
{
    // déclaration des variables d'instance
    private Joueur [] Joueurs;
    private int nb_joueurs;
    private int nb_coups;
    private De De1;

    /**
     * Constructeurs des objets de la classe Jeu
     * @param  Joueurs tableau d'objets de type Joueur comportant les informations de tous les joueurs présent dans le jeu
     * @param  nb_joueurs entier désignant le nombre de joueurs du jeu
     * @param  nb_coups  entier désignant le nombre de coups du jeu
     * @param  De1  objet de type De modélisant le dé du jeu
     */
    public Jeu(Joueur [] Joueurs, int nb_joueurs, int nb_coups, De De1)
    {
        // initialisation des variables d'instance
        this.Joueurs = Joueurs;
        this.nb_joueurs = nb_joueurs;
        this.nb_coups = nb_coups;
        this.De1 = De1;
    }
    /**
     * méthode partie permettant la simulation d'une partie entre 2 joueurs avec un nombre de coups spécifiés et d'afficher le nom du vainqueur et son score.
     */
    public void partie()
    {
        // mise à zéro des scores et stats des joueurs
        for (int id_joueur = 0; id_joueur < nb_joueurs; id_joueur++)
        {
            Joueurs[id_joueur].Reset();
            Joueurs[id_joueur].ResetStats(De1.getnbFaces());
        }
        //on affecte à chaque joueur le résultat du dé à chaque lancer
        for (int coup=1;coup<=nb_coups;coup++) 
        {
            for (int id_joueur = 0; id_joueur < nb_joueurs; id_joueur++)
            {
                Joueurs[id_joueur].ajoutPoints(De1.Lancer());
            }
        }
        //on affiche les stats de chaque joueur
        for (int id_joueur = 0; id_joueur < nb_joueurs; id_joueur++)
        {
            System.out.println("\nNom : " + Joueurs[id_joueur].getNom() + " Score : " + Joueurs[id_joueur].getScore() + "\n");
            Joueurs[id_joueur].ShowStats();
        }
        //déclaration des variables permettant de connaître le gagnant
        Vector<Integer> id_Gagnant = new Vector<>();
        int max = 0;
        // 
        for (int id_joueur = 0; id_joueur < nb_joueurs; id_joueur++)
        {
            int valeur = Joueurs[id_joueur].getScore();
            if (valeur > max)
            {
                id_Gagnant.removeAllElements();
                id_Gagnant.add(id_joueur);
                max = valeur;
            }
            else if (valeur == max)
            {
                id_Gagnant.add(id_joueur);
            }  
        }
        if (id_Gagnant.size() == 1)
        {
            System.out.println("\nLe vainqueur est " + Joueurs[id_Gagnant.elementAt(0)].getNom() + " son score est de : " + max);
        }
        else 
        {
            System.out.print("\nIl y a " + id_Gagnant.size() + " gagnants à égalité leurs score est de " + max + " leurs noms sont :");
            for (int id = 0; id < id_Gagnant.size(); id++)
            {
                System.out.print(" "+Joueurs[id_Gagnant.elementAt(id)].getNom());
            }
            System.out.println();
        }
    }
}
