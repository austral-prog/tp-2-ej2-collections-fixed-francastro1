package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventory = new HashMap<String, Integer>();
        for (String item : items) {
            if (inventory.containsKey(item)) {
                inventory.put(item, inventory.get(item) + 1);
            }
            else{
                inventory.put(item, 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                inventory.put(item, inventory.get(item) + 1);
            }
            else{
                inventory.put(item, 1);
            }
        }
        return inventory;
    }

    public static Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentQuantity = inventory.get(item);
                if (currentQuantity > 0) {
                    inventory.put(item, currentQuantity - 1);
                }
            }
        }
        return inventory;
    }

    public static Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()){
            if (entry.getValue() >= 1) {
                list.add(entry);
            }
        }
        return list;
    }
}