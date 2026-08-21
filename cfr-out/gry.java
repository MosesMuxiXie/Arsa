/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gry
extends gsb {
    static final amo b = amo.b("container/slot");
    static final Logger c = LogUtils.getLogger();
    private static final int d = 18;
    private static final int e = 20;
    private static final int f = 1;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 2;
    private static final amt<dxo> w = dxv.b;
    public static final yh a = yh.c("flat_world_preset.unknown");
    private final grd x;
    private yh y;
    private yh z;
    private a A;
    private gje B;
    gjn C;
    fdr D;

    public gry(grd $$0) {
        super(yh.c("createWorld.customize.presets.title"));
        this.x = $$0;
    }

    /*
     * WARNING - void declaration
     */
    private static @Nullable fdo a(je<dzq> $$0, String $$1, int $$2) {
        void $$13;
        int $$8;
        String $$7;
        List $$3 = Splitter.on((char)'*').limit(2).splitToList((CharSequence)$$1);
        if ($$3.size() == 2) {
            String $$4 = (String)$$3.get(1);
            try {
                int $$5 = Math.max(Integer.parseInt((String)$$3.get(0)), 0);
            }
            catch (NumberFormatException $$6) {
                c.error("Error while parsing flat world string", (Throwable)$$6);
                return null;
            }
        } else {
            $$7 = (String)$$3.get(0);
            $$8 = 1;
        }
        int $$9 = Math.min($$2 + $$8, esh.c);
        int $$10 = $$9 - $$2;
        try {
            Optional<jd.c<dzq>> $$11 = $$0.a(amt.a(mj.i, amo.a($$7)));
        }
        catch (Exception $$12) {
            c.error("Error while parsing flat world string", (Throwable)$$12);
            return null;
        }
        if ($$13.isEmpty()) {
            c.error("Error while parsing flat world string => Unknown block, {}", (Object)$$7);
            return null;
        }
        return new fdo($$10, (dzq)((jd.c)$$13.get()).a());
    }

    private static List<fdo> a(je<dzq> $$0, String $$1) {
        ArrayList $$2 = Lists.newArrayList();
        String[] $$3 = $$1.split(",");
        int $$4 = 0;
        for (String $$5 : $$3) {
            fdo $$6 = gry.a($$0, $$5, $$4);
            if ($$6 == null) {
                return Collections.emptyList();
            }
            int $$7 = esh.c - $$4;
            if ($$7 <= 0) continue;
            $$2.add($$6.a($$7));
            $$4 += $$6.a();
        }
        return $$2;
    }

    public static fdr a(je<dzq> $$02, je<dxo> $$1, je<ffu> $$2, je<fes> $$3, String $$4, fdr $$5) {
        jd.c<dxo> $$8;
        Iterator $$6 = Splitter.on((char)';').split((CharSequence)$$4).iterator();
        if (!$$6.hasNext()) {
            return fdr.a($$1, $$2, $$3);
        }
        List<fdo> $$7 = gry.a($$02, (String)$$6.next());
        if ($$7.isEmpty()) {
            return fdr.a($$1, $$2, $$3);
        }
        jd<dxo> $$9 = $$8 = $$1.b(w);
        if ($$6.hasNext()) {
            String $$10 = (String)$$6.next();
            $$9 = Optional.ofNullable(amo.c($$10)).map($$0 -> amt.a(mj.aS, $$0)).flatMap($$1::a).orElseGet(() -> {
                c.warn("Invalid biome: {}", (Object)$$10);
                return $$8;
            });
        }
        return $$5.a($$7, $$5.c(), $$9);
    }

    static String a(fdr $$0) {
        StringBuilder $$1 = new StringBuilder();
        for (int $$2 = 0; $$2 < $$0.e().size(); ++$$2) {
            if ($$2 > 0) {
                $$1.append(",");
            }
            $$1.append($$0.e().get($$2));
        }
        $$1.append(";");
        $$1.append($$0.d().e().map(amt::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
        return $$1.toString();
    }

    @Override
    protected void bg_() {
        this.y = yh.c("createWorld.customize.presets.share");
        this.z = yh.c("createWorld.customize.presets.list");
        this.C = new gjn(this.q, 50, 40, this.o - 100, 20, this.y);
        this.C.k(1230);
        gyh $$02 = this.x.a.o().k();
        jr.b $$1 = $$02.a();
        dgz $$2 = $$02.h().b();
        jq<dxo> $$3 = $$1.f(mj.aS);
        jq<ffu> $$42 = $$1.f(mj.br);
        jq<fes> $$5 = $$1.f(mj.bp);
        jf.b $$6 = $$1.f(mj.i).a($$2);
        this.C.a(gry.a(this.x.l()));
        this.D = this.x.l();
        this.d(this.C);
        this.A = this.c(new a($$1, $$2));
        this.B = this.c(gje.a(yh.c("createWorld.customize.presets.select"), (gje $$4) -> {
            fdr $$5 = gry.a($$6, $$3, $$42, $$5, this.C.a(), this.D);
            this.x.a($$5);
            this.n.a(this.x);
        }).a(this.o / 2 - 155, this.p - 28, 150, 20).a());
        this.c(gje.a(yg.e, (gje $$0) -> this.n.a(this.x)).a(this.o / 2 + 5, this.p - 28, 150, 20).a());
        this.c(this.A.q() != null);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        return this.A.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(int $$0, int $$1) {
        String $$2 = this.C.a();
        this.b($$0, $$1);
        this.C.a($$2);
    }

    @Override
    public void aX_() {
        this.n.a(this.x);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 8, -1);
        $$0.b(this.q, this.y, 51, 30, -6250336);
        $$0.b(this.q, this.z, 51, 68, -6250336);
        this.C.a($$0, $$1, $$2, $$3);
    }

    public void c(boolean $$0) {
        this.B.k = $$0 || this.C.a().length() > 1;
    }

    class gry$a
    extends gkb<a> {
        public gry$a(jr $$02, dgz $$12) {
            super(gry.this.n, gry.this.o, gry.this.p - 117, 80, 24);
            for (jd<fdp> $$2 : $$02.f(mj.bg).c(bdu.a)) {
                Set $$3 = $$2.a().b().e().stream().map($$0 -> $$0.b().b()).filter($$1 -> !$$1.a($$12)).collect(Collectors.toSet());
                if (!$$3.isEmpty()) {
                    c.info("Discarding flat world preset {} since it contains experimental blocks {}", (Object)$$2.e().map($$0 -> $$0.a().toString()).orElse("<unknown>"), $$3);
                    continue;
                }
                this.c(new a($$2));
            }
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            gry.this.c($$0 != null);
        }

        @Override
        public boolean a(gzb $$0) {
            if (super.a($$0)) {
                return true;
            }
            if ($$0.c() && this.q() != null) {
                ((a)this.q()).b();
            }
            return false;
        }

        public class a
        extends gkb.a<a> {
            private static final amo b = amo.b("textures/gui/container/stats_icons.png");
            private final fdp c;
            private final yh d;

            public a(jd<fdp> $$1) {
                this.c = $$1.a();
                this.d = $$1.e().map($$0 -> yh.c($$0.a().h("flat_world_preset"))).orElse(gry.a);
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                this.a($$0, this.d(), this.h(), this.c.a().a());
                $$0.b(gry.this.q, this.d, this.d() + 18 + 5, this.h() + 6, -1);
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                this.b();
                return super.a($$0, $$1);
            }

            void b() {
                a.this.a(this);
                gry.this.D = this.c.b();
                gry.this.C.a(gry.a(gry.this.D));
                gry.this.C.a(false);
            }

            private void a(gir $$0, int $$1, int $$2, dlp $$3) {
                this.a($$0, $$1 + 1, $$2 + 1);
                $$0.b(new dlt($$3), $$1 + 2, $$2 + 2);
            }

            private void a(gir $$0, int $$1, int $$2) {
                $$0.a(hpa.at, b, $$1, $$2, 18, 18);
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", this.d);
            }
        }
    }
}

