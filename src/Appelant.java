
public class Appelant implements Cancaneur {

    public Appelant() {
        this.observable = new Observable(this);
    }

    public void cancaner() {
        System.out.println("CouinCouin");
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
