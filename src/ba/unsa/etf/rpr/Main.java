package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
        Sat s=new Sat(15,30,45);
        s.ispisiVrijeme();
        s.sljedeci();
        s.ispisiVrijeme();
        s.pomjeriZa(-48);
        s.ispisiVrijeme();
        s.postavi(0,0,0);
        s.ispisiVrijeme();

    }
}
