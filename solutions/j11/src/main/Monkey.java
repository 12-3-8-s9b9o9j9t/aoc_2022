package main;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.LinkedList;

public class Monkey {

    public static List<Monkey> MONKEYS = new ArrayList<Monkey>();

    private List<Integer> items = new LinkedList<Integer>();
    private Function<Integer, Integer> op = null;
    private Consumer<Integer> test = null;
    private int nbInspect = 0;

    public Monkey() {
        MONKEYS.add(this);    
    }

    public List<Integer> getItems() {
        return items;
    }

    public void setOp(String operator, Integer b){
        switch (operator) {
            case "+":
                op = (old) -> old + (b == null ? old : b);
                break;
            case "*":
                op = (old) -> old * (b == null ? old : b);
                break;
            default:
                break;
        }
    }

    public void setTest(int div, int t, int f){
        test = (item) -> {
            if (item % div == 0) {
                MONKEYS.get(t).addItem(item);
            } else {
                MONKEYS.get(f).addItem(item);
            }
        };
    }

    public void addItem(Integer item) {
        items.add(item);
    }

    public int getNbInspect() {
        return nbInspect;
    }

    public void turn() {
        while(!items.isEmpty()) {
            Integer item = items.remove(0);
            item = op.apply(item);
            nbInspect++;
            item /= 1;
            test.accept(item);
        }
    }
}
