package Day3_ClassAssignment;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
    Map<String, String> map = new HashMap<>();
    public LoginService() {
        map.put("Shwetha","shwe@123");
        map.put("kavin","kavin@123");
        map.put("Jai","jai@123");
    }
    public boolean validate(String username, String password) {
        
        if(map.containsKey(username)){
            String originalPassword = map.get(username);
            if(originalPassword.equals(password))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}