public class AdaptaterTelephone implements ITelephone{
    private IOrdinateur ordinateur;

    public AdaptaterTelephone(IOrdinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    @Override
    public void recharge() {
        ordinateur.recharge();

    }
}
