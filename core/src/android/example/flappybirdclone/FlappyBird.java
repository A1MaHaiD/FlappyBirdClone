package android.example.flappybirdclone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FlappyBird extends ApplicationAdapter {
	SpriteBatch batch;
	Texture bird_wings_up;
	Texture background;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("background.png");
		bird_wings_up = new Texture("bird_wings_up.png");
	}

	@Override
	public void render () {

		batch.begin();
		batch.draw(background,0,0,Gdx.graphics.getWidth(),
				Gdx.graphics.getHeight());
		batch.draw(bird_wings_up,Gdx.graphics.getWidth()/2
						-bird_wings_up.getWidth(),
				Gdx.graphics.getHeight()/2
						-bird_wings_up.getHeight());
		batch.end();






		/*
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();

		 */
	}
	
	@Override
	public void dispose () {







		/*
		batch.dispose();
		img.dispose();

		 */
	}
}
