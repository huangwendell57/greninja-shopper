package zhua841.greninjashopper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import zhua841.greninjashopper.entity.GreninjaShopperEntity;

public class GreninjaShopper implements ModInitializer {
    public static final String MOD_ID = "greninja_shopper";

    public static final EntityType<GreninjaShopperEntity> GRENINJA_SHOPPER = Registry.register(
            Registries.ENTITY_TYPE,
            id("greninja_shopper"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, GreninjaShopperEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0F, 2.3F))
                    .trackRangeBlocks(10)
                    .trackedUpdateRate(3)
                    .build()
    );

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(GRENINJA_SHOPPER, GreninjaShopperEntity.createGreninjaAttributes());
    }
}
