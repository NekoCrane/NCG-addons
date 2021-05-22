package com.cn.NekoCrane.ncg.common.items;

import com.cn.NekoCrane.ncg.core.NCGGUNS;
import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

import static com.cn.NekoCrane.ncg.core.registry.ItemRegistry.M1911;


public class M1911 extends GunItem {
    public M1911() {
        super(new Item.Properties().maxStackSize(1).group(NCGGUNS.GROUP));
    }
}
