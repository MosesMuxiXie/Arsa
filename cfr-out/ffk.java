/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Locale;

public class ffk
extends ffs {
    protected final fgw a;
    protected is b;
    private final int d;
    protected final egm c;
    private final List<fgr> h = Lists.newArrayList();
    private final fjr i;
    private final fja j;

    public ffk(fjr $$0, fgw $$1, is $$2, int $$3, egm $$4, ffg $$5, fja $$6) {
        super(fgf.ad, 0, $$5);
        this.i = $$0;
        this.a = $$1;
        this.b = $$2;
        this.d = $$3;
        this.c = $$4;
        this.j = $$6;
    }

    public ffk(fge $$0, uz $$12) {
        super(fgf.ad, $$12);
        this.i = $$0.c();
        this.b = new is($$12.b("PosX", 0), $$12.b("PosY", 0), $$12.b("PosZ", 0));
        this.d = $$12.b("ground_level_delta", 0);
        ams<vz> $$2 = $$0.b().a(vn.a);
        this.a = $$12.a("pool_element", fgw.f, (DynamicOps<vz>)$$2).orElseThrow(() -> new IllegalStateException("Invalid pool element found"));
        this.c = $$12.a("rotation", egm.h).orElseThrow();
        this.f = this.a.a(this.i, this.b, this.c);
        vf $$3 = $$12.p("junctions");
        this.h.clear();
        $$3.forEach($$1 -> this.h.add(fgr.a(new Dynamic($$2, $$1))));
        this.j = $$12.a("liquid_settings", fja.c).orElse(fhp.e);
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        $$1.a("PosX", this.b.u());
        $$1.a("PosY", this.b.v());
        $$1.a("PosZ", this.b.w());
        $$1.a("ground_level_delta", this.d);
        ams<vz> $$2 = $$0.b().a(vn.a);
        $$1.a("pool_element", fgw.f, $$2, this.a);
        $$1.a("rotation", egm.h, this.c);
        vf $$3 = new vf();
        for (fgr $$4 : this.h) {
            $$3.add((vz)$$4.a($$2).getValue());
        }
        $$1.a("junctions", $$3);
        if (this.j != fhp.e) {
            $$1.a("liquid_settings", fja.c, $$2, this.j);
        }
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
        this.a($$0, $$1, $$2, $$3, $$4, $$6, false);
    }

    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, is $$5, boolean $$6) {
        this.a.a(this.i, $$0, $$1, $$2, this.b, $$5, this.c, $$4, $$3, this.j, $$6);
    }

    @Override
    public void a(int $$0, int $$1, int $$2) {
        super.a($$0, $$1, $$2);
        this.b = this.b.b($$0, $$1, $$2);
    }

    @Override
    public egm a() {
        return this.c;
    }

    public String toString() {
        return String.format(Locale.ROOT, "<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.b, this.c, this.a);
    }

    public fgw b() {
        return this.a;
    }

    public is c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public void a(fgr $$0) {
        this.h.add($$0);
    }

    public List<fgr> e() {
        return this.h;
    }
}

