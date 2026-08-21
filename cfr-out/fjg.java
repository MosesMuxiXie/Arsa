/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class fjg
extends fjn {
    public final bef<dzq> a;
    public static final MapCodec<fjg> b = bef.b(mj.i).xmap(fjg::new, $$0 -> $$0.a).fieldOf("value");

    public fjg(bef<dzq> $$0) {
        this.a = $$0;
    }

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        if (exx.a(this.a).test($$0.a_($$4.a()))) {
            return $$4;
        }
        return null;
    }

    @Override
    protected fjp<?> a() {
        return fjp.n;
    }
}

