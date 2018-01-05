
public class DziennikOcen {
    public static void main(String[] args) {
        Uczen  pierwszy = new Uczen();
        pierwszy.imie = "Hela";
        pierwszy.nazwisko = "Gacek";
        pierwszy.oceny = new double[]{4,5,2,3,4};

        System.out.println("Najlepsza ocena ucznia Hela "+pierwszy.max());
        System.out.println("Najgorsza ocena ucznia Hela "+pierwszy.min());
        System.out.println("Srednia ocena ucznia Hela "+pierwszy.srednia());

        Uczen  drugi = new Uczen();
        drugi.imie = "Ada";
        drugi.nazwisko = "Kij";
        drugi.oceny = new double[]{2,3,1,5,6};

        System.out.println("Najlepsza ocena ucznia Ada "+drugi.max());
        System.out.println("Najgorsza ocena ucznia Ada "+drugi.min());
        System.out.println("Srednia ocena ucznia Ada "+drugi.srednia());

        Uczen  trzeci = new Uczen();
        trzeci.imie = "Tom";
        trzeci.nazwisko = "Jones";
        trzeci.oceny = new double[]{5,5,5,4,6};

        System.out.println("Najlepsza ocena ucznia Tom "+trzeci.max());
        System.out.println("Najgorsza ocena ucznia Tom "+trzeci.min());
        System.out.println("Srednia ocena ucznia Tom "+trzeci.srednia());

        Uczen  czwarty = new Uczen();
        czwarty.imie = "John";
        czwarty.nazwisko = "Ohh";
        czwarty.oceny = new double[]{4,4,4,5,1};

        System.out.println("Najlepsza ocena ucznia John "+czwarty.max());
        System.out.println("Najgorsza ocena ucznia John "+czwarty.min());
        System.out.println("Srednia ocena ucznia John "+czwarty.srednia());
    }
}
