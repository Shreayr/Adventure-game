package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_sword extends SuperObject{
    
	public OBJ_sword() {
		name="Sword";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/sword_object.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void setDialogue(){
		loadDialogue(
			"You grasp the sword…",
"A surge of power flows through you…",
"The blade hums… as if it has chosen you.",
"A distant roar echoes…",
"Something has awakened…"
);
	}
}
