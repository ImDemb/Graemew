package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Texture ImageIcon;
	private Texture createImageIcon;
	private Texture up, right, left, down;
	private Texture Player;
	private Vector2 playerPosition;


	@Override
	public void create() {
		batch = new SpriteBatch();
		right = new Texture("buttonright.png");
		up = new Texture("buttonup.png");
		left = new Texture("buttonleft.png");
		down = new Texture("buttondown.png");
		Player = new Texture("koala.png");
		playerPosition = new Vector2();
		playerPosition.set(400, 400);


	}

	@Override
	public void render() {
		updategame();

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(right, 300, 100);
		batch.draw(left, 100, 100);
		batch.draw(down, 200, 0);
		batch.draw(up, 200, 200);
		batch.draw(Player, playerPosition.x, playerPosition.y);
		batch.end();
	}

	public void updategame() {
		if (Gdx.input.isTouched()) {
			float X = Gdx.input.getX();
			float Y = Gdx.input.getY();
			System.out.println(X + " " + Y);
			if (X > 200 && X < 250 && Y < 350 && Y > 250) {
				playerPosition.y = playerPosition.y + 5;
			}

			if (X < 250 && X >175 && Y > 500) {
				playerPosition.y = playerPosition.y - 5;
			}
			if (X < 200 && X > 50 && Y > 50 && Y < 150  ) {
				playerPosition.y = playerPosition.x-5;
			}
		}
	}
}
