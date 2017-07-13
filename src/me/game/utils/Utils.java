package me.game.utils;

import me.game.Game;

import java.io.*;

/**
 * Created by michtros17 on 12.07.2017.
 */
public class Utils {
    public static File getFromStream(String path) {
        try {
            InputStream inputStream = Game.class.getResourceAsStream(path);
            File tempFile = File.createTempFile("temp", ".temp");
            tempFile.deleteOnExit();
            OutputStream outputStream = new FileOutputStream(tempFile);
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
            return tempFile;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
