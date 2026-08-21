/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;

public final class dnv
extends Record
implements dpe {
    private final List<eky.c> d;
    public static final Codec<dnv> a = eky.c.b.xmap(dnv::new, dnv::a);
    public static final aao<xq, dnv> b = eky.c.c.a(aam.a()).a(dnv::new, dnv::a);
    public static final dnv c = new dnv(List.of());

    public dnv(List<eky.c> $$0) {
        this.d = $$0;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        $$1.accept(yh.a("container.beehive.bees", this.d.size(), 3).a(l.h));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnv.class, "bees", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnv.class, "bees", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnv.class, "bees", "d"}, this, $$0);
    }

    public List<eky.c> a() {
        return this.d;
    }
}

