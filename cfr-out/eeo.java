/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class eeo
extends dzq
implements dzy {
    private static final Codec<fkz> f = mi.c.q().comapFlatMap($$0 -> {
        DataResult dataResult;
        if ($$0 instanceof fkz) {
            fkz $$1 = (fkz)$$0;
            dataResult = DataResult.success((Object)$$1);
        } else {
            dataResult = DataResult.error(() -> "Not a flowing fluid: " + String.valueOf($$0));
        }
        return dataResult;
    }, $$0 -> $$0);
    public static final MapCodec<eeo> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)f.fieldOf("fluid").forGetter($$0 -> $$0.c), eeo.x()).apply((Applicative)$$02, eeo::new));
    public static final eph b = eox.aT;
    protected final fkz c;
    private final List<flb> g;
    public static final fug d = dzq.b(16.0, 0.0, 8.0);
    public static final ImmutableList<iz> e = ImmutableList.of((Object)iz.a, (Object)iz.d, (Object)iz.c, (Object)iz.f, (Object)iz.e);

    public MapCodec<eeo> a() {
        return a;
    }

    protected eeo(fkz $$0, eog.d $$1) {
        super($$1);
        this.c = $$0;
        this.g = Lists.newArrayList();
        this.g.add($$0.a(false));
        for (int $$2 = 1; $$2 < 8; ++$$2) {
            this.g.add($$0.a(8 - $$2, false));
        }
        this.g.add($$0.a(8, true));
        this.l((eoh)((eoh)this.C.b()).b(b, 0));
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        if ($$3.d()) {
            return fud.b();
        }
        if ($$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y())) {
            return d;
        }
        return fud.a();
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.y().f();
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        $$0.y().a($$1, $$2, $$3);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return false;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return !this.c.a(bdv.b);
    }

    @Override
    protected flb b_(eoh $$0) {
        int $$1 = $$0.c(b);
        return this.g.get(Math.min($$1, 8));
    }

    @Override
    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        return $$1.y().a().a(this.c);
    }

    @Override
    protected egf a_(eoh $$0) {
        return egf.a;
    }

    @Override
    protected List<dlt> a(eoh $$0, fod.a $$1) {
        return Collections.emptyList();
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.a();
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if (this.a($$1, $$2, $$0)) {
            $$1.a($$2, $$0.y().a(), this.c.a($$1));
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.y().b() || $$6.y().b()) {
            $$2.a($$3, $$0.y().a(), this.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if (this.a($$1, $$2, $$0)) {
            $$1.a($$2, $$0.y().a(), this.c.a($$1));
        }
    }

    private boolean a(dwo $$0, is $$1, eoh $$2) {
        if (this.c.a(bdv.b)) {
            boolean $$3 = $$0.a_($$1.e()).a(dzs.eA);
            for (iz $$4 : e) {
                is $$5 = $$1.a($$4.g());
                if ($$0.b_($$5).a(bdv.a)) {
                    dzq $$6 = $$0.b_($$1).b() ? dzs.cK : dzs.m;
                    $$0.c($$1, $$6.m());
                    this.a($$0, $$1);
                    return false;
                }
                if (!$$3 || !$$0.a_($$5).a(dzs.nT)) continue;
                $$0.c($$1, dzs.eB.m());
                this.a($$0, $$1);
                return false;
            }
        }
        return true;
    }

    private void a(dwp $$0, is $$1) {
        $$0.c(1501, $$1, 0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    public dlt a(@Nullable chl $$0, dwp $$1, is $$2, eoh $$3) {
        if ($$3.c(b) == 0) {
            $$1.a($$2, dzs.a.m(), 11);
            return new dlt(this.c.a());
        }
        return dlt.l;
    }

    @Override
    public Optional<bcz> au_() {
        return this.c.j();
    }
}

