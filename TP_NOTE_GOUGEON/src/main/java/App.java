import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args){

        //Préparation

        List<ServeurDiscussion> list_serv = new ArrayList<ServeurDiscussion>();
        List<Canal> list_can = new ArrayList<Canal>();
        List<Webhook> list_wh = new ArrayList<Webhook>();
        List<Message> list_mes = new ArrayList<Message>();

        Map<Rôle,List<Utilisateur>> map_uti = new HashMap<Rôle,List<Utilisateur>>();
        Map<Rôle,List<Habilitation>> map_habi = new HashMap<Rôle,List<Habilitation>>();

        Habilitation habi = Habilitation.ECRITURE;

        WebhookAction wba = WebhookAction.ECRITURE_MESSAGE;

        // Création du serveur
        ServeurDiscussion s1 = new ServeurDiscussion();
        s1.setNom("s1");
        s1.setCanaux(list_can);
        s1.setMapping_role_utilisateurs(map_uti);
        s1.setMapping_role_habilitations(map_habi);

        // Création des rôles
        Rôle admin = new Rôle("admin");
        Rôle pas_admin = new Rôle("pas_admin");


        // Création du webhook


        Webhook wh = new Webhook();
        wh.setNom("wh1");
        wh.setDescription("Je fais ça");
        wh.setAction(wba);
        wh.setNomApplicationAppelante("app appelante 1");

        // Création du canal

        Canal canal1 = new Canal();
        canal1.setMapping_role_utilisateurs(map_uti);
        canal1.setMapping_role_habilitations(map_habi);
        canal1.setOrdre(1);
        canal1.setNom("canal1");
        canal1.setWebhooks(list_wh);
        canal1.setHistoriques(list_mes);

        //Création de l'utilisateur

        Utilisateur eleve1 = new Utilisateur();
        eleve1.setPrenom("marc");
        eleve1.setNom("DUPONT");
        eleve1.setLogin("marc0000");
        eleve1.setMotDePasse("dupont0000");
        eleve1.setMail("marc.dupont@gmial.com");
        eleve1.setServeurs(list_serv);

        //Création du destinataire
        Destinataire eleve2 = new Utilisateur();

        //Création du message

        Message mes = new Message();
        mes.setAuteur(eleve1);
        mes.setDestinaire(eleve2);
        mes.setTexte("coucou");



        canal1.ecrireMessage(eleve1,mes);

    }
}
