
public class AdapteurDOie implements Cancaneur {

    private Oie _oie;

    public AdapteurDOie(Oie oie) {
        _oie = oie;
    }

    public void cancaner() {
        _oie.cacarder();
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
    }

}
