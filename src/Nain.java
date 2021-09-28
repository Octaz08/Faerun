public class Nain extends Guerrier {

    public void subirDegats(int degats){
        setPointsDeVie(getPointsDeVie() - (degats / 2));
    }
}
