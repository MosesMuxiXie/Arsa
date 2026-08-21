/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.joml.Vector2f
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gjf {
    private static final Logger c = LogUtils.getLogger();
    private static final int d = 100;
    private static final int e = 4;
    private static final int f = 40;
    private static final int g = 210;
    private static final int h = 60;
    private static final yh i = yh.c("chat.deleted_marker").a(l.h, l.u);
    public static final int a = 8;
    public static final amo b = amo.b("internal/expand_chat_queue");
    private static final zf j = zf.a.a(new yf.d(b, Optional.empty())).a(new yo.e(yh.c("chat.queue.tooltip")));
    final gfj k;
    private final beo<String> l = new beo(100);
    private final List<gfc> m = Lists.newArrayList();
    private final List<gfc.a> n = Lists.newArrayList();
    private int o;
    private boolean p;
    private @Nullable f q;
    private @Nullable gqy r;
    private final List<e> s = new ArrayList<e>();

    public gjf(gfj $$0) {
        this.k = $$0;
        this.l.addAll($$0.be().a());
    }

    public void a() {
        if (!this.s.isEmpty()) {
            this.m();
        }
    }

    private int a(a $$0, i $$1) {
        int $$2 = this.g();
        int $$3 = 0;
        for (int $$4 = Math.min(this.n.size() - this.o, $$2) - 1; $$4 >= 0; --$$4) {
            int $$5 = $$4 + this.o;
            gfc.a $$6 = this.n.get($$5);
            float $$7 = $$0.calculate($$6);
            if (!($$7 > 1.0E-5f)) continue;
            ++$$3;
            $$1.accept($$6, $$4, $$7);
        }
        return $$3;
    }

    public void a(gir $$0, gio $$1, int $$2, int $$3, int $$4, boolean $$5, boolean $$6) {
        $$0.e().pushMatrix();
        this.a($$5 ? new h($$0, $$1, $$3, $$4, $$6) : new g($$0), $$0.b(), $$2, $$5);
        $$0.e().popMatrix();
    }

    public void a(gil $$0, int $$1, int $$2, boolean $$3) {
        this.a(new d($$0), $$1, $$2, $$3);
    }

    private void a(final b $$0, int $$12, int $$2, boolean $$3) {
        if (this.l()) {
            return;
        }
        int $$4 = this.n.size();
        if ($$4 <= 0) {
            return;
        }
        bzm $$52 = bzl.a();
        $$52.a("chat");
        float $$62 = (float)this.q();
        int $$72 = bgj.d((float)this.o() / $$62);
        final int $$8 = bgj.b((float)($$12 - 40) / $$62);
        final float $$9 = this.k.k.u().b().floatValue() * 0.9f + 0.1f;
        float $$10 = this.k.k.y().b().floatValue();
        final int $$11 = this.k.g.b;
        int $$122 = 8;
        double $$13 = this.k.k.v().b();
        final int $$14 = (int)((double)$$11 * ($$13 + 1.0));
        final int $$15 = (int)Math.round(8.0 * ($$13 + 1.0) - 4.0 * $$13);
        long $$16 = this.k.ba().c();
        a $$17 = $$3 ? gjf$a.a : gjf$a.timeBased($$2);
        $$0.a((Matrix3x2f $$1) -> {
            $$1.scale($$62, $$62);
            $$1.translate(4.0f, 0.0f);
        });
        this.a($$17, (gfc.a $$5, int $$6, float $$7) -> {
            int $$8 = $$8 - $$6 * $$14;
            int $$9 = $$8 - $$14;
            $$0.a(-4, $$9, $$72 + 4 + 4, $$8, bel.c($$7 * $$10));
        });
        if ($$16 > 0L) {
            $$0.a(-2, $$8, $$72 + 4, $$8 + $$11, bel.c($$10));
        }
        int $$18 = this.a($$17, new i(){
            boolean a;

            @Override
            public void accept(gfc.a $$02, int $$1, float $$2) {
                boolean $$82;
                int $$3 = $$8 - $$1 * $$14;
                int $$4 = $$3 - $$14;
                int $$5 = $$3 - $$15;
                boolean $$6 = $$0.a($$5, $$2 * $$9, $$02.b());
                this.a |= $$6;
                if ($$02.d()) {
                    boolean $$7 = this.a;
                    this.a = false;
                } else {
                    $$82 = false;
                }
                gfd $$92 = $$02.c();
                if ($$92 != null) {
                    $$0.a(-4, $$4, -2, $$3, $$2 * $$9, $$92);
                    if ($$92.f() != null) {
                        int $$10 = $$02.a(gjf.this.k.g);
                        int $$112 = $$5 + $$11;
                        $$0.a($$10, $$112, $$82, $$92, $$92.f());
                    }
                }
            }
        });
        if ($$16 > 0L) {
            int $$19 = $$8 + $$11;
            yw $$20 = yh.a("chat.queue", $$16).b(j);
            $$0.a($$19 - 8, 0.5f * $$9, $$20.g());
        }
        if ($$3) {
            int $$21 = $$4 * $$14;
            int $$22 = $$18 * $$14;
            int $$23 = this.o * $$22 / $$4 - $$8;
            int $$24 = $$22 * $$22 / $$21;
            if ($$21 != $$22) {
                int $$25 = $$23 > 0 ? 170 : 96;
                int $$26 = this.p ? 0xCC3333 : 0x3333AA;
                int $$27 = $$72 + 4;
                $$0.a($$27, -$$23, $$27 + 2, -$$23 - $$24, bel.f($$25, $$26));
                $$0.a($$27 + 2, -$$23, $$27 + 1, -$$23 - $$24, bel.f($$25, 0xCCCCCC));
            }
        }
        $$52.c();
    }

    private boolean l() {
        return this.k.k.t().b() == ddj.c;
    }

    public void a(boolean $$0) {
        this.k.ba().d();
        this.s.clear();
        this.n.clear();
        this.m.clear();
        if ($$0) {
            this.l.clear();
            this.l.addAll(this.k.be().a());
        }
    }

    public void a(yh $$0) {
        this.a($$0, null, this.k.ab() ? gfd.b() : gfd.a());
    }

    public void a(yh $$0, @Nullable yu $$1, @Nullable gfd $$2) {
        gfc $$3 = new gfc(this.k.j.f(), $$0, $$1, $$2);
        this.a($$3);
        this.b($$3);
        this.c($$3);
    }

    private void a(gfc $$0) {
        String $$1 = $$0.b().getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n");
        String $$2 = t.a($$0.d(), gfd::h);
        if ($$2 != null) {
            c.info("[{}] [CHAT] {}", (Object)$$2, (Object)$$1);
        } else {
            c.info("[CHAT] {}", (Object)$$1);
        }
    }

    private void b(gfc $$0) {
        int $$1 = bgj.c((double)this.o() / this.q());
        List<bfr> $$2 = $$0.a(this.k.g, $$1);
        boolean $$3 = this.e();
        for (int $$4 = 0; $$4 < $$2.size(); ++$$4) {
            bfr $$5 = $$2.get($$4);
            if ($$3 && this.o > 0) {
                this.p = true;
                this.a(1);
            }
            boolean $$6 = $$4 == $$2.size() - 1;
            this.n.addFirst(new gfc.a($$0.a(), $$5, $$0.d(), $$6));
        }
        while (this.n.size() > 100) {
            this.n.removeLast();
        }
    }

    private void c(gfc $$0) {
        this.m.addFirst($$0);
        while (this.m.size() > 100) {
            this.m.removeLast();
        }
    }

    private void m() {
        int $$0 = this.k.j.f();
        this.s.removeIf($$1 -> {
            if ($$0 >= $$1.b()) {
                return this.b($$1.a()) == null;
            }
            return false;
        });
    }

    public void a(yu $$0) {
        e $$1 = this.b($$0);
        if ($$1 != null) {
            this.s.add($$1);
        }
    }

    private @Nullable e b(yu $$0) {
        int $$1 = this.k.j.f();
        ListIterator<gfc> $$2 = this.m.listIterator();
        while ($$2.hasNext()) {
            gfc $$3 = $$2.next();
            if (!$$0.equals($$3.c())) continue;
            int $$4 = $$3.a() + 60;
            if ($$1 >= $$4) {
                $$2.set(this.d($$3));
                this.n();
                return null;
            }
            return new e($$0, $$4);
        }
        return null;
    }

    private gfc d(gfc $$0) {
        return new gfc($$0.a(), i, null, gfd.a());
    }

    public void b() {
        this.d();
        this.n();
    }

    private void n() {
        this.n.clear();
        for (gfc $$0 : Lists.reverse(this.m)) {
            this.b($$0);
        }
    }

    public beo<String> c() {
        return this.l;
    }

    public void a(String $$0) {
        if (!$$0.equals(this.l.peekLast())) {
            if (this.l.size() >= 100) {
                this.l.removeFirst();
            }
            this.l.addLast($$0);
        }
        if ($$0.startsWith("/")) {
            this.k.be().a($$0);
        }
    }

    public void d() {
        this.o = 0;
        this.p = false;
    }

    public void a(int $$0) {
        this.o += $$0;
        int $$1 = this.n.size();
        if (this.o > $$1 - this.g()) {
            this.o = $$1 - this.g();
        }
        if (this.o <= 0) {
            this.o = 0;
            this.p = false;
        }
    }

    public boolean e() {
        return this.k.x instanceof gqy;
    }

    private int o() {
        return gjf.a(this.k.k.F().b());
    }

    private int p() {
        return gjf.b(this.e() ? this.k.k.H().b() : this.k.k.G().b());
    }

    private double q() {
        return this.k.k.E().b();
    }

    public static int a(double $$0) {
        int $$1 = 320;
        int $$2 = 40;
        return bgj.c($$0 * 280.0 + 40.0);
    }

    public static int b(double $$0) {
        int $$1 = 180;
        int $$2 = 20;
        return bgj.c($$0 * 160.0 + 20.0);
    }

    public static double f() {
        int $$0 = 180;
        int $$1 = 20;
        return 70.0 / (double)(gjf.b(1.0) - 20);
    }

    public int g() {
        return this.p() / this.r();
    }

    private int r() {
        return (int)((double)this.k.g.b * (this.k.k.v().b() + 1.0));
    }

    public void b(String $$0) {
        boolean $$1 = $$0.startsWith("/");
        this.q = new f($$0, $$1 ? gjf$c.b : gjf$c.a);
    }

    public void h() {
        this.q = null;
    }

    public <T extends gqy> T a(c $$0, gqy.a<T> $$1) {
        if (this.q != null && $$0.a(this.q)) {
            return $$1.create(this.q.a(), true);
        }
        return $$1.create($$0.a(), false);
    }

    public void b(c $$0, gqy.a<?> $$1) {
        this.k.a((gsb)this.a($$0, $$1));
    }

    public void i() {
        gsb gsb2 = this.k.x;
        if (gsb2 instanceof gqy) {
            gqy $$0;
            this.r = $$0 = (gqy)gsb2;
        }
    }

    public @Nullable gqy j() {
        gqy $$0 = this.r;
        this.r = null;
        return $$0;
    }

    public j k() {
        return new j(List.copyOf(this.m), List.copyOf(this.l), List.copyOf(this.s));
    }

    public void a(j $$0) {
        this.l.clear();
        this.l.addAll($$0.b);
        this.s.clear();
        this.s.addAll($$0.c);
        this.m.clear();
        this.m.addAll($$0.a);
        this.n();
    }

    @FunctionalInterface
    static interface a {
        public static final a a = $$0 -> 1.0f;

        public static a timeBased(int $$0) {
            return $$1 -> {
                int $$2 = $$0 - $$1.a();
                double $$3 = (double)$$2 / 200.0;
                $$3 = 1.0 - $$3;
                $$3 *= 10.0;
                $$3 = bgj.a($$3, 0.0, 1.0);
                $$3 *= $$3;
                return (float)$$3;
            };
        }

        public float calculate(gfc.a var1);
    }

    @FunctionalInterface
    static interface i {
        public void accept(gfc.a var1, int var2, float var3);
    }

    static class h
    implements b,
    Consumer<zf> {
        private final gir a;
        private final gio b;
        private final gil c;
        private gil.b d;
        private final int e;
        private final int f;
        private final Vector2f g = new Vector2f();
        private @Nullable zf h;
        private final boolean i;

        public h(gir $$0, gio $$1, int $$2, int $$3, boolean $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$0.a(gir.a.c, this);
            this.e = $$2;
            this.f = $$3;
            this.i = $$4;
            this.d = this.c.a();
            this.a();
        }

        private void a() {
            this.a.e().invert(new Matrix3x2f()).transformPosition((float)this.e, (float)this.f, this.g);
        }

        @Override
        public void a(Consumer<Matrix3x2f> $$0) {
            $$0.accept((Matrix3x2f)this.a.e());
            this.d = this.d.a((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.a.e()));
            this.a();
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
            this.a.a($$0, $$1, $$2, $$3, $$4);
        }

        public void a(zf $$0) {
            this.h = $$0;
        }

        @Override
        public boolean a(int $$0, float $$1, bfr $$2) {
            this.h = null;
            this.c.a(git.a, 0, $$0, this.d.b($$1), $$2);
            if (this.i && this.h != null && this.h.k() != null) {
                this.a.a(fyn.d);
            }
            return this.h != null;
        }

        private boolean a(int $$0, int $$1, int $$2, int $$3) {
            return gil.a(this.g.x, this.g.y, $$0, $$1, $$2, $$3);
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, float $$4, gfd $$5) {
            int $$6 = bel.a($$4, $$5.e());
            this.a.a($$0, $$1, $$2, $$3, $$6);
            if (this.a($$0, $$1, $$2, $$3)) {
                this.a($$5);
            }
        }

        @Override
        public void a(int $$0, int $$1, boolean $$2, gfd $$3, gfd.a $$4) {
            int $$5 = $$1 - $$4.d - 1;
            int $$6 = $$0 + $$4.c;
            boolean $$7 = this.a($$0, $$5, $$6, $$1);
            if ($$7) {
                this.a($$3);
            }
            if ($$2 || $$7) {
                $$4.a(this.a, $$0, $$5);
            }
        }

        private void a(gfd $$0) {
            if ($$0.g() != null) {
                this.a.b(this.b, this.b.c($$0.g(), 210), this.e, this.f);
            }
        }

        @Override
        public /* synthetic */ void accept(Object object) {
            this.a((zf)object);
        }
    }

    static class g
    implements b {
        private final gir a;
        private final gil b;
        private gil.b c;

        public g(gir $$0) {
            this.a = $$0;
            this.b = $$0.a(gir.a.a, null);
            this.c = this.b.a();
        }

        @Override
        public void a(Consumer<Matrix3x2f> $$0) {
            $$0.accept((Matrix3x2f)this.a.e());
            this.c = this.c.a((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.a.e()));
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
            this.a.a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public boolean a(int $$0, float $$1, bfr $$2) {
            this.b.a(git.a, 0, $$0, this.c.b($$1), $$2);
            return false;
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, float $$4, gfd $$5) {
            int $$6 = bel.a($$4, $$5.e());
            this.a.a($$0, $$1, $$2, $$3, $$6);
        }

        @Override
        public void a(int $$0, int $$1, boolean $$2, gfd $$3, gfd.a $$4) {
        }
    }

    public static interface b {
        public void a(Consumer<Matrix3x2f> var1);

        public void a(int var1, int var2, int var3, int var4, int var5);

        public boolean a(int var1, float var2, bfr var3);

        public void a(int var1, int var2, int var3, int var4, float var5, gfd var6);

        public void a(int var1, int var2, boolean var3, gfd var4, gfd.a var5);
    }

    static class d
    implements b {
        private final gil a;

        public d(gil $$0) {
            this.a = $$0;
        }

        @Override
        public void a(Consumer<Matrix3x2f> $$0) {
            gil.b $$1 = this.a.a();
            Matrix3x2f $$2 = new Matrix3x2f($$1.a());
            $$0.accept($$2);
            this.a.a($$1.a((Matrix3x2fc)$$2));
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, int $$4) {
        }

        @Override
        public boolean a(int $$0, float $$1, bfr $$2) {
            this.a.a(git.a, 0, $$0, $$2);
            return false;
        }

        @Override
        public void a(int $$0, int $$1, int $$2, int $$3, float $$4, gfd $$5) {
        }

        @Override
        public void a(int $$0, int $$1, boolean $$2, gfd $$3, gfd.a $$4) {
        }
    }

    record e(yu a, int b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "signature;deletableAfter", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "signature;deletableAfter", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "signature;deletableAfter", "a", "b"}, this, $$0);
        }
    }

    public static final class f
    extends Record {
        private final String a;
        final c b;

        public f(String $$0, c $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "text;chatMethod", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "text;chatMethod", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "text;chatMethod", "a", "b"}, this, $$0);
        }

        public String a() {
            return this.a;
        }

        public c b() {
            return this.b;
        }
    }

    public static abstract sealed class c
    extends Enum<c> {
        public static final /* enum */ c a = new c(""){

            @Override
            public boolean a(f $$0) {
                return true;
            }
        };
        public static final /* enum */ c b = new c("/"){

            @Override
            public boolean a(f $$0) {
                return this == $$0.b;
            }
        };
        private final String c;
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        c(String $$0) {
            this.c = $$0;
        }

        public String a() {
            return this.c;
        }

        public abstract boolean a(f var1);

        private static /* synthetic */ c[] b() {
            return new c[]{a, b};
        }

        static {
            d = gjf$c.b();
        }
    }

    public static class j {
        final List<gfc> a;
        final List<String> b;
        final List<e> c;

        public j(List<gfc> $$0, List<String> $$1, List<e> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }
    }
}

