/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dtg
extends Record
implements dti {
    private final amo b;
    private final jd<cin> d;
    private final dsv e;
    private final ciq.a f;
    public static final MapCodec<dtg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("id").forGetter(dtg::b), (App)cin.a.fieldOf("attribute").forGetter(dtg::c), (App)dsv.b.fieldOf("amount").forGetter(dtg::d), (App)ciq.a.f.fieldOf("operation").forGetter(dtg::e)).apply((Applicative)$$0, dtg::new));

    public dtg(amo $$0, jd<cin> $$1, dsv $$2, ciq.a $$3) {
        this.b = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    private amo a(bhh $$0) {
        return this.b.g("/" + $$0.c());
    }

    public ciq a(int $$0, bhh $$1) {
        return new ciq(this.a($$1), this.d().a($$0), this.e());
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4, boolean $$5) {
        if ($$5 && $$3 instanceof chl) {
            chl $$6 = (chl)$$3;
            $$6.fw().a((Multimap<jd<cin>, ciq>)this.a($$1, $$2.b()));
        }
    }

    @Override
    public void a(dsn $$0, cgk $$1, ftm $$2, int $$3) {
        if ($$1 instanceof chl) {
            chl $$4 = (chl)$$1;
            $$4.fw().b((Multimap<jd<cin>, ciq>)this.a($$3, $$0.b()));
        }
    }

    private HashMultimap<jd<cin>, ciq> a(int $$0, cgv $$1) {
        HashMultimap $$2 = HashMultimap.create();
        $$2.put(this.d, (Object)this.a($$0, (bhh)$$1));
        return $$2;
    }

    public MapCodec<dtg> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtg.class, "id;attribute;amount;operation", "b", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtg.class, "id;attribute;amount;operation", "b", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtg.class, "id;attribute;amount;operation", "b", "d", "e", "f"}, this, $$0);
    }

    public amo b() {
        return this.b;
    }

    public jd<cin> c() {
        return this.d;
    }

    public dsv d() {
        return this.e;
    }

    public ciq.a e() {
        return this.f;
    }
}

