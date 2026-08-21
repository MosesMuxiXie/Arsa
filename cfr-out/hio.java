/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.primitives.Shorts
 *  com.google.common.primitives.SignedBytes
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hio {
    private static final Logger a = LogUtils.getLogger();
    private final gfj b;
    private final hig c;
    private is d = new is(-1, -1, -1);
    private dlt e = dlt.l;
    private float f;
    private float g;
    private int h;
    private boolean i;
    private dwl j = dwl.e;
    private @Nullable dwl k;
    private int l;

    public hio(gfj $$0, hig $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public void a(ddm $$0) {
        this.j.a($$0.gL());
    }

    public void a(dwl $$0, @Nullable dwl $$1) {
        this.j = $$0;
        this.k = $$1;
        this.j.a(this.b.s.gL());
    }

    public void a(dwl $$0) {
        if ($$0 != this.j) {
            this.k = this.j;
        }
        this.j = $$0;
        this.j.a(this.b.s.gL());
    }

    public boolean a() {
        return this.j.h();
    }

    public boolean a(is $$0) {
        if (this.b.s.a(this.b.r, $$0, this.j)) {
            return false;
        }
        hif $$1 = this.b.r;
        eoh $$2 = $$1.a_($$0);
        if (!this.b.s.fx().a($$2, $$1, $$0, (ddm)this.b.s)) {
            return false;
        }
        dzq $$3 = $$2.b();
        if ($$3 instanceof ede && !this.b.s.hi()) {
            return false;
        }
        if ($$2.l()) {
            return false;
        }
        $$3.a((dwo)$$1, $$0, $$2, this.b.s);
        flb $$4 = $$1.b_($$0);
        boolean $$5 = $$1.a($$0, $$4.g(), 11);
        if ($$5) {
            $$3.a($$1, $$0, $$2);
        }
        if (w.U) {
            a.error("client broke {} {} -> {}", new Object[]{$$0, $$2, $$1.a_($$0)});
        }
        return $$5;
    }

    public boolean a(is $$0, iz $$1) {
        if (this.b.s.a(this.b.r, $$0, this.j)) {
            return false;
        }
        if (!this.b.r.w().a($$0)) {
            return false;
        }
        if (this.b.s.gL().d) {
            eoh $$22 = this.b.r.a_($$0);
            this.b.aH().a(this.b.r, $$0, $$22, 1.0f);
            if (w.U) {
                a.info("Creative start {} {}", (Object)$$0, (Object)$$22);
            }
            this.a(this.b.r, (int $$2) -> {
                this.a($$0);
                return new aji(aji.a.a, $$0, $$1, $$2);
            });
            this.h = 5;
        } else if (!this.i || !this.b($$0)) {
            if (this.i) {
                if (w.U) {
                    a.info("Abort old break {} {}", (Object)$$0, (Object)this.b.r.a_($$0));
                }
                this.c.b(new aji(aji.a.b, this.d, $$1));
            }
            eoh $$32 = this.b.r.a_($$0);
            this.b.aH().a(this.b.r, $$0, $$32, 0.0f);
            if (w.U) {
                a.info("Start break {} {}", (Object)$$0, (Object)$$32);
            }
            this.a(this.b.r, (int $$3) -> {
                boolean $$4;
                boolean bl2 = $$4 = !$$32.l();
                if ($$4 && this.f == 0.0f) {
                    $$32.a((dwo)this.b.r, $$0, this.b.s);
                }
                if ($$4 && $$32.a(this.b.s, this.b.s.ao(), $$0) >= 1.0f) {
                    this.a($$0);
                } else {
                    this.i = true;
                    this.d = $$0;
                    this.e = this.b.s.fx();
                    this.f = 0.0f;
                    this.g = 0.0f;
                    this.b.r.a(this.b.s.aA(), this.d, this.k());
                }
                return new aji(aji.a.a, $$0, $$1, $$3);
            });
        }
        return true;
    }

    public void b() {
        if (this.i) {
            eoh $$0 = this.b.r.a_(this.d);
            this.b.aH().a(this.b.r, this.d, $$0, -1.0f);
            if (w.U) {
                a.info("Stop dest {} {}", (Object)this.d, (Object)$$0);
            }
            this.c.b(new aji(aji.a.b, this.d, iz.a));
            this.i = false;
            this.f = 0.0f;
            this.b.r.a(this.b.s.aA(), this.d, -1);
            this.b.s.hf();
        }
    }

    public boolean b(is $$0, iz $$1) {
        this.l();
        if (this.h > 0) {
            --this.h;
            return true;
        }
        if (this.b.s.gL().d && this.b.r.w().a($$0)) {
            this.h = 5;
            eoh $$22 = this.b.r.a_($$0);
            this.b.aH().a(this.b.r, $$0, $$22, 1.0f);
            if (w.U) {
                a.info("Creative cont {} {}", (Object)$$0, (Object)$$22);
            }
            this.a(this.b.r, (int $$2) -> {
                this.a($$0);
                return new aji(aji.a.a, $$0, $$1, $$2);
            });
            return true;
        }
        if (this.b($$0)) {
            eoh $$3 = this.b.r.a_($$0);
            if ($$3.l()) {
                this.i = false;
                return false;
            }
            this.f += $$3.a(this.b.s, this.b.s.ao(), $$0);
            if (this.g % 4.0f == 0.0f) {
                ehs $$4 = $$3.A();
                this.b.ap().a(new iph($$4.f(), bdb.e, ($$4.a() + 1.0f) / 8.0f, $$4.b() * 0.5f, ipm.u(), $$0));
            }
            this.g += 1.0f;
            this.b.aH().a(this.b.r, $$0, $$3, bgj.a(this.f, 0.0f, 1.0f));
            if (this.f >= 1.0f) {
                this.i = false;
                if (w.U) {
                    a.info("Finished breaking {} {}", (Object)$$0, (Object)$$3);
                }
                this.a(this.b.r, (int $$2) -> {
                    this.a($$0);
                    return new aji(aji.a.c, $$0, $$1, $$2);
                });
                this.f = 0.0f;
                this.g = 0.0f;
                this.h = 5;
            }
        } else {
            return this.a($$0, $$1);
        }
        this.b.r.a(this.b.s.aA(), this.d, this.k());
        return true;
    }

    private void a(hif $$0, hjs $$1) {
        try (hjr $$2 = $$0.b().a();){
            int $$3 = $$2.b();
            aay<aib> $$4 = $$1.predict($$3);
            this.c.b($$4);
        }
    }

    public void c() {
        this.l();
        if (this.c.m().i()) {
            this.c.m().b();
        } else {
            this.c.m().n();
        }
    }

    private boolean b(is $$0) {
        dlt $$1 = this.b.s.fx();
        return $$0.equals(this.d) && dlt.c($$1, this.e);
    }

    private void l() {
        int $$0 = this.b.s.gK().g();
        if ($$0 != this.l) {
            this.l = $$0;
            this.c.b(new ajt(this.l));
        }
    }

    public cdc a(hnh $$0, cdb $$1, fti $$2) {
        this.l();
        if (!this.b.r.w().a($$2.b())) {
            return cdc.d;
        }
        MutableObject $$3 = new MutableObject();
        this.a(this.b.r, (int $$4) -> {
            $$3.setValue((Object)this.b($$0, $$1, $$2));
            return new ake($$1, $$2, $$4);
        });
        return (cdc)$$3.get();
    }

    private cdc b(hnh $$0, cdb $$1, fti $$2) {
        cdc $$13;
        boolean $$6;
        is $$3 = $$2.b();
        dlt $$4 = $$0.b($$1);
        if (this.j == dwl.d) {
            return cdc.c;
        }
        boolean $$5 = !$$0.fx().f() || !$$0.fy().f();
        boolean bl2 = $$6 = $$0.gA() && $$5;
        if (!$$6) {
            cdc $$9;
            eoh $$7 = this.b.r.a_($$3);
            if (!this.c.a($$7.b().k())) {
                return cdc.d;
            }
            cdc $$8 = $$7.a($$0.b($$1), this.b.r, $$0, $$1, $$2);
            if ($$8.a()) {
                return $$8;
            }
            if ($$8 instanceof cdc.f && $$1 == cdb.a && ($$9 = $$7.a((dwo)this.b.r, $$0, $$2)).a()) {
                return $$9;
            }
        }
        if ($$4.f() || $$0.hh().a($$4)) {
            return cdc.e;
        }
        dpw $$10 = new dpw($$0, $$1, $$2);
        if ($$0.gv()) {
            int $$11 = $$4.N();
            cdc $$12 = $$4.a($$10);
            $$4.e($$11);
        } else {
            $$13 = $$4.a($$10);
        }
        return $$13;
    }

    public cdc a(ddm $$0, cdb $$1) {
        if (this.j == dwl.d) {
            return cdc.e;
        }
        this.l();
        MutableObject $$2 = new MutableObject();
        this.a(this.b.r, (int $$3) -> {
            dlt $$9;
            akf $$4 = new akf($$1, $$3, $$0.ec(), $$0.ee());
            dlt $$5 = $$0.b($$1);
            if ($$0.hh().a($$5)) {
                $$2.setValue((Object)cdc.e);
                return $$4;
            }
            cdc $$6 = $$5.a((dwo)this.b.r, $$0, $$1);
            if ($$6 instanceof cdc.d) {
                cdc.d $$7 = (cdc.d)$$6;
                dlt $$8 = Objects.requireNonNullElseGet($$7.d(), () -> $$0.b($$1));
            } else {
                $$9 = $$0.b($$1);
            }
            if ($$9 != $$5) {
                $$0.a($$1, $$9);
            }
            $$2.setValue((Object)$$6);
            return $$4;
        });
        return (cdc)$$2.get();
    }

    public hnh a(hif $$0, bdl $$1, geu $$2) {
        return this.a($$0, $$1, $$2, ddk.b, false);
    }

    public hnh a(hif $$0, bdl $$1, geu $$2, ddk $$3, boolean $$4) {
        return new hnh(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
    }

    public void a(ddm $$0, cgk $$1) {
        this.l();
        this.c.b(aiy.a($$1, $$0.cu()));
        if (this.j != dwl.d) {
            $$0.e($$1);
            $$0.hf();
        }
    }

    public cdc a(ddm $$0, cgk $$1, cdb $$2) {
        this.l();
        this.c.b(aiy.a($$1, $$0.cu(), $$2));
        if (this.j == dwl.d) {
            return cdc.e;
        }
        return $$0.a($$1, $$2);
    }

    public cdc a(ddm $$0, cgk $$1, ftj $$2, cdb $$3) {
        this.l();
        ftm $$4 = $$2.g().a($$1.dP(), $$1.dR(), $$1.dV());
        this.c.b(aiy.a($$1, $$0.cu(), $$3, $$4));
        if (this.j == dwl.d) {
            return cdc.e;
        }
        return $$1.a($$0, $$4, $$3);
    }

    public void a(int $$0, int $$1, int $$2, dhu $$3, ddm $$4) {
        dhi $$5 = $$4.cn;
        if ($$0 != $$5.l) {
            a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", (Object)$$0, (Object)$$5.l);
            return;
        }
        jm<dji> $$6 = $$5.k;
        int $$7 = $$6.size();
        ArrayList $$8 = Lists.newArrayListWithCapacity((int)$$7);
        for (dji $$9 : $$6) {
            $$8.add($$9.g().v());
        }
        $$5.a($$1, $$2, $$3, $$4);
        Int2ObjectOpenHashMap $$10 = new Int2ObjectOpenHashMap();
        for (int $$11 = 0; $$11 < $$7; ++$$11) {
            dlt $$13;
            dlt $$12 = (dlt)$$8.get($$11);
            if (dlt.a($$12, $$13 = $$6.get($$11).g())) continue;
            $$10.put($$11, (Object)xa.b($$13, this.c.H()));
        }
        xa $$14 = xa.b($$5.g(), this.c.H());
        this.c.b(new ais($$0, $$5.j(), Shorts.checkedCast((long)$$1), SignedBytes.checkedCast((long)$$2), $$3, (Int2ObjectMap<xa>)$$10, $$14));
    }

    public void a(int $$0, dsa $$1, boolean $$2) {
        this.c.b(new ajg($$0, $$1, $$2));
    }

    public void a(int $$0, int $$1) {
        this.c.b(new air($$0, $$1));
    }

    public void a(dlt $$0, int $$1) {
        if (this.b.s.gv() && this.c.a($$0.h().k())) {
            this.c.b(new ajw($$1, $$0));
        }
    }

    public void a(dlt $$0) {
        boolean $$1;
        boolean bl2 = $$1 = this.b.x instanceof gti && !(this.b.x instanceof gua);
        if (this.b.s.gv() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
            this.c.b(new ajw(-1, $$0));
            this.b.s.N().a();
        }
    }

    public void b(ddm $$0) {
        this.l();
        this.c.b(new aji(aji.a.f, is.c, iz.a));
        $$0.ge();
    }

    public void a(dow $$0) {
        this.l();
        this.c.b(new aji(aji.a.h, is.c, iz.a));
        this.b.s.fO();
        this.b.s.fi();
        $$0.a(this.b.s);
    }

    public boolean d() {
        return this.j.h();
    }

    public boolean e() {
        return !this.j.g();
    }

    public boolean f() {
        return this.b.s.cq() && this.b.s.dz() instanceof cha;
    }

    public boolean g() {
        return this.j == dwl.d;
    }

    public @Nullable dwl h() {
        return this.k;
    }

    public dwl i() {
        return this.j;
    }

    public boolean j() {
        return this.i;
    }

    public int k() {
        return this.f > 0.0f ? (int)(this.f * 10.0f) : -1;
    }

    public void a(is $$0, boolean $$1) {
        this.c.b(new aje($$0, $$1));
    }

    public void a(cgk $$0, boolean $$1) {
        this.c.b(new ajf($$0.aA(), $$1));
    }

    public void a(int $$0, int $$1, boolean $$2) {
        this.c.b(new aiu($$0, $$1, $$2));
    }
}

