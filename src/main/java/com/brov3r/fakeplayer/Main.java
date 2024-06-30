package com.brov3r.fakeplayer;

import com.avrix.plugin.Metadata;
import com.avrix.plugin.Plugin;

/**
 * Main entry point of the example plugin
 */
public class Main extends Plugin {
    private static Main instance;

    /**
     * Constructs a new {@link Plugin} with the specified metadata.
     * Metadata is transferred when the plugin is loaded into the game context.
     *
     * @param metadata The {@link Metadata} associated with this plugin.
     */
    public Main(Metadata metadata) {
        super(metadata);
    }

    /**
     * Called when the plugin is initialized.
     * <p>
     * Implementing classes should override this method to provide the initialization logic.
     */
    @Override
    public void onInitialize() {
        instance = this;
        loadDefaultConfig();
    }

    /**
     * Getting a plugin instance
     *
     * @return plugin instance
     */
    public static Main getInstance() {
        return instance;
    }

    /**
     * Getting the number of players
     *
     * @return number of players
     */
    public static int getPlayers() {
        return getInstance() == null ? 0 : getInstance().getDefaultConfig().getInt("players");
    }
}