/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class fjj
extends fjn {
    public static final MapCodec<fjj> a = fjf.b.listOf().fieldOf("rules").xmap(fjj::new, $$0 -> $$0.b);
    private final ImmutableList<fjf> b;

    public fjj(List<? extends fjf> $$0) {
        this.b = ImmutableList.copyOf($$0);
    }

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        bgr $$6 = bgr.a(bgj.a($$4.a()));
        eoh $$7 = $$0.a_($$4.a());
        for (fjf $$8 : this.b) {
            if (!$$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) continue;
            return new fjq.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
        }
        return $$4;
    }

    @Override
    protected fjp<?> a() {
        return fjp.i;
    }
}

