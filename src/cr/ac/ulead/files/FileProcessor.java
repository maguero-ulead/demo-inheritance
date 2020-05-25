package cr.ac.ulead.files;

import cr.ac.ulead.entities.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class FileProcessor {

    protected String fileName;

    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }

    public List<Player> processFile() throws FileNotFoundException {
        Scanner reader = openFile();
        List<Player> result = readLines(reader);
        reader.close();
        return result;
    }

    protected Scanner openFile() throws FileNotFoundException {
        return new Scanner(new File(fileName));
    }

    protected abstract List<Player> readLines(Scanner reader);
}
