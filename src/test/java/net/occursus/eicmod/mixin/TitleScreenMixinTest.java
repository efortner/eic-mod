package net.occursus.eicmod.mixin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class TitleScreenMixinTest {
    @Test
    public void testInit() {
        final TitleScreenMixin titleScreenMixin = new TitleScreenMixin();
        Assertions.assertEquals("", titleScreenMixin.getSplashText());
        titleScreenMixin.init(new CallbackInfo("test callback", true));
        Assertions.assertEquals("Everything is Connected!", titleScreenMixin.getSplashText());
    }
}
