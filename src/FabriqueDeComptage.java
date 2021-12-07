public class FabriqueDeComptage extends  FabriqueDeCanard {

    public Cancaneur creerColvert(){
        return new CompteurDeCouac(super.creerColvert());
    }

    @Override
    public Cancaneur creerMandarin() {
        return new CompteurDeCouac(super.creerMandarin());
    }

    @Override
    public Cancaneur creerAppelant() {
        return new CompteurDeCouac(super.creerAppelant());
    }

    @Override
    public Cancaneur creerCanardEnPlastique() {
        return new CompteurDeCouac(super.creerCanardEnPlastique());
    }

    @Override
    public Cancaneur creerOie() {
        return new CompteurDeCouac(super.creerOie());
    }


}
