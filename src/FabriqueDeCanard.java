public class FabriqueDeCanard extends FabriqueDeCanardAbstraite {
    public FabriqueDeCanard() {
        super();
    }

    @Override
    public Cancaneur creerColvert() {
        return new Colvert();
    }

    @Override
    public Cancaneur creerMandarin() {
        return new Mandarin();
    }

    @Override
    public Cancaneur creerAppelant() {
        return new Appelant();
    }

    @Override
    public Cancaneur creerCanardEnPlastique() {
        return new CanardEnPlastique();
    }

    @Override
    public Cancaneur creerOie() {
        return new AdapteurDOie(new Oie());
    }
}
