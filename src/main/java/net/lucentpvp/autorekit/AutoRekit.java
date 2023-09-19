package net.lucentpvp.autorekit;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class AutoRekit implements ClientModInitializer {
    public static MinecraftClient mc;
    @Override
    public void onInitializeClient() {
        System.out.println("AutoRekit has been initialized!");

        mc = MinecraftClient.getInstance();
    }
}
