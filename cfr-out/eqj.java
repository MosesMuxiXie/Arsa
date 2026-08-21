/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public abstract class eqj
implements eqt,
AutoCloseable {
    public @Nullable eqq a(int $$0, int $$1, boolean $$2) {
        return (eqq)this.a($$0, $$1, erj.n, $$2);
    }

    public @Nullable eqq a(int $$0, int $$1) {
        return this.a($$0, $$1, false);
    }

    @Override
    public @Nullable eqs c(int $$0, int $$1) {
        return this.a($$0, $$1, erj.c, false);
    }

    public boolean b(int $$0, int $$1) {
        return this.a($$0, $$1, erj.n, false) != null;
    }

    public abstract @Nullable eqf a(int var1, int var2, erj var3, boolean var4);

    public abstract void a(BooleanSupplier var1, boolean var2);

    public void a(int $$0, int $$1, int $$2, boolean $$3) {
    }

    public abstract String e();

    public abstract int j();

    @Override
    public void close() throws IOException {
    }

    public abstract fkq r();

    public void b(boolean $$0) {
    }

    public boolean a(dvu $$0, boolean $$1) {
        return false;
    }

    public LongSet l() {
        return LongSet.of();
    }
}

