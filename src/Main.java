public class Main {
    public static void main(String[] args) {
        IOrdinateur ordinateur= new RechargeurOrdinateur();
        ITelephone telephone=new RechargeurTelephone();

        IOrdinateur adapterOrdinateur= new AdapterOrdinateur(telephone);
        adapterOrdinateur.recharge();

        ITelephone adapterTelephone= new AdaptaterTelephone(ordinateur);
        adapterTelephone.recharge();

        ordinateur.recharge();
        telephone.recharge();


    }
}