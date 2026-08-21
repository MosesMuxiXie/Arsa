/*
 * Decompiled with CFR 0.152.
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ffe {
    public static final amt<ffd> a = ffe.a("normal");
    public static final amt<ffd> b = ffe.a("flat");
    public static final amt<ffd> c = ffe.a("large_biomes");
    public static final amt<ffd> d = ffe.a("amplified");
    public static final amt<ffd> e = ffe.a("single_biome_surface");
    public static final amt<ffd> f = ffe.a("debug_all_block_states");

    public static void a(qr<ffd> $$0) {
        new a($$0).a();
    }

    private static amt<ffd> a(String $$0) {
        return amt.a(mj.bD, amo.b($$0));
    }

    public static Optional<amt<ffd>> a(evl $$02) {
        return $$02.a(esi.b).flatMap($$0 -> {
            eqg eqg2 = $$0.b();
            Objects.requireNonNull(eqg2);
            eqg $$1 = eqg2;
            int $$2 = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{eul.class, euh.class, eut.class}, (Object)$$1, $$2)) {
                case 0 -> {
                    eul $$3 = (eul)$$1;
                    yield Optional.of(b);
                }
                case 1 -> {
                    euh $$4 = (euh)$$1;
                    yield Optional.of(f);
                }
                case 2 -> {
                    eut $$5 = (eut)$$1;
                    yield Optional.of(a);
                }
                default -> Optional.empty();
            };
        });
    }

    public static evl a(jf.a $$0) {
        return $$0.e(mj.bD).b(a).a().a();
    }

    public static esi b(jf.a $$0) {
        return $$0.e(mj.bD).b(a).a().b().orElseThrow();
    }

    public static evl c(jf.a $$0) {
        return $$0.e(mj.bD).b(b).a().a();
    }

    static class a {
        private final qr<ffd> a;
        private final je<euv> b;
        private final je<dxo> c;
        private final je<fes> d;
        private final je<ffu> e;
        private final je<dyc> f;
        private final jd<esh> g;
        private final esi h;
        private final esi i;

        a(qr<ffd> $$0) {
            this.a = $$0;
            je<esh> $$1 = $$0.a(mj.bd);
            this.b = $$0.a(mj.bl);
            this.c = $$0.a(mj.aS);
            this.d = $$0.a(mj.bp);
            this.e = $$0.a(mj.br);
            this.f = $$0.a(mj.bk);
            this.g = $$1.b(esf.a);
            jd.c<esh> $$2 = $$1.b(esf.b);
            jd.c<euv> $$3 = this.b.b(euv.f);
            jd.c<dyc> $$4 = this.f.b(dyd.a);
            this.h = new esi($$2, new eut((dxs)dyb.a($$4), $$3));
            jd.c<esh> $$5 = $$1.b(esf.c);
            jd.c<euv> $$6 = this.b.b(euv.g);
            this.i = new esi($$5, new eut((dxs)dyf.a(this.c), $$6));
        }

        private esi a(eqg $$0) {
            return new esi(this.g, $$0);
        }

        private esi a(dxs $$0, jd<euv> $$1) {
            return this.a(new eut($$0, $$1));
        }

        private ffd a(esi $$0) {
            return new ffd(Map.of(esi.b, $$0, esi.c, this.h, esi.d, this.i));
        }

        private void a(amt<ffd> $$0, esi $$1) {
            this.a.a($$0, this.a($$1));
        }

        private void a(dxs $$0) {
            jd.c<euv> $$1 = this.b.b(euv.c);
            this.a(a, this.a($$0, $$1));
            jd.c<euv> $$2 = this.b.b(euv.d);
            this.a(c, this.a($$0, $$2));
            jd.c<euv> $$3 = this.b.b(euv.e);
            this.a(d, this.a($$0, $$3));
        }

        public void a() {
            jd.c<dyc> $$0 = this.f.b(dyd.b);
            this.a(dyb.a($$0));
            jd.c<euv> $$1 = this.b.b(euv.c);
            jd.c<dxo> $$2 = this.c.b(dxv.b);
            this.a(e, this.a(new dxz($$2), $$1));
            this.a(b, this.a(new eul(fdr.a(this.c, this.e, this.d))));
            this.a(f, this.a(new euh($$2)));
        }
    }
}

