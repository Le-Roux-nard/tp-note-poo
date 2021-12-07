
public class SimulateurDeCanard {
    public static void main(String[] args) {
        SimulateurDeCanard simulateurDeCanard = new SimulateurDeCanard();
        /*
            FabriqueDeCanardAbstraite fabrique = new FabriqueDeCanard();
            Cancaneur colvert = fabrique.creerColvert();
            Cancanologue leCancanologue = new Cancanologue();
            colvert.enregistrerObservateur(leCancanologue);
            simulateurDeCanard.simuler(colvert);
        */
        simulateurDeCanard.simuler();
    }

    public void simuler() {
       FabriqueDeCanardAbstraite fabrique = new FabriqueDeComptage();
       Cancaneur colvert = fabrique.creerColvert();
       Cancaneur mandarin = fabrique.creerMandarin();
       Cancaneur canardOie = new AdapteurDOie(new Oie());

       Troupe sousTroupe = new Troupe();
       fabrique = new FabriqueDeCanard();
       sousTroupe.add(fabrique.creerColvert());
       sousTroupe.add(fabrique.creerMandarin());
       sousTroupe.add(fabrique.creerColvert());

       Troupe maTroupe = new Troupe();
       maTroupe.add(colvert);
       maTroupe.add(mandarin);
       maTroupe.add(canardOie);
       maTroupe.add(sousTroupe);

       Visitor unVisiteur = new VisitorCompteurNoeudsFeuille();
        maTroupe.accept(unVisiteur);
        System.out.println("Nb noeuds : "   + ((VisitorCompteurNoeudsFeuille) unVisiteur).getNbNoeuds());
        System.out.println("Nb feuilles : " + ((VisitorCompteurNoeudsFeuille) unVisiteur).getNbFeuilles());


    }

    public void simuler(FabriqueDeCanardAbstraite fabrique) {
        Cancaneur colvert = fabrique.creerColvert();
        Cancaneur mandarin = fabrique.creerMandarin();
        Cancaneur appelant = fabrique.creerAppelant();
        Cancaneur canardEnPlastique = fabrique.creerCanardEnPlastique();
        Cancaneur canardOie = fabrique.creerOie();
        System.out.println("Simulateur de canard\n");
        simuler(colvert);
        simuler(mandarin);
        simuler(appelant);
        simuler(canardEnPlastique);
        simuler(canardOie);
        System.out.println("Nous avons compté " + CompteurDeCouac.getCouacs() + " couacs dans la fabrique");
    }

    public void simulerTroupe() {
        Troupe troupeDeCanard = new Troupe();
        troupeDeCanard.add(new Mandarin());
        troupeDeCanard.add(new Appelant());

        Troupe troupeDeColvert = new Troupe();
        troupeDeColvert.add(new Colvert());
        troupeDeColvert.add(new Colvert());

        troupeDeCanard.add(troupeDeColvert);

        System.out.println("Simulateur de canard : Toute la troupe");
        simuler(troupeDeCanard);
        System.out.println("\nSimulateur de canards : Troupe de colverts");
        simuler(troupeDeColvert);
    }

    public void simuler(Cancaneur cancaneur) {
        cancaneur.cancaner();
    }

}
