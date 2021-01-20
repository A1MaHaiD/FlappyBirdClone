package android.example.flappybirdclone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FlappyBird extends ApplicationAdapter {
    SpriteBatch batch;

    int birdStateFlag = 0;

    Texture background;
    Texture[] bird;
    float flyHeight;
    float fallingSpeed = 0;
    int gameStateFlag = 0;

    @Override
    public void create() {
        batch = new SpriteBatch();
        background = new Texture("background.png");
        bird = new Texture[2];
        bird[0] = new Texture("bird_wings_up.png");
        bird[1] = new Texture("bird_wings_down.png");
        flyHeight = Gdx.graphics.getHeight() / 2
                - bird[0].getHeight() / 2;

    }

    @Override
    public void render() {
        if (Gdx.input.justTouched()) {
            Gdx.app.log("Tap", "Oops!");
            gameStateFlag = 1;
        }

        if (gameStateFlag==1){
            fallingSpeed++;
            flyHeight-=fallingSpeed;
        } else {
            if (Gdx.input.justTouched()) {
                Gdx.app.log("Tap", "Oops!");
                gameStateFlag = 1;
            }
        }


        if (birdStateFlag == 0) {
            birdStateFlag = 1;
        } else {
            birdStateFlag = 0;
        }

        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(),
                Gdx.graphics.getHeight());
        batch.draw(bird[birdStateFlag], Gdx.graphics.getWidth() / 2
                        - bird[birdStateFlag].getWidth() / 2,
                flyHeight);
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
    public void dispose() {







		/*
		batch.dispose();
		img.dispose();

		 */
    }
}
