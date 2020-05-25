package cr.ac.ulead.files;

import cr.ac.ulead.entities.Player;
import cr.ac.ulead.entities.PlayerNBA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessorNBA extends FileProcessor {

    public ProcessorNBA(String fileName) {
        super(fileName);
    }

    @Override
    protected List<Player> readLines(Scanner reader) {
        ArrayList<Player> result = new ArrayList<>();
        boolean skip = true;
        while (reader.hasNextLine()) {
            String onePlayer = reader.nextLine();
            if (!skip) {
                PlayerNBA currentPlayer = getPlayerDataFromString(onePlayer);
                result.add(currentPlayer);
            } else {
                skip = false;
            }
        }
        return result;
    }

    private PlayerNBA getPlayerDataFromString(String playerData) {
        PlayerNBA newPlayer = new PlayerNBA();
        String[] data = playerData.split(",");
        newPlayer.setId(Integer.parseInt(data[0]));
        newPlayer.setName(data[1]);
        newPlayer.setHeight(Integer.parseInt(data[2]));
        newPlayer.setWeight(Integer.parseInt(data[3]));
        newPlayer.setCollege(data[4]);
        if (data.length == 8) {
            newPlayer.setBirthplace(data[6] + "," + data[7]);
        } else {
            newPlayer.setBirthplace("UNKNOW");
        }

        return newPlayer;
    }

}
