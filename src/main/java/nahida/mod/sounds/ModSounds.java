package nahida.mod.sounds;

import nahida.mod.NahidaMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    
    public static final SoundEvent AURORA_BLOCK_BREAK = registerSoundEvent("aurora_block_break");

    public static final SoundEvent AURORA_BLOCK_STEP = registerSoundEvent("aurora_block_step");

    public static final SoundEvent AURORA_BLOCK_PLACE = registerSoundEvent("aurora_block_place");

    public static final SoundEvent AURORA_BLOCK_HIT = registerSoundEvent("aurora_block_hit");

    public static final SoundEvent AURORA_BLOCK_FALL = registerSoundEvent("aurora_block_fall");
    
    public static final SoundEvent KIRA_KILLER = registerSoundEvent("kira_killer");

    public static final SoundEvent TRUTH_LIES = registerSoundEvent("truth_lies");

    public static final BlockSoundGroup AURORA_BLOCK_SOUNDS = new BlockSoundGroup( 1f, 1f,
    ModSounds.AURORA_BLOCK_BREAK, ModSounds.AURORA_BLOCK_STEP, ModSounds.AURORA_BLOCK_PLACE,
    ModSounds.AURORA_BLOCK_HIT, ModSounds.AURORA_BLOCK_FALL);

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.tryParse(NahidaMod.MOD_ID + ":" + name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    } 

    public static void registerSounds() {
        NahidaMod.LOGGER.info("Registering sounds for " + NahidaMod.MOD_ID);
    }
}
