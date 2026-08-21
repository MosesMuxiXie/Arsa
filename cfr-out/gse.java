/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class gse
extends gsb {
    private static final amo a = amo.b("textures/misc/credits_vignette.png");
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.b("============").a(l.p);
    private static final String d = "           ";
    private static final String e = String.valueOf(l.p) + String.valueOf(l.q) + String.valueOf(l.k) + String.valueOf(l.l);
    private static final float f = 5.0f;
    private static final float t = 15.0f;
    private static final amo u = amo.b("texts/end.txt");
    private static final amo v = amo.b("texts/credits.json");
    private static final amo w = amo.b("texts/postcredits.txt");
    private final boolean x;
    private final Runnable y;
    private float z;
    private List<bfr> A;
    private List<yh> B;
    private IntSet C;
    private int D;
    private boolean E;
    private final IntSet F = new IntOpenHashSet();
    private float G;
    private final float H;
    private int I;
    private final gjw J = new gjw(false);

    public gse(boolean $$0, Runnable $$1) {
        super(gfa.a);
        this.x = $$0;
        this.y = $$1;
        this.H = !$$0 ? 0.75f : 0.5f;
        this.I = 1;
        this.G = this.H;
    }

    private float o() {
        if (this.E) {
            return this.H * (5.0f + (float)this.F.size() * 15.0f) * (float)this.I;
        }
        return this.H * (float)this.I;
    }

    @Override
    public void e() {
        this.n.w().a();
        this.n.ap().a(false);
        float $$0 = this.D + this.p + this.p + 24;
        if (this.z > $$0) {
            this.p();
        }
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.h()) {
            this.I = -1;
        } else if ($$0.t() == 341 || $$0.t() == 345) {
            this.F.add($$0.t());
        } else if ($$0.t() == 32) {
            this.E = true;
        }
        this.G = this.o();
        return super.a($$0);
    }

    @Override
    public boolean b(gzb $$0) {
        if ($$0.h()) {
            this.I = 1;
        }
        if ($$0.t() == 32) {
            this.E = false;
        } else if ($$0.t() == 341 || $$0.t() == 345) {
            this.F.remove($$0.t());
        }
        this.G = this.o();
        return super.b($$0);
    }

    @Override
    public void aX_() {
        this.p();
    }

    private void p() {
        this.y.run();
    }

    @Override
    protected void bg_() {
        if (this.A != null) {
            return;
        }
        this.A = Lists.newArrayList();
        this.B = Lists.newArrayList();
        this.C = new IntOpenHashSet();
        if (this.x) {
            this.a(u, this::a);
        }
        this.a(v, this::b);
        if (this.x) {
            this.a(w, this::a);
        }
        this.D = this.A.size() * 12;
    }

    @Override
    public yh i() {
        return yg.a((yh[])this.B.toArray(yh[]::new));
    }

    private void a(amo $$0, a $$1) {
        try (BufferedReader $$2 = this.n.ah().openAsReader($$0);){
            $$1.read($$2);
        }
        catch (Exception $$3) {
            b.error("Couldn't load credits from file {}", (Object)$$0, (Object)$$3);
        }
    }

    private void a(Reader $$0) throws IOException {
        Object $$3;
        BufferedReader $$1 = new BufferedReader($$0);
        bgr $$2 = bgr.a(8124371L);
        while (($$3 = $$1.readLine()) != null) {
            int $$4;
            $$3 = ((String)$$3).replaceAll("PLAYERNAME", this.n.ac().c());
            while (($$4 = ((String)$$3).indexOf(e)) != -1) {
                String $$5 = ((String)$$3).substring(0, $$4);
                String $$6 = ((String)$$3).substring($$4 + e.length());
                $$3 = $$5 + String.valueOf(l.p) + String.valueOf(l.q) + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
            }
            this.a((String)$$3);
            this.F();
        }
        for (int $$7 = 0; $$7 < 8; ++$$7) {
            this.F();
        }
    }

    private void b(Reader $$0) {
        JsonArray $$1 = bfv.b($$0);
        for (JsonElement $$2 : $$1) {
            JsonObject $$3 = $$2.getAsJsonObject();
            String $$4 = $$3.get("section").getAsString();
            this.a(c, true, false);
            this.a(yh.b($$4).a(l.o), true, true);
            this.a(c, true, false);
            this.F();
            this.F();
            JsonArray $$5 = $$3.getAsJsonArray("disciplines");
            for (JsonElement $$6 : $$5) {
                JsonObject $$7 = $$6.getAsJsonObject();
                String $$8 = $$7.get("discipline").getAsString();
                if (StringUtils.isNotEmpty((CharSequence)$$8)) {
                    this.a(yh.b($$8).a(l.o), true, true);
                    this.F();
                    this.F();
                }
                JsonArray $$9 = $$7.getAsJsonArray("titles");
                for (JsonElement $$10 : $$9) {
                    JsonObject $$11 = $$10.getAsJsonObject();
                    String $$12 = $$11.get("title").getAsString();
                    JsonArray $$13 = $$11.getAsJsonArray("names");
                    this.a(yh.b($$12).a(l.h), false, true);
                    for (JsonElement $$14 : $$13) {
                        String $$15 = $$14.getAsString();
                        this.a(yh.b(d).f($$15).a(l.p), false, true);
                    }
                    this.F();
                    this.F();
                }
            }
        }
    }

    private void F() {
        this.A.add(bfr.a);
        this.B.add(yg.a);
    }

    private void a(String $$0) {
        yw $$1 = yh.b($$0);
        this.A.addAll(this.n.g.c($$1, 256));
        this.B.add($$1);
    }

    private void a(yh $$0, boolean $$1, boolean $$2) {
        if ($$1) {
            this.C.add(this.A.size());
        }
        this.A.add($$0.g());
        if ($$2) {
            this.B.add($$0);
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.d($$0);
        this.z = Math.max(0.0f, this.z + $$3 * this.G);
        int $$4 = this.o / 2 - 128;
        int $$5 = this.p + 50;
        float $$6 = -this.z;
        $$0.e().pushMatrix();
        $$0.e().translate(0.0f, $$6);
        $$0.c();
        this.J.a($$0, this.o, 1.0f, $$5);
        int $$7 = $$5 + 100;
        for (int $$8 = 0; $$8 < this.A.size(); ++$$8) {
            float $$9;
            if ($$8 == this.A.size() - 1 && ($$9 = (float)$$7 + $$6 - (float)(this.p / 2 - 6)) < 0.0f) {
                $$0.e().translate(0.0f, -$$9);
            }
            if ((float)$$7 + $$6 + 12.0f + 8.0f > 0.0f && (float)$$7 + $$6 < (float)this.p) {
                bfr $$10 = this.A.get($$8);
                if (this.C.contains($$8)) {
                    $$0.a(this.q, $$10, $$4 + 128, $$7, -1);
                } else {
                    $$0.b(this.q, $$10, $$4, $$7, -1);
                }
            }
            $$7 += 12;
        }
        $$0.e().popMatrix();
    }

    private void d(gir $$0) {
        $$0.a(hpa.az, a, 0, 0, 0.0f, 0.0f, this.o, this.p, this.o, this.p);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        if (this.x) {
            ilr $$4 = gfj.V().af();
            ikz $$5 = $$4.b(hrb.a);
            ikz $$6 = $$4.b(hrb.b);
            gpq $$7 = gpq.a($$5.b(), $$5.c(), $$6.b(), $$6.c());
            $$0.a(hpa.V, $$7, 0, 0, this.o, this.p);
        } else {
            super.b($$0, $$1, $$2, $$3);
        }
    }

    @Override
    protected void a(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        float $$5 = this.z * 0.5f;
        gsb.a($$0, gsb.g, 0, 0, 0.0f, $$5, $$3, $$4);
    }

    @Override
    public boolean ba_() {
        return !this.x;
    }

    @Override
    public boolean bb_() {
        return true;
    }

    @Override
    public void aZ_() {
        this.n.w().b(bcy.c);
    }

    @Override
    public bcx E() {
        return bcy.c;
    }

    @FunctionalInterface
    static interface a {
        public void read(Reader var1) throws IOException;
    }
}

