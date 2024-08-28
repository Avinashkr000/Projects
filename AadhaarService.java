package Project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String, Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("9695519957",new Aadhaar("9695519957",
                "Avinash","Mr Awdhesh Kumar singh","Ara"));
        aadhaarMap.put("96955199570",new Aadhaar("96955199570",
                "anku","Mr singh","Delhi"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);
    }
}