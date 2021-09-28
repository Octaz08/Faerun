import java.util.ArrayList;
import java.util.LinkedList;

public class Chateau {

    private int RESSOURCES_INITIAL = 3;
    private int RESSOURCES_AJOUTEES_PAR_TOUR = 1;
    private int ressources;
    private LinkedList<Guerrier> guerriersNovices = new LinkedList<>();
    private Couleur couleur;


    Chateau(Couleur couleur){
        couleur = couleur;
    }

    private void incrementerRessources(){
        ressources = ressources + RESSOURCES_AJOUTEES_PAR_TOUR;
    }


    public int getRessources(){
        return this.ressources;
    }
    public void ajoutGuerrierNovice(Guerrier guerrier){
        this.guerriersNovices.add(guerrier);
    }

    public getGuerriersNovices(){    }

    public Arraylist<Guerrier> entrainer(){
        new ArrayList<Guerrier>();

        while(guerriersNovices.size() > 0 && getRessources() > 0){

            Guerrier premierGuerrier = guerriersNovices.pollFirst();

            ressources = getRessources() - premierGuerrier.getRESSOURCE_BASE();

            entrainer
        }
    }

    public Couleur getCouleur(){
        return this.couleur;
    }

    public void estBleu(Couleur estBleu){
        this.couleur = estBleu ;
    }

    public void estRouge(Couleur estRouge){
        this.couleur = estRouge;
    }
}