package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_apple extends SuperObject {

    public OBJ_apple() {
        name = "Apple";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/apple_object.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setDialogue(){
        loadDialogue(
            "You pick up a glowing apple…",
"You feel your strength increase.",
"A faint energy gathers within you…"
        );
    }
}