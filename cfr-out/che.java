/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class che
extends cgk
implements cgb,
cij {
    private static final alw<Float> a = ama.a(che.class, aly.d);
    private static final alw<Float> b = ama.a(che.class, aly.d);
    private static final alw<Boolean> c = ama.a(che.class, aly.k);
    private static final String d = "width";
    private static final String e = "height";
    private static final String f = "attack";
    private static final String g = "interaction";
    private static final String h = "response";
    private static final float i = 1.0f;
    private static final float j = 1.0f;
    private static final boolean k = false;
    private @Nullable a l;
    private @Nullable a m;

    public che(cgu<?> $$0, dwo $$1) {
        super($$0, $$1);
        this.ar = true;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(a, Float.valueOf(1.0f));
        $$0.a(b, Float.valueOf(1.0f));
        $$0.a(c, false);
    }

    @Override
    protected void a(fnq $$0) {
        this.a($$0.a(d, 1.0f));
        this.b($$0.a(e, 1.0f));
        this.l = $$0.a(f, che$a.a).orElse(null);
        this.m = $$0.a(g, che$a.a).orElse(null);
        this.a($$0.a(h, false));
        this.a(this.aG());
    }

    @Override
    protected void a(fns $$0) {
        $$0.a(d, this.f());
        $$0.a(e, this.i());
        $$0.b(f, che$a.a, this.l);
        $$0.b(g, che$a.a, this.m);
        $$0.a(h, this.k());
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (b.equals($$0) || a.equals($$0)) {
            this.j_();
        }
    }

    @Override
    public boolean bW() {
        return false;
    }

    @Override
    public boolean bX() {
        return true;
    }

    @Override
    public flg n_() {
        return flg.d;
    }

    @Override
    public boolean m_() {
        return true;
    }

    @Override
    public boolean w(cgk $$0) {
        if ($$0 instanceof ddm) {
            ddm $$1 = (ddm)$$0;
            this.l = new a($$1.cY(), this.ao().au());
            if ($$1 instanceof axg) {
                axg $$2 = (axg)$$1;
                aj.h.a($$2, this, $$1.en().p(), 1.0f, 1.0f, false);
            }
            return !this.k();
        }
        return false;
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        if (this.ao().B_()) {
            return this.k() ? cdc.a : cdc.c;
        }
        this.m = new a($$0.cY(), this.ao().au());
        return cdc.c;
    }

    @Override
    public void g() {
    }

    @Override
    public @Nullable chl f_() {
        if (this.l != null) {
            return this.ao().c(this.l.a());
        }
        return null;
    }

    @Override
    public @Nullable chl ag_() {
        if (this.m != null) {
            return this.ao().c(this.m.a());
        }
        return null;
    }

    private void a(float $$0) {
        this.az.a(a, Float.valueOf($$0));
    }

    private float f() {
        return this.az.a(a).floatValue();
    }

    private void b(float $$0) {
        this.az.a(b, Float.valueOf($$0));
    }

    private float i() {
        return this.az.a(b).floatValue();
    }

    private void a(boolean $$0) {
        this.az.a(c, $$0);
    }

    private boolean k() {
        return this.az.a(c);
    }

    private cgn m() {
        return cgn.b(this.f(), this.i());
    }

    @Override
    public cgn a(chx $$0) {
        return this.m();
    }

    @Override
    protected fth c(ftm $$0) {
        return this.m().a($$0);
    }

    static final class a
    extends Record {
        private final UUID b;
        private final long c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)jx.a.fieldOf("player").forGetter(a::a), (App)Codec.LONG.fieldOf("timestamp").forGetter(a::b)).apply((Applicative)$$0, a::new));

        a(UUID $$0, long $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;timestamp", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;timestamp", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;timestamp", "b", "c"}, this, $$0);
        }

        public UUID a() {
            return this.b;
        }

        public long b() {
            return this.c;
        }
    }
}

