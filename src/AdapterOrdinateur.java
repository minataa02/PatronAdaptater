public class AdapterOrdinateur implements IOrdinateur{
    private ITelephone telephone;

    public AdapterOrdinateur(ITelephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public void recharge() {
        telephone.recharge();
    }
}
