package ru.imaginaerum.lesson26_2;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import ru.imaginaerum.lesson26_2.init.creative_tabs.LessonTabs;
import ru.imaginaerum.lesson26_2.init.items.LessonItems;

@Mod(Lesson26_2.MODID)
public class Lesson26_2 {
    public static final String MODID = "lesson26_2";

    public Lesson26_2(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        LessonItems.ITEMS.register(modEventBus);
        LessonTabs.CREATIVE_LESSON_TABS.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

}
