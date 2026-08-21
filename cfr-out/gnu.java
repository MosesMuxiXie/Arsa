/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gnu
implements AutoCloseable {
    private final ilr a;
    private final amo b;
    private final List<gns> c = new ArrayList<gns>();

    public gnu(ilr $$0, amo $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public void a() {
        int $$0 = this.c.size();
        this.c.clear();
        for (int $$1 = 0; $$1 < $$0; ++$$1) {
            this.a.c(this.a($$1));
        }
    }

    @Override
    public void close() {
        this.a();
    }

    public @Nullable gob a(fwp $$0, fwo $$1) {
        for (gns $$2 : this.c) {
            gob $$3 = $$2.a($$0, $$1);
            if ($$3 == null) continue;
            return $$3;
        }
        int $$4 = this.c.size();
        amo $$5 = this.a($$4);
        boolean $$6 = $$1.c();
        gnt $$7 = $$6 ? gnt.b($$5) : gnt.a($$5);
        gns $$8 = new gns($$5::toString, $$7, $$6);
        this.c.add($$8);
        this.a.a($$5, $$8);
        return $$8.a($$0, $$1);
    }

    private amo a(int $$0) {
        return this.b.g("/" + $$0);
    }
}

