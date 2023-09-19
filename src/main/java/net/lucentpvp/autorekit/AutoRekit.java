package net.lucentpvp.autorekit;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class AutoRekit implements ClientModInitializer {
    public static MinecraftClient mc;
    @Override
    public void onInitializeClient() {
        System.out.println("AutoRekit by Lucent Productions");
        System.out.println("Now initializing...");

        // wow this is such a great initialization
        mc = MinecraftClient.getInstance();

        // would you look at that it's done
        System.out.println("Initialized!");
    }
}
