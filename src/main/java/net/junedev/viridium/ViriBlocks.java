package net.junedev.viridium;

import net.junedev.viridium.blocks.BaseFullLog;
import net.junedev.viridium.items.blocks.BaldCypressLogItem;
import net.junedev.viridium.items.blocks.BaobabLogItem;
import net.junedev.viridium.items.blocks.BlackPineLogItem;
import net.junedev.viridium.items.blocks.DragonsBloodLogItem;
import net.junedev.viridium.items.blocks.RoyalPalmLogItem;
import net.junedev.viridium.items.blocks.SierraJuniperLogItem;
import net.junedev.viridium.items.blocks.SweetgumLogItem;
import net.junedev.viridium.items.blocks.SycamoreLogItem;
import net.junedev.viridium.items.blocks.WeepingWillowLogItem;
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
        GameRegistry.registerBlock(americanSycamoreLog, SycamoreLogItem.class, "american_sycamore_log");

        baldCypressLog = new BaseFullLog().setBlockName("bald_cypress_log");
        GameRegistry.registerBlock(baldCypressLog, BaldCypressLogItem.class, "bald_cypress_log");

        baobabLog = new BaseFullLog().setBlockName("baobab_log");
        GameRegistry.registerBlock(baobabLog, BaobabLogItem.class, "baobab_log");

        blackPineLog = new BaseFullLog().setBlockName("black_pine_log");
        GameRegistry.registerBlock(blackPineLog, BlackPineLogItem.class, "black_pine_log");

        dragonsBloodLog = new BaseFullLog().setBlockName("dragons_blood_log");
        GameRegistry.registerBlock(dragonsBloodLog, DragonsBloodLogItem.class, "dragons_blood_log");

        royalPalmLog = new BaseFullLog().setBlockName("royal_palm_log");
        GameRegistry.registerBlock(royalPalmLog, RoyalPalmLogItem.class, "royal_palm_log");

        sierraJuniperLog = new BaseFullLog().setBlockName("sierra_juniper_log");
        GameRegistry.registerBlock(sierraJuniperLog, SierraJuniperLogItem.class, "sierra_juniper_log");

        sweetgumLog = new BaseFullLog().setBlockName("sweetgum_log");
        GameRegistry.registerBlock(sweetgumLog, SweetgumLogItem.class, "sweetgum_log");

        weepingWillowLog = new BaseFullLog().setBlockName("weeping_willow_log");
        GameRegistry.registerBlock(weepingWillowLog, WeepingWillowLogItem.class, "weeping_willow_log");
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
    public static Block baobabLog;
    public static Block blackPineLog;
    public static Block dragonsBloodLog;
    public static Block royalPalmLog;
    public static Block sierraJuniperLog;
    public static Block sweetgumLog;
    public static Block weepingWillowLog;

}
