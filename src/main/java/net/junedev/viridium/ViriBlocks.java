package net.junedev.viridium;

import net.junedev.viridium.blocks.BaseFullLog;
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

        // Full Trees
        americanSycamoreLog = new BaseFullLog().setBlockName("american_sycamore_log");
        americanSycamoreLeaves = new BaseLeaves().setBlockName("american_sycamore_leaves");
        GameRegistry.registerBlock(americanSycamoreLog, "american_sycamore_log");
        GameRegistry.registerBlock(americanSycamoreLeaves, "american_sycamore_leaves");

        baldCypressLog = new BaseFullLog().setBlockName("bald_cypress_log");
        baldCypressLeaves = new BaseLeaves().setBlockName("bald_cypress_leaves");
        GameRegistry.registerBlock(baldCypressLog, "bald_cypress_log");
        GameRegistry.registerBlock(baldCypressLeaves, "bald_cypress_leaves");

        // TODO: Baobab planks texture
        baobabLog = new BaseFullLog().setBlockName("baobab_log");
        baobabLeaves = new BaseLeaves().setBlockName("baobab_leaves");
        GameRegistry.registerBlock(baobabLog, "baobab_log");
        GameRegistry.registerBlock(baobabLeaves, "baobab_leaves");

        blackPineLog = new BaseFullLog().setBlockName("black_pine_log");
        blackPineLeaves = new BaseLeaves().setBlockName("black_pine_leaves");
        GameRegistry.registerBlock(blackPineLog, "black_pine_log");
        GameRegistry.registerBlock(blackPineLeaves, "black_pine_leaves");

        dragonsBloodLog = new BaseFullLog().setBlockName("dragons_blood_log");
        dragonsBloodLeaves = new BaseLeaves().setBlockName("dragons_blood_leaves");
        GameRegistry.registerBlock(dragonsBloodLog, "dragons_blood_log");
        GameRegistry.registerBlock(dragonsBloodLeaves, "dragons_blood_leaves");

        royalPalmLog = new BaseFullLog().setBlockName("royal_palm_log");
        royalPalmLeaves = new BaseLeaves().setBlockName("royal_palm_leaves");
        GameRegistry.registerBlock(royalPalmLog, "royal_palm_log");
        GameRegistry.registerBlock(royalPalmLeaves, "royal_palm_leaves");

        sierraJuniperLog = new BaseFullLog().setBlockName("sierra_juniper_log");
        sierraJuniperLeaves = new BaseLeaves().setBlockName("sierra_juniper_leaves");
        GameRegistry.registerBlock(sierraJuniperLog, "sierra_juniper_log");
        GameRegistry.registerBlock(sierraJuniperLeaves, "sierra_juniper_leaves");

        sweetgumLog = new BaseFullLog().setBlockName("sweetgum_log");
        sweetgumLeaves = new BaseLeaves().setBlockName("sweetgum_leaves");
        GameRegistry.registerBlock(sweetgumLog, "sweetgum_log");
        GameRegistry.registerBlock(sweetgumLeaves, "sweetgum_leaves");

        weepingWillowLog = new BaseFullLog().setBlockName("weeping_willow_log");
        weepingWillowLeaves = new BaseLeaves().setBlockName("weeping_willow_leaves");
        GameRegistry.registerBlock(weepingWillowLog, "weeping_willow_log");
        GameRegistry.registerBlock(weepingWillowLeaves, "weeping_willow_leaves");
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
