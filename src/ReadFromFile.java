import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFromFile {
    Path path = Paths.get("e:/file.txt");
    Charset charset = Charset.forName("UTF-8");
    public void Read(){
    try(
        BufferedReader reader = Files.newBufferedReader(path, charset)) {
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            try {
                FileWriter write = new FileWriter("e:/newfile.txt");
                write.write(line);
                write.close();
            } catch (
                    FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
