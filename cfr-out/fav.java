/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class fav
implements fac {
    public static final Codec<fav> a = bfm.c(fes.c).fieldOf("features").xmap(fav::new, $$0 -> $$0.b).codec();
    public final jh<fes> b;

    public fav(jh<fes> $$0) {
        this.b = $$0;
    }

    @Override
    public Stream<exi<?, ?>> e() {
        return this.b.a().flatMap($$0 -> ((fes)$$0.a()).a());
    }
}

