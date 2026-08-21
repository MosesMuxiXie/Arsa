/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class coh
extends cop {
    private final chn a;

    public coh(chn $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.c));
        $$0.N().a(true);
    }

    @Override
    public boolean b() {
        return this.a.by() && this.a.b(bdv.a) > this.a.dE() || this.a.bN();
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        if (this.a.ep().i() < 0.8f) {
            this.a.L().a();
        }
    }
}

