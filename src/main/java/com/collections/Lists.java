package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String elemento, List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfByIndex(String elemento,List<String> lista, int index) {
        for (int i = index; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfEmpty(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }


    public static int put(String elemento, List<String> lista) {
        String empty = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(empty)) {
                lista.add(i, elemento);
                return i;
            }
        }
        return -1;
    }

    public static int remove(String elemento, List<String> lista) {
        String empty = "";
        int count = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                lista.set(i, empty);
                count += 1;
            }
        }
        return count;
    }
}
