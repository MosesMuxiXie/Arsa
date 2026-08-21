/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class fue
extends fug {
    private final fug b;
    private final iz.a c;
    private static final DoubleList d = new fts(1);

    public fue(fug $$0, iz.a $$1, int $$2) {
        super(fue.a($$0.a, $$1, $$2));
        this.b = $$0;
        this.c = $$1;
    }

    private static ftv a(ftv $$0, iz.a $$1, int $$2) {
        return new fuf($$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1));
    }

    @Override
    public DoubleList a(iz.a $$0) {
        if ($$0 == this.c) {
            return d;
        }
        return this.b.a($$0);
    }
}

