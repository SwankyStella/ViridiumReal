package net.junedev.viridium.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class baldCypressLogItem extends ItemBlock {

    private String unlocalizedName;

    public baldCypressLogItem(Block block) {
        super(block);

    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item." + "bald_cypress_log";
    }

    @Override
    public ItemBlock setUnlocalizedName(String name) {
        this.unlocalizedName = name;
        return this;
    }
}
