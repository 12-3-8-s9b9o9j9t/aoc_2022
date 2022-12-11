package main;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.LinkedList;

public class Monkey {

    public static List<Monkey> MONKEYS = new ArrayList<Monkey>();

    private List<Long> items = new LinkedList<Long>();
    private Function<Long, Long> op = null;
    private Consumer<Long> test = null;
    private int nbInspect = 0;
    
    private static int alldiv = 1;

    public Monkey() {
        MONKEYS.add(this);
    }

    public List<Long> getItems() {
        return items;
    }

    public void setOp(String operator, Long b) {
        switch (operator) {
            case "+":
                op = old -> old + (b == null ? old : b);
                break;
            case "*":
                op = old -> old * (b == null ? old : b);
                break;
            default:
                break;
        }
    }

    public void setTest(int div, int t, int f) {
        if (alldiv % div != 0) {
            alldiv *= div;
        }
        test = item -> {
            if (item % div == 0) {
                MONKEYS.get(t).addItem(item);
            } else {
                MONKEYS.get(f).addItem(item);
            }
        };
    }

    public void addItem(Long item) {
        items.add(item);
    }

    public int getNbInspect() {
        return nbInspect;
    }

    public void turn() {
        while (!items.isEmpty()) {
            Long item = items.remove(0);
            item = op.apply(item);
            item = item % alldiv == 0 ? alldiv : item % alldiv;
            nbInspect++;
            item /= Main.RELIEF;
            test.accept(item);
        }
    }
}
