/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class fdr {
    private static final Logger b = LogUtils.getLogger();
    public static final Codec<fdr> a = RecordCodecBuilder.create($$02 -> $$02.group((App)js.a(mj.br).lenientOptionalFieldOf("structure_overrides").forGetter($$0 -> $$0.c), (App)fdo.a.listOf().fieldOf("layers").forGetter(fdr::e), (App)Codec.BOOL.fieldOf("lakes").orElse((Object)false).forGetter($$0 -> $$0.i), (App)Codec.BOOL.fieldOf("features").orElse((Object)false).forGetter($$0 -> $$0.h), (App)dxo.c.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0 -> Optional.of($$0.e)), ams.d(dxv.b), ams.d(se.g), ams.d(se.h)).apply((Applicative)$$02, fdr::new)).comapFlatMap(fdr::a, Function.identity()).stable();
    private final Optional<jh<ffu>> c;
    private final List<fdo> d = Lists.newArrayList();
    private final jd<dxo> e;
    private final List<eoh> f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final List<jd<fes>> j;

    private static DataResult<fdr> a(fdr $$0) {
        int $$1 = $$0.d.stream().mapToInt(fdo::a).sum();
        if ($$1 > esh.c) {
            return DataResult.error(() -> "Sum of layer heights is > " + esh.c, (Object)$$0);
        }
        return DataResult.success((Object)$$0);
    }

    private fdr(Optional<jh<ffu>> $$0, List<fdo> $$1, boolean $$2, boolean $$3, Optional<jd<dxo>> $$4, jd.c<dxo> $$5, jd<fes> $$6, jd<fes> $$7) {
        this($$0, fdr.a($$4, $$5), List.of($$6, $$7));
        if ($$2) {
            this.b();
        }
        if ($$3) {
            this.a();
        }
        this.d.addAll($$1);
        this.g();
    }

    private static jd<dxo> a(Optional<? extends jd<dxo>> $$0, jd<dxo> $$1) {
        if ($$0.isEmpty()) {
            b.error("Unknown biome, defaulting to plains");
            return $$1;
        }
        return $$0.get();
    }

    public fdr(Optional<jh<ffu>> $$0, jd<dxo> $$1, List<jd<fes>> $$2) {
        this.c = $$0;
        this.e = $$1;
        this.f = Lists.newArrayList();
        this.j = $$2;
    }

    public fdr a(List<fdo> $$0, Optional<jh<ffu>> $$1, jd<dxo> $$2) {
        fdr $$3 = new fdr($$1, $$2, this.j);
        for (fdo $$4 : $$0) {
            $$3.d.add(new fdo($$4.a(), $$4.b().b()));
            $$3.g();
        }
        if (this.h) {
            $$3.a();
        }
        if (this.i) {
            $$3.b();
        }
        return $$3;
    }

    public void a() {
        this.h = true;
    }

    public void b() {
        this.i = true;
    }

    public dxp a(jd<dxo> $$0) {
        boolean $$4;
        if (!$$0.equals(this.e)) {
            return $$0.a().c();
        }
        dxp $$1 = this.d().a().c();
        dxp.b $$2 = new dxp.b();
        if (this.i) {
            for (jd<fes> $$3 : this.j) {
                $$2.a(eum.a.b, $$3);
            }
        }
        boolean bl2 = $$4 = (!this.g || $$0.a(dxv.a)) && this.h;
        if ($$4) {
            List<jh<fes>> $$5 = $$1.c();
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                if ($$6 == eum.a.d.ordinal() || $$6 == eum.a.e.ordinal() || this.i && $$6 == eum.a.b.ordinal()) continue;
                jh<fes> $$7 = $$5.get($$6);
                for (jd jd2 : $$7) {
                    $$2.a($$6, (jd<fes>)jd2);
                }
            }
        }
        List<eoh> $$9 = this.f();
        for (int $$10 = 0; $$10 < $$9.size(); ++$$10) {
            eoh $$11 = $$9.get($$10);
            if (euq.a.e.e().test($$11)) continue;
            $$9.set($$10, null);
            $$2.a(eum.a.k, sh.a(exx.ad, new fag($$10, $$11), new fev[0]));
        }
        return $$2.a();
    }

    public Optional<jh<ffu>> c() {
        return this.c;
    }

    public jd<dxo> d() {
        return this.e;
    }

    public List<fdo> e() {
        return this.d;
    }

    public List<eoh> f() {
        return this.f;
    }

    public void g() {
        this.f.clear();
        for (fdo $$02 : this.d) {
            for (int $$1 = 0; $$1 < $$02.a(); ++$$1) {
                this.f.add($$02.b());
            }
        }
        this.g = this.f.stream().allMatch($$0 -> $$0.a(dzs.a));
    }

    public static fdr a(je<dxo> $$0, je<ffu> $$1, je<fes> $$2) {
        jh.a $$3 = jh.a($$1.b(ffh.r), $$1.b(ffh.a));
        fdr $$4 = new fdr(Optional.of($$3), fdr.a($$0), fdr.b($$2));
        $$4.e().add(new fdo(1, dzs.I));
        $$4.e().add(new fdo(2, dzs.j));
        $$4.e().add(new fdo(1, dzs.i));
        $$4.g();
        return $$4;
    }

    public static jd<dxo> a(je<dxo> $$0) {
        return $$0.b(dxv.b);
    }

    public static List<jd<fes>> b(je<fes> $$0) {
        return List.of($$0.b(se.g), $$0.b(se.h));
    }
}

