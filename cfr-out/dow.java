/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public final class dow
extends Record {
    private final boolean c;
    private final boolean d;
    private final Optional<jd<bcz>> e;
    private final Optional<jd<bcz>> f;
    public static final Codec<dow> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("deals_knockback", (Object)true).forGetter(dow::a), (App)Codec.BOOL.optionalFieldOf("dismounts", (Object)false).forGetter(dow::b), (App)bcz.b.optionalFieldOf("sound").forGetter(dow::c), (App)bcz.b.optionalFieldOf("hit_sound").forGetter(dow::d)).apply((Applicative)$$0, dow::new));
    public static final aao<xq, dow> b = aao.a(aam.b, dow::a, aam.b, dow::b, bcz.d.a(aam::a), dow::c, bcz.d.a(aam::a), dow::d, dow::new);

    public dow(boolean $$0, boolean $$1, Optional<jd<bcz>> $$2, Optional<jd<bcz>> $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public void a(cgk $$0) {
        this.e.ifPresent($$1 -> $$0.ao().a($$0, $$0.dP(), $$0.dR(), $$0.dV(), (jd<bcz>)$$1, $$0.dB(), 1.0f, 1.0f));
    }

    public void b(cgk $$0) {
        this.f.ifPresent($$1 -> $$0.ao().a(null, $$0.dP(), $$0.dR(), $$0.dV(), (jd<bcz>)$$1, $$0.dB(), 1.0f, 1.0f));
    }

    public static boolean a(cgk $$0, cgk $$1) {
        if ($$1.cU() || !$$1.cb()) {
            return false;
        }
        if ($$1 instanceof che) {
            return true;
        }
        if (!$$1.bW()) {
            return false;
        }
        if ($$1 instanceof ddm) {
            ddm $$3;
            ddm $$2 = (ddm)$$1;
            if ($$0 instanceof ddm && !($$3 = (ddm)$$0).a($$2)) {
                return false;
            }
        }
        return !$$0.A($$1);
    }

    public void a(chl $$02, cgv $$12) {
        float $$2 = (float)$$02.i(cis.d);
        dnu $$3 = $$02.fz();
        boolean $$4 = false;
        for (ftj $$5 : (Collection)dee.a((cgk)$$02, $$3, $$1 -> dow.a((cgk)$$02, $$1), dvw.a.a).map($$0 -> List.of(), $$0 -> $$0)) {
            $$4 |= $$02.a($$12, $$5.a(), $$2, true, this.c, this.d);
        }
        $$02.fO();
        $$02.fi();
        if ($$4) {
            this.b($$02);
        }
        this.a($$02);
        $$02.a(cdb.a, false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dow.class, "dealsKnockback;dismounts;sound;hitSound", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dow.class, "dealsKnockback;dismounts;sound;hitSound", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dow.class, "dealsKnockback;dismounts;sound;hitSound", "c", "d", "e", "f"}, this, $$0);
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public Optional<jd<bcz>> c() {
        return this.e;
    }

    public Optional<jd<bcz>> d() {
        return this.f;
    }
}

