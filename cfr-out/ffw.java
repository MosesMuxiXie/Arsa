/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class ffw {
    public static final String a = "INVALID";
    public static final ffw b = new ffw(null, new dvu(0, 0), 0, new fgd(List.of()));
    private static final Logger c = LogUtils.getLogger();
    private final ffo d;
    private final fgd e;
    private final dvu f;
    private int g;
    private volatile @Nullable ffg h;

    public ffw(ffo $$0, dvu $$1, int $$2, fgd $$3) {
        this.d = $$0;
        this.f = $$1;
        this.g = $$2;
        this.e = $$3;
    }

    public static @Nullable ffw a(fge $$0, uz $$1, long $$2) {
        String $$3 = $$1.b("id", "");
        if (a.equals($$3)) {
            return b;
        }
        jq<ffo> $$4 = $$0.b().f(mj.bs);
        ffo $$5 = $$4.a(amo.a($$3));
        if ($$5 == null) {
            c.error("Unknown stucture id: {}", (Object)$$3);
            return null;
        }
        dvu $$6 = new dvu($$1.b("ChunkX", 0), $$1.b("ChunkZ", 0));
        int $$7 = $$1.b("references", 0);
        vf $$8 = $$1.p("Children");
        try {
            fgd $$9 = fgd.a($$8, $$0);
            if ($$5 instanceof fhz) {
                $$9 = fhz.a($$6, $$2, $$9);
            }
            return new ffw($$5, $$6, $$7, $$9);
        }
        catch (Exception $$10) {
            c.error("Failed Start with id {}", (Object)$$3, (Object)$$10);
            return null;
        }
    }

    public ffg a() {
        ffg $$0 = this.h;
        if ($$0 == null) {
            this.h = $$0 = this.d.a(this.e.b());
        }
        return $$0;
    }

    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5) {
        List<ffs> $$6 = this.e.c();
        if ($$6.isEmpty()) {
            return;
        }
        ffg $$7 = $$6.get((int)0).f;
        is $$8 = $$7.g();
        is $$9 = new is($$8.u(), $$7.i(), $$8.w());
        for (ffs $$10 : $$6) {
            if (!$$10.f().a($$4)) continue;
            $$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$9);
        }
        this.d.a($$0, $$1, $$2, $$3, $$4, $$5, this.e);
    }

    public uz a(fge $$0, dvu $$1) {
        uz $$2 = new uz();
        if (!this.b()) {
            $$2.a("id", a);
            return $$2;
        }
        $$2.a("id", $$0.b().f(mj.bs).b(this.d).toString());
        $$2.a("ChunkX", $$1.h);
        $$2.a("ChunkZ", $$1.i);
        $$2.a("references", this.g);
        $$2.a("Children", this.e.a($$0));
        return $$2;
    }

    public boolean b() {
        return !this.e.a();
    }

    public dvu c() {
        return this.f;
    }

    public boolean d() {
        return this.g < this.g();
    }

    public void e() {
        ++this.g;
    }

    public int f() {
        return this.g;
    }

    protected int g() {
        return 1;
    }

    public ffo h() {
        return this.d;
    }

    public List<ffs> i() {
        return this.e.c();
    }
}

