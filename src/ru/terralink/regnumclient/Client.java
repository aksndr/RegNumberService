package ru.terralink.regnumclient;

import ru.terralink.regnumservice.RegNumber;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ArzamastsevA on 10.11.2015.
 */
public class Client {

    public Map getRegNum(){
        URL serviceURL = null;
        try {
            serviceURL = new URL("http://ot-nntest.terralink.ru/SAPDM.Web.RegNumbers/Service/RegNumberService.svc?wsdl");
        } catch (MalformedURLException e) {
            return failed(e.getMessage());
        }
        ru.terralink.regnumservice.IService service = new ru.terralink.regnumservice.Service(serviceURL).getBasicHttpBindingIService();
        int i = 0;
        try {
            RegNumber r = service.next(null, null, null, null);
            i = r.getID();
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
