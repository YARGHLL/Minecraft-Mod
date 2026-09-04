package wintercrops.item;
/*
* This file will store the items in my minecraft mod
*/

import wintercrops.WinterCrops;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WinterCrops.MODID);  // Serves as a long list of all items that I want to register

    public static final DeferredItem<Item> WINTER_POTATO = ITEMS.register("winterpotato", () -> new Item(new Item.Properties()));  //Will be the winter potato item


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
