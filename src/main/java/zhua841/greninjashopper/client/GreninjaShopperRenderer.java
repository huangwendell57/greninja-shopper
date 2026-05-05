package zhua841.greninjashopper.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import zhua841.greninjashopper.entity.GreninjaShopperEntity;

public class GreninjaShopperRenderer extends GeoEntityRenderer<GreninjaShopperEntity> {
    public GreninjaShopperRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new GreninjaShopperModel());
        this.shadowRadius = 0.45F;
    }
}
