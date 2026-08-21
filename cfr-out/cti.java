/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface cti {
    public boolean a();

    public void a(boolean var1);

    public void a(dlt var1);

    public void a(uz var1);

    public dlt b();

    public bcz c();

    @Deprecated
    public static void a(chn $$0, dlt $$12) {
        $$12.a(ki.h, (kd)$$0);
        doe.a(ki.ag, $$12, $$1 -> {
            if ($$0.gG()) {
                $$1.a("NoAI", $$0.gG());
            }
            if ($$0.bq()) {
                $$1.a("Silent", $$0.bq());
            }
            if ($$0.br()) {
                $$1.a("NoGravity", $$0.br());
            }
            if ($$0.cE()) {
                $$1.a("Glowing", $$0.cE());
            }
            if ($$0.cU()) {
                $$1.a("Invulnerable", $$0.cU());
            }
            $$1.a("Health", $$0.eZ());
        });
    }

    @Deprecated
    public static void a(chn $$0, uz $$1) {
        $$1.q("NoAI").ifPresent($$0::u);
        $$1.q("Silent").ifPresent($$0::f);
        $$1.q("NoGravity").ifPresent($$0::g);
        $$1.q("Glowing").ifPresent($$0::k);
        $$1.q("Invulnerable").ifPresent($$0::n);
        $$1.g("Health").ifPresent($$0::x);
    }

    public static <T extends chl> Optional<cdc> a(ddm $$0, cdb $$1, T $$2) {
        dlt $$3 = $$0.b($$1);
        if ($$3.h() == dlx.sl && $$2.cb()) {
            $$2.a(((cti)((Object)$$2)).c(), 1.0f, 1.0f);
            dlt $$4 = ((cti)((Object)$$2)).b();
            ((cti)((Object)$$2)).a($$4);
            dlt $$5 = dlw.a($$3, $$0, $$4, false);
            $$0.a($$1, $$5);
            dwo $$6 = $$2.ao();
            if (!$$6.B_()) {
                aj.k.a((axg)$$0, $$4);
            }
            $$2.aC();
            return Optional.of(cdc.a);
        }
        return Optional.empty();
    }
}

