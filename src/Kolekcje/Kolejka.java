package Kolekcje;

import SymulatorKaczki.Kaczka;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("Paweł");
        kolejka.add("Michał");
        kolejka.add("Marcin");
        kolejka.add("Tomek");
        kolejka.add("Rafał");
        System.out.println(kolejka.remove());

        Queue<String> kolejka2 = new PriorityQueue<>();
        kolejka2.add("Paweł");
        kolejka2.add("Michał");
        kolejka2.add("Marcin");
        kolejka2.add("Tomek");
        kolejka2.add("Rafał");
        System.out.println(kolejka2.remove());

    }
    private String _name;
    private String _shoppingList;
    public Kolejka(String name, String shoppingList){
        _name = name;
        _shoppingList = shoppingList;
    }
    public String getName(){
        return _name;

    }
    public String unpackShopping (){
        return "Wypakuj na taśmociąg " + _shoppingList;
    }
}
