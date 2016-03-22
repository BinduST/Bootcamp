package Wizard;

import java.util.List;

public class BallCountFormatter implements Formatter{

    @Override
    public String format(List<Pair> counts) {
        String result = "";
        for (Pair count : counts) {
            if(result.equals(""))
                result = count.getKey() +": "+ count.getValue();
            else
                result = result +"\n"+count.getKey() +": "+ count.getValue();
        }
        return result;
    }
}
