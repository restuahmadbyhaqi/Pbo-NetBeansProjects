/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InfoTool;

/**
 *
 * @author user
 */
public class InfoModel {
    private String message;
    private String weather;
    
    public InfoModel(String message, String weather) {
        this.message = message;
        this.weather = weather;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getWeather() {
        return weather;
    }
    
    public void setWeather(String weather) {
        this.weather = weather;
    }
}
