/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fmw
extends fmn {
    private static final Logger j = LogUtils.getLogger();
    private static final int k = 128;
    private static final int l = 64;
    public static final int a = 4;
    public static final int b = 256;
    private static final String m = "frame-";
    public static final Codec<fmw> c = RecordCodecBuilder.create($$02 -> $$02.group((App)dwo.g.fieldOf("dimension").forGetter($$0 -> $$0.f), (App)Codec.INT.fieldOf("xCenter").forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("zCenter").forGetter($$0 -> $$0.e), (App)Codec.BYTE.optionalFieldOf("scale", (Object)0).forGetter($$0 -> $$0.g), (App)Codec.BYTE_BUFFER.fieldOf("colors").forGetter($$0 -> ByteBuffer.wrap($$0.h)), (App)Codec.BOOL.optionalFieldOf("trackingPosition", (Object)true).forGetter($$0 -> $$0.n), (App)Codec.BOOL.optionalFieldOf("unlimitedTracking", (Object)false).forGetter($$0 -> $$0.o), (App)Codec.BOOL.optionalFieldOf("locked", (Object)false).forGetter($$0 -> $$0.i), (App)fmp.a.listOf().optionalFieldOf("banners", List.of()).forGetter($$0 -> List.copyOf($$0.r.values())), (App)fmt.a.listOf().optionalFieldOf("frames", List.of()).forGetter($$0 -> List.copyOf($$0.t.values()))).apply((Applicative)$$02, fmw::new));
    public final int d;
    public final int e;
    public final amt<dwo> f;
    private final boolean n;
    private final boolean o;
    public final byte g;
    public byte[] h = new byte[16384];
    public final boolean i;
    private final List<a> p = Lists.newArrayList();
    private final Map<ddm, a> q = Maps.newHashMap();
    private final Map<String, fmp> r = Maps.newHashMap();
    final Map<String, fmq> s = Maps.newLinkedHashMap();
    private final Map<String, fmt> t = Maps.newHashMap();
    private int u;

    public static fmo<fmw> a(fmu $$0) {
        return new fmo<fmw>($$0.a(), () -> {
            throw new IllegalStateException("Should never create an empty map saved data");
        }, c, bhz.k);
    }

    private fmw(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, amt<dwo> $$6) {
        this.g = $$2;
        this.d = $$0;
        this.e = $$1;
        this.f = $$6;
        this.n = $$3;
        this.o = $$4;
        this.i = $$5;
    }

    private fmw(amt<dwo> $$0, int $$1, int $$2, byte $$3, ByteBuffer $$4, boolean $$5, boolean $$6, boolean $$7, List<fmp> $$8, List<fmt> $$9) {
        this($$1, $$2, (byte)bgj.a((int)$$3, 0, 4), $$5, $$6, $$7, $$0);
        if ($$4.array().length == 16384) {
            this.h = $$4.array();
        }
        for (fmp $$10 : $$8) {
            this.r.put($$10.b(), $$10);
            this.a($$10.a(), null, $$10.b(), $$10.c().u(), $$10.c().w(), 180.0, $$10.e().orElse(null));
        }
        for (fmt $$11 : $$9) {
            this.t.put($$11.a(), $$11);
            this.a(fms.b, null, fmw.b($$11.d()), $$11.b().u(), $$11.b().w(), $$11.c(), null);
        }
    }

    public static fmw a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, amt<dwo> $$5) {
        int $$6 = 128 * (1 << $$2);
        int $$7 = bgj.c(($$0 + 64.0) / (double)$$6);
        int $$8 = bgj.c(($$1 + 64.0) / (double)$$6);
        int $$9 = $$7 * $$6 + $$6 / 2 - 64;
        int $$10 = $$8 * $$6 + $$6 / 2 - 64;
        return new fmw($$9, $$10, $$2, $$3, $$4, false, $$5);
    }

    public static fmw a(byte $$0, boolean $$1, amt<dwo> $$2) {
        return new fmw(0, 0, $$0, false, false, $$1, $$2);
    }

    public fmw b() {
        fmw $$0 = new fmw(this.d, this.e, this.g, this.n, this.o, true, this.f);
        $$0.r.putAll(this.r);
        $$0.s.putAll(this.s);
        $$0.u = this.u;
        System.arraycopy(this.h, 0, $$0.h, 0, this.h.length);
        return $$0;
    }

    public fmw c() {
        return fmw.a(this.d, this.e, (byte)bgj.a(this.g + 1, 0, 4), this.n, this.o, this.f);
    }

    private static Predicate<dlt> a(dlt $$0) {
        fmu $$1 = $$0.a(ki.T);
        return $$2 -> {
            if ($$2 == $$0) {
                return true;
            }
            return $$2.a($$0.h()) && Objects.equals($$1, $$2.a(ki.T));
        };
    }

    public void a(ddm $$0, dlt $$12) {
        if (!this.q.containsKey($$0)) {
            a $$22 = new a($$0);
            this.q.put($$0, $$22);
            this.p.add($$22);
        }
        Predicate<dlt> $$3 = fmw.a($$12);
        if (!$$0.gK().b($$3)) {
            this.a($$0.aq());
        }
        for (int $$4 = 0; $$4 < this.p.size(); ++$$4) {
            a $$5 = this.p.get($$4);
            ddm $$6 = $$5.a;
            String $$7 = $$6.aq();
            if ($$6.eh() || !$$6.gK().b($$3) && !$$12.H()) {
                this.q.remove($$6);
                this.p.remove($$5);
                this.a($$7);
            } else if (!$$12.H() && $$6.ao().aq() == this.f && this.n) {
                this.a(fms.a, $$6.ao(), $$7, $$6.dP(), $$6.dV(), $$6.ec(), null);
            }
            if ($$6.equals($$0) || !fmw.b($$6)) continue;
            this.a($$7);
        }
        if ($$12.H() && this.n) {
            czc $$8 = $$12.I();
            is $$9 = $$8.i();
            fmt $$10 = this.t.get(fmt.a($$9));
            if ($$10 != null && $$8.aA() != $$10.d() && this.t.containsKey($$10.a())) {
                this.a(fmw.b($$10.d()));
            }
            fmt $$11 = new fmt($$9, $$8.dg().e() * 90, $$8.aA());
            this.a(fms.b, $$0.ao(), fmw.b($$8.aA()), $$9.u(), $$9.w(), $$8.dg().e() * 90, null);
            fmt $$122 = this.t.put($$11.a(), $$11);
            if (!$$11.equals($$122)) {
                this.u();
            }
        }
        dos $$13 = $$12.a(ki.U, dos.a);
        if (!this.s.keySet().containsAll($$13.a().keySet())) {
            $$13.a().forEach(($$1, $$2) -> {
                if (!this.s.containsKey($$1)) {
                    this.a($$2.a(), $$0.ao(), (String)$$1, $$2.b(), $$2.c(), $$2.d(), null);
                }
            });
        }
    }

    private static boolean b(ddm $$0) {
        for (cgv $$1 : cgv.values()) {
            if ($$1 == cgv.a || $$1 == cgv.b || !$$0.a($$1).a(bdy.cO)) continue;
            return true;
        }
        return false;
    }

    private void a(String $$0) {
        fmq $$1 = this.s.remove($$0);
        if ($$1 != null && $$1.c().a().f()) {
            --this.u;
        }
        this.g();
    }

    public static void a(dlt $$0, is $$1, String $$22, jd<fmr> $$3) {
        dos.a $$4 = new dos.a($$3, $$1.u(), $$1.w(), 180.0f);
        $$0.a(ki.U, dos.a, $$2 -> $$2.a($$22, $$4));
        if ($$3.a().a()) {
            $$0.b(ki.S, new dot($$3.a().d()));
        }
    }

    private void a(jd<fmr> $$0, @Nullable dwp $$1, String $$2, double $$3, double $$4, double $$5, @Nullable yh $$6) {
        fmq $$12;
        int $$7 = 1 << this.g;
        float $$8 = (float)($$3 - (double)this.d) / (float)$$7;
        float $$9 = (float)($$4 - (double)this.e) / (float)$$7;
        b $$10 = this.a($$0, $$1, $$5, $$8, $$9);
        if ($$10 == null) {
            this.a($$2);
            return;
        }
        fmq $$11 = new fmq($$10.a(), $$10.b(), $$10.c(), $$10.d(), Optional.ofNullable($$6));
        if (!$$11.equals($$12 = this.s.put($$2, $$11))) {
            if ($$12 != null && $$12.c().a().f()) {
                --this.u;
            }
            if ($$10.a().a().f()) {
                ++this.u;
            }
            this.g();
        }
    }

    private @Nullable b a(jd<fmr> $$0, @Nullable dwp $$1, double $$2, float $$3, float $$4) {
        byte $$5 = fmw.a($$3);
        byte $$6 = fmw.a($$4);
        if ($$0.a(fms.a)) {
            Pair<jd<fmr>, Byte> $$7 = this.b($$0, $$1, $$2, $$3, $$4);
            return $$7 == null ? null : new b((jd)$$7.getFirst(), $$5, $$6, (Byte)$$7.getSecond());
        }
        if (fmw.a($$3, $$4) || this.o) {
            return new b($$0, $$5, $$6, this.a($$1, $$2));
        }
        return null;
    }

    private @Nullable Pair<jd<fmr>, Byte> b(jd<fmr> $$0, @Nullable dwp $$1, double $$2, float $$3, float $$4) {
        if (fmw.a($$3, $$4)) {
            return Pair.of($$0, (Object)this.a($$1, $$2));
        }
        jd<fmr> $$5 = this.b($$3, $$4);
        if ($$5 == null) {
            return null;
        }
        return Pair.of($$5, (Object)0);
    }

    private byte a(@Nullable dwp $$0, double $$1) {
        if (this.f == dwo.i && $$0 != null) {
            int $$2 = (int)($$0.au() / 10L);
            return (byte)($$2 * $$2 * 34187121 + $$2 * 121 >> 15 & 0xF);
        }
        double $$3 = $$1 < 0.0 ? $$1 - 8.0 : $$1 + 8.0;
        return (byte)($$3 * 16.0 / 360.0);
    }

    private static boolean a(float $$0, float $$1) {
        int $$2 = 63;
        return $$0 >= -63.0f && $$1 >= -63.0f && $$0 <= 63.0f && $$1 <= 63.0f;
    }

    private @Nullable jd<fmr> b(float $$0, float $$1) {
        boolean $$3;
        int $$2 = 320;
        boolean bl2 = $$3 = Math.abs($$0) < 320.0f && Math.abs($$1) < 320.0f;
        if ($$3) {
            return fms.g;
        }
        return this.o ? fms.h : null;
    }

    private static byte a(float $$0) {
        int $$1 = 63;
        if ($$0 <= -63.0f) {
            return -128;
        }
        if ($$0 >= 63.0f) {
            return 127;
        }
        return (byte)((double)($$0 * 2.0f) + 0.5);
    }

    public @Nullable aay<?> a(fmu $$0, ddm $$1) {
        a $$2 = this.q.get($$1);
        if ($$2 == null) {
            return null;
        }
        return $$2.a($$0);
    }

    private void a(int $$0, int $$1) {
        this.u();
        for (a $$2 : this.p) {
            $$2.a($$0, $$1);
        }
    }

    private void g() {
        this.p.forEach(a::b);
    }

    public a a(ddm $$0) {
        a $$1 = this.q.get($$0);
        if ($$1 == null) {
            $$1 = new a($$0);
            this.q.put($$0, $$1);
            this.p.add($$1);
        }
        return $$1;
    }

    public boolean a(dwp $$0, is $$1) {
        double $$2 = (double)$$1.u() + 0.5;
        double $$3 = (double)$$1.w() + 0.5;
        int $$4 = 1 << this.g;
        double $$5 = ($$2 - (double)this.d) / (double)$$4;
        double $$6 = ($$3 - (double)this.e) / (double)$$4;
        int $$7 = 63;
        if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
            fmp $$8 = fmp.a($$0, $$1);
            if ($$8 == null) {
                return false;
            }
            if (this.r.remove($$8.b(), $$8)) {
                this.a($$8.b());
                this.u();
                return true;
            }
            if (!this.a(256)) {
                this.r.put($$8.b(), $$8);
                this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
                this.u();
                return true;
            }
        }
        return false;
    }

    public void a(dvt $$0, int $$1, int $$2) {
        Iterator<fmp> $$3 = this.r.values().iterator();
        while ($$3.hasNext()) {
            fmp $$5;
            fmp $$4 = $$3.next();
            if ($$4.c().u() != $$1 || $$4.c().w() != $$2 || $$4.equals($$5 = fmp.a($$0, $$4.c()))) continue;
            $$3.remove();
            this.a($$4.b());
            this.u();
        }
    }

    public Collection<fmp> d() {
        return this.r.values();
    }

    public void a(is $$0, int $$1) {
        this.a(fmw.b($$1));
        this.t.remove(fmt.a($$0));
        this.u();
    }

    public boolean a(int $$0, int $$1, byte $$2) {
        byte $$3 = this.h[$$0 + $$1 * 128];
        if ($$3 != $$2) {
            this.b($$0, $$1, $$2);
            return true;
        }
        return false;
    }

    public void b(int $$0, int $$1, byte $$2) {
        this.h[$$0 + $$1 * 128] = $$2;
        this.a($$0, $$1);
    }

    public boolean e() {
        for (fmq $$0 : this.s.values()) {
            if (!$$0.c().a().e()) continue;
            return true;
        }
        return false;
    }

    public void a(List<fmq> $$0) {
        this.s.clear();
        this.u = 0;
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            fmq $$2 = $$0.get($$1);
            this.s.put("icon-" + $$1, $$2);
            if (!$$2.c().a().f()) continue;
            ++this.u;
        }
    }

    public Iterable<fmq> f() {
        return this.s.values();
    }

    public boolean a(int $$0) {
        return this.u >= $$0;
    }

    private static String b(int $$0) {
        return m + $$0;
    }

    public class a {
        public final ddm a;
        private boolean d = true;
        private int e;
        private int f;
        private int g = 127;
        private int h = 127;
        private boolean i = true;
        private int j;
        public int b;

        a(ddm $$1) {
            this.a = $$1;
        }

        private c a() {
            int $$0 = this.e;
            int $$1 = this.f;
            int $$2 = this.g + 1 - this.e;
            int $$3 = this.h + 1 - this.f;
            byte[] $$4 = new byte[$$2 * $$3];
            for (int $$5 = 0; $$5 < $$2; ++$$5) {
                for (int $$6 = 0; $$6 < $$3; ++$$6) {
                    $$4[$$5 + $$6 * $$2] = fmw.this.h[$$0 + $$5 + ($$1 + $$6) * 128];
                }
            }
            return new c($$0, $$1, $$2, $$3, $$4);
        }

        @Nullable aay<?> a(fmu $$0) {
            Collection<fmq> $$4;
            c $$2;
            if (this.d) {
                this.d = false;
                c $$1 = this.a();
            } else {
                $$2 = null;
            }
            if (this.i && this.j++ % 5 == 0) {
                this.i = false;
                Collection<fmq> $$3 = fmw.this.s.values();
            } else {
                $$4 = null;
            }
            if ($$4 != null || $$2 != null) {
                return new aex($$0, fmw.this.g, fmw.this.i, $$4, $$2);
            }
            return null;
        }

        void a(int $$0, int $$1) {
            if (this.d) {
                this.e = Math.min(this.e, $$0);
                this.f = Math.min(this.f, $$1);
                this.g = Math.max(this.g, $$0);
                this.h = Math.max(this.h, $$1);
            } else {
                this.d = true;
                this.e = $$0;
                this.f = $$1;
                this.g = $$0;
                this.h = $$1;
            }
        }

        private void b() {
            this.i = true;
        }
    }

    record b(jd<fmr> a, byte b, byte c, byte d) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "type;x;y;rot", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "type;x;y;rot", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "type;x;y;rot", "a", "b", "c", "d"}, this, $$0);
        }
    }

    public static final class c
    extends Record {
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final byte[] f;
        public static final aao<ByteBuf, Optional<c>> a = aao.a(c::a, c::a);

        public c(int $$0, int $$1, int $$2, int $$3, byte[] $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        private static void a(ByteBuf $$0, Optional<c> $$1) {
            if ($$1.isPresent()) {
                c $$2 = $$1.get();
                $$0.writeByte($$2.d);
                $$0.writeByte($$2.e);
                $$0.writeByte($$2.b);
                $$0.writeByte($$2.c);
                wx.a($$0, $$2.f);
            } else {
                $$0.writeByte(0);
            }
        }

        private static Optional<c> a(ByteBuf $$0) {
            short $$1 = $$0.readUnsignedByte();
            if ($$1 > 0) {
                short $$2 = $$0.readUnsignedByte();
                short $$3 = $$0.readUnsignedByte();
                short $$4 = $$0.readUnsignedByte();
                byte[] $$5 = wx.a($$0);
                return Optional.of(new c($$3, $$4, $$1, $$2, $$5));
            }
            return Optional.empty();
        }

        public void a(fmw $$0) {
            for (int $$1 = 0; $$1 < this.d; ++$$1) {
                for (int $$2 = 0; $$2 < this.e; ++$$2) {
                    $$0.b(this.b + $$1, this.c + $$2, this.f[$$1 + $$2 * this.d]);
                }
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "startX;startY;width;height;mapColors", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "startX;startY;width;height;mapColors", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "startX;startY;width;height;mapColors", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public byte[] e() {
            return this.f;
        }
    }
}

