public class VisitorCompteurNoeudsFeuille implements Visitor {

    //les compteurs
    private int nbFeuille;
    private int nbNoeud;

    //les accesseurs aux compteurs
    public int getNbFeuilles() {
        return nbFeuille;
    }

    public int getNbNoeuds() {
        return nbNoeud;
    }

    //les différentes méthodes de visite
    @Override
    public void visit(Troupe t) {
        nbNoeud++;
    }

    @Override
    public void visit(CompteurDeCouac c) {
        nbNoeud++;
    }

    @Override
    public void visit(Colvert c) {
        nbFeuille++;
    }

    @Override
    public void visit(Appelant c) {
        nbFeuille++;
    }

    @Override
    public void visit(Mandarin c) {
        nbFeuille++;
    }

    @Override
    public void visit(AdapteurDOie c) {
        nbFeuille++;
    }

    @Override
    public void visit(CanardEnPlastique c) {
        nbFeuille++;
    }

    @Override
    public void visit(Visitable c) {
        System.out.println("Classe pas encore gérée");
    }
}
