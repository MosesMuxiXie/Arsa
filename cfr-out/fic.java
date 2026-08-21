/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;

public class fic
extends ffy {
    private static final float h = 0.3f;
    private static final float i = 0.07f;
    private static final float j = 0.2f;
    private final b k;
    private final a l;

    public fic(fjr $$0, is $$1, b $$2, a $$3, amo $$4, fjq $$5, egm $$6, eev $$7, is $$8) {
        super(fgf.J, 0, $$0, $$4, $$4.toString(), fic.a($$7, $$6, $$2, $$8, $$3), $$1);
        this.k = $$2;
        this.l = $$3;
    }

    public fic(fjr $$0, uz $$1) {
        super(fgf.J, $$1, $$0, $$2 -> fic.a($$0, $$1, $$2));
        this.k = $$1.a("VerticalPlacement", fic$b.g).orElseThrow();
        this.l = $$1.a("Properties", fic$a.a).orElseThrow();
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        super.a($$0, $$1);
        $$1.a("Rotation", egm.h, this.c.d());
        $$1.a("Mirror", eev.e, this.c.c());
        $$1.a("VerticalPlacement", fic$b.g, this.k);
        $$1.a("Properties", fic$a.a, this.l);
    }

    private static fjm a(fjr $$0, uz $$1, amo $$2) {
        fjq $$3 = $$0.a($$2);
        is $$4 = new is($$3.a().u() / 2, 0, $$3.a().w() / 2);
        return fic.a($$1.a("Mirror", eev.e).orElseThrow(), $$1.a("Rotation", egm.h).orElseThrow(), $$1.a("VerticalPlacement", fic$b.g).orElseThrow(), $$4, (a)fic$a.a.parse(new Dynamic((DynamicOps)vn.a, (Object)$$1.a("Properties"))).getPartialOrThrow());
    }

    private static fjm a(eev $$0, egm $$1, b $$2, is $$3, a $$4) {
        fir $$5 = $$4.d ? fir.b : fir.d;
        ArrayList $$6 = Lists.newArrayList();
        $$6.add(fic.a(dzs.cr, 0.3f, dzs.a));
        $$6.add(fic.a($$2, $$4));
        if (!$$4.b) {
            $$6.add(fic.a(dzs.ey, 0.07f, dzs.lF));
        }
        fjm $$7 = new fjm().a($$1).a($$0).a($$3).a($$5).a(new fjj($$6)).a(new fiq($$4.c)).a(new fjg(bdp.cd)).a(new fiy());
        if ($$4.g) {
            $$7.a(fip.b);
        }
        return $$7;
    }

    private static fjf a(b $$0, a $$1) {
        if ($$0 == fic$b.c) {
            return fic.a(dzs.K, dzs.lF);
        }
        if ($$1.b) {
            return fic.a(dzs.K, dzs.ey);
        }
        return fic.a(dzs.K, 0.2f, dzs.lF);
    }

    @Override
    public void a(dxn $$0, dxk $$1, eqg $$22, bgr $$3, ffg $$4, dvu $$5, is $$6) {
        ffg $$7 = this.b.b(this.c, this.d);
        if (!$$4.b($$7.g())) {
            return;
        }
        $$4.b($$7);
        super.a($$0, $$1, $$22, $$3, $$4, $$5, $$6);
        this.b($$3, $$0);
        this.a($$3, $$0);
        if (this.l.f || this.l.e) {
            is.a(this.f()).forEach($$2 -> {
                if (this.l.f) {
                    this.a($$3, (dwp)$$0, (is)$$2);
                }
                if (this.l.e) {
                    this.b($$3, $$0, (is)$$2);
                }
            });
        }
    }

    @Override
    protected void a(String $$0, is $$1, dxf $$2, bgr $$3, ffg $$4) {
    }

    private void a(bgr $$0, dwp $$1, is $$2) {
        eoh $$3 = $$1.a_($$2);
        if ($$3.l() || $$3.a(dzs.fN)) {
            return;
        }
        iz $$4 = fic.a($$0);
        is $$5 = $$2.a($$4);
        eoh $$6 = $$1.a_($$5);
        if (!$$6.l()) {
            return;
        }
        if (!dzq.a($$3.g($$1, $$2), $$4)) {
            return;
        }
        eoy $$7 = ejh.a($$4.g());
        $$1.a($$5, (eoh)dzs.fN.m().b($$7, true), 3);
    }

    private void b(bgr $$0, dwp $$1, is $$2) {
        if ($$0.i() < 0.5f && $$1.a_($$2).a(dzs.ey) && $$1.a_($$2.d()).l()) {
            $$1.a($$2.d(), (eoh)dzs.aN.m().b(eei.c, true), 3);
        }
    }

    private void a(bgr $$0, dwp $$1) {
        for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); ++$$2) {
            for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); ++$$3) {
                is $$4 = new is($$2, this.f.i(), $$3);
                if (!$$1.a_($$4).a(dzs.ey)) continue;
                this.c($$0, $$1, $$4.e());
            }
        }
    }

    private void c(bgr $$0, dwp $$1, is $$2) {
        is.a $$3 = $$2.k();
        this.d($$0, $$1, $$3);
        for (int $$4 = 8; $$4 > 0 && $$0.i() < 0.5f; --$$4) {
            $$3.c(iz.a);
            this.d($$0, $$1, $$3);
        }
    }

    private void b(bgr $$0, dwp $$1) {
        boolean $$2 = this.k == fic$b.a || this.k == fic$b.c;
        is $$3 = this.f.g();
        int $$4 = $$3.u();
        int $$5 = $$3.w();
        float[] $$6 = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.9f, 0.9f, 0.8f, 0.7f, 0.6f, 0.4f, 0.2f};
        int $$7 = $$6.length;
        int $$8 = (this.f.d() + this.f.f()) / 2;
        int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
        int $$10 = 3;
        is.a $$11 = is.c.k();
        for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; ++$$12) {
            for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; ++$$13) {
                int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
                int $$15 = Math.max(0, $$14 + $$9);
                if ($$15 >= $$7) continue;
                float $$16 = $$6[$$15];
                if (!($$0.j() < (double)$$16)) continue;
                int $$17 = fic.a($$1, $$12, $$13, this.k);
                int $$18 = $$2 ? $$17 : Math.min(this.f.i(), $$17);
                $$11.d($$12, $$18, $$13);
                if (Math.abs($$18 - this.f.i()) > 3 || !this.a($$1, $$11)) continue;
                this.d($$0, $$1, $$11);
                if (this.l.e) {
                    this.b($$0, $$1, $$11);
                }
                this.c($$0, $$1, $$11.e());
            }
        }
    }

    private boolean a(dwp $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        return !$$2.a(dzs.a) && !$$2.a(dzs.cK) && !$$2.a(bdp.cd) && (this.k == fic$b.f || !$$2.a(dzs.K));
    }

    private void d(bgr $$0, dwp $$1, is $$2) {
        if (!this.l.b && $$0.i() < 0.07f) {
            $$1.a($$2, dzs.lF.m(), 3);
        } else {
            $$1.a($$2, dzs.ey.m(), 3);
        }
    }

    private static int a(dwp $$0, int $$1, int $$2, b $$3) {
        return $$0.a(fic.a($$3), $$1, $$2) - 1;
    }

    public static euq.a a(b $$0) {
        return $$0 == fic$b.c ? euq.a.c : euq.a.a;
    }

    private static fjf a(dzq $$0, float $$1, dzq $$2) {
        return new fjf(new fjh($$0, $$1), fin.b, $$2.m());
    }

    private static fjf a(dzq $$0, dzq $$1) {
        return new fjf(new fis($$0), fin.b, $$1.m());
    }

    public static final class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b("on_land_surface");
        public static final /* enum */ b b = new b("partly_buried");
        public static final /* enum */ b c = new b("on_ocean_floor");
        public static final /* enum */ b d = new b("in_mountain");
        public static final /* enum */ b e = new b("underground");
        public static final /* enum */ b f = new b("in_nether");
        public static final Codec<b> g;
        private final String h;
        private static final /* synthetic */ b[] i;

        public static b[] values() {
            return (b[])i.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0) {
            this.h = $$0;
        }

        public String a() {
            return this.h;
        }

        @Override
        public String c() {
            return this.h;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e, f};
        }

        static {
            i = fic$b.b();
            g = bhh.a(b::values);
        }
    }

    public static class a {
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.BOOL.fieldOf("cold").forGetter($$0 -> $$0.b), (App)Codec.FLOAT.fieldOf("mossiness").forGetter($$0 -> Float.valueOf($$0.c)), (App)Codec.BOOL.fieldOf("air_pocket").forGetter($$0 -> $$0.d), (App)Codec.BOOL.fieldOf("overgrown").forGetter($$0 -> $$0.e), (App)Codec.BOOL.fieldOf("vines").forGetter($$0 -> $$0.f), (App)Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0 -> $$0.g)).apply((Applicative)$$02, a::new));
        public boolean b;
        public float c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;

        public a() {
        }

        public a(boolean $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
        }
    }
}

