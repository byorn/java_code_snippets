package byorn.learning.executearound;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    public static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("README.md"))){
            return bufferedReaderProcessor.process(br);
        }
    }
}
