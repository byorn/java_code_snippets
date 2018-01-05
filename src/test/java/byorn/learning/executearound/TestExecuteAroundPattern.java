package byorn.learning.executearound;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestExecuteAroundPattern {

    @Test
    public void testReadingOneLineFromAFile() {

        try {
            String contents = FileReaderUtil.processFile((BufferedReader br) ->  br.readLine() );
            System.out.println(contents);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert true;
    }
}
