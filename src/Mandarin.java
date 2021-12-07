
public class Mandarin implements Cancaneur {

    public Mandarin() {
        this.observable = new Observable(this);
    }

    public void cancaner() {
        System.out.println("CoinCoin");
        notifierObservateurs();
    }

    private Observable observable;

    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observable.enregistrerObservateur(observateur);
    }

    @Override
    public void notifierObservateurs() {
        observable.notifierObservateurs();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
