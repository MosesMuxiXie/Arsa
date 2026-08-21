/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableBiMap
 */
import com.google.common.collect.ImmutableBiMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Function;

public record dnl(dlp a, dlp b, dlp c, dlp d, dlp e, dlp f, dlp g, dlp h) {
    private final dlp a;
    private final dlp b;
    private final dlp c;
    private final dlp d;
    private final dlp e;
    private final dlp f;
    private final dlp g;
    private final dlp h;

    public static dnl a(ejs $$0, Function<dzq, dlp> $$1) {
        return new dnl($$1.apply($$0.d()), $$1.apply($$0.e()), $$1.apply($$0.f()), $$1.apply($$0.g()), $$1.apply($$0.h()), $$1.apply($$0.i()), $$1.apply($$0.j()), $$1.apply($$0.k()));
    }

    public ImmutableBiMap<dlp, dlp> a() {
        return ImmutableBiMap.of((Object)this.a, (Object)this.e, (Object)this.b, (Object)this.f, (Object)this.c, (Object)this.g, (Object)this.d, (Object)this.h);
    }

    public void a(Consumer<dlp> $$0) {
        $$0.accept(this.a);
        $$0.accept(this.b);
        $$0.accept(this.c);
        $$0.accept(this.d);
        $$0.accept(this.e);
        $$0.accept(this.f);
        $$0.accept(this.g);
        $$0.accept(this.h);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnl.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnl.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "a", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnl.class, "unaffected;exposed;weathered;oxidized;waxed;waxedExposed;waxedWeathered;waxedOxidized", "a", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public dlp b() {
        return this.a;
    }

    public dlp c() {
        return this.b;
    }

    public dlp d() {
        return this.c;
    }

    public dlp e() {
        return this.d;
    }

    public dlp f() {
        return this.e;
    }

    public dlp g() {
        return this.f;
    }

    public dlp h() {
        return this.g;
    }

    public dlp i() {
        return this.h;
    }
}

