package net.junedev.viridium;

import net.junedev.viridium.blocks.BaseFullLog;
import net.junedev.viridium.items.blocks.*;
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
        GameRegistry.registerBlock(americanSycamoreLog, sycamoreLogItem.class, "american_sycamore_log");

        baldCypressLog = new BaseFullLog().setBlockName("bald_cypress_log");
        GameRegistry.registerBlock(baldCypressLog, baldCypressLogItem.class, "bald_cypress_log");

        baobabLog = new BaseFullLog().setBlockName("baobab_log");
        GameRegistry.registerBlock(baobabLog, baobabLogItem.class, "baobab_log");

        blackPineLog = new BaseFullLog().setBlockName("black_pine_log");
        GameRegistry.registerBlock(blackPineLog, blackPineLogItem.class, "black_pine_log");

        dragonsBloodLog = new BaseFullLog().setBlockName("dragons_blood_log");
        GameRegistry.registerBlock(dragonsBloodLog, dragonsBloodLogItem.class, "dragons_blood_log");

        royalPalmLog = new BaseFullLog().setBlockName("royal_palm_log");
        GameRegistry.registerBlock(royalPalmLog, royalPalmLogItem.class, "royal_palm_log");

        sierraJuniperLog = new BaseFullLog().setBlockName("sierra_juniper_log");
        GameRegistry.registerBlock(sierraJuniperLog, sierraJuniperLogItem.class, "sierra_juniper_log");

        sweetgumLog = new BaseFullLog().setBlockName("sweetgum_log");
        GameRegistry.registerBlock(sweetgumLog, sweetgumLogItem.class, "sweetgum_log");

        weepingWillowLog = new BaseFullLog().setBlockName("weeping_willow_log");
        GameRegistry.registerBlock(weepingWillowLog, weepingWillowLogItem.class, "weeping_willow_log");
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
