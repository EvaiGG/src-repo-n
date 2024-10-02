package src.com.tony.config;

import java.util.Map;

public class ResponseBean  <T>{
    
    private T data;
    
    private String message;
    
    public ResponseBean(T data, String message) {
        this.data = data;
        this.message = message;
    }
    
    Map success(T data, String code) {
      return Map.of("data", data, "code", code);  
    }
    
    Map fail(String ErrMsg) {
        return Map.of("code", 500, "info", ErrMsg);
    }
}
