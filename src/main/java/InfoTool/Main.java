package InfoTool;


public class Main {
    public static void main(String[] args) {
        InfoView infoView1 = new InfoView();
        infoView1.setVisible(true);
        
        InfoView infoView2 = new InfoView();
        infoView2.setVisible(true);
        
        InfoController infoController = new InfoController();
        infoController.addInfoView(infoView1);
        infoController.addInfoView(infoView2);
        
        infoView1.setInfoController(infoController);
        infoView2.setInfoController(infoController);
        
    }
}
    