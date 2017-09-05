package Kolekcje;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;

public class SimuleteQueue {
    public static void main(String[] args) {
        ArrayDeque<Kolejka> kolejka = new ArrayDeque<>();
        kolejka.add(new Kolejka("Mariola", "piwo, wino, cola"));
        kolejka.add(new Kolejka("Andżej z wąsem", "szlugi"));
        kolejka.add(new Kolejka("Kuba", "materac"));
        kolejka.add(new Kolejka("Paweł", "baton"));

        while (!kolejka.isEmpty()){
            Kolejka currentClient = kolejka.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.unpackShopping());
        }
        System.out.println("Obsłużyliśmy klientów");
    }
}
