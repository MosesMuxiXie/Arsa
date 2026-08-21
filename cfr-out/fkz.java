/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanMap
 *  it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 */
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.EnumMap;
import java.util.Map;

public abstract class fkz
extends fla {
    public static final eoy a = eox.l;
    public static final eph b = eox.aQ;
    private static final int e = 200;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<a>> f = ThreadLocal.withInitial(() -> {
        Object2ByteLinkedOpenHashMap<a> $$0 = new Object2ByteLinkedOpenHashMap<a>(200){

            protected void rehash(int $$0) {
            }
        };
        $$0.defaultReturnValue((byte)127);
        return $$0;
    });
    private final Map<flb, fug> g = Maps.newIdentityHashMap();

    @Override
    protected void a(eoi.a<fla, flb> $$0) {
        $$0.a(new epk[]{a});
    }

    @Override
    public ftm a(dvt $$0, is $$1, flb $$2) {
        double $$3 = 0.0;
        double $$4 = 0.0;
        is.a $$5 = new is.a();
        for (iz $$6 : iz.c.a) {
            $$5.a((jy)$$1, $$6);
            flb $$7 = $$0.b_($$5);
            if (!this.g($$7)) continue;
            float $$8 = $$7.d();
            float $$9 = 0.0f;
            if ($$8 == 0.0f) {
                is $$10;
                flb $$11;
                if (!$$0.a_($$5).d() && this.g($$11 = $$0.b_($$10 = $$5.e())) && ($$8 = $$11.d()) > 0.0f) {
                    $$9 = $$2.d() - ($$8 - 0.8888889f);
                }
            } else if ($$8 > 0.0f) {
                $$9 = $$2.d() - $$8;
            }
            if ($$9 == 0.0f) continue;
            $$3 += (double)((float)$$6.j() * $$9);
            $$4 += (double)((float)$$6.l() * $$9);
        }
        ftm $$12 = new ftm($$3, 0.0, $$4);
        if ($$2.c(a).booleanValue()) {
            for (iz $$13 : iz.c.a) {
                $$5.a((jy)$$1, $$13);
                if (!this.a($$0, (is)$$5, $$13) && !this.a($$0, $$5.d(), $$13)) continue;
                $$12 = $$12.d().b(0.0, -6.0, 0.0);
                break;
            }
        }
        return $$12.d();
    }

    private boolean g(flb $$0) {
        return $$0.c() || $$0.a().a(this);
    }

    protected boolean a(dvt $$0, is $$1, iz $$2) {
        eoh $$3 = $$0.a_($$1);
        flb $$4 = $$0.b_($$1);
        if ($$4.a().a(this)) {
            return false;
        }
        if ($$2 == iz.b) {
            return true;
        }
        if ($$3.b() instanceof edv) {
            return false;
        }
        return $$3.c($$0, $$1, $$2);
    }

    protected void a(axf $$0, is $$1, eoh $$2, flb $$3) {
        flb $$7;
        fla $$8;
        flb $$6;
        eoh $$5;
        if ($$3.c()) {
            return;
        }
        is $$4 = $$1.e();
        if (this.a($$0, $$1, $$2, iz.a, $$4, $$5 = $$0.a_($$4), $$6 = $$5.y()) && $$6.a((dvt)$$0, $$4, $$8 = ($$7 = this.a($$0, $$4, $$5)).a(), iz.a) && fkz.b($$0, $$4, $$5, $$8)) {
            this.a($$0, $$4, $$5, iz.a, $$7);
            if (this.a($$0, $$1) >= 3) {
                this.a($$0, $$1, $$3, $$2);
            }
            return;
        }
        if ($$3.b() || !this.a((dvt)$$0, $$1, $$2, $$4, $$5)) {
            this.a($$0, $$1, $$3, $$2);
        }
    }

    private void a(axf $$0, is $$1, flb $$2, eoh $$3) {
        int $$4 = $$2.e() - this.c($$0);
        if ($$2.c(a).booleanValue()) {
            $$4 = 7;
        }
        if ($$4 <= 0) {
            return;
        }
        Map<iz, flb> $$5 = this.b($$0, $$1, $$3);
        for (Map.Entry<iz, flb> $$6 : $$5.entrySet()) {
            iz $$7 = $$6.getKey();
            flb $$8 = $$6.getValue();
            is $$9 = $$1.a($$7);
            this.a($$0, $$9, $$0.a_($$9), $$7, $$8);
        }
    }

    protected flb a(axf $$0, is $$1, eoh $$2) {
        is.a $$12;
        eoh $$13;
        flb $$14;
        int $$3 = 0;
        int $$4 = 0;
        is.a $$5 = new is.a();
        for (iz $$6 : iz.c.a) {
            is.a $$7 = $$5.a((jy)$$1, $$6);
            eoh $$8 = $$0.a_($$7);
            flb $$9 = $$8.y();
            if (!$$9.a().a(this) || !fkz.a($$6, $$0, $$1, $$2, $$7, $$8)) continue;
            if ($$9.b()) {
                ++$$4;
            }
            $$3 = Math.max($$3, $$9.e());
        }
        if ($$4 >= 2 && this.a($$0)) {
            eoh $$10 = $$0.a_($$5.a((jy)$$1, iz.a));
            flb $$11 = $$10.y();
            if ($$10.e() || this.h($$11)) {
                return this.a(false);
            }
        }
        if (!($$14 = ($$13 = $$0.a_($$12 = $$5.a((jy)$$1, iz.b))).y()).c() && $$14.a().a(this) && fkz.a(iz.b, $$0, $$1, $$2, $$12, $$13)) {
            return this.a(8, true);
        }
        int $$15 = $$3 - this.c($$0);
        if ($$15 <= 0) {
            return flc.a.g();
        }
        return this.a($$15, false);
    }

    private static boolean a(iz $$0, dvt $$1, is $$2, eoh $$3, is $$4, eoh $$5) {
        boolean $$13;
        Object $$12;
        Object2ByteLinkedOpenHashMap<a> $$9;
        if (w.as || w.ax && $$4.w() < 0) {
            return false;
        }
        fug $$6 = $$5.g($$1, $$4);
        if ($$6 == fud.b()) {
            return false;
        }
        fug $$7 = $$3.g($$1, $$2);
        if ($$7 == fud.b()) {
            return false;
        }
        if ($$7 == fud.a() && $$6 == fud.a()) {
            return true;
        }
        if ($$3.b().n() || $$5.b().n()) {
            Object $$8 = null;
        } else {
            $$9 = f.get();
        }
        if ($$9 != null) {
            a $$10 = new a($$3, $$5, $$0);
            byte $$11 = $$9.getAndMoveToFirst((Object)$$10);
            if ($$11 != 127) {
                return $$11 != 0;
            }
        } else {
            $$12 = null;
        }
        boolean bl2 = $$13 = !fud.b($$7, $$6, $$0);
        if ($$9 != null) {
            if ($$9.size() == 200) {
                $$9.removeLastByte();
            }
            $$9.putAndMoveToFirst($$12, (byte)($$13 ? 1 : 0));
        }
        return $$13;
    }

    public abstract fla d();

    public flb a(int $$0, boolean $$1) {
        return (flb)((flb)this.d().g().b(b, $$0)).b(a, $$1);
    }

    public abstract fla e();

    public flb a(boolean $$0) {
        return (flb)this.e().g().b(a, $$0);
    }

    protected abstract boolean a(axf var1);

    protected void a(dwp $$0, is $$1, eoh $$2, iz $$3, flb $$4) {
        dzq dzq2 = $$2.b();
        if (dzq2 instanceof eep) {
            eep $$5 = (eep)((Object)dzq2);
            $$5.a($$0, $$1, $$2, $$4);
        } else {
            if (!$$2.l()) {
                this.a($$0, $$1, $$2);
            }
            $$0.a($$1, $$4.g(), 3);
        }
    }

    protected abstract void a(dwp var1, is var2, eoh var3);

    protected int a(dwr $$0, is $$1, int $$2, iz $$3, eoh $$4, b $$5) {
        int $$6 = 1000;
        for (iz $$7 : iz.c.a) {
            int $$11;
            if ($$7 == $$3) continue;
            is $$8 = $$1.a($$7);
            eoh $$9 = $$5.a($$8);
            flb $$10 = $$9.y();
            if (!this.a($$0, this.d(), $$1, $$4, $$7, $$8, $$9, $$10)) continue;
            if ($$5.b($$8)) {
                return $$2;
            }
            if ($$2 >= this.b($$0) || ($$11 = this.a($$0, $$8, $$2 + 1, $$7.g(), $$9, $$5)) >= $$6) continue;
            $$6 = $$11;
        }
        return $$6;
    }

    boolean a(dvt $$0, is $$1, eoh $$2, is $$3, eoh $$4) {
        if (!fkz.a(iz.a, $$0, $$1, $$2, $$3, $$4)) {
            return false;
        }
        if ($$4.y().a().a(this)) {
            return true;
        }
        return fkz.a($$0, $$3, $$4, this.d());
    }

    private boolean a(dvt $$0, fla $$1, is $$2, eoh $$3, iz $$4, is $$5, eoh $$6, flb $$7) {
        return this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7) && fkz.b($$0, $$5, $$6, $$1);
    }

    private boolean a(dvt $$0, is $$1, eoh $$2, iz $$3, is $$4, eoh $$5, flb $$6) {
        return !this.h($$6) && fkz.a($$5) && fkz.a($$3, $$0, $$1, $$2, $$4, $$5);
    }

    private boolean h(flb $$0) {
        return $$0.a().a(this) && $$0.b();
    }

    protected abstract int b(dwr var1);

    private int a(dwr $$0, is $$1) {
        int $$2 = 0;
        for (iz $$3 : iz.c.a) {
            is $$4 = $$1.a($$3);
            flb $$5 = $$0.b_($$4);
            if (!this.h($$5)) continue;
            ++$$2;
        }
        return $$2;
    }

    protected Map<iz, flb> b(axf $$0, is $$1, eoh $$2) {
        int $$3 = 1000;
        EnumMap $$4 = Maps.newEnumMap(iz.class);
        b $$5 = null;
        for (iz $$6 : iz.c.a) {
            int $$12;
            flb $$10;
            flb $$9;
            eoh $$8;
            is $$7;
            if (!this.a($$0, $$1, $$2, $$6, $$7 = $$1.a($$6), $$8 = $$0.a_($$7), $$9 = $$8.y()) || !fkz.b($$0, $$7, $$8, ($$10 = this.a($$0, $$7, $$8)).a())) continue;
            if ($$5 == null) {
                $$5 = new b($$0, $$1);
            }
            if ($$5.b($$7)) {
                boolean $$11 = false;
            } else {
                $$12 = this.a($$0, $$7, 1, $$6.g(), $$8, $$5);
            }
            if ($$12 < $$3) {
                $$4.clear();
            }
            if ($$12 > $$3) continue;
            if ($$9.a((dvt)$$0, $$7, $$10.a(), $$6)) {
                $$4.put($$6, $$10);
            }
            $$3 = $$12;
        }
        return $$4;
    }

    private static boolean a(eoh $$0) {
        dzq $$1 = $$0.b();
        if ($$1 instanceof eep) {
            return true;
        }
        if ($$0.d()) {
            return false;
        }
        return !($$1 instanceof ebz) && !$$0.a(bdp.aM) && !$$0.a(dzs.dm) && !$$0.a(dzs.ev) && !$$0.a(dzs.oa) && !$$0.a(dzs.eI) && !$$0.a(dzs.gm) && !$$0.a(dzs.lB) && !$$0.a(dzs.lJ);
    }

    private static boolean a(dvt $$0, is $$1, eoh $$2, fla $$3) {
        return fkz.a($$2) && fkz.b($$0, $$1, $$2, $$3);
    }

    private static boolean b(dvt $$0, is $$1, eoh $$2, fla $$3) {
        dzq $$4 = $$2.b();
        if ($$4 instanceof eep) {
            eep $$5 = (eep)((Object)$$4);
            return $$5.a(null, $$0, $$1, $$2, $$3);
        }
        return true;
    }

    protected abstract int c(dwr var1);

    protected int a(dwo $$0, is $$1, flb $$2, flb $$3) {
        return this.a($$0);
    }

    @Override
    public void b(axf $$0, is $$1, eoh $$2, flb $$3) {
        if (!$$3.b()) {
            flb $$4 = this.a($$0, $$1, $$0.a_($$1));
            int $$5 = this.a((dwo)$$0, $$1, $$3, $$4);
            if ($$4.c()) {
                $$3 = $$4;
                $$2 = dzs.a.m();
                $$0.a($$1, $$2, 3);
            } else if ($$4 != $$3) {
                $$3 = $$4;
                $$2 = $$3.g();
                $$0.a($$1, $$2, 3);
                $$0.a($$1, $$3.a(), $$5);
            }
        }
        this.a($$0, $$1, $$2, $$3);
    }

    protected static int e(flb $$0) {
        if ($$0.b()) {
            return 0;
        }
        return 8 - Math.min($$0.e(), 8) + ($$0.c(a) != false ? 8 : 0);
    }

    private static boolean d(flb $$0, dvt $$1, is $$2) {
        return $$0.a().a($$1.b_($$2.d()).a());
    }

    @Override
    public float a(flb $$0, dvt $$1, is $$2) {
        if (fkz.d($$0, $$1, $$2)) {
            return 1.0f;
        }
        return $$0.d();
    }

    @Override
    public float a(flb $$0) {
        return (float)$$0.e() / 9.0f;
    }

    @Override
    public abstract int d(flb var1);

    @Override
    public fug b(flb $$0, dvt $$1, is $$22) {
        if ($$0.e() == 9 && fkz.d($$0, $$1, $$22)) {
            return fud.b();
        }
        return this.g.computeIfAbsent($$0, $$2 -> fud.a(0.0, 0.0, 0.0, 1.0, $$2.a($$1, $$22), 1.0));
    }

    record a(eoh a, eoh b, iz c) {
        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean equals(Object $$0) {
            if (!($$0 instanceof a)) return false;
            a $$1 = (a)$$0;
            if (this.a != $$1.a) return false;
            if (this.b != $$1.b) return false;
            if (this.c != $$1.c) return false;
            return true;
        }

        @Override
        public int hashCode() {
            int $$0 = System.identityHashCode(this.a);
            $$0 = 31 * $$0 + System.identityHashCode(this.b);
            $$0 = 31 * $$0 + this.c.hashCode();
            return $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "first;second;direction", "a", "b", "c"}, this);
        }
    }

    protected class b {
        private final dvt b;
        private final is c;
        private final Short2ObjectMap<eoh> d = new Short2ObjectOpenHashMap();
        private final Short2BooleanMap e = new Short2BooleanOpenHashMap();

        b(dvt $$1, is $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public eoh a(is $$0) {
            return this.a($$0, this.c($$0));
        }

        private eoh a(is $$0, short $$12) {
            return (eoh)this.d.computeIfAbsent($$12, $$1 -> this.b.a_($$0));
        }

        public boolean b(is $$0) {
            return this.e.computeIfAbsent(this.c($$0), $$1 -> {
                eoh $$2 = this.a($$0, $$1);
                is $$3 = $$0.e();
                eoh $$4 = this.b.a_($$3);
                return fkz.this.a(this.b, $$0, $$2, $$3, $$4);
            });
        }

        private short c(is $$0) {
            int $$1 = $$0.u() - this.c.u();
            int $$2 = $$0.w() - this.c.w();
            return (short)(($$1 + 128 & 0xFF) << 8 | $$2 + 128 & 0xFF);
        }
    }
}

