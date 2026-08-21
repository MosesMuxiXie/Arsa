/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4fc
 */
import java.util.List;
import org.joml.Matrix4fc;

public class igc {
    private final fzm a = new fzm();

    public void a(hpn $$0, hon.a $$1, hpw $$2, hoq $$3) {
        for (hpp.i $$4 : $$0.g()) {
            hpz $$5 = $$4.b();
            eoh $$6 = $$5.c;
            List<hqg> $$7 = $$2.a($$6).a(bgr.a($$6.b($$5.a)));
            fzm $$8 = new fzm();
            $$8.a((Matrix4fc)$$4.a());
            $$2.b().a((dvq)$$5, $$7, $$6, $$5.b, $$8, $$1.a(hoe.b($$6)), false, ilg.d);
        }
        for (hpp.b $$9 : $$0.f()) {
            this.a.a();
            this.a.c().a($$9.a());
            $$2.a($$9.b(), this.a, $$1, $$9.c(), $$9.d());
            if ($$9.e() != 0) {
                $$3.a($$9.e());
                $$2.a($$9.b(), this.a, $$3, $$9.c(), $$9.d());
            }
            this.a.b();
        }
        for (hpp.a $$10 : $$0.h()) {
            hpy.a($$10.a(), $$1.a($$10.b()), $$10.c(), $$10.d(), $$10.e(), $$10.f(), $$10.g(), $$10.h());
            if ($$10.i() == 0) continue;
            $$3.a($$10.i());
            hpy.a($$10.a(), $$3.a($$10.b()), $$10.c(), $$10.d(), $$10.e(), $$10.f(), $$10.g(), $$10.h());
        }
    }
}

