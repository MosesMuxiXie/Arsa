/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class fiy
extends fjn {
    public static final MapCodec<fiy> a = MapCodec.unit(() -> b);
    public static final fiy b = new fiy();

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        is $$6 = $$4.a();
        boolean $$7 = $$0.a_($$6).a(dzs.K);
        if ($$7 && !dzq.a($$4.b().f($$0, $$6))) {
            return new fjq.d($$6, dzs.K.m(), $$4.c());
        }
        return $$4;
    }

    @Override
    protected fjp<?> a() {
        return fjp.m;
    }
}

