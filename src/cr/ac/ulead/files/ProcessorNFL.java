package cr.ac.ulead.files;

import cr.ac.ulead.entities.Player;
import cr.ac.ulead.entities.PlayerNFL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessorNFL extends FileProcessor {

    public ProcessorNFL(String fileName) {
        super(fileName);
    }

    @Override
    protected List<Player> readLines(Scanner reader) {
        ArrayList<Player> result = new ArrayList<>();
        boolean skip = true;
        while (reader.hasNextLine()) {
            String onePlayer = reader.nextLine();
            if (!skip) {
                PlayerNFL currentPlayer = getPlayerDataFromString(onePlayer);
                result.add(currentPlayer);
            } else {
                skip = false;
            }
        }
        return result;
    }

    private PlayerNFL getPlayerDataFromString(String playerData) {
        PlayerNFL newPlayer = new PlayerNFL();
        String[] data = playerData.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        newPlayer.setId(Integer.parseInt(data[12].split("/")[1]));
        newPlayer.setName(data[10]);
        newPlayer.setCollege(data[3]);
        newPlayer.setBirthplace(data[1]);
        newPlayer.setStatus(data[4]);
        newPlayer.setHighSchool(data[9]);
        if (data.length == 16) {
            newPlayer.setYearsPlayed(data[15]);
        }
        return newPlayer;
    }
}
