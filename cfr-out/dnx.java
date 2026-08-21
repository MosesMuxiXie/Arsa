/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public final class dnx
extends Record {
    private final float c;
    private final float d;
    private final List<a> e;
    private final b f;
    private final Optional<bef<cez>> g;
    private final Optional<jd<bcz>> h;
    private final Optional<jd<bcz>> i;
    public static final Codec<dnx> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.u.optionalFieldOf("block_delay_seconds", (Object)Float.valueOf(0.0f)).forGetter(dnx::b), (App)bfm.u.optionalFieldOf("disable_cooldown_scale", (Object)Float.valueOf(1.0f)).forGetter(dnx::c), (App)dnx$a.a.listOf().optionalFieldOf("damage_reductions", List.of(new a(90.0f, Optional.empty(), 0.0f, 1.0f))).forGetter(dnx::d), (App)dnx$b.a.optionalFieldOf("item_damage", (Object)dnx$b.c).forGetter(dnx::e), (App)bef.b(mj.ba).optionalFieldOf("bypassed_by").forGetter(dnx::f), (App)bcz.b.optionalFieldOf("block_sound").forGetter(dnx::g), (App)bcz.b.optionalFieldOf("disabled_sound").forGetter(dnx::h)).apply((Applicative)$$0, dnx::new));
    public static final aao<xq, dnx> b = aao.a(aam.l, dnx::b, aam.l, dnx::c, dnx$a.b.a(aam.a()), dnx::d, dnx$b.b, dnx::e, bef.c(mj.ba).a(aam::a), dnx::f, bcz.d.a(aam::a), dnx::g, bcz.d.a(aam::a), dnx::h, dnx::new);

    public dnx(float $$0, float $$1, List<a> $$2, b $$3, Optional<bef<cez>> $$4, Optional<jd<bcz>> $$5, Optional<jd<bcz>> $$6) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
    }

    public void a(axf $$0, chl $$1) {
        this.h.ifPresent($$2 -> $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), (jd<bcz>)$$2, $$1.dB(), 1.0f, 0.8f + $$0.y.i() * 0.4f));
    }

    public void a(axf $$0, chl $$1, float $$22, dlt $$3) {
        int $$4 = this.a($$22);
        if ($$4 > 0) {
            if ($$1 instanceof ddm) {
                ddm $$5 = (ddm)$$1;
                $$5.hh().a($$3, $$4);
            }
            $$1.gf();
            this.i.ifPresent($$2 -> $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), (jd<bcz>)$$2, $$1.dB(), 0.8f, 0.8f + $$0.y.i() * 0.4f));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void a(dwo $$0, dlt $$1, chl $$2, cdb $$3, float $$4) {
        int $$7;
        if (!($$2 instanceof ddm)) {
            return;
        }
        ddm $$5 = (ddm)$$2;
        if (!$$0.B_()) {
            void $$6;
            $$6.b(bdk.c.b($$1.h()));
        }
        if (($$7 = this.f.a($$4)) > 0) {
            $$1.a($$7, $$2, $$3.a());
        }
    }

    private int a(float $$0) {
        float $$1 = $$0 * this.d;
        if ($$1 > 0.0f) {
            return Math.round($$1 * 20.0f);
        }
        return 0;
    }

    public int a() {
        return Math.round(this.c * 20.0f);
    }

    public float a(cex $$0, float $$1, double $$2) {
        float $$3 = 0.0f;
        for (a $$4 : this.e) {
            $$3 += $$4.a($$0, $$1, $$2);
        }
        return bgj.a($$3, 0.0f, $$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dnx.class, "blockDelaySeconds;disableCooldownScale;damageReductions;itemDamage;bypassedBy;blockSound;disableSound", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dnx.class, "blockDelaySeconds;disableCooldownScale;damageReductions;itemDamage;bypassedBy;blockSound;disableSound", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dnx.class, "blockDelaySeconds;disableCooldownScale;damageReductions;itemDamage;bypassedBy;blockSound;disableSound", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public List<a> d() {
        return this.e;
    }

    public b e() {
        return this.f;
    }

    public Optional<bef<cez>> f() {
        return this.g;
    }

    public Optional<jd<bcz>> g() {
        return this.h;
    }

    public Optional<jd<bcz>> h() {
        return this.i;
    }

    public static final class b
    extends Record {
        private final float d;
        private final float e;
        private final float f;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.u.fieldOf("threshold").forGetter(b::a), (App)Codec.FLOAT.fieldOf("base").forGetter(b::b), (App)Codec.FLOAT.fieldOf("factor").forGetter(b::c)).apply((Applicative)$$0, b::new));
        public static final aao<ByteBuf, b> b = aao.a(aam.l, b::a, aam.l, b::b, aam.l, b::c, b::new);
        public static final b c = new b(1.0f, 0.0f, 1.0f);

        public b(float $$0, float $$1, float $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        public int a(float $$0) {
            if ($$0 < this.d) {
                return 0;
            }
            return bgj.b(this.e + this.f * $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "threshold;base;factor", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "threshold;base;factor", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "threshold;base;factor", "d", "e", "f"}, this, $$0);
        }

        public float a() {
            return this.d;
        }

        public float b() {
            return this.e;
        }

        public float c() {
            return this.f;
        }
    }

    public static final class a
    extends Record {
        private final float c;
        private final Optional<jh<cez>> d;
        private final float e;
        private final float f;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.v.optionalFieldOf("horizontal_blocking_angle", (Object)Float.valueOf(90.0f)).forGetter(a::a), (App)js.a(mj.ba).optionalFieldOf("type").forGetter(a::b), (App)Codec.FLOAT.fieldOf("base").forGetter(a::c), (App)Codec.FLOAT.fieldOf("factor").forGetter(a::d)).apply((Applicative)$$0, a::new));
        public static final aao<xq, a> b = aao.a(aam.l, a::a, aam.c(mj.ba).a(aam::a), a::b, aam.l, a::c, aam.l, a::d, a::new);

        public a(float $$0, Optional<jh<cez>> $$1, float $$2, float $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        public float a(cex $$0, float $$1, double $$2) {
            if ($$2 > (double)((float)Math.PI / 180 * this.c)) {
                return 0.0f;
            }
            if (this.d.isPresent() && !this.d.get().a($$0.l())) {
                return 0.0f;
            }
            return bgj.a(this.e + this.f * $$1, 0.0f, $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "horizontalBlockingAngle;type;base;factor", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "horizontalBlockingAngle;type;base;factor", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "horizontalBlockingAngle;type;base;factor", "c", "d", "e", "f"}, this, $$0);
        }

        public float a() {
            return this.c;
        }

        public Optional<jh<cez>> b() {
            return this.d;
        }

        public float c() {
            return this.e;
        }

        public float d() {
            return this.f;
        }
    }
}

