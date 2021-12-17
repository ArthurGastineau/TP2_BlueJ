
/**
 * Cette classe permet la modélisation d'un dé à 6 faces et offre un service de lancer de dé
 * 
 * @author GASTINEAU Arthur et LAMOUR Guillaume
 * @version v0.2
 */
public class De
{
    private int nb_faces;
    /**
     * Constructeur de la classe Test
     * 
     * @param nb_faces entier correspondant au nombre de faces du dé
     */
    public De(int nb_faces) {
        this.nb_faces = nb_faces;  //le dé comporte 6 faces
    }
    
    /**
     * méthode Lancer simulant un lancer de dé permettant de retourner un entier entre 1 et le nombre de faces du dé
     * 
     * @return la méthode retourne un entier correspondant à la valeur de la face du dé
     */
    public int Lancer()
    {
        @SuppressWarnings("deprecation")
		Double D = new Double ( nb_faces*Math.random() + 1);   //créer un objet de  type Double contenant un nombre décimal entre 1 inclus et la valeur du nombre de faces plus un non inclus
        int valeurDe = D.intValue();    //initialisation et affectation d'un entier à la valeur de l'attribut de D moulé en entier.
        return valeurDe;    //retourne la valeur du De
    }
    /**
     * méthode getnbFaces permettant de récupérer le nombre de faces du dé
     * 
     * @return la méthode retourne un entier correspondant au noimbre de faces du dé
     */
    public int getnbFaces()
    {
        return nb_faces;    //retourne le nombre de faces du dé
    }
}
