package net.moddingplayground.ranched.impl;

import com.google.common.reflect.Reflection;
import net.fabricmc.api.ModInitializer;
import net.moddingplayground.frame.api.util.InitializationLogger;
import net.moddingplayground.ranched.api.Ranched;
import net.moddingplayground.ranched.api.block.RanchedBlocks;
import net.moddingplayground.ranched.api.item.RanchedItemGroups;

public final class RanchedImpl implements Ranched, ModInitializer {
	private final InitializationLogger initializer;

	public RanchedImpl() {
		this.initializer = new InitializationLogger(LOGGER, MOD_NAME);
	}

	@SuppressWarnings("UnstableApiUsage")
	@Override
	public void onInitialize() {
		this.initializer.start();

		Reflection.initialize(
			RanchedItemGroups.class,
			RanchedBlocks.class
		);

		this.initializer.finish();
	}
}
