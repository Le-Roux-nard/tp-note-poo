
public class Colvert implements Cancaneur {
    Observable observable;

    public Colvert() {
        observable = new Observable(this);
    }

    public void cancaner() {
        System.out.println("Coincoin");
        observable.notifierObservateurs();
    }

    public void enregistrerObservateur(Observateur observateur) {
        observable.enregistrerObservateur(observateur);
    }

    public void notifierObservateurs() {
        observable.notifierObservateurs();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}