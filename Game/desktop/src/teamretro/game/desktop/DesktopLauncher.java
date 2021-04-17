package teamretro.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import teamretro.game.SpaceShooterGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


		//config.height = 640;
		//config.width = 360;


		new LwjglApplication(new SpaceShooterGame(), config);
	}
}
