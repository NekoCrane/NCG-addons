package com.cn.NekoCrane.ncg.core.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_REGISTRY;
    public static final RegistryObject<SoundEvent> ITEM_M1911_SHOOT;
    public static final RegistryObject<SoundEvent> ITEM_M1911_RELOAD;

    public SoundRegistry() {
    }

    private static RegistryObject<SoundEvent> register(String key) {
        return SOUND_REGISTRY.register(key, () -> {
            return new SoundEvent(new ResourceLocation("M1911", key));
        });
    }

    static {
        SOUND_REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "M1911");
        ITEM_M1911_SHOOT = register("item.M1911.fire");
        ITEM_M1911_RELOAD = register("item.M1911.reload");
    }
}
