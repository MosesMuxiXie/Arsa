/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import org.jspecify.annotations.Nullable;

public class gvo
extends gvt {
    private static final yh b = yh.c("multiplayer.codeOfConduct.title").a(l.r);
    private static final yh c = yh.c("multiplayer.codeOfConduct.check");
    private final @Nullable hit d;
    private final String e;
    private final BooleanConsumer f;
    private final gsb t;

    private gvo(@Nullable hit $$0, gsb $$1, yh $$2, String $$3, BooleanConsumer $$4) {
        super(b, $$2, c, b.f().f("\n").b($$2));
        this.d = $$0;
        this.t = $$1;
        this.e = $$3;
        this.f = $$4;
    }

    public gvo(@Nullable hit $$0, gsb $$1, String $$2, BooleanConsumer $$3) {
        this($$0, $$1, yh.b($$2), $$2, $$3);
    }

    @Override
    protected gov o() {
        goy $$02 = goy.e().a(8);
        $$02.a(gje.a(yg.m, (gje $$0) -> this.c(true)).a());
        $$02.a(gje.a(yg.q, (gje $$0) -> this.c(false)).a());
        return $$02;
    }

    private void c(boolean $$0) {
        this.f.accept($$0);
        if (this.d != null) {
            if ($$0 && this.a.a()) {
                this.d.b(this.e);
            } else {
                this.d.g();
            }
            hiu.b(this.d);
        }
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    public void e() {
        super.e();
        if (this.t instanceof grb || this.t instanceof gvr) {
            this.t.e();
        }
    }
}

