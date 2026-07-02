package net.junedev.viridium;

import net.junedev.viridium.blocks.BaseFullLog;
import net.junedev.viridium.items.blocks.baldCypressItem;
import net.junedev.viridium.items.blocks.sycamoreItem;
import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;

public class ViriBlocks {

    public void preInit() {
        // Bushes

        // Standalone Grasses

        // Standalone Flora

        // Mushrooms

        // Grass Decorators

        // Vines

        // Wood
        americanSycamoreLog = new BaseFullLog().setBlockName("american_sycamore_log");
        GameRegistry.registerBlock(americanSycamoreLog, sycamoreItem.class, "american_sycamore_log");

        baldCypressLog = new BaseFullLog().setBlockName("bald_cypress_log");
        GameRegistry.registerBlock(baldCypressLog, baldCypressItem.class, "bald_cypress_log");
    }

    // Bushes

    // Standalone Grasses

    // Standalone Flora

    // Mushrooms

    // Grass Decorators

    // Vines

    // Wood
    public static Block americanSycamoreLog;
    public static Block baldCypressLog;

}
