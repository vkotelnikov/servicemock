package kotelnikov.servicemock;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class ResourceReadTest {

    @Autowired
    private String sampleString;
    @Autowired
    private String dadataString;

    @Test
    public void readSampleTest(){
      log.info(sampleString);
    }

    @Test
    public void readDadataTest(){
      log.info(dadataString);
    }
}
