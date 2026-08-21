/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumMap;
import org.jspecify.annotations.Nullable;

public class flv
extends flo {
    private final boolean a;
    private final Long2ObjectMap<fls> l = new Long2ObjectOpenHashMap();

    public flv(boolean $$0) {
        this.a = $$0;
    }

    @Override
    public void a(dxb $$0, chn $$1) {
        super.a($$0, $$1);
        this.l.clear();
    }

    @Override
    public void b() {
        super.b();
        this.l.clear();
    }

    @Override
    public fln a() {
        return this.c(bgj.c(this.c.dj().a), bgj.c(this.c.dj().b + 0.5), bgj.c(this.c.dj().c));
    }

    @Override
    public flw a(double $$0, double $$1, double $$2) {
        return this.b($$0, $$1, $$2);
    }

    @Override
    public int a(fln[] $$0, fln $$1) {
        int $$2 = 0;
        EnumMap $$3 = Maps.newEnumMap(iz.class);
        for (iz $$4 : iz.values()) {
            fln $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
            $$3.put($$4, $$5);
            if (!this.a($$5)) continue;
            $$0[$$2++] = $$5;
        }
        for (iz $$6 : iz.c.a) {
            fln $$8;
            iz $$7 = $$6.h();
            if (!flv.b((fln)$$3.get($$6)) || !flv.b((fln)$$3.get($$7)) || !this.a($$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l()))) continue;
            $$0[$$2++] = $$8;
        }
        return $$2;
    }

    protected boolean a(@Nullable fln $$0) {
        return $$0 != null && !$$0.i;
    }

    private static boolean b(@Nullable fln $$0) {
        return $$0 != null && $$0.k >= 0.0f;
    }

    protected @Nullable fln a(int $$0, int $$1, int $$2) {
        float $$5;
        fln $$3 = null;
        fls $$4 = this.b($$0, $$1, $$2);
        if ((this.a && $$4 == fls.u || $$4 == fls.j) && ($$5 = this.c.a($$4)) >= 0.0f) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new is($$0, $$1, $$2)).c()) {
                $$3.k += 8.0f;
            }
        }
        return $$3;
    }

    protected fls b(int $$0, int $$1, int $$2) {
        return (fls)((Object)this.l.computeIfAbsent(is.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2)));
    }

    @Override
    public fls a(flu $$0, int $$1, int $$2, int $$3) {
        return this.a($$0, $$1, $$2, $$3, this.c);
    }

    @Override
    public fls a(flu $$0, int $$1, int $$2, int $$3, chn $$4) {
        is.a $$5 = new is.a();
        for (int $$6 = $$1; $$6 < $$1 + this.e; ++$$6) {
            for (int $$7 = $$2; $$7 < $$2 + this.f; ++$$7) {
                for (int $$8 = $$3; $$8 < $$3 + this.g; ++$$8) {
                    eoh $$9 = $$0.a($$5.d($$6, $$7, $$8));
                    flb $$10 = $$9.y();
                    if ($$10.c() && $$9.a(flq.b) && $$9.l()) {
                        return fls.u;
                    }
                    if ($$10.a(bdv.a)) continue;
                    return fls.a;
                }
            }
        }
        eoh $$11 = $$0.a($$5);
        if ($$11.a(flq.b)) {
            return fls.j;
        }
        return fls.a;
    }
}

