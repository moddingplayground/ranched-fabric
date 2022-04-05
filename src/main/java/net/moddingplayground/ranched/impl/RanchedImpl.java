package net.moddingplayground.ranched.impl;

import net.fabricmc.api.ModInitializer;
import net.moddingplayground.ranched.api.Ranched;
import net.moddingplayground.frame.api.util.InitializationLogger;

public final class RanchedImpl implements Ranched, ModInitializer {
	private final InitializationLogger initializer;

	public RanchedImpl() {
		this.initializer = new InitializationLogger(LOGGER, MOD_NAME);
	}

	@Override
	public void onInitialize() {
		this.initializer.start();

		//

		this.initializer.finish();
	}
}
