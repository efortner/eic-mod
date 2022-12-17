package net.occursus.eicmod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.minecraft.client.gui.screen.TitleScreen;

@Mixin(TitleScreen.class)
@Slf4j
public class TitleScreenMixin {
	@Shadow
	@Getter
	private String splashText = "";
	
	@Inject(at = @At("HEAD"), method = "init()V")
	public void init(final CallbackInfo info) {
		log.info("Running mixin on {}", TitleScreen.class.getName());
		this.splashText = "Everything is Connected!";
	}
}
