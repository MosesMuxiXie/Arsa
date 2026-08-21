/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.stream.Stream;

public final class eow
extends Record {
    private final String s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final a w;
    private final ehs x;
    private final bcz y;
    private final bcz z;
    private final bcz A;
    private final bcz B;
    private final bcz C;
    private final bcz D;
    private final bcz E;
    private final bcz F;
    private static final Map<String, eow> G = new Object2ObjectArrayMap();
    public static final Codec<eow> a = Codec.stringResolver(eow::b, G::get);
    public static final eow b = eow.a(new eow("iron", false, false, false, eow$a.a, ehs.br, bda.pq, bda.pr, bda.py, bda.pz, bda.qW, bda.qX, bda.Cw, bda.Cx));
    public static final eow c = eow.a(new eow("copper", true, true, false, eow$a.a, ehs.aj, bda.gu, bda.gv, bda.gZ, bda.ha, bda.qW, bda.qX, bda.Cw, bda.Cx));
    public static final eow d = eow.a(new eow("gold", false, true, false, eow$a.a, ehs.g, bda.pq, bda.pr, bda.py, bda.pz, bda.qW, bda.qX, bda.Cw, bda.Cx));
    public static final eow e = eow.a(new eow("stone", true, true, false, eow$a.b, ehs.f, bda.pq, bda.pr, bda.py, bda.pz, bda.CB, bda.CC, bda.Cw, bda.Cx));
    public static final eow f = eow.a(new eow("polished_blackstone", true, true, false, eow$a.b, ehs.f, bda.pq, bda.pr, bda.py, bda.pz, bda.CB, bda.CC, bda.Cw, bda.Cx));
    public static final eow g = eow.a(new eow("oak"));
    public static final eow h = eow.a(new eow("spruce"));
    public static final eow i = eow.a(new eow("birch"));
    public static final eow j = eow.a(new eow("acacia"));
    public static final eow k = eow.a(new eow("cherry", true, true, true, eow$a.a, ehs.aX, bda.ff, bda.fg, bda.fh, bda.fi, bda.fl, bda.fm, bda.fj, bda.fk));
    public static final eow l = eow.a(new eow("jungle"));
    public static final eow m = eow.a(new eow("dark_oak"));
    public static final eow n = eow.a(new eow("pale_oak"));
    public static final eow o = eow.a(new eow("crimson", true, true, true, eow$a.a, ehs.aW, bda.tq, bda.tr, bda.ts, bda.tt, bda.tw, bda.tx, bda.tu, bda.tv));
    public static final eow p = eow.a(new eow("warped", true, true, true, eow$a.a, ehs.aW, bda.tq, bda.tr, bda.ts, bda.tt, bda.tw, bda.tx, bda.tu, bda.tv));
    public static final eow q = eow.a(new eow("mangrove"));
    public static final eow r = eow.a(new eow("bamboo", true, true, true, eow$a.a, ehs.aV, bda.bA, bda.bB, bda.bC, bda.bD, bda.bG, bda.bH, bda.bE, bda.bF));

    public eow(String $$0) {
        this($$0, true, true, true, eow$a.a, ehs.b, bda.Gi, bda.Gj, bda.Gk, bda.Gl, bda.Go, bda.Gp, bda.Gm, bda.Gn);
    }

    public eow(String $$0, boolean $$1, boolean $$2, boolean $$3, a $$4, ehs $$5, bcz $$6, bcz $$7, bcz $$8, bcz $$9, bcz $$10, bcz $$11, bcz $$12, bcz $$13) {
        this.s = $$0;
        this.t = $$1;
        this.u = $$2;
        this.v = $$3;
        this.w = $$4;
        this.x = $$5;
        this.y = $$6;
        this.z = $$7;
        this.A = $$8;
        this.B = $$9;
        this.C = $$10;
        this.D = $$11;
        this.E = $$12;
        this.F = $$13;
    }

    private static eow a(eow $$0) {
        G.put($$0.s, $$0);
        return $$0;
    }

    public static Stream<eow> a() {
        return G.values().stream();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eow.class, "name;canOpenByHand;canOpenByWindCharge;canButtonBeActivatedByArrows;pressurePlateSensitivity;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eow.class, "name;canOpenByHand;canOpenByWindCharge;canButtonBeActivatedByArrows;pressurePlateSensitivity;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eow.class, "name;canOpenByHand;canOpenByWindCharge;canButtonBeActivatedByArrows;pressurePlateSensitivity;soundType;doorClose;doorOpen;trapdoorClose;trapdoorOpen;pressurePlateClickOff;pressurePlateClickOn;buttonClickOff;buttonClickOn", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F"}, this, $$0);
    }

    public String b() {
        return this.s;
    }

    public boolean c() {
        return this.t;
    }

    public boolean d() {
        return this.u;
    }

    public boolean e() {
        return this.v;
    }

    public a f() {
        return this.w;
    }

    public ehs g() {
        return this.x;
    }

    public bcz h() {
        return this.y;
    }

    public bcz i() {
        return this.z;
    }

    public bcz j() {
        return this.A;
    }

    public bcz k() {
        return this.B;
    }

    public bcz l() {
        return this.C;
    }

    public bcz m() {
        return this.D;
    }

    public bcz n() {
        return this.E;
    }

    public bcz o() {
        return this.F;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = eow$a.a();
        }
    }
}

