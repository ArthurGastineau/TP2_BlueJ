import java.util.Scanner;
import java.io.*;

/**
 * Cette classe offre un point d'entrée à l'application via son unique méthode main
 * 
 * @author GASTINEAU Arthur et LAMOUR Guillaume
 * @version v0.2
 */
public class Test
{
    /**
     * Constructeur vide de la classe Test
     */
    public Test() {}
    
    /**
     * Méthode main permettant la création et l'exécution d'une partie en fonction des paramètres rentrés par l'utilisateur
     */
    public static void main(String[] args)
    {
        // On demande les paramètres de la partie à l'utilisateur
        System.out.print("\nEntrée le nombre de joueurs : ");
        Scanner input = new Scanner(System.in);
        int nb_joueurs = input.nextInt();
        System.out.print("\nEntrée le nombre de lancers : ");
        input = new Scanner(System.in);
        int nb_lancers = input.nextInt();
        System.out.print("\nEntrée le nombre de face du dé : ");
        input = new Scanner(System.in);
        int nb_faces = input.nextInt();
        
        System.out.println("\n\nLancement de la partie \n\n");
        
        //Déclaration du dé et du tableau de Joueurs
        De De1 = new De(nb_faces);
        Joueur [] Joueurs = new Joueur[nb_joueurs];
        
        //On créé un tableau de Joueurs avec le nombre de joueurs souhaités
        for (int id_joueur = 0; id_joueur < nb_joueurs; id_joueur++)
        {
            Joueurs[id_joueur] = new Joueur("Joueur"+(id_joueur+1));
        }
        
        //On créé un jeu avec les joueurs et les paramètres
        Jeu Jeu1 = new Jeu (Joueurs,nb_joueurs,nb_lancers,De1);
        
        //On lance la partie
        Jeu1.partie();
        
        //Fin de la partie
        System.out.println("\nFin de la partie \n\n");
    }
}
