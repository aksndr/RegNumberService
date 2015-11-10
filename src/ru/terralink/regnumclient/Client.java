package ru.terralink.regnumclient;

import ru.terralink.regnumservice.RegNumberRest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ArzamastsevA on 10.11.2015.
 */
public class Client {

    public Map getRegNum(){
        ru.terralink.regnumservice.IRegNumberService service = new ru.terralink.regnumservice.RegNumberService().getBasicHttpBindingIRegNumberService();
        int i = 0;
        try {
            RegNumberRest r = service.next(null,null,null,null);
            i = r.getId();
        } catch (Exception e){
            return failed(e.getMessage());
        }
        return succeed(i);
    }

    private static Map<String, Object> succeed(Object value){
        Map<String, Object> result = new HashMap<>();
        result.put("ok", true);
        result.put("value", value);
        return result;
    }

    private static Map<String, Object> failed(String errMsg){
        Map<String, Object> result = new HashMap<>();
        result.put("ok", false);
        result.put("errMsg", errMsg);
        return result;
    }
}
