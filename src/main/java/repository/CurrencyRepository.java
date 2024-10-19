package repository;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class CurrencyRepository {
    private Map<String, Double> currencyRates = new HashMap<String, Double>();
    private String apiUrl = "https://api.freecurrencyapi.com/v1/latest?apikey=fca_live_tDMOrxsLZlretkZWPX4ZF4vE4L6N6Pe307EWQNqa";

    public CurrencyRepository() {
        try {
            HttpResponse<String> response = Unirest.get(apiUrl).asString();

            if(response.getStatus() == 200) {
                JSONObject data = new JSONObject(response.getBody()).getJSONObject("data");
                for (String key : data.keySet()) {
                    double value = data.getDouble(key);
                    currencyRates.put(key, value);
                }
            }else {
                System.out.println("GET request failed with code: " +response.getStatus());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Double> getCurrencyRates() {
        return currencyRates;
    }
}
