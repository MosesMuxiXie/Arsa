/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class hiy {
    private static final yh a = yh.c("chat.validation_error").a(l.m, l.u);
    private final gfj b;
    private final Deque<a> c = Queues.newArrayDeque();
    private long d;
    private long e;

    public hiy(gfj $$0) {
        this.b = $$0;
    }

    public void a() {
        if (this.b.an()) {
            if (this.d > 0L) {
                this.e += 50L;
            }
            return;
        }
        if (this.d == 0L) {
            if (!this.c.isEmpty()) {
                this.d();
            }
        } else if (bhs.c() >= this.e + this.d) {
            a $$0;
            while (($$0 = this.c.poll()) != null && !$$0.a()) {
            }
        }
    }

    public void a(double $$0) {
        long $$1 = (long)($$0 * 1000.0);
        if ($$1 == 0L && this.d > 0L && !this.b.an()) {
            this.d();
        }
        this.d = $$1;
    }

    public void b() {
        this.c.remove().a();
    }

    public long c() {
        return this.c.size();
    }

    public void d() {
        this.c.forEach(a::a);
        this.c.clear();
        this.e = 0L;
    }

    public boolean a(yu $$0) {
        return this.c.removeIf($$1 -> $$0.equals($$1.b()));
    }

    private boolean e() {
        return this.d > 0L && bhs.c() < this.e + this.d;
    }

    private void a(@Nullable yu $$0, BooleanSupplier $$1) {
        if (this.e()) {
            this.c.add(new a($$0, $$1));
        } else {
            $$1.getAsBoolean();
        }
    }

    public void a(yy $$0, GameProfile $$1, yd.a $$2) {
        boolean $$3 = this.b.k.ax().b();
        yy $$4 = $$3 ? $$0.a() : $$0;
        yh $$5 = $$2.a($$4.d());
        Instant $$6 = Instant.now();
        this.a($$0.l(), () -> {
            boolean $$6 = this.a($$2, $$0, $$5, $$1, $$3, $$6);
            hig $$7 = this.b.R();
            if ($$7 != null && $$0.l() != null) {
                $$7.a($$0.l(), $$6);
            }
            return $$6;
        });
    }

    public void a(UUID $$0, @Nullable yu $$1, yd.a $$2) {
        this.a(null, () -> {
            hig $$3 = this.b.R();
            if ($$3 != null && $$1 != null) {
                $$3.a($$1, false);
            }
            if (this.b.a($$0)) {
                return false;
            }
            yh $$4 = $$2.a(a);
            this.b.j.e().a($$4, null, gfd.d());
            this.b.aZ().b($$2.b(a));
            this.e = bhs.c();
            return true;
        });
    }

    public void a(yh $$0, yd.a $$1) {
        Instant $$2 = Instant.now();
        this.a(null, () -> {
            yh $$3 = $$1.a($$0);
            this.b.j.e().a($$3);
            this.a($$1, $$0);
            this.a($$3, $$2);
            this.e = bhs.c();
            return true;
        });
    }

    private boolean a(yd.a $$0, yy $$1, yh $$2, GameProfile $$3, boolean $$4, Instant $$5) {
        hja $$6 = this.a($$1, $$2, $$5);
        if ($$4 && $$6.a()) {
            return false;
        }
        if (this.b.a($$1.g()) || $$1.j()) {
            return false;
        }
        gfd $$7 = $$6.a($$1);
        yu $$8 = $$1.l();
        yl $$9 = $$1.o();
        if ($$9.a()) {
            this.b.j.e().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
        } else {
            yh $$10 = $$9.b($$1.c());
            if ($$10 != null) {
                this.b.j.e().a($$0.a($$10), $$8, $$7);
                this.a($$0, $$10);
            }
        }
        this.a($$1, $$3, $$6);
        this.e = bhs.c();
        return true;
    }

    private void a(yd.a $$0, yh $$1) {
        this.b.aZ().a($$0.b($$1));
    }

    private hja a(yy $$0, yh $$1, Instant $$2) {
        if (this.a($$0.g())) {
            return hja.a;
        }
        return hja.a($$0, $$1, $$2);
    }

    private void a(yy $$0, GameProfile $$1, hja $$2) {
        hiz $$3 = this.b.bb().b();
        $$3.a(hjc.a($$1, $$0, $$2));
    }

    private void a(yh $$0, Instant $$1) {
        hiz $$2 = this.b.bb().b();
        $$2.a(hjc.a($$0, $$1));
    }

    public void a(yh $$0, boolean $$1) {
        if (this.b.k.av().b().booleanValue() && this.b.a(this.a($$0))) {
            return;
        }
        if ($$1) {
            this.b.j.a($$0, false);
            this.b.aZ().c($$0);
        } else {
            this.b.j.e().a($$0);
            this.a($$0, Instant.now());
            this.b.aZ().b($$0);
        }
    }

    private UUID a(yh $$0) {
        String $$1 = bhg.a($$0);
        String $$2 = StringUtils.substringBetween((String)$$1, (String)"<", (String)">");
        if ($$2 == null) {
            return bhs.e;
        }
        return this.b.aQ().a($$2);
    }

    private boolean a(UUID $$0) {
        if (this.b.Y() && this.b.s != null) {
            UUID $$1 = this.b.s.gI().id();
            return $$1.equals($$0);
        }
        return false;
    }

    record a(@Nullable yu a, BooleanSupplier b) {
        private final @Nullable yu a;
        private final BooleanSupplier b;

        public boolean a() {
            return this.b.getAsBoolean();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "signature;handler", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "signature;handler", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "signature;handler", "a", "b"}, this, $$0);
        }

        public @Nullable yu b() {
            return this.a;
        }

        public BooleanSupplier c() {
            return this.b;
        }
    }
}

