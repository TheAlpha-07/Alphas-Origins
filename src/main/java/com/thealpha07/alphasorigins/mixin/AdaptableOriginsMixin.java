package com.thealpha07.alphasorigins.mixin;

import com.thealpha07.alphasorigins.AdaptableOrigins;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(TitleScreen.class)
public class AdaptableOriginsMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info)    {
        AdaptableOrigins.LOGGER.info("Loading Alpha's Origins");
    }
}
