/*
 * Decompiled with CFR 0.152.
 */
public class drm
extends dpy {
    public drm(String $$0, dqe $$1, dqo $$2, dlt $$3, float $$4, int $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    protected dlp f() {
        return dlx.fw;
    }

    @Override
    public drc<drm> a() {
        return drc.o;
    }

    @Override
    public drd<drm> b() {
        return drd.b;
    }

    @Override
    public dqv h() {
        return switch (this.e()) {
            default -> throw new MatchException(null, null);
            case dqe.b -> dqu.f;
            case dqe.a -> dqu.e;
            case dqe.c -> dqu.g;
        };
    }
}

