import junit.framework.Assert;
import org.junit.Test;
import ru.terralink.regnumclient.Client;

import java.util.Map;

/**
 * Created by ArzamastsevA on 10.11.2015.
 */
public class ClientTest {
    @Test
    public void testRegNumService(){
        Client c = new Client();
        Map result = c.getRegNum();
        Assert.assertTrue((Boolean)result.get("ok"));
        Assert.assertNotNull(result.get("value"));
    }


}
