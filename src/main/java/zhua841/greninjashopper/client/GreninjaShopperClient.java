package zhua841.greninjashopper.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import zhua841.greninjashopper.GreninjaShopper;

public class GreninjaShopperClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(GreninjaShopper.GRENINJA_SHOPPER, GreninjaShopperRenderer::new);
    }
}
