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
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class eml
extends Record
implements dpe {
    private final Optional<dlp> d;
    private final Optional<dlp> e;
    private final Optional<dlp> f;
    private final Optional<dlp> g;
    public static final eml a = new eml(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    public static final Codec<eml> b = mi.h.q().sizeLimitedListOf(4).xmap(eml::new, eml::a);
    public static final aao<xq, eml> c = aam.a(mj.R).a(aam.c(4)).a(eml::new, eml::a);

    private eml(List<dlp> $$0) {
        this(eml.a($$0, 0), eml.a($$0, 1), eml.a($$0, 2), eml.a($$0, 3));
    }

    public eml(dlp $$0, dlp $$1, dlp $$2, dlp $$3) {
        this(List.of($$0, $$1, $$2, $$3));
    }

    public eml(Optional<dlp> $$0, Optional<dlp> $$1, Optional<dlp> $$2, Optional<dlp> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    private static Optional<dlp> a(List<dlp> $$0, int $$1) {
        if ($$1 >= $$0.size()) {
            return Optional.empty();
        }
        dlp $$2 = $$0.get($$1);
        return $$2 == dlx.sx ? Optional.empty() : Optional.of($$2);
    }

    public List<dlp> a() {
        return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(dlx.sx)).toList();
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        if (this.equals(a)) {
            return;
        }
        $$1.accept(yg.a);
        eml.a($$1, this.g);
        eml.a($$1, this.e);
        eml.a($$1, this.f);
        eml.a($$1, this.d);
    }

    private static void a(Consumer<yh> $$0, Optional<dlp> $$1) {
        $$0.accept(new dlt($$1.orElse(dlx.sx), 1).y().e().a(l.h));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eml.class, "back;left;right;front", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eml.class, "back;left;right;front", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eml.class, "back;left;right;front", "d", "e", "f", "g"}, this, $$0);
    }

    public Optional<dlp> b() {
        return this.d;
    }

    public Optional<dlp> c() {
        return this.e;
    }

    public Optional<dlp> d() {
        return this.f;
    }

    public Optional<dlp> e() {
        return this.g;
    }
}

