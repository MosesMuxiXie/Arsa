/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class frq
implements frm {
    private static final frq b = new frq();
    public static final MapCodec<frq> a = MapCodec.unit((Object)b);

    private frq() {
    }

    @Override
    public frn a() {
        return fro.g;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.d);
    }

    public boolean a(fnz $$0) {
        return $$0.a(fqx.d);
    }

    public static frm.a c() {
        return () -> b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

