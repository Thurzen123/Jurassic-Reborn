package mod.reborn.server.entity.dinosaur;

import mod.reborn.client.model.animation.EntityAnimation;
import mod.reborn.client.sound.SoundHandler;
import mod.reborn.server.entity.DinosaurEntity;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class GuanlongEntity extends DinosaurEntity {
    private static final Class[] targets = {AlvarezsaurusEntity.class, EntityPlayer.class, ChilesaurusEntity.class, CoelurusEntity.class, CompsognathusEntity.class, DodoEntity.class, GallimimusEntity.class, HyaenodonEntity.class, HypsilophodonEntity.class, LeaellynasauraEntity.class, LeptictidiumEntity.class, MicroceratusEntity.class, MicroraptorEntity.class, MussaurusEntity.class, OrnithomimusEntity.class, OthnieliaEntity.class, OviraptorEntity.class, SegisaurusEntity.class, TroodonEntity.class);

    public GuanlongEntity(World world) {
        super(world);
    }

    public SoundEvent getSoundForAnimation(Animation animation) {
        switch (EntityAnimation.getAnimation(animation)) {
            case SPEAK:
                return SoundHandler.GUANLONG_LIVING;
            case DYING:
                return SoundHandler.GUANLONG_DEATH;
            case INJURED:
                return SoundHandler.GUANLONG_HURT;
            default:
                return null;
        }
    }
}
