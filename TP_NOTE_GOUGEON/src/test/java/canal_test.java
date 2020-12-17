import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class canal_test {
    @Test
    public void ecrireMessageOK() throws ActionNonAutoriseeException {
     /*   // Etape 1 : préparation des objets
        Canal c = new Canal();

        c.setNom("Canal1");
        Role debutant = new Role("debutant");
        List<Message> list_mess = new ArrayList<Message>();
        List<Webhook> list_web = new ArrayList<Webhook>();
        List<Utilisateur> list_uti = new ArrayList<Utilisateur>();

        //Map<Role, List<Utilisateur>> m1 = new Map<Role, List<Utilisateur>>;

       // c.setMapping_role_utilisateurs(debutant,list_uti);
        c.setHistoriques(list_mess);
        c.setWebhooks(list_web);
        c.set

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne fêtes de fin d'année !");

        Utilisateur utilisateur = new Utilisateur();

        //m.setAuteur(utilisateur);
        c.getMapping_role_utilisateurs().put(new Role("Membre"), Arrays.asList(utilisateur));
        c.getMapping_role_habilitations().put(new Role("Membre"), Arrays.asList(Habilitation.ECRITURE));

        // Etape 2 : appel de la méthode testée
        c.ecrireMessage(utilisateur, m);

        // Etape 3 test du retour
        List<Message> historiques = c.getHistoriques();
        Assert.assertEquals(1, historiques.size());
        System.out.println(historiques.get(0).getTexte());*/

        // Etape 1 : préparation des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne fêtes de fin d'année !");

        Utilisateur utilisateur = new Utilisateur();
        c.getMapping_role_utilisateurs().put(new Rôle("Membre"), Arrays.asList(utilisateur));
        c.getMapping_role_habilitations().put(new Rôle("Membre"), Arrays.asList(Habilitation.ECRITURE));

        // Etape 2 : appel de la méthode testée
        c.ecrireMessage(utilisateur, m);

        // Etape 3 test du retour
        List<Message> historiques = c.getHistoriques();
        Assert.assertEquals(1, historiques.size());
        System.out.println(historiques.get(0).getTexte());
    }
/*
    @Test
    public void ecrireMessageKO() {

        // Etape 1 : préparation des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne année 2021 !");

        Utilisateur utilisateur = new Utilisateur();

        // Etape 2 : appel de la méthode testée
        try {
            c.ecrireMessage(utilisateur, m);

            // Etape 3 test du retour
            Assert.fail("L'exception aurait du être levée, on ne doit pas passer ici !");
        } catch (ActionNonAutoriseeException e) {

            // Etape 3 test du retour = si on arrive ici, le test est concluant
        }
    }*/
}
