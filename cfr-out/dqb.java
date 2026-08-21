/*
 * Decompiled with CFR 0.152.
 */
public class dqb
extends dpy {
    public dqb(String $$0, dqe $$1, dqo $$2, dlt $$3, float $$4, int $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected dlp f() {
        return dlx.yQ;
    }

    @Override
    public drc<dqb> a() {
        return drc.p;
    }

    @Override
    public drd<dqb> b() {
        return drd.c;
    }

    @Override
    public dqv h() {
        return switch (this.e()) {
            default -> throw new MatchException(null, null);
            case dqe.b -> dqu.h;
            case dqe.a, dqe.c -> dqu.i;
        };
    }
}

