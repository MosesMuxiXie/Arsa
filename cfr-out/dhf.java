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

public final class dhf
extends Record
implements doc {
    private final int c;
    private final float d;
    private final boolean e;
    public static final Codec<dhf> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.fieldOf("nutrition").forGetter(dhf::a), (App)Codec.FLOAT.fieldOf("saturation").forGetter(dhf::b), (App)Codec.BOOL.optionalFieldOf("can_always_eat", (Object)false).forGetter(dhf::c)).apply((Applicative)$$0, dhf::new));
    public static final aao<xq, dhf> b = aao.a(aam.h, dhf::a, aam.l, dhf::b, aam.b, dhf::c, dhf::new);

    public dhf(int $$0, float $$1, boolean $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public void a(dwo $$0, chl $$1, dlt $$2, dob $$3) {
        bgr $$4 = $$1.ep();
        $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), $$3.e().a(), bdb.g, 1.0f, $$4.a(1.0f, 0.4f));
        if ($$1 instanceof ddm) {
            ddm $$5 = (ddm)$$1;
            $$5.gW().a(this);
            $$0.a(null, $$5.dP(), $$5.dR(), $$5.dV(), bda.wV, bdb.h, 0.5f, bgj.b($$4, 0.9f, 1.0f));
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dhf.class, "nutrition;saturation;canAlwaysEat", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dhf.class, "nutrition;saturation;canAlwaysEat", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dhf.class, "nutrition;saturation;canAlwaysEat", "c", "d", "e"}, this, $$0);
    }

    public int a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public static class a {
        private int a;
        private float b;
        private boolean c;

        public a a(int $$0) {
            this.a = $$0;
            return this;
        }

        public a a(float $$0) {
            this.b = $$0;
            return this;
        }

        public a a() {
            this.c = true;
            return this;
        }

        public dhf b() {
            float $$0 = dhd.a(this.a, this.b);
            return new dhf(this.a, $$0, this.c);
        }
    }
}

