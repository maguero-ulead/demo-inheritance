package cr.ac.ulead;

import cr.ac.ulead.entities.Player;
import cr.ac.ulead.files.FileProcessor;
import cr.ac.ulead.files.ProcessorNBA;
import cr.ac.ulead.files.ProcessorNFL;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileProcessor oneProcessor = new ProcessorNBA("c:\\dev\\data\\Players-NBA.csv");
        FileProcessor anotherProcessor = new ProcessorNFL("c:\\dev\\data\\Players-NFL.csv");

        List<Player> listOfNBA = oneProcessor.processFile();
        List<Player> listOfNFL = anotherProcessor.processFile();

        System.out.println(listOfNBA.size());
        System.out.println(listOfNFL.size());
    }
}
