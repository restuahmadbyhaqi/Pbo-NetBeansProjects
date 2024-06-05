package InfoTool;
import java.util.ArrayList;
import java.util.List;


public class InfoController {
    private List<InfoView>list;
    private InfoModel infoModel;
    
    public InfoController() {
        list = new ArrayList<InfoView>();
        infoModel = new InfoModel("Dinginnn", "Ujan deress");
    }
    
    public void addInfoView(InfoView viewInfo) {
        list.add(viewInfo);
    }
    
    public void updateMessage(String message) {
        infoModel.setMessage(message);
        for(InfoView infoView: list) {
            infoView.getLblMessage().setText("Message: " + message);
        }
    }
    
    public void updateWeather(String weather) {
        infoModel.setWeather(weather);
        for(InfoView infoView: list) {
            infoView.getLblWeather().setText("Weather: " + weather);
        }
    }
    
    public String getMessage() {
        return infoModel.getMessage();
    }
    
    public String getWeather() {
        return infoModel.getWeather();
    }
}
