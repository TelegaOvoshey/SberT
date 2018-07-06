package FX;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import vk_init.ClientVK;
import vk_init.TotalInformationVO;

import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    private TextField userId;
    private Button searchUser;
    private ImageView userPhoto;
    private ClientVK clientVK;

    @FXML
    protected void searchingUser() {
        TotalInformationVO totalInformationVO = clientVK.getTotalInformation("zzredeyezz");
        userId.getText();


    }
    public void setClient(String tokenUri){
        this.clientVK = new ClientVK(tokenUri);
    }
}


