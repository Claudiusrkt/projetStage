package Controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RemplirLogin {
    public void remplirLogFb( String url,String identifiant , String MotPasse){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();
        try{
            driver.get(url);
            Thread.sleep(3000);
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.name("login"));
            emailField.sendKeys(identifiant);
            passwordField.sendKeys(MotPasse);
//            loginButton.click();
//            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void remplirLogInsta(String url,String identifiant , String motPasse){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();
        try {
            driver.get(url);
            Thread.sleep(3000);
            WebElement usernameField = driver.findElement(By.cssSelector("input[type='text']"));
            WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
//            class="_aa4b _add6 _ac4d _ap35"
            usernameField.sendKeys(identifiant);
            passwordField.sendKeys(motPasse);
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
//            loginButton.click();
//            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void remplirLogWhat(String url){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();

        try {
            driver.get(url);
            Thread.sleep(3000);
            System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void rempliLogLin(String url,String identifiant, String motPasse){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();
        try {
            driver.get(url);
            Thread.sleep(3000);
            WebElement emailField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            emailField.sendKeys(identifiant);
            passwordField.sendKeys(motPasse);
            WebElement loginButton = driver.findElement(By.tagName("button"));
//            loginButton.click();
//            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void rempliLogTwitter(String url,String identifiant, String motPasse){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();
        try {
            driver.get(url);
            Thread.sleep(10000);
            WebElement usernameField = driver.findElement(By.name("text"));
            usernameField.sendKeys(identifiant);
            String className1 = "css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-ywje51 r-184id4b r-13qz1uu r-2yi16 r-1qi8awa r-3pj75a r-1loqt21 r-o7ynqc r-6416eg r-1ny4l3l";
            WebElement nextButton = driver.findElement(By.cssSelector("." + className1.replace(" ", ".")));
            nextButton.click();
            try {
                WebElement passwordField = driver.findElement(By.name("password"));
                passwordField.sendKeys(motPasse);
                String className = "css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-19yznuf r-64el8z r-1fkl15p r-o7ynqc r-6416eg r-icoktb r-1ny4l3l";
                WebElement loginButton = driver.findElement(By.cssSelector("." + className.replace(" ", ".")));
                Thread.sleep(10000);
//            loginButton.click();
            }catch (Exception e){
                System.out.println("Identifiant erroné");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void remplirLogGit(String url,String identifiant, String motPasse){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();
        try {
            driver.get(url);
            Thread.sleep(3000);
            WebElement usernameField = driver.findElement(By.name("login"));
            usernameField.sendKeys(identifiant);
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys(motPasse);
            WebElement validerButton = driver.findElement(By.name("commit"));
            validerButton.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void remplirLogStack(String url,String identifiant, String motPasse){
        Pilote connex = new Pilote();
        WebDriver driver = connex.driveGui();
        try {
            driver.get(url);
            Thread.sleep(3000);
            WebElement usernameField = driver.findElement(By.id("email"));
            usernameField.sendKeys(identifiant);
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys(motPasse);
            WebElement validerButton = driver.findElement(By.id("submit-button"));
            validerButton.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
