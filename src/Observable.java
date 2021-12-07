import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements CouacObservable {
    private ArrayList<Observateur> observers = new ArrayList<Observateur>();
    private CouacObservable canard;

    public Observable(CouacObservable canard) {
        this.canard = canard;
    }

    @Override
    public void enregistrerObservateur(Observateur observer) {
        observers.add(observer);

    }
    @Override
    public void notifierObservateurs() {
        Iterator<Observateur> it = observers.iterator();
        while (it.hasNext()) {
            Observateur o = it.next();
            o.actualiser(canard);
        }
    }
}
