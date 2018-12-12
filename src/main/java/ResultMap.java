import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultMap {

    public static final Map<String, List<Integer>> resultMap = new HashMap<>();

    static{
        resultMap.put(""+TrustGameInput.COOPERATE+TrustGameInput.COOPERATE , Arrays.asList(2,2));

        resultMap.put(""+TrustGameInput.COOPERATE+TrustGameInput.CHEAT , Arrays.asList(-1,3));

        resultMap.put(""+TrustGameInput.CHEAT+TrustGameInput.COOPERATE , Arrays.asList(3,-1));

        resultMap.put(""+TrustGameInput.CHEAT+TrustGameInput.CHEAT , Arrays.asList(0,0));
    }

}
