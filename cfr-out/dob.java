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
import java.util.ArrayList;
import java.util.List;

public final class dob
extends Record {
    private final float d;
    private final dlv e;
    private final jd<bcz> f;
    private final boolean g;
    private final List<dpp> h;
    public static final float a = 1.6f;
    private static final int i = 4;
    private static final float j = 0.21875f;
    public static final Codec<dob> b = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.u.optionalFieldOf("consume_seconds", (Object)Float.valueOf(1.6f)).forGetter(dob::c), (App)dlv.m.optionalFieldOf("animation", (Object)dlv.b).forGetter(dob::d), (App)bcz.b.optionalFieldOf("sound", bda.lR).forGetter(dob::e), (App)Codec.BOOL.optionalFieldOf("has_consume_particles", (Object)true).forGetter(dob::f), (App)dpp.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dob::g)).apply((Applicative)$$0, dob::new));
    public static final aao<xq, dob> c = aao.a(aam.l, dob::c, dlv.n, dob::d, bcz.d, dob::e, aam.b, dob::f, dpp.e.a(aam.a()), dob::g, dob::new);

    public dob(float $$0, dlv $$1, jd<bcz> $$2, boolean $$3, List<dpp> $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    public cdc a(chl $$0, dlt $$1, cdb $$2) {
        boolean $$3;
        if (!this.a($$0, $$1)) {
            return cdc.d;
        }
        boolean bl2 = $$3 = this.a() > 0;
        if ($$3) {
            $$0.c($$2);
            return cdc.c;
        }
        dlt $$4 = this.a($$0.ao(), $$0, $$1);
        return cdc.c.a($$4);
    }

    public dlt a(dwo $$0, chl $$1, dlt $$2) {
        bgr $$32 = $$1.ep();
        this.a($$32, $$1, $$2, 16);
        if ($$1 instanceof axg) {
            axg $$4 = (axg)$$1;
            $$4.b(bdk.c.b($$2.h()));
            aj.A.a($$4, $$2);
        }
        $$2.a(doc.class).forEach($$3 -> $$3.a($$0, $$1, $$2, this));
        if (!$$0.B_()) {
            this.h.forEach($$3 -> $$3.a($$0, $$2, $$1));
        }
        $$1.c(this.e == dlv.c ? etk.l : etk.m);
        $$2.a(1, $$1);
        return $$2;
    }

    public boolean a(chl $$0, dlt $$1) {
        dhf $$2 = $$1.a(ki.y);
        if ($$2 != null && $$0 instanceof ddm) {
            ddm $$3 = (ddm)$$0;
            return $$3.u($$2.c());
        }
        return true;
    }

    public int a() {
        return (int)(this.d * 20.0f);
    }

    public void a(bgr $$0, chl $$1, dlt $$2, int $$3) {
        bcz bcz2;
        float $$9;
        float $$4 = $$0.h() ? 0.5f : 1.0f;
        float $$5 = $$0.a(1.0f, 0.2f);
        float $$6 = 0.5f;
        float $$7 = bgj.b($$0, 0.9f, 1.0f);
        float $$8 = this.e == dlv.c ? 0.5f : $$4;
        float f2 = $$9 = this.e == dlv.c ? $$7 : $$5;
        if (this.g) {
            $$1.b($$2, $$3);
        }
        if ($$1 instanceof b) {
            b $$10 = (b)((Object)$$1);
            bcz2 = $$10.j($$2);
        } else {
            bcz2 = this.f.a();
        }
        bcz $$11 = bcz2;
        $$1.a($$11, $$8, $$9);
    }

    public boolean a(int $$0) {
        int $$2;
        int $$1 = this.a() - $$0;
        boolean $$3 = $$1 > ($$2 = (int)((float)this.a() * 0.21875f));
        return $$3 && $$0 % 4 == 0;
    }

    public static a b() {
        return new a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dob.class, "consumeSeconds;animation;sound;hasConsumeParticles;onConsumeEffects", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dob.class, "consumeSeconds;animation;sound;hasConsumeParticles;onConsumeEffects", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dob.class, "consumeSeconds;animation;sound;hasConsumeParticles;onConsumeEffects", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public float c() {
        return this.d;
    }

    public dlv d() {
        return this.e;
    }

    public jd<bcz> e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public List<dpp> g() {
        return this.h;
    }

    public static interface b {
        public bcz j(dlt var1);
    }

    public static class a {
        private float a = 1.6f;
        private dlv b = dlv.b;
        private jd<bcz> c = bda.lR;
        private boolean d = true;
        private final List<dpp> e = new ArrayList<dpp>();

        a() {
        }

        public a a(float $$0) {
            this.a = $$0;
            return this;
        }

        public a a(dlv $$0) {
            this.b = $$0;
            return this;
        }

        public a a(jd<bcz> $$0) {
            this.c = $$0;
            return this;
        }

        public a b(jd<bcz> $$0) {
            return this.a(new dpq($$0));
        }

        public a a(boolean $$0) {
            this.d = $$0;
            return this;
        }

        public a a(dpp $$0) {
            this.e.add($$0);
            return this;
        }

        public dob a() {
            return new dob(this.a, this.b, this.c, this.d, this.e);
        }
    }
}

