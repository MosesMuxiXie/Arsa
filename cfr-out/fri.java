/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fri
implements frm {
    private static final fri b = new fri();
    public static final MapCodec<fri> a = MapCodec.unit((Object)b);

    private fri() {
    }

    @Override
    public frn a() {
        return fro.l;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.l);
    }

    public boolean a(fnz $$0) {
        Float $$1 = $$0.c(fqx.l);
        if ($$1 != null) {
            bgr $$2 = $$0.b();
            float $$3 = 1.0f / $$1.floatValue();
            return $$2.i() <= $$3;
        }
        return true;
    }

    public static frm.a c() {
        return () -> b;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

