/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public abstract class fgw {
    public static final Codec<fgw> f = mi.ag.q().dispatch("element_type", fgw::a, fgx::codec);
    private static final jd<fjo> a = jd.a(new fjo(List.of()));
    private volatile @Nullable fgy.a b;

    protected static <E extends fgw> RecordCodecBuilder<E, fgy.a> f() {
        return fgy.a.c.fieldOf("projection").forGetter(fgw::g);
    }

    protected fgw(fgy.a $$0) {
        this.b = $$0;
    }

    public abstract jy a(fjr var1, egm var2);

    public abstract List<fjq.a> a(fjr var1, is var2, egm var3, bgr var4);

    public abstract ffg a(fjr var1, is var2, egm var3);

    public abstract boolean a(fjr var1, dxn var2, dxk var3, eqg var4, is var5, is var6, egm var7, ffg var8, bgr var9, fja var10, boolean var11);

    public abstract fgx<?> a();

    public void a(dwp $$0, fjq.d $$1, is $$2, egm $$3, bgr $$4, ffg $$5) {
    }

    public fgw a(fgy.a $$0) {
        this.b = $$0;
        return this;
    }

    public fgy.a g() {
        fgy.a $$0 = this.b;
        if ($$0 == null) {
            throw new IllegalStateException();
        }
        return $$0;
    }

    public int h() {
        return 1;
    }

    public static Function<fgy.a, fgp> i() {
        return $$0 -> fgp.b;
    }

    public static Function<fgy.a, fgt> a(String $$0) {
        return $$1 -> new fgt((Either<amo, fjq>)Either.left((Object)amo.a($$0)), a, (fgy.a)$$1, Optional.empty());
    }

    public static Function<fgy.a, fgt> a(String $$0, jd<fjo> $$1) {
        return $$2 -> new fgt((Either<amo, fjq>)Either.left((Object)amo.a($$0)), $$1, (fgy.a)$$2, Optional.empty());
    }

    public static Function<fgy.a, fgv> b(String $$0) {
        return $$1 -> new fgv((Either<amo, fjq>)Either.left((Object)amo.a($$0)), a, (fgy.a)$$1, Optional.empty());
    }

    public static Function<fgy.a, fgv> b(String $$0, jd<fjo> $$1) {
        return $$2 -> new fgv((Either<amo, fjq>)Either.left((Object)amo.a($$0)), $$1, (fgy.a)$$2, Optional.empty());
    }

    public static Function<fgy.a, fgv> a(String $$0, fja $$1) {
        return $$2 -> new fgv((Either<amo, fjq>)Either.left((Object)amo.a($$0)), a, (fgy.a)$$2, Optional.of($$1));
    }

    public static Function<fgy.a, fgv> a(String $$0, jd<fjo> $$1, fja $$2) {
        return $$3 -> new fgv((Either<amo, fjq>)Either.left((Object)amo.a($$0)), $$1, (fgy.a)$$3, Optional.of($$2));
    }

    public static Function<fgy.a, fgq> a(jd<fes> $$0) {
        return $$1 -> new fgq($$0, (fgy.a)$$1);
    }

    public static Function<fgy.a, fgu> b(List<Function<fgy.a, ? extends fgw>> $$0) {
        return $$12 -> new fgu($$0.stream().map($$1 -> (fgw)$$1.apply($$12)).collect(Collectors.toList()), (fgy.a)$$12);
    }
}

