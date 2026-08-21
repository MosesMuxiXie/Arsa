/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class dqo
implements ddt.a<jd<dlp>>,
Predicate<dlt> {
    public static final aao<xq, dqo> a = aam.c(mj.R).a(dqo::new, $$0 -> $$0.e);
    public static final aao<xq, Optional<dqo>> b = aam.c(mj.R).a($$0 -> $$0.b() == 0 ? Optional.empty() : Optional.of(new dqo((jh<dlp>)$$0)), $$02 -> $$02.map($$0 -> $$0.e).orElse(jh.a(new jd[0])));
    public static final Codec<jh<dlp>> c = amn.a(mj.R, dlp.e, false);
    public static final Codec<dqo> d = bfm.c(c).xmap(dqo::new, $$0 -> $$0.e);
    private final jh<dlp> e;

    private dqo(jh<dlp> $$02) {
        $$02.d().ifRight($$0 -> {
            if ($$0.isEmpty()) {
                throw new UnsupportedOperationException("Ingredients can't be empty");
            }
            if ($$0.contains(dlx.a.e())) {
                throw new UnsupportedOperationException("Ingredient can't contain air");
            }
        });
        this.e = $$02;
    }

    public static boolean a(Optional<dqo> $$0, dlt $$12) {
        return $$0.map($$1 -> $$1.a($$12)).orElseGet($$12::f);
    }

    @Deprecated
    public Stream<jd<dlp>> a() {
        return this.e.a();
    }

    public boolean b() {
        return this.e.b() == 0;
    }

    public boolean a(dlt $$0) {
        return $$0.a(this.e);
    }

    public boolean a(jd<dlp> $$0) {
        return this.e.a($$0);
    }

    public boolean equals(Object $$0) {
        if ($$0 instanceof dqo) {
            dqo $$1 = (dqo)$$0;
            return Objects.equals(this.e, $$1.e);
        }
        return false;
    }

    public static dqo a(dwn $$0) {
        return new dqo(jh.a($$0.h().e()));
    }

    public static dqo a(dwn ... $$0) {
        return dqo.a(Arrays.stream($$0));
    }

    public static dqo a(Stream<? extends dwn> $$02) {
        return new dqo(jh.a($$02.map($$0 -> $$0.h().e()).toList()));
    }

    public static dqo a(jh<dlp> $$0) {
        return new dqo($$0);
    }

    public dse c() {
        return (dse)this.e.d().map(dse.h::new, $$0 -> new dse.b($$0.stream().map(dqo::b).toList()));
    }

    public static dse a(Optional<dqo> $$0) {
        return $$0.map(dqo::c).orElse(dse.c.c);
    }

    private static dse b(jd<dlp> $$0) {
        dse.d $$1 = new dse.d($$0);
        dlt $$2 = $$0.a().i();
        if (!$$2.f()) {
            dse.f $$3 = new dse.f($$2);
            return new dse.j($$1, $$3);
        }
        return $$1;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((dlt)object);
    }

    @Override
    public /* synthetic */ boolean acceptsItem(Object object) {
        return this.a((jd)object);
    }
}
