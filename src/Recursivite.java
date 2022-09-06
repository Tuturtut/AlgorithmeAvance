public class Recursivite {

    public static void main(String[] args) {
        // Creation de l'objet test
        Recursivite test = new Recursivite();
    }
    //Ecrire une méthode récursive qui verifie si une chaine de caractere est un palindrome
    public boolean palindrome(String chaine) {
        // Si la chaine est vide ou de longueur 1
        if (chaine.length() == 0 || chaine.length() == 1) {
            return true;
        }
        // Si le premier caractere est different du dernier
        if (chaine.charAt(0) != chaine.charAt(chaine.length() - 1)) {
            return false;
        }
        // Appel recursif de la fonction palindrome
        return palindrome(chaine.substring(1, chaine.length() - 1));
    }
    //Ecrire une méthode récursive qui calcule la somme des entiers de 1 à n
    public int somme(int n) {
        // Si n est egal a 1
        if (n == 1) {
            return 1;
        }
        // Appel recursif de la fonction somme
        return n + somme(n - 1);
    }




    // Fonction qui retourne le carre d'un nombre
    public int carre(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException("n doit être positif");
        }
        int res = 0;
        if (n == 1){
            res = 1;
        } else {
            res = n * n + carre(n-1);
        }
        return res;
    }

    public int sommeTab(int tab[],int index){
   //ajoute des commentaire pour expliquer ce que fait la fonction et ce qu'elle retourne

        int res = 0;
        if (index == 0){
            if (tab[index] > 0){
                res = tab[index];
            }
        } else {
            if (tab[index] > 0){
                res = tab[index] + sommeTab(tab,index-1);
            } else {
                res = sommeTab(tab,index-1);
            }
        }
        return res;
    }
}
