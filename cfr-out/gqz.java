/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class gqz
extends gra {
    private static final yh t = yh.c("chat.link.warning").b(-13108);
    private static final int u = 100;
    private final String v;
    private final boolean w;

    public gqz(BooleanConsumer $$0, String $$1, boolean $$2) {
        this($$0, (yh)gqz.c($$2), (yh)yh.b($$1), $$1, $$2 ? yg.e : yg.g, $$2);
    }

    public gqz(BooleanConsumer $$0, yh $$1, String $$2, boolean $$3) {
        this($$0, $$1, (yh)gqz.a($$3, $$2), $$2, $$3 ? yg.e : yg.g, $$3);
    }

    public gqz(BooleanConsumer $$0, yh $$1, URI $$2, boolean $$3) {
        this($$0, $$1, $$2.toString(), $$3);
    }

    public gqz(BooleanConsumer $$0, yh $$1, yh $$2, URI $$3, yh $$4, boolean $$5) {
        this($$0, $$1, $$2, $$3.toString(), $$4, true);
    }

    public gqz(BooleanConsumer $$0, yh $$1, yh $$2, String $$3, yh $$4, boolean $$5) {
        super($$0, $$1, $$2);
        this.b = $$5 ? yg.n : yg.f;
        this.c = $$4;
        this.w = !$$5;
        this.v = $$3;
    }

    protected static yw a(boolean $$0, String $$1) {
        return gqz.c($$0).b(yg.x).b(yh.b($$1));
    }

    protected static yw c(boolean $$0) {
        return yh.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
    }

    @Override
    protected void l() {
        if (this.w) {
            this.a.a(new gko(t, this.q));
        }
    }

    @Override
    protected void a(goy $$02) {
        this.d = $$02.a(gje.a(this.b, (gje $$0) -> this.f.accept(true)).a(100).a());
        $$02.a(gje.a(yg.o, (gje $$0) -> {
            this.o();
            this.f.accept(false);
        }).a(100).a());
        this.e = $$02.a(gje.a(this.c, (gje $$0) -> this.f.accept(false)).a(100).a());
    }

    public void o() {
        this.n.o.a(this.v);
    }

    public static void a(gsb $$0, String $$1, boolean $$2) {
        gfj $$32 = gfj.V();
        $$32.a(new gqz($$3 -> {
            if ($$3) {
                bhs.n().a($$1);
            }
            $$32.a($$0);
        }, $$1, $$2));
    }

    public static void a(gsb $$0, URI $$1, boolean $$2) {
        gfj $$32 = gfj.V();
        $$32.a(new gqz($$3 -> {
            if ($$3) {
                bhs.n().a($$1);
            }
            $$32.a($$0);
        }, $$1.toString(), $$2));
    }

    public static void a(gsb $$0, URI $$1) {
        gqz.a($$0, $$1, true);
    }

    public static void a(gsb $$0, String $$1) {
        gqz.a($$0, $$1, true);
    }

    public static gje.c b(gsb $$0, String $$1, boolean $$2) {
        return $$3 -> gqz.a($$0, $$1, $$2);
    }

    public static gje.c b(gsb $$0, URI $$1, boolean $$2) {
        return $$3 -> gqz.a($$0, $$1, $$2);
    }

    public static gje.c b(gsb $$0, String $$1) {
        return gqz.b($$0, $$1, true);
    }

    public static gje.c b(gsb $$0, URI $$1) {
        return gqz.b($$0, $$1, true);
    }
}

