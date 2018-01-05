public class Uczen {
    String imie;
    String nazwisko;
    double[] oceny;

    public double srednia() {
        double suma = 0;
        for(int i = 0; i<oceny.length; i++) {
            suma += oceny[i];
        }
        return(suma/oceny.length);
    }

    public double max() {
        double najlepsza = 0;
        for(double ocena : oceny) {
            if (ocena>najlepsza) {
                najlepsza = ocena;
            }
        }
        return(najlepsza);
    }

    public double min() {
        double najgorsza = 6;
        for(double ocena : oceny) {
            if (ocena<najgorsza) {
                najgorsza = ocena;
            }
        }
        return(najgorsza);
    }
}

