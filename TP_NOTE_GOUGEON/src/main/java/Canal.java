import java.util.List;

import java.util.Map;


public class Canal implements Comparable,Destinataire {

    private Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs;
    private Integer ordre;
    private List<Webhook> webhooks;
    private String nom;
    private Map<Rôle, List<Habilitation>> mapping_role_habilitations;
    private List<Message> historiques;

    public Canal(){}



    public Map<Rôle, List<Utilisateur>> getMapping_role_utilisateurs() {
        return mapping_role_utilisateurs;
    }

    public void setMapping_role_utilisateurs(Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs) {
        this.mapping_role_utilisateurs = mapping_role_utilisateurs;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(List<Webhook> webhooks) {
        this.webhooks = webhooks;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Rôle, List<Habilitation>> getMapping_role_habilitations() {
        return mapping_role_habilitations;
    }

    public void setMapping_role_habilitations(Map<Rôle, List<Habilitation>> mapping_role_habilitations) {
        this.mapping_role_habilitations = mapping_role_habilitations;
    }

    public List<Message> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Message> historiques) {
        this.historiques = historiques;
    }

    public void ecrireMessage(Utilisateur uti,Message mes) {

        String message_envoye = mes.getTexte();
        String nom_uti = uti.getNom();;

        System.out.println("L'utilisateur "+nom_uti+" a envoyé le message : "+message_envoye);

    }




    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
