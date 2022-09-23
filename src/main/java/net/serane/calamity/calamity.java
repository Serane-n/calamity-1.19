package net.serane.calamity;

import net.fabricmc.api.ModInitializer;
import net.serane.calamity.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class calamity implements ModInitializer {
	public static final String MOD_ID = "calamity";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
