/**
 * Cette classe permet la modélisation d'un dé. Il contient des méthodes permettant d' offrir un service de lancer de dé et de récupérer le nombre de face du dé.
 * 
 * @author GASTINEAU Arthur et LAMOUR Guillaume
 * @version v0.2
 */
public class De
{
    // déclaration de la variable d'instance
    private int nb_faces;
    
    /**
     * Constructeur de la classe De
     * @param nb_faces entier correspondant au nombre de faces du dé
     */
    public De(int nb_faces) {
        // initialisation de la variable d'instance
        this.nb_faces = nb_faces;
    }
    
    /**
     * Méthode Lancer simulant un lancer de dé et retournant la valeur de sa face
     * 
     * @return la méthode retourne un entier entre 1 et le nombre de faces du dé
     */
    public int Lancer()
    {
        //Créé un objet de  type Double contenant un nombre décimal entre 1 inclus et le nombre de faces + 1 non inclus
        Double D = new Double ( nb_faces*Math.random() + 1);
        //Initialisation et affectation d'un entier à la valeur de l'attribut de D moulé en entier
        int valeurDe = D.intValue();  
        //Retourne la valeur du dé
        return valeurDe;    
    }
    
    /**
     * Méthode getnbFaces permettant de récupérer le nombre de faces du dé
     * 
     * @return la méthode retourne un entier correspondant au nombre de faces du dé
     */
    public int getnbFaces()
    {
        //Retourne le nombre de faces du dé
        return nb_faces;    
    }
}
