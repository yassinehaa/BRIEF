import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Utilisateur> users = new ArrayList<>();

    public static void ajouter() {
        Utilisateur user = new Utilisateur();
        System.out.println("entrer le nom: ");
        user.nom = input.next();
        System.out.println("entrer l'age: ");
        user.age = input.nextInt();
        input.nextLine();
        System.out.println("entrer l'email: ");
        user.email = input.nextLine();
        System.out.println("entrer le mot de passe: ");
        user.password = input.nextLine();
        System.out.println("entrer le role: ");
        user.roles= input.next();
        users.add(user);
    }

    public static void afficher() {
        for (Utilisateur user : users) {
            System.out.println(user);
        }
    }

    public static void modifier() {
        System.out.println("entrer le nom à modifier: ");
        String nameToEdit = input.next();
        input.nextLine();
        for (Utilisateur user : users) {
            if (user.nom.equals(nameToEdit)) {
                System.out.println("entrer nouveau nom: ");
                user.nom = input.next();
                System.out.println("entrer nouvel age: ");
                user.age = input.nextInt();
                input.nextLine();
                System.out.println("entrer nouveau email: ");
                user.email = input.nextLine();
                System.out.println("entrer nouveau mot de passe: ");
                user.password = input.nextLine();
                System.out.println("entrer nouveau role: ");
                user.roles = input.nextLine();
                return;
            }
        }
        System.out.println("Utilisateur non trouvé.");
    }

    public static void rechercher() {
        System.out.println("entrer le nom à rechercher: ");
        String nameToSearch = input.next();
        for (Utilisateur user : users) {
            if (user.nom.equals(nameToSearch)) {
                System.out.println(user);
                return;
            }
        }
        System.out.println("Utilisateur non trouvé.");
    }

    public static void supprimer() {
        System.out.println("entrer le nom à supprimer: ");
        String nameToDelete = input.next();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).nom.equals(nameToDelete)) {
                users.remove(i);
                System.out.println("Utilisateur supprimé.");
                return;
            }
        }
        System.out.println("Utilisateur non trouvé.");
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("MENU");
            System.out.println("1: AJOUTER");
            System.out.println("2: AFFICHER");
            System.out.println("3: MODIFIER");
            System.out.println("4: RECHERCHER");
            System.out.println("5: SUPPRIMER");
            System.out.println("6: QUITTER");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    afficher();
                    break;
                case 3:
                    modifier();
                    break;
                case 4:
                    rechercher();
                    break;
                case 5:
                    supprimer();
                    break;
                case 6:
                    System.out.println("QUITTER");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while (ch != 6);
    }
}