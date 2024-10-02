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
}
