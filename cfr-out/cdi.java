/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class cdi
extends fmn {
    public static final Codec<cdi> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.INT.fieldOf("salt").forGetter(cdi::b), (App)Codec.BOOL.optionalFieldOf("include_world_seed", (Object)true).forGetter(cdi::c), (App)Codec.BOOL.optionalFieldOf("include_sequence_id", (Object)true).forGetter(cdi::d), (App)Codec.unboundedMap(amo.a, cdh.a).fieldOf("sequences").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, cdi::new));
    public static final fmo<cdi> b = new fmo<cdi>("random_sequences", cdi::new, a, bhz.n);
    private int c;
    private boolean d = true;
    private boolean e = true;
    private final Map<amo, cdh> f = new Object2ObjectOpenHashMap();

    public cdi() {
    }

    private cdi(int $$0, boolean $$1, boolean $$2, Map<amo, cdh> $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f.putAll($$3);
    }

    public bgr a(amo $$0, long $$12) {
        bgr $$2 = this.f.computeIfAbsent($$0, $$1 -> this.c((amo)$$1, $$12)).a();
        return new a($$2);
    }

    private cdh c(amo $$0, long $$1) {
        return this.b($$0, $$1, this.c, this.d, this.e);
    }

    private cdh b(amo $$0, long $$1, int $$2, boolean $$3, boolean $$4) {
        long $$5 = ($$3 ? $$1 : 0L) ^ (long)$$2;
        return new cdh($$5, $$4 ? Optional.of($$0) : Optional.empty());
    }

    public void a(BiConsumer<amo, cdh> $$0) {
        this.f.forEach($$0);
    }

    public void a(int $$0, boolean $$1, boolean $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public int a() {
        int $$0 = this.f.size();
        this.f.clear();
        return $$0;
    }

    public void b(amo $$0, long $$1) {
        this.f.put($$0, this.c($$0, $$1));
    }

    public void a(amo $$0, long $$1, int $$2, boolean $$3, boolean $$4) {
        this.f.put($$0, this.b($$0, $$1, $$2, $$3, $$4));
    }

    private int b() {
        return this.c;
    }

    private boolean c() {
        return this.d;
    }

    private boolean d() {
        return this.e;
    }

    class a
    implements bgr {
        private final bgr c;

        a(bgr $$0) {
            this.c = $$0;
        }

        @Override
        public bgr d() {
            cdi.this.u();
            return this.c.d();
        }

        @Override
        public evd e() {
            cdi.this.u();
            return this.c.e();
        }

        @Override
        public void b(long $$0) {
            cdi.this.u();
            this.c.b($$0);
        }

        @Override
        public int f() {
            cdi.this.u();
            return this.c.f();
        }

        @Override
        public int a(int $$0) {
            cdi.this.u();
            return this.c.a($$0);
        }

        @Override
        public long g() {
            cdi.this.u();
            return this.c.g();
        }

        @Override
        public boolean h() {
            cdi.this.u();
            return this.c.h();
        }

        @Override
        public float i() {
            cdi.this.u();
            return this.c.i();
        }

        @Override
        public double j() {
            cdi.this.u();
            return this.c.j();
        }

        @Override
        public double k() {
            cdi.this.u();
            return this.c.k();
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 instanceof a) {
                a $$1 = (a)$$0;
                return this.c.equals($$1.c);
            }
            return false;
        }
    }
}

