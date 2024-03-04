package homework6.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Copier {

   public static void copyTextFile(String filePath, String newFilePath ) throws IOException {

       Path path1 = Path.of(filePath);
       Path path2 = Path.of(newFilePath);

       String infoAsAString = Files.readString(path1);
       Files.writeString(path2, infoAsAString);

   }

}
