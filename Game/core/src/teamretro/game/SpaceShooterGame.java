package teamretro.game;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import java.util.Random;

public class SpaceShooterGame extends Game {
    private Music GOmusic;
    private Music music;
	public final static int MENU = 0;
	public final static int APPLICATION = 1;
	public final static int ENDGAME = 2;
	public final static int GAMEOVER = 3;
	//public final static int HIGHSCORE = 3;


	GameScreen gameScreen;
	MenuScreen menuScreen;
	EndScreen endScreen;
	GameOverScreen gameOverScreen;


	public static Random random = new Random();

	public void changeScreen(int screen) {
		switch (screen) {
			case MENU:
				if (menuScreen == null) menuScreen = new MenuScreen(this); // added (this)
				this.setScreen(menuScreen);

				GOmusic.pause();
				break;

				case APPLICATION:
				if (gameScreen == null) gameScreen = new GameScreen(this); //added (this)
				this.setScreen(gameScreen);

				break;
			case ENDGAME:
				if (endScreen == null) endScreen = new EndScreen(this);  // added (this)
				this.setScreen(endScreen);
				break;
			case GAMEOVER:
				if (gameOverScreen == null) gameOverScreen = new GameOverScreen(this);
				this.setScreen(gameOverScreen);
				GOmusic=Gdx.audio.newMusic(Gdx.files.internal("death.ogg"));
				GOmusic.setLooping(true);
				GOmusic.setVolume(1.0f);
				GOmusic.play();

				break;
		}
	}

	@Override
	public void create() {
		menuScreen = new MenuScreen(this);
		setScreen(menuScreen);
	}

	@Override
	public void dispose() {
		//menuScreen.dispose();
		//gameScreen.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		//gameScreen.resize(width, height);
		//menuScreen.resize(width, height);
	}
}
