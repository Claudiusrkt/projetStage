import Controller.*;
import View.*;
import org.mindrot.jbcrypt.BCrypt;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
    Login login = new Login();
    login.login();

    }
}