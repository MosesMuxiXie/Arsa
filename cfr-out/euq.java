/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class euq {
    private static final Logger a = LogUtils.getLogger();
    static final Predicate<eoh> b = $$0 -> !$$0.l();
    static final Predicate<eoh> c = eog.a::d;
    private final beq d;
    private final Predicate<eoh> e;
    private final eqf f;

    public euq(eqf $$0, a $$1) {
        this.e = $$1.e();
        this.f = $$0;
        int $$2 = bgj.f($$0.L_() + 1);
        this.d = new bgy($$2, 256);
    }

    public static void a(eqf $$0, Set<a> $$1) {
        if ($$1.isEmpty()) {
            return;
        }
        int $$2 = $$1.size();
        ObjectArrayList $$3 = new ObjectArrayList($$2);
        ObjectListIterator $$4 = $$3.iterator();
        int $$5 = $$0.b() + 16;
        is.a $$6 = new is.a();
        for (int $$7 = 0; $$7 < 16; ++$$7) {
            block1: for (int $$8 = 0; $$8 < 16; ++$$8) {
                for (a $$9 : $$1) {
                    $$3.add((Object)$$0.a($$9));
                }
                for (int $$10 = $$5 - 1; $$10 >= $$0.K_(); --$$10) {
                    $$6.d($$7, $$10, $$8);
                    eoh $$11 = $$0.a_($$6);
                    if ($$11.a(dzs.a)) continue;
                    while ($$4.hasNext()) {
                        euq $$12 = (euq)$$4.next();
                        if (!$$12.e.test($$11)) continue;
                        $$12.a($$7, $$8, $$10 + 1);
                        $$4.remove();
                    }
                    if ($$3.isEmpty()) continue block1;
                    $$4.back($$2);
                }
            }
        }
    }

    public boolean a(int $$0, int $$1, int $$2, eoh $$3) {
        int $$4 = this.a($$0, $$2);
        if ($$1 <= $$4 - 2) {
            return false;
        }
        if (this.e.test($$3)) {
            if ($$1 >= $$4) {
                this.a($$0, $$2, $$1 + 1);
                return true;
            }
        } else if ($$4 - 1 == $$1) {
            is.a $$5 = new is.a();
            for (int $$6 = $$1 - 1; $$6 >= this.f.K_(); --$$6) {
                $$5.d($$0, $$6, $$2);
                if (!this.e.test(this.f.a_($$5))) continue;
                this.a($$0, $$2, $$6 + 1);
                return true;
            }
            this.a($$0, $$2, this.f.K_());
            return true;
        }
        return false;
    }

    public int a(int $$0, int $$1) {
        return this.a(euq.c($$0, $$1));
    }

    public int b(int $$0, int $$1) {
        return this.a(euq.c($$0, $$1)) - 1;
    }

    private int a(int $$0) {
        return this.d.a($$0) + this.f.K_();
    }

    private void a(int $$0, int $$1, int $$2) {
        this.d.b(euq.c($$0, $$1), $$2 - this.f.K_());
    }

    public void a(eqf $$0, a $$1, long[] $$2) {
        long[] $$3 = this.d.a();
        if ($$3.length == $$2.length) {
            System.arraycopy($$2, 0, $$3, 0, $$2.length);
            return;
        }
        a.warn("Ignoring heightmap data for chunk {}, size does not match; expected: {}, got: {}", new Object[]{$$0.f(), $$3.length, $$2.length});
        euq.a($$0, EnumSet.of($$1));
    }

    public long[] a() {
        return this.d.a();
    }

    private static int c(int $$0, int $$1) {
        return $$0 + $$1 * 16;
    }

    public static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a(0, "WORLD_SURFACE_WG", euq$b.a, b);
        public static final /* enum */ a b = new a(1, "WORLD_SURFACE", euq$b.c, b);
        public static final /* enum */ a c = new a(2, "OCEAN_FLOOR_WG", euq$b.a, c);
        public static final /* enum */ a d = new a(3, "OCEAN_FLOOR", euq$b.b, c);
        public static final /* enum */ a e = new a(4, "MOTION_BLOCKING", euq$b.c, $$0 -> $$0.d() || !$$0.y().c());
        public static final /* enum */ a f = new a(5, "MOTION_BLOCKING_NO_LEAVES", euq$b.c, $$0 -> ($$0.d() || !$$0.y().c()) && !($$0.b() instanceof eei));
        public static final Codec<a> g;
        private static final IntFunction<a> i;
        public static final aao<ByteBuf, a> h;
        private final int j;
        private final String k;
        private final b l;
        private final Predicate<eoh> m;
        private static final /* synthetic */ a[] n;

        public static a[] values() {
            return (a[])n.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, String $$1, b $$2, Predicate<eoh> $$3) {
            this.j = $$0;
            this.k = $$1;
            this.l = $$2;
            this.m = $$3;
        }

        public String a() {
            return this.k;
        }

        public boolean b() {
            return this.l == euq$b.c;
        }

        public boolean d() {
            return this.l != euq$b.a;
        }

        public Predicate<eoh> e() {
            return this.m;
        }

        @Override
        public String c() {
            return this.k;
        }

        private static /* synthetic */ a[] f() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            n = euq$a.f();
            g = bhh.a(a::values);
            i = beu.a($$0 -> $$0.j, euq$a.values(), beu.a.a);
            h = aam.a(i, (T $$0) -> $$0.j);
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = euq$b.a();
        }
    }
}

