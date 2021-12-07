import java.util.ArrayList;

public class Troupe implements Cancaneur {

    private ArrayList<Cancaneur> canards = new ArrayList<Cancaneur>();

    public void add(Cancaneur canard) {
        canards.add(canard);
    }


    @Override
    public void cancaner() {
        for (Cancaneur canard : canards
        ) {
            canard.cancaner();
        }
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
        for(Cancaneur c : canards) {
            c.accept(v);
        }
    }
}
