package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_coconut extends SuperObject {

    public OBJ_coconut() {
        name = "Coconut";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/coconut_object.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setDialogue(){
        loadDialogue(
            "You crack open a coconut…",
            "Refreshing… you feel revitalized.",
            "Your stamina increases."
        );
    }
    
}