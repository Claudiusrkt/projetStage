package Modele;

public class SiteWeb {
    private  String nomSite,urlSite,passwordSite,loginSite,category;
    public String getNomSite(){
        return nomSite;
    }
    public String getUrlSite(){
        return urlSite;
    }
    public String getPasswordSite(){
        return passwordSite;
    }
    public String getloginSite(){
        return loginSite;
    }

    public String getCategory(){return category;}

    public void setNomSite( String NomSite){
        this.nomSite = NomSite;
    }
    public void setUrlSite(String Url){
        this.urlSite= Url;
    }
    public void setPasswordSite(String MotPasse){
        this.passwordSite =MotPasse;
    }
    public void setloginSite(String Id){
        this.loginSite = Id;
    }
    public void setIdChampMotPasse(String Mot){
        this.loginSite = Mot;
    }
    public void setCategory(String Cat){this.category=Cat;}
}
