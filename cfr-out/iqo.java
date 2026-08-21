/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2FloatMap
 *  it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class iqo {
    private static final Marker d = MarkerFactory.getMarker((String)"SOUNDS");
    private static final Logger e = LogUtils.getLogger();
    private static final float f = 0.5f;
    private static final float g = 2.0f;
    private static final float h = 0.0f;
    private static final float i = 1.0f;
    private static final int j = 20;
    private static final Set<amo> k = Sets.newHashSet();
    private static final long l = 1000L;
    public static final String a = "FOR THE DEBUG!";
    public static final String b = "OpenAL Soft on ";
    public static final int c = "OpenAL Soft on ".length();
    private final iqr m;
    private final gfo n;
    private boolean o;
    private final fwh p = new fwh();
    private final fwi q = this.p.e();
    private final iqn r;
    private final iqp s = new iqp();
    private final iqg t = new iqg(this.p, this.s);
    private int u;
    private long v;
    private final AtomicReference<a> w = new AtomicReference<a>(iqo$a.c);
    private final Map<ipm, iqg.a> x = Maps.newHashMap();
    private final Multimap<bdb, ipm> y = HashMultimap.create();
    private final Object2FloatMap<bdb> z = (Object2FloatMap)bhs.a(new Object2FloatOpenHashMap(), (? super T $$0) -> $$0.defaultReturnValue(1.0f));
    private final List<ipn> A = Lists.newArrayList();
    private final Map<ipm, Integer> B = Maps.newHashMap();
    private final Map<ipm, Integer> C = Maps.newHashMap();
    private final List<iqq> D = Lists.newArrayList();
    private final List<ipn> E = Lists.newArrayList();
    private final List<ipj> F = Lists.newArrayList();

    public iqo(iqr $$02, gfo $$1, bbc $$2) {
        this.m = $$02;
        this.n = $$1;
        this.r = new iqn($$2);
    }

    public void a() {
        k.clear();
        for (bcz $$0 : mi.b) {
            amo $$1;
            if ($$0 == bda.tA || this.m.a($$1 = $$0.a()) != null) continue;
            e.warn("Missing sound for event: {}", (Object)mi.b.b($$0));
            k.add($$1);
        }
        this.b();
        this.i();
    }

    private synchronized void i() {
        if (this.o) {
            return;
        }
        try {
            String $$0 = this.n.aL().b();
            this.p.a("".equals($$0) ? null : $$0, (boolean)this.n.al().b());
            this.q.a();
            this.r.a(this.F).thenRun(this.F::clear);
            this.o = true;
            e.info(d, "Sound engine started");
        }
        catch (RuntimeException $$1) {
            e.error(d, "Error starting SoundSystem. Turning off sounds & music", (Throwable)$$1);
        }
    }

    public void a(bdb $$0) {
        if (!this.o) {
            return;
        }
        this.x.forEach(($$12, $$2) -> {
            if ($$0 == $$12.c() || $$0 == bdb.a) {
                float $$3 = this.h((ipm)$$12);
                $$2.a((fwg $$1) -> $$1.b($$3));
            }
        });
    }

    public void b() {
        if (this.o) {
            this.d();
            this.r.a();
            this.p.d();
            this.o = false;
        }
    }

    public void c() {
        if (this.o) {
            this.p.d();
        }
    }

    public void a(ipm $$0) {
        iqg.a $$1;
        if (this.o && ($$1 = this.x.get($$0)) != null) {
            $$1.a(fwg::f);
        }
    }

    public void a(bdb $$0, float $$1) {
        this.z.put((Object)$$0, bgj.a($$1, 0.0f, 1.0f));
        this.a($$0);
    }

    public void d() {
        if (this.o) {
            this.s.a();
            this.x.clear();
            this.t.b();
            this.B.clear();
            this.A.clear();
            this.y.clear();
            this.C.clear();
            this.E.clear();
            this.z.clear();
            this.s.b();
        }
    }

    public void a(iqq $$0) {
        this.D.add($$0);
    }

    public void b(iqq $$0) {
        this.D.remove($$0);
    }

    private boolean j() {
        boolean $$1;
        if (this.p.h()) {
            e.info("Audio device was lost!");
            return true;
        }
        long $$0 = bhs.c();
        boolean bl2 = $$1 = $$0 - this.v >= 1000L;
        if ($$1) {
            this.v = $$0;
            if (this.w.compareAndSet(iqo$a.c, iqo$a.a)) {
                String $$2 = this.n.aL().b();
                bhs.i().execute(() -> {
                    if ("".equals($$2)) {
                        if (this.p.c()) {
                            e.info("System default audio device has changed!");
                            this.w.compareAndSet(iqo$a.a, iqo$a.b);
                        }
                    } else if (!this.p.b().equals($$2) && this.p.g().contains($$2)) {
                        e.info("Preferred audio device has become available!");
                        this.w.compareAndSet(iqo$a.a, iqo$a.b);
                    }
                    this.w.compareAndSet(iqo$a.a, iqo$a.c);
                });
            }
        }
        return this.w.compareAndSet(iqo$a.b, iqo$a.c);
    }

    public void a(boolean $$0) {
        if (this.j()) {
            this.a();
        }
        if (!$$0) {
            this.k();
        } else {
            this.l();
        }
        this.t.a();
    }

    private void k() {
        ++this.u;
        this.E.stream().filter(ipm::s).forEach(this::c);
        this.E.clear();
        for (ipn $$0 : this.A) {
            if (!$$0.s()) {
                this.a((ipm)$$0);
            }
            $$0.q();
            if ($$0.m()) {
                this.a((ipm)$$0);
                continue;
            }
            float $$1 = this.h($$0);
            float $$2 = this.g($$0);
            ftm $$32 = new ftm($$0.h(), $$0.i(), $$0.j());
            iqg.a $$4 = this.x.get($$0);
            if ($$4 == null) continue;
            $$4.a((fwg $$3) -> {
                $$3.b($$1);
                $$3.a($$2);
                $$3.a($$32);
            });
        }
        Iterator<Map.Entry<ipm, iqg.a>> $$5 = this.x.entrySet().iterator();
        while ($$5.hasNext()) {
            int $$9;
            Map.Entry<ipm, iqg.a> $$6 = $$5.next();
            iqg.a $$7 = $$6.getValue();
            ipm $$8 = $$6.getKey();
            if (!$$7.a() || ($$9 = this.C.get($$8).intValue()) > this.u) continue;
            if (iqo.e($$8)) {
                this.B.put($$8, this.u + $$8.e());
            }
            $$5.remove();
            e.debug(d, "Removed channel {} because it's not playing anymore", (Object)$$7);
            this.C.remove($$8);
            try {
                this.y.remove((Object)$$8.c(), (Object)$$8);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!($$8 instanceof ipn)) continue;
            this.A.remove($$8);
        }
        Iterator<Map.Entry<ipm, Integer>> $$10 = this.B.entrySet().iterator();
        while ($$10.hasNext()) {
            Map.Entry<ipm, Integer> $$11 = $$10.next();
            if (this.u < $$11.getValue()) continue;
            ipm $$12 = $$11.getKey();
            if ($$12 instanceof ipn) {
                ((ipn)$$12).q();
            }
            this.c($$12);
            $$10.remove();
        }
    }

    private void l() {
        Iterator<Map.Entry<ipm, iqg.a>> $$0 = this.x.entrySet().iterator();
        while ($$0.hasNext()) {
            Map.Entry<ipm, iqg.a> $$1 = $$0.next();
            iqg.a $$2 = $$1.getValue();
            ipm $$3 = $$1.getKey();
            if ($$3.c() != bdb.b || !$$2.a()) continue;
            $$0.remove();
            e.debug(d, "Removed channel {} because it's not playing anymore", (Object)$$2);
            this.C.remove($$3);
            this.y.remove((Object)$$3.c(), (Object)$$3);
        }
    }

    private static boolean d(ipm $$0) {
        return $$0.e() > 0;
    }

    private static boolean e(ipm $$0) {
        return $$0.d() && iqo.d($$0);
    }

    private static boolean f(ipm $$0) {
        return $$0.d() && !iqo.d($$0);
    }

    public boolean b(ipm $$0) {
        if (!this.o) {
            return false;
        }
        if (this.C.containsKey($$0) && this.C.get($$0) <= this.u) {
            return true;
        }
        return this.x.containsKey($$0);
    }

    public b c(ipm $$0) {
        ipj $$3;
        if (!this.o) {
            return iqo$b.c;
        }
        if (!$$0.s()) {
            return iqo$b.c;
        }
        iqt $$1 = $$0.a(this.m);
        amo $$2 = $$0.a();
        if ($$1 == null) {
            if (k.add($$2)) {
                e.warn(d, "Unable to play unknown soundEvent: {}", (Object)$$2);
            }
            if (!w.aI) {
                return iqo$b.c;
            }
            $$1 = new iqt($$2, a);
        }
        if (($$3 = $$0.b()) == iqr.e) {
            return iqo$b.c;
        }
        if ($$3 == iqr.b) {
            if (k.add($$2)) {
                e.warn(d, "Unable to play empty soundEvent: {}", (Object)$$2);
            }
            return iqo$b.c;
        }
        float $$4 = $$0.f();
        float $$5 = Math.max($$4, 1.0f) * (float)$$3.i();
        bdb $$6 = $$0.c();
        float $$7 = this.a($$4, $$6);
        float $$82 = this.g($$0);
        ipm.a $$9 = $$0.k();
        boolean $$10 = $$0.l();
        if (!this.D.isEmpty()) {
            float $$11 = $$10 || $$9 == ipm.a.a ? Float.POSITIVE_INFINITY : $$5;
            for (iqq $$122 : this.D) {
                $$122.a($$0, $$1, $$11);
            }
        }
        boolean $$13 = false;
        if ($$7 == 0.0f) {
            if ($$0.r() || $$6 == bdb.b) {
                $$13 = true;
            } else {
                e.debug(d, "Skipped playing sound {}, volume was zero.", (Object)$$3.a());
                return iqo$b.c;
            }
        }
        ftm $$14 = new ftm($$0.h(), $$0.i(), $$0.j());
        boolean $$15 = iqo.f($$0);
        boolean $$16 = $$3.g();
        CompletableFuture<@Nullable iqg.a> $$17 = this.t.a($$3.g() ? fwh.c.b : fwh.c.a);
        iqg.a $$18 = $$17.join();
        if ($$18 == null) {
            if (w.aX) {
                e.warn("Failed to create new sound handle");
            }
            return iqo$b.c;
        }
        e.debug(d, "Playing sound {} for event {}", (Object)$$3.a(), (Object)$$2);
        this.C.put($$0, this.u + 20);
        this.x.put($$0, $$18);
        this.y.put((Object)$$6, (Object)$$0);
        $$18.a((fwg $$8) -> {
            $$8.a($$82);
            $$8.b($$7);
            if ($$9 == ipm.a.b) {
                $$8.c($$5);
            } else {
                $$8.i();
            }
            $$8.a($$15 && !$$16);
            $$8.a($$14);
            $$8.b($$10);
        });
        if (!$$16) {
            this.r.a($$3.b()).thenAccept($$12 -> $$18.a((fwg $$1) -> {
                $$1.a((fwl)$$12);
                $$1.c();
            }));
        } else {
            this.r.a($$3.b(), $$15).thenAccept($$12 -> $$18.a((fwg $$1) -> {
                $$1.a((iqf)$$12);
                $$1.c();
            }));
        }
        if ($$0 instanceof ipn) {
            this.A.add((ipn)$$0);
        }
        if ($$13) {
            return iqo$b.b;
        }
        return iqo$b.a;
    }

    public void a(ipn $$0) {
        this.E.add($$0);
    }

    public void a(ipj $$0) {
        this.F.add($$0);
    }

    private float g(ipm $$0) {
        return bgj.a($$0.g(), 0.5f, 2.0f);
    }

    private float h(ipm $$0) {
        return this.a($$0.f(), $$0.c());
    }

    private float a(float $$0, bdb $$1) {
        return bgj.a($$0, 0.0f, 1.0f) * bgj.a(this.n.a($$1), 0.0f, 1.0f) * this.z.getFloat((Object)$$1);
    }

    public void a(bdb ... $$0) {
        if (!this.o) {
            return;
        }
        for (Map.Entry<ipm, iqg.a> $$1 : this.x.entrySet()) {
            if (List.of($$0).contains((Object)$$1.getKey().c())) continue;
            $$1.getValue().a(fwg::d);
        }
    }

    public void e() {
        if (this.o) {
            this.t.a((Stream<fwg> $$0) -> $$0.forEach(fwg::e));
        }
    }

    public void a(ipm $$0, int $$1) {
        this.B.put($$0, this.u + $$1);
    }

    public void a(ger $$0) {
        if (!this.o || !$$0.i()) {
            return;
        }
        fwj $$1 = new fwj($$0.b(), new ftm($$0.n()), new ftm($$0.o()));
        this.s.execute(() -> this.q.a($$1));
    }

    public void a(@Nullable amo $$0, @Nullable bdb $$1) {
        if ($$1 != null) {
            for (ipm $$2 : this.y.get((Object)$$1)) {
                if ($$0 != null && !$$2.a().equals($$0)) continue;
                this.a($$2);
            }
        } else if ($$0 == null) {
            this.d();
        } else {
            for (ipm $$3 : this.x.keySet()) {
                if (!$$3.a().equals($$0)) continue;
                this.a($$3);
            }
        }
    }

    public String f() {
        return this.p.f();
    }

    public List<String> g() {
        return this.p.g();
    }

    public fwj h() {
        return this.q.b();
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = iqo$a.a();
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
            d = iqo$b.a();
        }
    }
}

