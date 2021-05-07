import java.util.Arrays;
import java.util.List;

public class PasswordValidator {

    public static boolean isValidPassword(final String motDePasse) {

        //verifier si me mot de passe a plus de 6 character ou pas
        if (motDePasse.length() < 6) {
            return false;
        }

        //initaliser estUneLettre la variable a false
        boolean estUneLettre = false;
        //initaliser estUnChiffire la variable a false
        boolean estUnChiffire = false;
        //parcourire la chaine de caractere motDePasse
        for (int i = 0; i < motDePasse.length(); i++) {
            char charCourant = motDePasse.charAt(i);

            //verifier si le caractere est un chiffre
            if (Character.isDigit(charCourant)) {
                estUnChiffire = true;
            }
            //verifier si le caractere est une lettre
            if (Character.isAlphabetic(charCourant)) {
                estUneLettre = true;
            }

            //verifier si les deux variable sont a true
            if (estUneLettre && estUnChiffire) {
                return true;
            }
        }

        return false;
    }

    public static boolean isValidPasswordAdmin(final String motDePasse) {

        //verifier si me mot de passe a plus de 6 character ou pas
        if (motDePasse.length() < 10) {
            return false;
        }

        //initaliser estUneLettre la variable a false
        boolean estUneLettre = false;
        //initaliser estUnChiffire la variable a false
        boolean estUnChiffire = false;
        //initaliser estUnChiffire la variable a false
        boolean estUnCarSpecial = false;
        final List<Character> specialChar = Arrays.asList('!', '@', '#', '$', '%', '^', '&','*','?','-','+');
        //parcourire la chaine de caractere motDePasse
        for (int i = 0; i < motDePasse.length(); i++) {
            char charCourant = motDePasse.charAt(i);

            //verifier si le caractere est un chiffre
            if (Character.isDigit(charCourant) && !estUnChiffire) {
                estUnChiffire = true;
            }
            //verifier si le caractere est une lettre
            if (Character.isAlphabetic(charCourant) && !estUneLettre) {
                estUneLettre = true;
            }
            if(specialChar.contains(charCourant) && !estUnCarSpecial) {
                estUnCarSpecial = true;
            }
            //verifier si les deux variable sont a true
            if (estUneLettre && estUnChiffire & estUnCarSpecial) {
                return true;
            }
        }

        return false;
    }
}