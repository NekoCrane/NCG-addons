package com.cn.NekoCrane.ncg.core;

import com.cn.NekoCrane.ncg.common.items.M1911;
import com.cn.NekoCrane.ncg.core.registry.ItemRegistry;
import com.cn.NekoCrane.ncg.core.registry.SoundRegistry;
import com.mrcrayfish.guns.Config;
import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.mrcrayfish.guns.item.GunItem;


@Mod(NCGGUNS.MOD_ID)
public class NCGGUNS {

    public static final String MOD_ID = "ncg";

    public static final ItemGroup GROUP = new ItemGroup(NCGGUNS.MOD_ID) {

        @Override
        public ItemStack createIcon() {
            ItemStack stack = new ItemStack(ItemRegistry.M1911.get());
            stack.getOrCreateTag().putInt("AmmoCount", ItemRegistry.M1911.get().getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };
}


    //What needs to be called the the event bus
    //public NCGGUNS() {

        //IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        //bus.register(this);

        //ItemRegistry.ITEM_REGISTRY.register(bus);

        //SoundRegistry.SOUND_REGISTRY.register(bus);

    //}

//}