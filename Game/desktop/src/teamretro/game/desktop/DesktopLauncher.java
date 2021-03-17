package teamretro.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import teamretro.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		/*
		config.height = (insert height here);
		config.width = (insert width here);

		 */
		new LwjglApplication(new Game(), config);
	}
}
