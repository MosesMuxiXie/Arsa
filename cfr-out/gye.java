/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

public interface gye {
    public static final Map<Optional<amt<ffd>>, gye> a = Map.of(Optional.of(ffe.b), ($$0, $$12) -> {
        eqg $$2 = $$12.e().a();
        jr.b $$3 = $$12.a();
        jq<dxo> $$4 = $$3.f(mj.aS);
        jq<ffu> $$5 = $$3.f(mj.br);
        jq<fes> $$6 = $$3.f(mj.bp);
        return new grd($$0, $$1 -> $$0.o().a(gye.a($$1)), $$2 instanceof eul ? ((eul)$$2).h() : fdr.a($$4, $$5, $$6));
    }, Optional.of(ffe.e), ($$0, $$12) -> new grc($$0, $$12, $$1 -> $$0.o().a(gye.a($$1))));

    public gsb createEditScreen(gxx var1, gyh var2);

    public static gyh.a a(fdr $$0) {
        return ($$1, $$2) -> {
            eul $$3 = new eul($$0);
            return $$2.a((jf.a)$$1, $$3);
        };
    }

    private static gyh.a a(jd<dxo> $$0) {
        return ($$1, $$2) -> {
            jq<euv> $$3 = $$1.f(mj.bl);
            jd.c $$4 = $$3.b(euv.c);
            dxz $$5 = new dxz($$0);
            eut $$6 = new eut((dxs)$$5, $$4);
            return $$2.a((jf.a)$$1, $$6);
        };
    }
}

