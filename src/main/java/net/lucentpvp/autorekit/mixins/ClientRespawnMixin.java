package net.lucentpvp.autorekit.mixins;

import net.lucentpvp.autorekit.AutoRekit;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientRespawnMixin {
    @Inject(method = "onPlayerRespawn", at = @At("TAIL"))
    public void onPlayerRespawn(PlayerRespawnS2CPacket packet, CallbackInfo ci) {
        if (AutoRekit.mc.isInSingleplayer() || AutoRekit.mc.getCurrentServerEntry() == null) return;
        if (!AutoRekit.mc.getCurrentServerEntry().address.endsWith("lucentpvp.net")) return; // only do this on lucentpvp.net
        if (AutoRekit.mc.player == null) return; // wut idk when this happens but ig it happens

        // send the command
        AutoRekit.mc.player.sendCommand("kits claim");
    }
}
