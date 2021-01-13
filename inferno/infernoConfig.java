package net.runelite.client.plugins.inferno;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup("Inferno")
public interface InfernoConfig extends Config
{

    @ConfigItem(
            keyName = "showPrayers",
            name = "Show Prayers",
            description = "Show prayers to protect while in inferno",
            position = 0
    )
    default boolean showPrayers()
    {
        return true;
    }

}
