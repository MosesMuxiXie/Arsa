/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class eab
extends ecp {
    public static final MapCodec<eab> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)eow.a.fieldOf("block_set_type").forGetter($$0 -> $$0.d), (App)Codec.intRange((int)1, (int)1024).fieldOf("ticks_to_stay_pressed").forGetter($$0 -> $$0.e), eab.x()).apply((Applicative)$$02, eab::new));
    public static final eoy b = eox.A;
    private final eow d;
    private final int e;
    private final Function<eoh, fug> g;

    public MapCodec<eab> a() {
        return a;
    }

    protected eab(eow $$0, int $$1, eog.d $$2) {
        super($$2.a($$0.g()));
        this.d = $$0;
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(b, false)).b(c, eos.b));
        this.e = $$1;
        this.g = this.b();
    }

    private Function<eoh, fug> b() {
        fug $$0 = dzq.a(14.0);
        fug $$1 = dzq.a(12.0);
        Map<eos, Map<iz, fug>> $$2 = fud.e(dzq.b(6.0, 4.0, 8.0, 16.0));
        return this.a((eoh $$3) -> fud.a((fug)((Map)$$2.get($$3.c(c))).get($$3.c(f)), $$3.c(b) != false ? $$0 : $$1, ftq.e));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.g.apply($$0);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$0.c(b).booleanValue()) {
            return cdc.c;
        }
        this.a($$0, $$1, $$2, $$3);
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$3.g() && !$$0.c(b).booleanValue()) {
            this.a($$0, (dwo)$$1, $$2, (ddm)null);
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    public void a(eoh $$0, dwo $$1, is $$2, @Nullable ddm $$3) {
        $$1.a($$2, (eoh)$$0.b(b, true), 3);
        this.d($$0, $$1, $$2);
        $$1.a($$2, (dzq)this, this.e);
        this.a($$3, (dwp)$$1, $$2, true);
        $$1.a((cgk)$$3, etk.a, $$2);
    }

    protected void a(@Nullable ddm $$0, dwp $$1, is $$2, boolean $$3) {
        $$1.a((cgk)($$3 ? $$0 : null), $$2, this.a($$3), bdb.e);
    }

    protected bcz a(boolean $$0) {
        return $$0 ? this.d.o() : this.d.n();
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3 && $$0.c(b).booleanValue()) {
            this.d($$0, $$1, $$2);
        }
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.c(b) != false ? 15 : 0;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(b).booleanValue() && eab.n($$0) == $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        this.c($$0, $$1, $$2);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$1.B_() || !this.d.e() || $$0.c(b).booleanValue()) {
            return;
        }
        this.c($$0, $$1, $$2);
    }

    protected void c(eoh $$0, dwo $$1, is $$2) {
        boolean $$5;
        deh $$3 = this.d.e() ? (deh)$$1.a(deh.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
        boolean $$4 = $$3 != null;
        if ($$4 != ($$5 = $$0.c(b).booleanValue())) {
            $$1.a($$2, (eoh)$$0.b(b, $$4), 3);
            this.d($$0, $$1, $$2);
            this.a(null, (dwp)$$1, $$2, $$4);
            $$1.a((cgk)$$3, $$4 ? etk.a : etk.e, $$2);
        }
        if ($$4) {
            $$1.a(new is($$2), (dzq)this, this.e);
        }
    }

    private void d(eoh $$0, dwo $$1, is $$2) {
        iz $$3;
        fmj $$4 = fmf.a($$1, $$3, ($$3 = eab.n($$0).g()).o().d() ? iz.b : (iz)$$0.c(f));
        $$1.a($$2, (dzq)this, $$4);
        $$1.a($$2.a($$3), (dzq)this, $$4);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, b, c);
    }
}

