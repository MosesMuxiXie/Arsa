/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hhz
extends eqj {
    static final Logger a = LogUtils.getLogger();
    private final eqq b;
    private final fkq c;
    volatile a d;
    final hif e;

    public hhz(hif $$0, int $$1) {
        this.e = $$0;
        this.b = new eqm($$0, new dvu(0, 0), $$0.J_().f(mj.aS).b(dxv.b));
        this.c = new fkq(this, true, $$0.F_().e());
        this.d = new a(hhz.b($$1));
    }

    @Override
    public fkq r() {
        return this.c;
    }

    private static boolean a(@Nullable eqq $$0, int $$1, int $$2) {
        if ($$0 == null) {
            return false;
        }
        dvu $$3 = $$0.f();
        return $$3.h == $$1 && $$3.i == $$2;
    }

    public void a(dvu $$0) {
        if (!this.d.b($$0.h, $$0.i)) {
            return;
        }
        int $$1 = this.d.a($$0.h, $$0.i);
        eqq $$2 = this.d.a($$1);
        if (hhz.a($$2, $$0.h, $$0.i)) {
            this.d.b($$1, $$2);
        }
    }

    public @Nullable eqq b(int $$0, int $$1, erj $$2, boolean $$3) {
        eqq $$4;
        if (this.d.b($$0, $$1) && hhz.a($$4 = this.d.a(this.d.a($$0, $$1)), $$0, $$1)) {
            return $$4;
        }
        if ($$3) {
            return this.b;
        }
        return null;
    }

    @Override
    public dvt s() {
        return this.e;
    }

    public void a(int $$0, int $$1, wx $$2) {
        if (!this.d.b($$0, $$1)) {
            a.warn("Ignoring chunk since it's not in the view range: {}, {}", (Object)$$0, (Object)$$1);
            return;
        }
        int $$3 = this.d.a($$0, $$1);
        eqq $$4 = this.d.b.get($$3);
        if (!hhz.a($$4, $$0, $$1)) {
            a.warn("Ignoring chunk since it's not present: {}, {}", (Object)$$0, (Object)$$1);
        } else {
            $$4.a($$2);
        }
    }

    public @Nullable eqq a(int $$0, int $$1, wx $$2, Map<euq.a, long[]> $$3, Consumer<aeq.b> $$4) {
        if (!this.d.b($$0, $$1)) {
            a.warn("Ignoring chunk since it's not in the view range: {}, {}", (Object)$$0, (Object)$$1);
            return null;
        }
        int $$5 = this.d.a($$0, $$1);
        eqq $$6 = this.d.b.get($$5);
        dvu $$7 = new dvu($$0, $$1);
        if (!hhz.a($$6, $$0, $$1)) {
            $$6 = new eqq(this.e, $$7);
            $$6.a($$2, $$3, $$4);
            this.d.a($$5, $$6);
        } else {
            $$6.a($$2, $$3, $$4);
            this.d.c($$6);
        }
        this.e.a($$7);
        return $$6;
    }

    @Override
    public void a(BooleanSupplier $$0, boolean $$1) {
    }

    public void d(int $$0, int $$1) {
        this.d.f = $$0;
        this.d.g = $$1;
    }

    public void a(int $$0) {
        int $$1 = this.d.d;
        int $$2 = hhz.b($$0);
        if ($$1 != $$2) {
            a $$3 = new a($$2);
            $$3.f = this.d.f;
            $$3.g = this.d.g;
            for (int $$4 = 0; $$4 < this.d.b.length(); ++$$4) {
                eqq $$5 = this.d.b.get($$4);
                if ($$5 == null) continue;
                dvu $$6 = $$5.f();
                if (!$$3.b($$6.h, $$6.i)) continue;
                $$3.a($$3.a($$6.h, $$6.i), $$5);
            }
            this.d = $$3;
        }
    }

    private static int b(int $$0) {
        return Math.max(2, $$0) + 3;
    }

    @Override
    public String e() {
        return this.d.b.length() + ", " + this.j();
    }

    @Override
    public int j() {
        return this.d.h;
    }

    @Override
    public void a(dww $$0, jw $$1) {
        gfj.V().e.b($$1.a(), $$1.b(), $$1.c());
    }

    public LongOpenHashSet a() {
        return this.d.c;
    }

    @Override
    public void a(int $$0, int $$1, int $$2, boolean $$3) {
        this.d.a($$0, $$1, $$2, $$3);
    }

    @Override
    public /* synthetic */ @Nullable eqf a(int n2, int n3, erj erj2, boolean bl2) {
        return this.b(n2, n3, erj2, bl2);
    }

    final class a {
        final AtomicReferenceArray<@Nullable eqq> b;
        final LongOpenHashSet c = new LongOpenHashSet();
        final int d;
        private final int e;
        volatile int f;
        volatile int g;
        int h;

        a(int $$0) {
            this.d = $$0;
            this.e = $$0 * 2 + 1;
            this.b = new AtomicReferenceArray(this.e * this.e);
        }

        int a(int $$0, int $$1) {
            return Math.floorMod($$1, this.e) * this.e + Math.floorMod($$0, this.e);
        }

        void a(int $$0, @Nullable eqq $$1) {
            eqq $$2 = this.b.getAndSet($$0, $$1);
            if ($$2 != null) {
                --this.h;
                this.a($$2);
                hhz.this.e.a($$2);
            }
            if ($$1 != null) {
                ++this.h;
                this.b($$1);
            }
        }

        void b(int $$0, eqq $$1) {
            if (this.b.compareAndSet($$0, $$1, null)) {
                --this.h;
                this.a($$1);
            }
            hhz.this.e.a($$1);
        }

        public void a(int $$0, int $$1, int $$2, boolean $$3) {
            if (!this.b($$0, $$2)) {
                return;
            }
            long $$4 = jw.b($$0, $$1, $$2);
            if ($$3) {
                this.c.add($$4);
            } else if (this.c.remove($$4)) {
                hhz.this.e.b($$4);
            }
        }

        private void a(eqq $$0) {
            eqr[] $$1 = $$0.d();
            for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
                dvu $$3 = $$0.f();
                this.c.remove(jw.b($$3.h, $$0.h($$2), $$3.i));
            }
        }

        private void b(eqq $$0) {
            eqr[] $$1 = $$0.d();
            for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
                eqr $$3 = $$1[$$2];
                if (!$$3.c()) continue;
                dvu $$4 = $$0.f();
                this.c.add(jw.b($$4.h, $$0.h($$2), $$4.i));
            }
        }

        void c(eqq $$0) {
            dvu $$1 = $$0.f();
            eqr[] $$2 = $$0.d();
            for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
                eqr $$4 = $$2[$$3];
                long $$5 = jw.b($$1.h, $$0.h($$3), $$1.i);
                if ($$4.c()) {
                    this.c.add($$5);
                    continue;
                }
                if (!this.c.remove($$5)) continue;
                hhz.this.e.b($$5);
            }
        }

        boolean b(int $$0, int $$1) {
            return Math.abs($$0 - this.f) <= this.d && Math.abs($$1 - this.g) <= this.d;
        }

        protected @Nullable eqq a(int $$0) {
            return this.b.get($$0);
        }

        private void a(String $$0) {
            try (FileOutputStream $$1 = new FileOutputStream($$0);){
                int $$2 = hhz.this.d.d;
                for (int $$3 = this.g - $$2; $$3 <= this.g + $$2; ++$$3) {
                    for (int $$4 = this.f - $$2; $$4 <= this.f + $$2; ++$$4) {
                        eqq $$5 = hhz.this.d.b.get(hhz.this.d.a($$4, $$3));
                        if ($$5 == null) continue;
                        dvu $$6 = $$5.f();
                        $$1.write(($$6.h + "\t" + $$6.i + "\t" + $$5.F() + "\n").getBytes(StandardCharsets.UTF_8));
                    }
                }
            }
            catch (IOException $$7) {
                a.error("Failed to dump chunks to file {}", (Object)$$0, (Object)$$7);
            }
        }
    }
}

