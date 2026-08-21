/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;

public class gru
extends gsb {
    private static final yh a = yh.c("symlink_warning.title.world").a(l.r);
    private static final yh b = yh.a("symlink_warning.message.world", yh.a(bez.p));
    private static final yh c = yh.c("symlink_warning.title.pack").a(l.r);
    private static final yh d = yh.a("symlink_warning.message.pack", yh.a(bez.p));
    private final yh e;
    private final URI f;
    private final Runnable t;
    private final got u = new got().b(10);

    public gru(yh $$0, yh $$1, URI $$2, Runnable $$3) {
        super($$0);
        this.e = $$1;
        this.f = $$2;
        this.t = $$3;
    }

    public static gsb a(Runnable $$0) {
        return new gru(a, b, bez.p, $$0);
    }

    public static gsb b(Runnable $$0) {
        return new gru(c, d, bez.p, $$0);
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.u.c().b();
        got.b $$02 = this.u.d(1);
        $$02.a(new gko(this.m, this.q));
        $$02.a(new gjz(this.e, this.q).a(this.o - 50).a(true));
        int $$1 = 120;
        got $$2 = new got().a(5);
        got.b $$3 = $$2.d(3);
        $$3.a(gje.a(yg.n, (gje $$0) -> bhs.n().a(this.f)).b(120, 20).a());
        $$3.a(gje.a(yg.p, (gje $$0) -> this.n.o.a(this.f.toString())).b(120, 20).a());
        $$3.a(gje.a(yg.k, (gje $$0) -> this.aX_()).b(120, 20).a());
        $$02.a($$2);
        this.c();
        this.u.a(this::c);
    }

    @Override
    protected void c() {
        this.u.a();
        gos.a(this.u, this.aV_());
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), this.e});
    }

    @Override
    public void aX_() {
        this.t.run();
    }
}

