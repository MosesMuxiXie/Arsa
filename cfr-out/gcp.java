/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class gcp
extends isc {
    protected BooleanConsumer a;
    private final yh b;
    private final yh c;

    public gcp(BooleanConsumer $$0, yh $$1, yh $$2) {
        super(gfa.a);
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
    }

    @Override
    public void bg_() {
        this.c(gje.a(yg.f, (gje $$0) -> this.a.accept(true)).a(this.o / 2 - 105, gcp.a(9), 100, 20).a());
        this.c(gje.a(yg.g, (gje $$0) -> this.a.accept(false)).a(this.o / 2 + 5, gcp.a(9), 100, 20).a());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.b, this.o / 2, gcp.a(3), -1);
        $$0.a(this.q, this.c, this.o / 2, gcp.a(5), -1);
    }
}

