------------------------------------------------------------------------
This is the project README file. 
------------------------------------------------------------------------
PROJECT TITLE:Jeu de Dé

PURPOSE OF PROJECT: Créer un programme permettant de créer une partie de dé entre plusieurs joueurs pour se familiariser avec le language Java

VERSION or DATE: 17/12/2021

AUTHORS: GASTINEAU Arthur et LAMOUR Guillaume

USER INSTRUCTIONS: 
Si vous voulez créer un executable du programme, suivez les instructions suivantes :
- Créer un fichier Program.bat y écrire : 
    javac *.java  //Compilation des classes
    jar cvfe Test.jar Test *.class    //Créer un fichier Manifest qui renseigne la classe permettant l'entrée de l'application et un fichier .jar
    java -jar Test.jar    //Lance l'executable .jar
    pause   //Garde le Command Prompt ouvert jusqu'à appui d'une touche
=======
- Il suffit ensuite d'éxecuter le fichier .bat, un Command prompt s'ouvrira.
- Il suffit ensuite de renseigner les paramètres ci-dessous :
    - Nombre de Joueurs
    - Nombre de lancers de dé
    - Nombre de faces du dé
Pour faire un simple git push depuis le dossier :
    git fetch
    git status
    git push
