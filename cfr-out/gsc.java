/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gsc
extends gsb {
    private static final int a = 1024;
    private static final int b = 65535;
    private static final yh c = yh.c("selectWorld.allowCommands");
    private static final yh d = yh.c("selectWorld.gameMode");
    private static final yh e = yh.c("lanServer.otherPlayers");
    private static final yh f = yh.c("lanServer.port");
    private static final yh t = yh.a("lanServer.port.unavailable", 1024, 65535);
    private static final yh u = yh.a("lanServer.port.invalid", 1024, 65535);
    private final gsb v;
    private dwl w = dwl.a;
    private boolean x;
    private int y = bfx.a();
    private @Nullable gjn z;

    public gsc(gsb $$0) {
        super(yh.c("lanServer.title"));
        this.v = $$0;
    }

    @Override
    protected void bg_() {
        iqa $$02 = this.n.aa();
        this.w = $$02.w();
        this.x = $$02.bb().l();
        this.c(gjl.a(dwl::e, this.w).a((dwl[])new dwl[]{dwl.a, dwl.d, dwl.b, dwl.c}).a(this.o / 2 - 155, 100, 150, 20, d, ($$0, $$1) -> {
            this.w = $$1;
        }));
        this.c(gjl.a(this.x).a(this.o / 2 + 5, 100, 150, 20, c, ($$0, $$1) -> {
            this.x = $$1;
        }));
        gje $$12 = gje.a(yh.c("lanServer.start"), (gje $$1) -> {
            yw $$3;
            this.n.a((gsb)null);
            if ($$02.a(this.w, this.x, this.y)) {
                yw $$2 = apz.a(this.y);
            } else {
                $$3 = yh.c("commands.publish.failed");
            }
            this.n.j.e().a($$3);
            this.n.aZ().c($$3);
            this.n.g();
        }).a(this.o / 2 - 155, this.p - 28, 150, 20).a();
        this.z = new gjn(this.q, this.o / 2 - 75, 160, 150, 20, yh.c("lanServer.port"));
        this.z.b((String $$1) -> {
            yh $$2 = this.a((String)$$1);
            this.z.c(yh.b("" + this.y));
            if ($$2 == null) {
                this.z.l(-2039584);
                this.z.a((gks)null);
                $$0.k = true;
            } else {
                this.z.l(-2142128);
                this.z.a(gks.a($$2));
                $$0.k = false;
            }
        });
        this.z.c(yh.b("" + this.y));
        this.c(this.z);
        this.c($$12);
        this.c(gje.a(yg.e, (gje $$0) -> this.aX_()).a(this.o / 2 + 5, this.p - 28, 150, 20).a());
    }

    @Override
    public void aX_() {
        this.n.a(this.v);
    }

    private @Nullable yh a(String $$0) {
        if ($$0.isBlank()) {
            this.y = bfx.a();
            return null;
        }
        try {
            this.y = Integer.parseInt($$0);
            if (this.y < 1024 || this.y > 65535) {
                return u;
            }
            if (!bfx.a(this.y)) {
                return t;
            }
            return null;
        }
        catch (NumberFormatException $$1) {
            this.y = bfx.a();
            return u;
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 50, -1);
        $$0.a(this.q, e, this.o / 2, 82, -1);
        $$0.a(this.q, f, this.o / 2, 142, -1);
    }
}

