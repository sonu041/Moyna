package com.shuvankar.moyna.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.shuvankar.moyna.MoynaPakhi;

public class DesktopLauncher {
	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MoynaPakhi.WIDTH;
		config.height = MoynaPakhi.HEIGHT;
		config.title = MoynaPakhi.TITLE;
		new LwjglApplication(new MoynaPakhi(), config);
	}
}
