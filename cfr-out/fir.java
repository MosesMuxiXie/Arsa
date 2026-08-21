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

public class fir
extends fjn {
    public static final MapCodec<fir> a = eoh.a.xmap(eog.a::b, dzq::m).listOf().fieldOf("blocks").xmap(fir::new, $$0 -> $$0.e);
    public static final fir b = new fir((List<dzq>)ImmutableList.of((Object)dzs.pY));
    public static final fir c = new fir((List<dzq>)ImmutableList.of((Object)dzs.a));
    public static final fir d = new fir((List<dzq>)ImmutableList.of((Object)dzs.a, (Object)dzs.pY));
    private final ImmutableList<dzq> e;

    public fir(List<dzq> $$0) {
        this.e = ImmutableList.copyOf($$0);
    }

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        if (this.e.contains((Object)$$4.b().b())) {
            return null;
        }
        return $$4;
    }

    @Override
    protected fjp<?> a() {
        return fjp.e;
    }
}

