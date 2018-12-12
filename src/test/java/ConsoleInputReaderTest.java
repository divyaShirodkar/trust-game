import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ConsoleInputReaderTest {

   @Test
   public void shouldCaptureInput(){

       InputReader inputReader = Mockito.mock(ConsoleInputReader.class);
       Mockito.when(inputReader.readInput()).thenReturn(TrustGameInput.COOPERATE);

       Assert.assertEquals(TrustGameInput.COOPERATE,inputReader.readInput());

   }
}
