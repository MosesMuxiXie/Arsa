/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.HashMultimap;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record hqm(iod a, boolean b, ilp c) implements hqg
{
    private final iod a;
    private final boolean b;
    private final ilp c;
    private static final Logger d = LogUtils.getLogger();

    public static hqg a(inw $$0, amo $$1, ioc $$2) {
        iof $$3 = $$0.a($$1);
        hqp $$4 = $$3.g();
        boolean $$5 = $$3.c();
        ilp $$6 = $$3.a($$4, $$0);
        iod $$7 = $$3.a($$4, $$0, $$2);
        HashMultimap $$8 = null;
        for (hqa $$9 : $$7.a()) {
            ilp $$10 = $$9.l();
            if ($$10.h().equals(ilo.d)) continue;
            if ($$8 == null) {
                $$8 = HashMultimap.create();
            }
            $$8.put((Object)$$10.h(), (Object)$$10.e().d());
        }
        if ($$8 != null) {
            d.warn("Rejecting block model {}, since it contains sprites from outside of supported atlas: {}", (Object)$$1, $$8);
            return $$0.a();
        }
        return new hqm($$7, $$5, $$6);
    }

    @Override
    public List<hqa> a(@Nullable iz $$0) {
        return this.a.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqm.class, "quads;useAmbientOcclusion;particleIcon", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqm.class, "quads;useAmbientOcclusion;particleIcon", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqm.class, "quads;useAmbientOcclusion;particleIcon", "a", "b", "c"}, this, $$0);
    }

    public iod c() {
        return this.a;
    }

    @Override
    public boolean a() {
        return this.b;
    }

    @Override
    public ilp b() {
        return this.c;
    }
}

