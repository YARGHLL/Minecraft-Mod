package oreadditions.item;
/*
* This file will store the items in my minecraft mod
*/

import oreadditions.OreAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OreAdditions.MODID);  // Serves as a long list of all items that I want to register


    public static final DeferredItem<Item> SILVER = ITEMS.register("silver", () -> new Item(new Item.Properties()));  //Will be the silver for Magistu mod's silver items
    public static final DeferredItem<Item> TIN = ITEMS.register("tin", () -> new Item(new Item.Properties()));  //Will be the silver for Magistu mod's silver items
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));  //Will be the silver for Magistu mod's silver items
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));  //Will be the silver for Magistu mod's silver items
    public static final DeferredItem<Item> BRONZE = ITEMS.register("bronze", () -> new Item(new Item.Properties()));  //Will be the silver for Magistu mod's silver items

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
