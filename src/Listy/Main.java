package Listy;

public class Main {
    public static void main(String[] args) {
        MyList<String> lista = new MyList<String>();
        lista.addElementAtBeginning("ZZZZZ");
        lista.addElementAtBeginning("ZZa");
        lista.printAllElement();
    }
}
