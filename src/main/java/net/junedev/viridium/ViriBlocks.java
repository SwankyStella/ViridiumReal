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
        americanSycamoreLogStripped = new BaseFullLog().setBlockName("american_sycamore_stripped");
        americanSycamoreLeaves = new BaseLeaves().setBlockName("american_sycamore_leaves");
        americanSycamorePlanks = new BasePlanks().setBlockName("american_sycamore_planks");
        americanSycamoreSapling = new BaseSaplingBlock().setBlockName("american_sycamore_sapling");
        GameRegistry.registerBlock(americanSycamoreLog, "american_sycamore_log");
        GameRegistry.registerBlock(americanSycamoreLogStripped, "american_sycamore_stripped");
        GameRegistry.registerBlock(americanSycamoreLeaves, "american_sycamore_leaves");
        GameRegistry.registerBlock(americanSycamorePlanks, "american_sycamore_planks");
        GameRegistry.registerBlock(americanSycamoreSapling, "american_sycamore_sapling");

        baldCypressLog = new BaseFullLog().setBlockName("bald_cypress_log");
        baldCypressLogStripped = new BaseFullLog().setBlockName("bald_cypress_stripped");
        baldCypressLeaves = new BaseLeaves().setBlockName("bald_cypress_leaves");
        baldCypressPlanks = new BasePlanks().setBlockName("bald_cypress_planks");
        baldCypressSapling = new BaseSaplingBlock().setBlockName("bald_cypress_sapling");
        GameRegistry.registerBlock(baldCypressLog, "bald_cypress_log");
        GameRegistry.registerBlock(baldCypressLogStripped, "bald_cypress_stripped");
        GameRegistry.registerBlock(baldCypressLeaves, "bald_cypress_leaves");
        GameRegistry.registerBlock(baldCypressPlanks, "bald_cypress_planks");
        GameRegistry.registerBlock(baldCypressSapling, "bald_cypress_sapling");

        // TODO: Baobab planks texture
        baobabLog = new BaseFullLog().setBlockName("baobab_log");
        baobabLogStripped = new BaseFullLog().setBlockName("baobab_stripped");
        baobabLeaves = new BaseLeaves().setBlockName("baobab_leaves");
        baobabPlanks = new BasePlanks().setBlockName("baobab_planks");
        baobabSapling = new BaseSaplingBlock().setBlockName("baobab_sapling");
        GameRegistry.registerBlock(baobabLog, "baobab_log");
        GameRegistry.registerBlock(baobabLogStripped, "baobab_stripped");
        GameRegistry.registerBlock(baobabLeaves, "baobab_leaves");
        GameRegistry.registerBlock(baobabPlanks, "baobab_planks");
        GameRegistry.registerBlock(baobabSapling, "baobab_sapling");

        blackPineLog = new BaseFullLog().setBlockName("black_pine_log");
        blackPineLogStripped = new BaseFullLog().setBlockName("black_pine_stripped");
        blackPineLeaves = new BaseLeaves().setBlockName("black_pine_leaves");
        blackPinePlanks = new BasePlanks().setBlockName("black_pine_planks");
        blackPineSapling = new BaseSaplingBlock().setBlockName("black_pine_sapling");
        GameRegistry.registerBlock(blackPineLog, "black_pine_log");
        GameRegistry.registerBlock(blackPineLogStripped, "black_pine_stripped");
        GameRegistry.registerBlock(blackPineLeaves, "black_pine_leaves");
        GameRegistry.registerBlock(blackPinePlanks, "black_pine_planks");
        GameRegistry.registerBlock(blackPineSapling, "black_pine_sapling");

        dragonsBloodLog = new BaseFullLog().setBlockName("dragons_blood_log");
        dragonsBloodLogStripped = new BaseFullLog().setBlockName("dragons_blood_stripped");
        dragonsBloodLeaves = new BaseLeaves().setBlockName("dragons_blood_leaves");
        dragonsBloodPlanks = new BasePlanks().setBlockName("dragons_blood_planks");
        dragonsBloodSapling = new BaseSaplingBlock().setBlockName("dragons_blood_sapling");
        GameRegistry.registerBlock(dragonsBloodLog, "dragons_blood_log");
        GameRegistry.registerBlock(dragonsBloodLogStripped, "dragons_blood_stripped");
        GameRegistry.registerBlock(dragonsBloodLeaves, "dragons_blood_leaves");
        GameRegistry.registerBlock(dragonsBloodPlanks, "dragons_blood_planks");
        GameRegistry.registerBlock(dragonsBloodSapling, "dragons_blood_sapling");

        // TODO: Driftwood log top/side texture delineation
        driftwoodLog = new BaseFullLog().setBlockName("driftwood_log");
        driftwoodPlanks = new BasePlanks().setBlockName("driftwood_planks");
        GameRegistry.registerBlock(driftwoodLog, "driftwood_log");
        GameRegistry.registerBlock(driftwoodPlanks, "driftwood_planks");

        royalPalmLog = new BaseFullLog().setBlockName("royal_palm_log");
        royalPalmCrown = new BaseFullLog().setBlockName("royal_palm_crown");
        royalPalmLeaves = new BaseLeaves().setBlockName("royal_palm_leaves");
        royalPalmPlanks = new BasePlanks().setBlockName("royal_palm_planks");
        royalPalmSapling = new BaseSaplingBlock().setBlockName("royal_palm_sapling");
        GameRegistry.registerBlock(royalPalmLog, "royal_palm_log");
        GameRegistry.registerBlock(royalPalmCrown, "royal_palm_crown");
        GameRegistry.registerBlock(royalPalmLeaves, "royal_palm_leaves");
        GameRegistry.registerBlock(royalPalmPlanks, "royal_palm_planks");
        GameRegistry.registerBlock(royalPalmSapling, "royal_palm_sapling");

        sierraJuniperLog = new BaseFullLog().setBlockName("sierra_juniper_log");
        sierraJuniperLogStripped = new BaseFullLog().setBlockName("sierra_juniper_stripped");
        sierraJuniperLeaves = new BaseLeaves().setBlockName("sierra_juniper_leaves");
        sierraJuniperPlanks = new BasePlanks().setBlockName("sierra_juniper_planks");
        sierraJuniperSapling = new BaseSaplingBlock().setBlockName("sierra_juniper_sapling");
        GameRegistry.registerBlock(sierraJuniperLog, "sierra_juniper_log");
        GameRegistry.registerBlock(sierraJuniperLogStripped, "sierra_juniper_stripped");
        GameRegistry.registerBlock(sierraJuniperLeaves, "sierra_juniper_leaves");
        GameRegistry.registerBlock(sierraJuniperPlanks, "sierra_juniper_planks");
        GameRegistry.registerBlock(sierraJuniperSapling, "sierra_juniper_sapling");

        sweetgumLog = new BaseFullLog().setBlockName("sweetgum_log");
//        sweetgumLogStripped = new BaseFullLog().setBlockName("sweetgum_stripped");
        sweetgumLeaves = new BaseLeaves().setBlockName("sweetgum_leaves");
        sweetgumPlanks = new BasePlanks().setBlockName("sweetgum_planks");
        sweetgumSapling = new BaseSaplingBlock().setBlockName("sweetgum_sapling");
        GameRegistry.registerBlock(sweetgumLog, "sweetgum_log");
//        GameRegistry.registerBlock(sweetgumLogStripped, "sweetgum_stripped");
        GameRegistry.registerBlock(sweetgumLeaves, "sweetgum_leaves");
        GameRegistry.registerBlock(sweetgumPlanks, "sweetgum_planks");
        GameRegistry.registerBlock(sweetgumSapling, "sweetgum_sapling");

        weepingWillowLog = new BaseFullLog().setBlockName("weeping_willow_log");
        weepingWillowLogStripped = new BaseFullLog().setBlockName("weeping_willow_stripped");
        weepingWillowLeaves = new BaseLeaves().setBlockName("weeping_willow_leaves");
        weepingWillowPlanks = new BasePlanks().setBlockName("weeping_willow_planks");
        weepingWillowSapling = new BaseSaplingBlock().setBlockName("weeping_willow_sapling");
        GameRegistry.registerBlock(weepingWillowLog, "weeping_willow_log");
        GameRegistry.registerBlock(weepingWillowLogStripped, "weeping_willow_stripped");
        GameRegistry.registerBlock(weepingWillowLeaves, "weeping_willow_leaves");
        GameRegistry.registerBlock(weepingWillowPlanks, "weeping_willow_planks");
        GameRegistry.registerBlock(weepingWillowSapling, "weeping_willow_sapling");
    }

    // Bushes

    // Standalone Grasses

    // Standalone Flora

    // Mushrooms

    // Grass Decorators

    // Vines

    // Wood
    public static Block americanSycamoreLog;
    public static Block americanSycamorePlanks;
    public static Block baldCypressLog;
    public static Block baldCypressPlanks;
    public static Block baobabLog;
    public static Block baobabPlanks;
    public static Block blackPineLog;
    public static Block blackPinePlanks;
    public static Block dragonsBloodLog;
    public static Block dragonsBloodPlanks;

    public static Block driftwoodLog;
    public static Block driftwoodPlanks;

    public static Block royalPalmLog;
    public static Block royalPalmPlanks;
    public static Block sierraJuniperLog;
    public static Block sierraJuniperPlanks;
    public static Block sweetgumLog;
    public static Block sweetgumPlanks;
    public static Block weepingWillowLog;
    public static Block weepingWillowPlanks;

}
