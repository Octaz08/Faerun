public abstract class Guerrier {
        private static final int FORCE_BASE = 10;
        private static final int PV_MAX_BASE = 100;
        private static final int RESSOURCE_BASE = 1;
        private int pointsDeVie;

        public Guerrier() {
            this.
            pointsDeVie = PV_MAX_BASE;
        }

        public void setPointsDeVie(int pointsDeVie) {
            this.pointsDeVie = pointsDeVie;
        }

        public int getPointsDeVie() {
            return this.pointsDeVie;
        }

        public int getForce() {
            return this.FORCE_BASE;
        }

        public boolean estVivant() {
            return (getPointsDeVie() > 0);
        }

        public void setChateau(Chateau chateau){

        }

        public void attaquer(Guerrier guerrier) {
            int degats = PlateauUtilitaire.De3(getForce());
            guerrier.subirDegats(degats);
        }

        protected void subirDegats(int degats) {
            setPointsDeVie(getPointsDeVie() - degats);
        }

        public boolean estBleu() {
        }

        public int getRESSOURCE_BASE(){
            return RESSOURCE_BASE;
        }
}
