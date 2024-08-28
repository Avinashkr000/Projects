package Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap=new HashMap<>();

    static {
        panMap.put("DTHPS8723K",new Pan("DTHPS8723K",
                "9695519957","HDFC BANK",
                "Stock,ELSS,FD"));
        panMap.put("DTHPS8723",new Pan("DTHPS8723",
                "96955199570","SBI BANK",
                "Stock,FD"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber)
    {
        for(Pan pan:panMap.values())
        {
            if(pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
