/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class coc
extends cop {
    private final chn a;
    private final dwo b;

    public coc(chn $$0, dwo $$1) {
        this.a = $$0;
        this.b = $$1;
        this.a(EnumSet.of(cop.a.c));
    }

    @Override
    public boolean b() {
        boolean $$0;
        boolean bl2 = $$0 = this.a.aK || this.a.aJ;
        if (!$$0 || !this.a.ay().a(bdt.i)) {
            return false;
        }
        is $$1 = this.a.dK().d();
        eoh $$2 = this.b.a_($$1);
        return $$2.a(dzs.rP) || $$2.g(this.b, $$1) == fud.a();
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        this.a.L().a();
    }
}

