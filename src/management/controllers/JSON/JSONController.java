package management.controllers.JSON;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JSONController {
    public JSONController(){}
    
    public static String bytes2String(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }
    
    public static String byteFileToString(String filename){
        try (FileInputStream fis = new FileInputStream(filename)){
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            String context = bytes2String(buffer);
            return context;
        }
        catch(Exception e){
            System.out.println("Error in management.controllers.JSON.JSONController.byteFileToString\n" + e);
        }
        
        return null;
    }
    
    public String[] getStorage(){
        try {
            String jsonString = byteFileToString("..\\..\\temps\\storages.dat");
            
            JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);

            String storageId, tempC, humidity, fire;

            for (String key : jsonObject.keySet()) {
                storageId = key;

                JsonObject storageObject = jsonObject.getAsJsonObject(key);

                tempC = storageObject.get("tempC").getAsString();
                humidity = storageObject.get("humidity").getAsString();
                fire = storageObject.get("fire").getAsString();
                
                String[] storageData = {storageId, tempC, humidity, fire};
                return storageData;
            }   
            
        } catch (Exception e) {
            System.out.println("Error in management.controllers.JSON.JSONController.getStorage()\n" + e);
        }
        
        return null;
    }

    
    public ArrayList<ArrayList<String>> getStorageData(){
        try {
            String jsonString = byteFileToString("..\\..\\temps\\storages.dat");
            
            ArrayList<ArrayList<String>> storageData = new ArrayList<ArrayList<String>>();
            ArrayList<String> tempStorage = new ArrayList<String>();

            JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);

            JsonObject storageJson = jsonObject.getAsJsonObject("storage");

            String tempC, humidity, fire;

            for (String storageId: storageJson.keySet()){
                JsonObject storageEntry = storageJson.getAsJsonObject(storageId);

                tempC = storageEntry.get("tempC").getAsString();
                humidity = storageEntry.get("humidity").getAsString();
                fire = storageEntry.get("fire").getAsString();

                tempStorage.add(storageId);
                tempStorage.add(tempC);
                tempStorage.add(humidity);
                tempStorage.add(fire);

                storageData.add(tempStorage);
            }
            
            return storageData;
        }
        catch (Exception e){
            System.out.println("Error in management.controllers.JSON.JSONController.getStorage()\n" + e);
        } 
        
        return null;
    }
    
}
