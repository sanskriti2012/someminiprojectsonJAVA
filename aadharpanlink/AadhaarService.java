package aadharpanlink;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String,Aadhar> aadharMap=new HashMap<>();
    static{
        aadharMap.put("123456788",new Aadhar("123456788","Sanskriti ojha","Mr. Raju Ojha","mughalsarai"));
        aadharMap.put("1234589588",new Aadhar("123458958","Vibhash ojha","Mr. Raju Ojha","mughalsarai"));
    }

    public Aadhar getaadharbyNumber(String Aadharnumber)
    {
        return aadharMap.get(Aadharnumber);
    }

}
