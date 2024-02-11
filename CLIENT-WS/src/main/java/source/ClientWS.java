package source;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(11));
        Compte cp = proxy.getCompte(5);
        System.out.println("Code = "+ cp.getCode());
        System.out.println("Solde = "+cp.getSolde());
        System.out.println("Date de Creation  = "+cp.getDateCreation());


    }
}
