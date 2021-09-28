public class ChefNain extends Nain{

    public void subirDegats(int degats){
        setPointsDeVie(getPointsDeVie() - (degats / 2));
    }
}
