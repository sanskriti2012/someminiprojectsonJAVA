package aadharpanlink;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panuserrdata = new HashMap<>();

    static {
        panuserrdata.put("ABG24NJDF", new Pan("ABG24NJDF", "123456788",
                "SBI BANK", "Stock"));
        panuserrdata.put("ABG25MNDF", new Pan("ABG25MNDF", "123458958",
                "HDFC BANK", "Stock,FD"));
    }

    public Pan getpanbyAdhar(String AadharNumber) {
        for (Pan pan : panuserrdata.values()) {
            if (pan.getAadhaarNumber().equals(AadharNumber)) {
                return pan;
            }
        }
        return null;
    }
}

