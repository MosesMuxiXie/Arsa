/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;

public final class dop
extends Record
implements dpe {
    private final List<yh> e;
    private final List<yh> f;
    public static final dop a = new dop(List.of());
    public static final int b = 256;
    private static final zf g = zf.a.a(l.f).b(true);
    public static final Codec<dop> c = yj.a.sizeLimitedListOf(256).xmap(dop::new, dop::a);
    public static final aao<xq, dop> d = yj.b.a(aam.c(256)).a(dop::new, dop::a);

    public dop(List<yh> $$02) {
        this($$02, Lists.transform($$02, $$0 -> yk.a($$0, g)));
    }

    public dop(List<yh> $$0, List<yh> $$1) {
        if ($$0.size() > 256) {
            throw new IllegalArgumentException("Got " + $$0.size() + " lines, but maximum is 256");
        }
        this.e = $$0;
        this.f = $$1;
    }

    public dop a(yh $$0) {
        return new dop(bhs.a(this.e, $$0));
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        this.f.forEach($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dop.class, "lines;styledLines", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dop.class, "lines;styledLines", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dop.class, "lines;styledLines", "e", "f"}, this, $$0);
    }

    public List<yh> a() {
        return this.e;
    }

    public List<yh> b() {
        return this.f;
    }
}

