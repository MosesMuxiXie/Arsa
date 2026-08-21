/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class fgv
extends fgw {
    private static final Comparator<fjq.a> a = Comparator.comparingInt(fjq.a::g).reversed();
    private static final Codec<Either<amo, fjq>> g = Codec.of(fgv::a, (Decoder)amo.a.map(Either::left));
    public static final MapCodec<fgv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fgv.d(), fgv.b(), fgv.f(), fgv.c()).apply((Applicative)$$0, fgv::new));
    protected final Either<amo, fjq> c;
    protected final jd<fjo> d;
    protected final Optional<fja> e;

    private static <T> DataResult<T> a(Either<amo, fjq> $$0, DynamicOps<T> $$1, T $$2) {
        Optional $$3 = $$0.left();
        if ($$3.isEmpty()) {
            return DataResult.error(() -> "Can not serialize a runtime pool element");
        }
        return amo.a.encode((Object)((amo)$$3.get()), $$1, $$2);
    }

    protected static <E extends fgv> RecordCodecBuilder<E, jd<fjo>> b() {
        return fjp.d.fieldOf("processors").forGetter($$0 -> $$0.d);
    }

    protected static <E extends fgv> RecordCodecBuilder<E, Optional<fja>> c() {
        return fja.c.optionalFieldOf("override_liquid_settings").forGetter($$0 -> $$0.e);
    }

    protected static <E extends fgv> RecordCodecBuilder<E, Either<amo, fjq>> d() {
        return g.fieldOf("location").forGetter($$0 -> $$0.c);
    }

    protected fgv(Either<amo, fjq> $$0, jd<fjo> $$1, fgy.a $$2, Optional<fja> $$3) {
        super($$2);
        this.c = $$0;
        this.d = $$1;
        this.e = $$3;
    }

    @Override
    public jy a(fjr $$0, egm $$1) {
        fjq $$2 = this.a($$0);
        return $$2.a($$1);
    }

    private fjq a(fjr $$0) {
        return (fjq)this.c.map($$0::a, Function.identity());
    }

    public List<fjq.d> a(fjr $$0, is $$1, egm $$2, boolean $$3) {
        fjq $$4 = this.a($$0);
        ObjectArrayList<fjq.d> $$5 = $$4.a($$1, new fjm().a($$2), dzs.pY, $$3);
        ArrayList $$6 = Lists.newArrayList();
        for (fjq.d $$7 : $$5) {
            eps $$9;
            uz $$8 = $$7.c();
            if ($$8 == null || ($$9 = $$8.a("mode", eps.e).orElseThrow()) != eps.d) continue;
            $$6.add($$7);
        }
        return $$6;
    }

    @Override
    public List<fjq.a> a(fjr $$0, is $$1, egm $$2, bgr $$3) {
        List<fjq.a> $$4 = this.a($$0).a($$1, $$2);
        bhs.c($$4, $$3);
        fgv.a($$4);
        return $$4;
    }

    @VisibleForTesting
    static void a(List<fjq.a> $$0) {
        $$0.sort(a);
    }

    @Override
    public ffg a(fjr $$0, is $$1, egm $$2) {
        fjq $$3 = this.a($$0);
        return $$3.b(new fjm().a($$2), $$1);
    }

    @Override
    public boolean a(fjr $$0, dxn $$1, dxk $$2, eqg $$3, is $$4, is $$5, egm $$6, ffg $$7, bgr $$8, fja $$9, boolean $$10) {
        fjm $$12;
        fjq $$11 = this.a($$0);
        if ($$11.a($$1, $$4, $$5, $$12 = this.a($$6, $$7, $$9, $$10), $$8, 18)) {
            List<fjq.d> $$13 = fjq.a($$1, $$4, $$5, $$12, this.a($$0, $$4, $$6, false));
            for (fjq.d $$14 : $$13) {
                this.a($$1, $$14, $$4, $$6, $$8, $$7);
            }
            return true;
        }
        return false;
    }

    protected fjm a(egm $$0, ffg $$1, fja $$2, boolean $$3) {
        fjm $$4 = new fjm();
        $$4.a($$1);
        $$4.a($$0);
        $$4.b(true);
        $$4.a(false);
        $$4.a(fir.b);
        $$4.c(true);
        $$4.a(this.e.orElse($$2));
        if (!$$3) {
            $$4.a(fix.b);
        }
        this.d.a().a().forEach($$4::a);
        this.g().b().forEach($$4::a);
        return $$4;
    }

    @Override
    public fgx<?> a() {
        return fgx.a;
    }

    public String toString() {
        return "Single[" + String.valueOf(this.c) + "]";
    }

    @VisibleForTesting
    public amo e() {
        return (amo)this.c.orThrow();
    }
}

