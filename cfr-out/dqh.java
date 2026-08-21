/*
 * Decompiled with CFR 0.152.
 */
public interface dqh
extends dqs<dqg> {
    @Override
    default public drd<dqh> b() {
        return drd.a;
    }

    @Override
    public drc<? extends dqh> a();

    public dqf c();

    default public jm<dlt> a(dqg $$0) {
        return dqh.b($$0);
    }

    public static jm<dlt> b(dqg $$0) {
        jm<dlt> $$1 = jm.a($$0.a(), dlt.l);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            dlp $$3 = $$0.a($$2).h();
            $$1.set($$2, $$3.i());
        }
        return $$1;
    }

    @Override
    default public dqv h() {
        return switch (this.c()) {
            default -> throw new MatchException(null, null);
            case dqf.a -> dqu.a;
            case dqf.c -> dqu.c;
            case dqf.b -> dqu.b;
            case dqf.d -> dqu.d;
        };
    }
}

