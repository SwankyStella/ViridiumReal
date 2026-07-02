package net.junedev.viridium.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class royalPalmLogItem extends ItemBlock {

    private String unlocalizedName;

    public royalPalmLogItem(Block block) {
        super(block);

    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + "royal_palm_log";
    }

    @Override
    public ItemBlock setUnlocalizedName(String name) {
        this.unlocalizedName = name;
        return this;
    }
}
