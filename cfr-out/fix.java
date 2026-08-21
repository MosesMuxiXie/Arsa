/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fix
extends fjn {
    private static final Logger c = LogUtils.getLogger();
    public static final MapCodec<fix> a = MapCodec.unit(() -> b);
    public static final fix b = new fix();

    private fix() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        void $$11;
        eoh $$6 = $$4.b();
        if (!$$6.a(dzs.pZ) || w.W) {
            return $$4;
        }
        if ($$4.c() == null) {
            c.warn("Jigsaw block at {} is missing nbt, will not replace", (Object)$$1);
            return $$4;
        }
        String $$7 = $$4.c().b("final_state", "minecraft:air");
        try {
            ga.a $$8 = ga.a($$0.a(mj.i), $$7, true);
            eoh $$9 = $$8.a();
        }
        catch (CommandSyntaxException $$10) {
            c.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{$$7, $$1, $$10.getMessage()});
            return null;
        }
        if ($$11.a(dzs.lJ)) {
            return null;
        }
        return new fjq.d($$4.a(), (eoh)$$11, null);
    }

    @Override
    protected fjp<?> a() {
        return fjp.h;
    }
}

