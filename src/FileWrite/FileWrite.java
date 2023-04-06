package FileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    private final String fileName;
    private final FileWriter fW;

    public FileWrite(String fileName) throws IOException {
        this.fileName = fileName;
        this.fW = new FileWriter(fileName, true);
    }

    public void writeToFile(String stringToWrite) throws IOException {
        try {
            fW.write(stringToWrite + "\n");
            fW.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
