/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class dni
extends Record {
    private final bef<dzq> h;
    private final int i;
    private final float j;
    private final float k;
    private final int l;
    private final bef<dlp> m;
    public static final dni a = new dni(bdp.cc, 59, 2.0f, 0.0f, 15, bdy.bv);
    public static final dni b = new dni(bdp.ca, 131, 4.0f, 1.0f, 5, bdy.bw);
    public static final dni c = new dni(bdp.bZ, 190, 5.0f, 1.0f, 13, bdy.bx);
    public static final dni d = new dni(bdp.bY, 250, 6.0f, 2.0f, 14, bdy.by);
    public static final dni e = new dni(bdp.bX, 1561, 8.0f, 3.0f, 10, bdy.bA);
    public static final dni f = new dni(bdp.cb, 32, 12.0f, 0.0f, 22, bdy.bz);
    public static final dni g = new dni(bdp.bW, 2031, 9.0f, 4.0f, 15, bdy.bB);

    public dni(bef<dzq> $$0, int $$1, float $$2, float $$3, int $$4, bef<dlp> $$5) {
        this.h = $$0;
        this.i = $$1;
        this.j = $$2;
        this.k = $$3;
        this.l = $$4;
        this.m = $$5;
    }

    private dlp.a a(dlp.a $$0) {
        return $$0.b(this.i).a(this.m).c(this.l);
    }

    public dlp.a a(dlp.a $$0, bef<dzq> $$1, float $$2, float $$3, float $$4) {
        je<dzq> $$5 = mi.a(mi.e);
        return this.a($$0).a(ki.D, new dpc(List.of(dpc.a.a($$5.b(this.h)), dpc.a.a($$5.b($$1), this.j)), 1.0f, 1, true)).a(this.a($$2, $$3)).a(ki.E, new dpj(2, $$4));
    }

    private don a(float $$0, float $$1) {
        return don.a().a(cis.d, new ciq(dlp.h, $$0 + this.k, ciq.a.a), cgw.b).a(cis.f, new ciq(dlp.i, $$1, ciq.a.a), cgw.b).a();
    }

    public dlp.a a(dlp.a $$0, float $$1, float $$2) {
        je<dzq> $$3 = mi.a(mi.e);
        return this.a($$0).a(ki.D, new dpc(List.of(dpc.a.a(jh.a(dzs.bz.p()), 15.0f), dpc.a.b($$3.b(bdp.bS), Float.MAX_VALUE), dpc.a.b($$3.b(bdp.bR), 1.5f)), 1.0f, 2, false)).a(this.b($$1, $$2)).a(ki.E, new dpj(1));
    }

    private don b(float $$0, float $$1) {
        return don.a().a(cis.d, new ciq(dlp.h, $$0 + this.k, ciq.a.a), cgw.b).a(cis.f, new ciq(dlp.i, $$1, ciq.a.a), cgw.b).a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dni.class, "incorrectBlocksForDrops;durability;speed;attackDamageBonus;enchantmentValue;repairItems", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dni.class, "incorrectBlocksForDrops;durability;speed;attackDamageBonus;enchantmentValue;repairItems", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dni.class, "incorrectBlocksForDrops;durability;speed;attackDamageBonus;enchantmentValue;repairItems", "h", "i", "j", "k", "l", "m"}, this, $$0);
    }

    public bef<dzq> a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public float c() {
        return this.j;
    }

    public float d() {
        return this.k;
    }

    public int e() {
        return this.l;
    }

    public bef<dlp> f() {
        return this.m;
    }
}

