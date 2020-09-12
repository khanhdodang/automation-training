package utils;

import objects.CheckoutInfo;
import objects.CheckoutOverview;
import objects.Product;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import profiles.DefaultProfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Utils {
    public static JSONObject readJSON(String filePath) {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = null;
        try (InputStream is = Utils.class.getResource(filePath).openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            try {
                jsonObject = (JSONObject) jsonParser.parse(reader);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public static ArrayList<Product> productArrayList() {
        JSONObject jsonObject = readJSON(DefaultProfile.DATA_TEST);
        ArrayList<Product> products = new ArrayList<Product>();
        JSONArray jsonArray = (JSONArray) jsonObject.get("product");
        for (Object obj : jsonArray) {
            Product product = new Product();
            products.add(product.jsonFormat((JSONObject) obj));
        }
        return products;
    }

    public static CheckoutInfo checkoutInfo() {
        JSONObject jsonObject = readJSON(DefaultProfile.DATA_TEST);
        JSONObject object = (JSONObject) jsonObject.get("checkout");
        CheckoutInfo checkoutInfo = new CheckoutInfo();
        return checkoutInfo.jsonFormat(object);
    }

    public static CheckoutOverview checkoutOverview() {
        JSONObject jsonObject = readJSON(DefaultProfile.DATA_TEST);
        JSONObject object = (JSONObject) jsonObject.get("checkout_overview");
        CheckoutOverview checkoutOverview = new CheckoutOverview();
        return checkoutOverview.jsonFormat(object);
    }

}
