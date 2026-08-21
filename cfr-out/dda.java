/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public final class dda
extends Record {
    private final yh q;
    private final Predicate<jd<cta>> r;
    private final Predicate<jd<cta>> s;
    private final ImmutableSet<dlp> t;
    private final ImmutableSet<dzq> u;
    private final @Nullable bcz v;
    public static final Predicate<jd<cta>> a = $$0 -> $$0.a(bea.a);
    public static final amt<dda> b = dda.a("none");
    public static final amt<dda> c = dda.a("armorer");
    public static final amt<dda> d = dda.a("butcher");
    public static final amt<dda> e = dda.a("cartographer");
    public static final amt<dda> f = dda.a("cleric");
    public static final amt<dda> g = dda.a("farmer");
    public static final amt<dda> h = dda.a("fisherman");
    public static final amt<dda> i = dda.a("fletcher");
    public static final amt<dda> j = dda.a("leatherworker");
    public static final amt<dda> k = dda.a("librarian");
    public static final amt<dda> l = dda.a("mason");
    public static final amt<dda> m = dda.a("nitwit");
    public static final amt<dda> n = dda.a("shepherd");
    public static final amt<dda> o = dda.a("toolsmith");
    public static final amt<dda> p = dda.a("weaponsmith");

    public dda(yh $$0, Predicate<jd<cta>> $$1, Predicate<jd<cta>> $$2, ImmutableSet<dlp> $$3, ImmutableSet<dzq> $$4, @Nullable bcz $$5) {
        this.q = $$0;
        this.r = $$1;
        this.s = $$2;
        this.t = $$3;
        this.u = $$4;
        this.v = $$5;
    }

    private static amt<dda> a(String $$0) {
        return amt.a(mj.aL, amo.b($$0));
    }

    private static dda a(jq<dda> $$0, amt<dda> $$12, amt<cta> $$2, @Nullable bcz $$3) {
        return dda.a($$0, $$12, $$1 -> $$1.a($$2), $$1 -> $$1.a($$2), $$3);
    }

    private static dda a(jq<dda> $$0, amt<dda> $$1, Predicate<jd<cta>> $$2, Predicate<jd<cta>> $$3, @Nullable bcz $$4) {
        return dda.a($$0, $$1, $$2, $$3, (ImmutableSet<dlp>)ImmutableSet.of(), (ImmutableSet<dzq>)ImmutableSet.of(), $$4);
    }

    private static dda a(jq<dda> $$0, amt<dda> $$12, amt<cta> $$2, ImmutableSet<dlp> $$3, ImmutableSet<dzq> $$4, @Nullable bcz $$5) {
        return dda.a($$0, $$12, $$1 -> $$1.a($$2), $$1 -> $$1.a($$2), $$3, $$4, $$5);
    }

    private static dda a(jq<dda> $$0, amt<dda> $$1, Predicate<jd<cta>> $$2, Predicate<jd<cta>> $$3, ImmutableSet<dlp> $$4, ImmutableSet<dzq> $$5, @Nullable bcz $$6) {
        return jq.a($$0, $$1, new dda(yh.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
    }

    public static dda a(jq<dda> $$0) {
        dda.a($$0, b, cta.a, a, null);
        dda.a($$0, c, ctb.a, bda.Er);
        dda.a($$0, d, ctb.b, bda.Es);
        dda.a($$0, e, ctb.c, bda.Et);
        dda.a($$0, f, ctb.d, bda.Eu);
        dda.a($$0, g, ctb.e, (ImmutableSet<dlp>)ImmutableSet.of((Object)dlx.rc, (Object)dlx.rb, (Object)dlx.xA, (Object)dlx.tC), (ImmutableSet<dzq>)ImmutableSet.of((Object)dzs.cZ), bda.Ev);
        dda.a($$0, h, ctb.f, bda.Ew);
        dda.a($$0, i, ctb.g, bda.Ex);
        dda.a($$0, j, ctb.h, bda.Ey);
        dda.a($$0, k, ctb.i, bda.Ez);
        dda.a($$0, l, ctb.j, bda.EA);
        dda.a($$0, m, cta.a, cta.a, null);
        dda.a($$0, n, ctb.k, bda.EB);
        dda.a($$0, o, ctb.l, bda.EC);
        return dda.a($$0, p, ctb.m, bda.ED);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dda.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "q", "r", "s", "t", "u", "v"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dda.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "q", "r", "s", "t", "u", "v"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dda.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "q", "r", "s", "t", "u", "v"}, this, $$0);
    }

    public yh a() {
        return this.q;
    }

    public Predicate<jd<cta>> b() {
        return this.r;
    }

    public Predicate<jd<cta>> c() {
        return this.s;
    }

    public ImmutableSet<dlp> d() {
        return this.t;
    }

    public ImmutableSet<dzq> e() {
        return this.u;
    }

    public @Nullable bcz f() {
        return this.v;
    }
}

