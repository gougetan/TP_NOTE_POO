public class Rôle {

    private String nomRôle;

    public Rôle(String rol){
        this.nomRôle=rol;
    }

    public String getNomRôle() {
        return nomRôle;
    }

    public void setNomRole(String nomRôle) {
        this.nomRôle = nomRôle;
    }

    public boolean equals(Object o){
        return true;
    }

    public int hashCode(){
        return 1;
    }
}
