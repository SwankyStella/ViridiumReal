package net.junedev.viridium.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class sweetgumLogItem extends ItemBlock {

    private String unlocalizedName;

    public sweetgumLogItem(Block block) {
        super(block);

    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + "sweetgum_log";
    }

    @Override
    public ItemBlock setUnlocalizedName(String name) {
        this.unlocalizedName = name;
        return this;
    }
}
