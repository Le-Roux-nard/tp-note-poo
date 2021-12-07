public class CompteurDeCouac implements Cancaneur{
    private static int nombreDeCouacs = 0;
    private Cancaneur _cancaneur;

    public CompteurDeCouac(Cancaneur cancaneur) {
        _cancaneur = cancaneur;
    }

    public void cancaner() {
        nombreDeCouacs++;
        _cancaneur.cancaner();
    }

    public static int getCouacs() {
        return nombreDeCouacs;
    }

    @Override
    public void enregistrerObservateur(Observateur observateur) {

    }

    @Override
    public void notifierObservateurs() {

    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
        _cancaneur.accept(v);
    }
}
