package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.antlr.runtime.*;
import output.monkeyLexer;
import output.monkeyParser;

public class Main {

    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("resource/j11.txt");
        String content = Files.readString(filePath);
        
        ANTLRStringStream in = new ANTLRStringStream(content);
        monkeyLexer lexer = new monkeyLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        monkeyParser parser = new monkeyParser(tokens);
        parser.monkeys();

        List<Monkey> monkeys = Monkey.MONKEYS;

        for (int round = 0; round < 20; round++) {
            for (Monkey monkey : monkeys) {
                monkey.turn();
            }
        }

        int first = 0;
        int second = 0;
        for (Monkey monkey : monkeys) {
            if (monkey.getNbInspect() > first) {
                second = first;
                first = monkey.getNbInspect();
            } else if (monkey.getNbInspect() > second) {
                second = monkey.getNbInspect();
            }
        }

        System.out.println("Monkey business level is at: " + first*second);
    } 
}