
public class CanardEnPlastique implements Cancaneur {

    public CanardEnPlastique(){
        this.observable = new Observable(this);
    }

    public void cancaner() {
        System.out.println("Couic");
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
