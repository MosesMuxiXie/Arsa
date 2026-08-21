/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ComparisonChain;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cfm
implements Comparable<cfm> {
    private static final Logger f = LogUtils.getLogger();
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 255;
    public static final Codec<cfm> d = RecordCodecBuilder.create($$0 -> $$0.group((App)cfk.a.fieldOf("id").forGetter(cfm::c), (App)cfm$b.a.forGetter(cfm::l)).apply((Applicative)$$0, cfm::new));
    public static final aao<xq, cfm> e = aao.a(cfk.b, cfm::c, cfm$b.b, cfm::l, cfm::new);
    private final jd<cfk> g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private @Nullable cfm m;
    private final a n = new a();

    public cfm(jd<cfk> $$0) {
        this($$0, 0, 0);
    }

    public cfm(jd<cfk> $$0, int $$1) {
        this($$0, $$1, 0);
    }

    public cfm(jd<cfk> $$0, int $$1, int $$2) {
        this($$0, $$1, $$2, false, true);
    }

    public cfm(jd<cfk> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
        this($$0, $$1, $$2, $$3, $$4, $$4);
    }

    public cfm(jd<cfk> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
        this($$0, $$1, $$2, $$3, $$4, $$5, null);
    }

    public cfm(jd<cfk> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable cfm $$6) {
        this.g = $$0;
        this.h = $$1;
        this.i = bgj.a($$2, 0, 255);
        this.j = $$3;
        this.k = $$4;
        this.l = $$5;
        this.m = $$6;
    }

    public cfm(cfm $$0) {
        this.g = $$0.g;
        this.a($$0);
    }

    private cfm(jd<cfk> $$0, b $$12) {
        this($$0, $$12.b(), $$12.a(), $$12.c(), $$12.d(), $$12.e(), $$12.f().map($$1 -> new cfm($$0, (b)$$1)).orElse(null));
    }

    private b l() {
        return new b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(cfm::l));
    }

    public float a(chl $$0, float $$1) {
        return this.n.a($$0, $$1);
    }

    public lw a() {
        return this.g.a().a(this);
    }

    void a(cfm $$0) {
        this.h = $$0.h;
        this.i = $$0.i;
        this.j = $$0.j;
        this.k = $$0.k;
        this.l = $$0.l;
    }

    public boolean b(cfm $$0) {
        if (!this.g.equals($$0.g)) {
            f.warn("This method should only be called for matching effects!");
        }
        boolean $$1 = false;
        if ($$0.i > this.i) {
            if ($$0.e(this)) {
                cfm $$2 = this.m;
                this.m = new cfm(this);
                this.m.m = $$2;
            }
            this.i = $$0.i;
            this.h = $$0.h;
            $$1 = true;
        } else if (this.e($$0)) {
            if ($$0.i == this.i) {
                this.h = $$0.h;
                $$1 = true;
            } else if (this.m == null) {
                this.m = new cfm($$0);
            } else {
                this.m.b($$0);
            }
        }
        if (!$$0.j && this.j || $$1) {
            this.j = $$0.j;
            $$1 = true;
        }
        if ($$0.k != this.k) {
            this.k = $$0.k;
            $$1 = true;
        }
        if ($$0.l != this.l) {
            this.l = $$0.l;
            $$1 = true;
        }
        return $$1;
    }

    private boolean e(cfm $$0) {
        return !this.b() && (this.h < $$0.h || $$0.b());
    }

    public boolean b() {
        return this.h == -1;
    }

    public boolean a(int $$0) {
        return !this.b() && this.h <= $$0;
    }

    public cfm a(float $$0) {
        cfm $$12 = new cfm(this);
        $$12.h = $$12.a($$1 -> Math.max(bgj.b((float)$$1 * $$0), 1));
        return $$12;
    }

    public int a(Int2IntFunction $$0) {
        if (this.b() || this.h == 0) {
            return this.h;
        }
        return $$0.applyAsInt(this.h);
    }

    public jd<cfk> c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public boolean f() {
        return this.j;
    }

    public boolean g() {
        return this.k;
    }

    public boolean h() {
        return this.l;
    }

    public boolean a(axf $$0, chl $$1, Runnable $$2) {
        int $$3;
        if (!this.m()) {
            return false;
        }
        int n2 = $$3 = this.b() ? $$1.at : this.h;
        if (this.g.a().a($$3, this.i) && !this.g.a().a($$0, $$1, this.i)) {
            return false;
        }
        this.n();
        if (this.o()) {
            $$2.run();
        }
        return this.m();
    }

    public void i() {
        if (this.m()) {
            this.n();
            this.o();
        }
        this.n.b(this);
    }

    private boolean m() {
        return this.b() || this.h > 0;
    }

    private void n() {
        if (this.m != null) {
            this.m.n();
        }
        this.h = this.a($$0 -> $$0 - 1);
    }

    private boolean o() {
        if (this.h == 0 && this.m != null) {
            this.a(this.m);
            this.m = this.m.m;
            return true;
        }
        return false;
    }

    public void a(chl $$0) {
        this.g.a().a($$0, this.i);
    }

    public void a(axf $$0, chl $$1, cgk.e $$2) {
        this.g.a().a($$0, $$1, this.i, $$2);
    }

    public void a(axf $$0, chl $$1, cex $$2, float $$3) {
        this.g.a().a($$0, $$1, this.i, $$2, $$3);
    }

    public String j() {
        return this.g.a().f();
    }

    public String toString() {
        String $$1;
        if (this.i > 0) {
            String $$0 = this.j() + " x " + (this.i + 1) + ", Duration: " + this.p();
        } else {
            $$1 = this.j() + ", Duration: " + this.p();
        }
        if (!this.k) {
            $$1 = $$1 + ", Particles: false";
        }
        if (!this.l) {
            $$1 = $$1 + ", Show Icon: false";
        }
        return $$1;
    }

    private String p() {
        if (this.b()) {
            return "infinite";
        }
        return Integer.toString(this.h);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof cfm) {
            cfm $$1 = (cfm)$$0;
            return this.h == $$1.h && this.i == $$1.i && this.j == $$1.j && this.k == $$1.k && this.l == $$1.l && this.g.equals($$1.g);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.g.hashCode();
        $$0 = 31 * $$0 + this.h;
        $$0 = 31 * $$0 + this.i;
        $$0 = 31 * $$0 + (this.j ? 1 : 0);
        $$0 = 31 * $$0 + (this.k ? 1 : 0);
        $$0 = 31 * $$0 + (this.l ? 1 : 0);
        return $$0;
    }

    public int c(cfm $$0) {
        int $$1 = 32147;
        if (this.d() > 32147 && $$0.d() > 32147 || this.f() && $$0.f()) {
            return ComparisonChain.start().compare(Boolean.valueOf(this.f()), Boolean.valueOf($$0.f())).compare(this.c().a().i(), $$0.c().a().i()).result();
        }
        return ComparisonChain.start().compareFalseFirst(this.f(), $$0.f()).compareFalseFirst(this.b(), $$0.b()).compare(this.d(), $$0.d()).compare(this.c().a().i(), $$0.c().a().i()).result();
    }

    public void b(chl $$0) {
        this.g.a().b($$0, this.i);
    }

    public boolean a(jd<cfk> $$0) {
        return this.g.equals($$0);
    }

    public void d(cfm $$0) {
        this.n.a($$0.n);
    }

    public void k() {
        this.n.a(this);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((cfm)object);
    }

    static class a {
        private float a;
        private float b;

        a() {
        }

        public void a(cfm $$0) {
            this.b = this.a = cfm$a.c($$0) ? 1.0f : 0.0f;
        }

        public void a(a $$0) {
            this.a = $$0.a;
            this.b = $$0.b;
        }

        public void b(cfm $$0) {
            int $$4;
            float $$2;
            this.b = this.a;
            boolean $$1 = cfm$a.c($$0);
            float f2 = $$2 = $$1 ? 1.0f : 0.0f;
            if (this.a == $$2) {
                return;
            }
            cfk $$3 = $$0.c().a();
            int n2 = $$4 = $$1 ? $$3.b() : $$3.c();
            if ($$4 == 0) {
                this.a = $$2;
            } else {
                float $$5 = 1.0f / (float)$$4;
                this.a += bgj.a($$2 - this.a, -$$5, $$5);
            }
        }

        private static boolean c(cfm $$0) {
            return !$$0.a($$0.c().a().d());
        }

        public float a(chl $$0, float $$1) {
            if ($$0.eh()) {
                this.b = this.a;
            }
            return bgj.h($$1, this.b, this.a);
        }
    }

    static final class b
    extends Record {
        private final int c;
        private final int d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        private final Optional<b> h;
        public static final MapCodec<b> a = MapCodec.recursive((String)"MobEffectInstance.Details", $$0 -> RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)bfm.p.optionalFieldOf("amplifier", (Object)0).forGetter(b::a), (App)Codec.INT.optionalFieldOf("duration", (Object)0).forGetter(b::b), (App)Codec.BOOL.optionalFieldOf("ambient", (Object)false).forGetter(b::c), (App)Codec.BOOL.optionalFieldOf("show_particles", (Object)true).forGetter(b::d), (App)Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0 -> Optional.of($$0.e())), (App)$$0.optionalFieldOf("hidden_effect").forGetter(b::f)).apply((Applicative)$$1, b::a)));
        public static final aao<ByteBuf, b> b = aao.a($$0 -> aao.a(aam.h, b::a, aam.h, b::b, aam.b, b::c, aam.b, b::d, aam.b, b::e, $$0.a(aam::a), b::f, b::new));

        b(int $$0, int $$1, boolean $$2, boolean $$3, boolean $$4, Optional<b> $$5) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
        }

        private static b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<b> $$5) {
            return new b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "amplifier;duration;ambient;showParticles;showIcon;hiddenEffect", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "amplifier;duration;ambient;showParticles;showIcon;hiddenEffect", "c", "d", "e", "f", "g", "h"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "amplifier;duration;ambient;showParticles;showIcon;hiddenEffect", "c", "d", "e", "f", "g", "h"}, this, $$0);
        }

        public int a() {
            return this.c;
        }

        public int b() {
            return this.d;
        }

        public boolean c() {
            return this.e;
        }

        public boolean d() {
            return this.f;
        }

        public boolean e() {
            return this.g;
        }

        public Optional<b> f() {
            return this.h;
        }
    }
}

