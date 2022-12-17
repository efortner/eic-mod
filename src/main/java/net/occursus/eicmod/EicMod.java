package net.occursus.eicmod;

import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ModInitializer;

@Slf4j
public class EicMod implements ModInitializer {
	public static final String MOD_ID = EicMod.class.getSimpleName();

	@Override
	public void onInitialize() {
		log.info("Initializing mod '{}'", MOD_ID);
	}
}
