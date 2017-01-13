package verwaltung;

import speicher.Speicher;
import klassen.*;

public class LoginVerwaltung {

    private Speicher speicher;
    private String username;

    public LoginVerwaltung(Speicher speicher, String username) {
        this.speicher = speicher;
        this.username = username;
    }
    
    public LoginVerwaltung() {
    }
    
    private boolean isAdmin() {
        return false;
    }
    
    private Mitglied convertUser(String pUsername) {
        return null;
    }
    
    private Admin convertAdmin(String pUsername) {
        return null;
    }
    
    public void login(String pUsername, String pPasswort) {
        
    }

    public void openVerwaltung() {
    
    }
    
    public void openJFrame() {
    
    }
}
