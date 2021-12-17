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
     * méthode main permettant la création et l'execution d'une partie entre 2 joueurs
     *  
     */
    public static void main(String[] args) throws IOException
    {
        // On demande les paramètres de la partie à l'utilisateur
        System.out.println("\nEntrée le nombre de joueurs : \n");
        Scanner input = new Scanner(System.in);
        int nb_joueurs = input.nextInt();
        System.out.println("\nEntrée le nombre de lancers : \n");
        input = new Scanner(System.in);
        int nb_lancers = input.nextInt();
        System.out.println("\nEntrée le nombre de faces du dé : \n");
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
        
        //on créé un jeu avec les joueurs et les paramètres
        Jeu Jeu1 = new Jeu (Joueurs,nb_joueurs,nb_lancers,De1);
        
        //on lance la partie
        Jeu1.partie(); 
        
        System.out.println("\nFin de la partie \n\n");
    }
}
