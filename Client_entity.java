import javax.naming.Context;
import javax.naming.InitialContext;

public class Client_entity {
    public static void main(String[] args) throws Exception {
        Context initcont = new InitialContext();

        // questionA(initcont);
        // questionB(initcont);
        // questionC(initcont);
        questionD(initcont);

        // cm.nouveauEmprunteur(333, "Seb");
        // cm.rendreLivre("3333");
        // cm.nouveauLivre("3334", "RolePlay O&M");
    }

    public static void questionA(Context initcont) throws Exception{
        bean_entity.IGestionLivre cm = (bean_entity.IGestionLivre) initcont.lookup("bean_entity.IGestionLivre");
        
        cm.creerSession(333);
        cm.rendreLivre("3334");
    }

    public static void questionB(Context initcont) throws Exception{
        bean_entity.IInfosLivres cm = (bean_entity.IInfosLivres) initcont.lookup("bean_entity.IInfosLivres");

        System.out.println(cm.titreLivre("3333"));
        System.out.println(cm.listeLivreDispo());
    }

    public static void questionC(Context initcont) throws Exception{
        bean_entity.IGestionLivre cm = (bean_entity.IGestionLivre) initcont.lookup("bean_entity.IGestionLivre");
        
        cm.creerSession(333);
        cm.emprunterLivre("3333"); // livre déjà emprunté
    }

    public static void questionD(Context initcont) throws Exception{
        bean_entity.IGestionLivre cm = (bean_entity.IGestionLivre) initcont.lookup("bean_entity.IGestionLivre");
        
        cm.creerSession(333);
        cm.emprunterLivre("3335");
        // cm.emprunterLivre("3336"); // exception nbLivresMax
    }
}