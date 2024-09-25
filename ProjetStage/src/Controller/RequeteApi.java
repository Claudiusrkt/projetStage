package Controller;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.json.TypeToken;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequeteApi {

    public String donnees,reponse;
    public String[] analyeContentJson(String reponse , String nomColonne){
        List<String> liste = new ArrayList<>();
        Gson gson = new Gson();
        String[] rst ;
        Type listType = new TypeToken<List<Map<String, Object>>>() {}.getType();
        List<Map<String, Object>> data = gson.fromJson(reponse, listType);
        for (Map<String, Object> item : data) {
            liste.add((String) item.get(nomColonne));
        }
        rst = liste.toArray(new String[0]);
        return rst;
    }
    public String recupereSiteDispo(WebDriver driver){
        String rst = null;
        try{
            driver.get("https://127.0.0.1:8000/site/");
            WebElement table = driver.findElement(By.tagName("table"));
            List<WebElement> headerElements = table.findElements(By.tagName("th"));
            List<String> headers = new ArrayList<>();
            for (WebElement header : headerElements) {
                headers.add(header.getText());
            }
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            List<Map<String, String>> tableData = new ArrayList<>();
            for (int i = 1; i < rows.size(); i++) {
                WebElement row = rows.get(i);
                List<WebElement> cells = row.findElements(By.tagName("td"));
                Map<String, String> rowData = new HashMap<>();
                for (int j = 0; j < cells.size(); j++) {
                    if (j < headers.size()) {
                        rowData.put(headers.get(j), cells.get(j).getText());
                    }
                }
                if (!rowData.isEmpty()) {
                    tableData.add(rowData);
                }
            }
            Gson gson = new Gson();
            rst = gson.toJson(tableData);
            System.out.println(rst);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("tache terminé");
        }
        return rst;
    }
    public Boolean isValideAuthentif(WebDriver driver,String adrMail , String MotPasse){
        boolean ok= true;
        try {
            driver.get("https://127.0.0.1:8000/login");
            WebElement emailField = driver.findElement(By.id("inputEmail"));
            WebElement passwordField = driver.findElement(By.id("inputPassword"));
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            emailField.sendKeys(adrMail);
            passwordField.sendKeys(MotPasse);
            loginButton.click();
            try {
                WebElement alertElement = driver.findElement(By.className("alert-danger"));
                System.out.println("L'alerte suivante a été détectée : " + alertElement.getText());
                ok = false;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println("Aucune alerte avec la classe 'alert alert-danger' trouvée.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }
    public String[] recupereNom(WebDriver driver){
        String[] nom = new String[2];try {
            driver.get("https://127.0.0.1:8000/admin/profil");
            nom[0]=driver.findElement(By.className("info-nom")).getText();
            nom[1]=driver.findElement(By.className("info-prenom")).getText();
        }catch (Exception e){
            driver.get("https://127.0.0.1:8000/user/profil/simple");
        }
        return nom;
    }
    public String recupereSiteData(String json, String name ,String aRecuperer ){
        String rst =null;
        try {
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if (jsonObject.getString("Name").equals(name)) {
                    rst = jsonObject.getString(aRecuperer);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return rst;
    }
    public void fin(WebDriver driver){
        driver.quit();
    }
}
