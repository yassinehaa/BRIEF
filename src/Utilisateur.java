public class Utilisateur extends personne {
    String email;
    String password;
    String roles;

    public Utilisateur() {
        super();
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "Utilisateur{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}

