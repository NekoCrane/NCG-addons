package com.cn.NekoCrane.ncg.core.registry;

import com.cn.NekoCrane.ncg.common.items.M1911;
import com.cn.NekoCrane.ncg.core.NCGGUNS;
import com.mrcrayfish.guns.item.AmmoItem;
import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.client.gui.NewChatGui;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NCGGUNS.MOD_ID);

    public static final RegistryObject<GunItem> M1911 = ITEM_REGISTRY.register("M1911", M1911::new);






    }
