public class MainTest {

    public static void main (String[] arg){

        Guerrier nain = new Nain();
        Guerrier elf = new Elf();
        Guerrier chefElf = new ChefElf();
        Guerrier chefNain = new ChefNain();

        /*
        while(nain.estVivant() && elf.estVivant()) {
            nain.attaquer(elf);
            if(elf.estVivant())
                    elf.attaquer(nain);
        }


        System.out.println(elf.estVivant());
        System.out.println(nain.estVivant());

         */
        elf.attaquer(nain);
        chefElf.attaquer(chefNain);

        System.out.println(nain.getPointsDeVie());
        System.out.println(chefNain.getPointsDeVie());

    }
}
