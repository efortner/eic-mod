package net.occursus.eicmod;

import lombok.extern.slf4j.Slf4j;
import net.fabricmc.api.ClientModInitializer;

@Slf4j
public class EicModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        log.info("Initializing client for mod '{}'", EicMod.MOD_ID);
    }
}
