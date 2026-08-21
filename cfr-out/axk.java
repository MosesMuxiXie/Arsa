/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class axk
extends awl {
    private final LongSet c = new LongOpenHashSet();
    private final int d;
    private final String e;

    public axk(cbx<Runnable> $$0, Executor $$1, int $$2) {
        super($$0, $$1);
        this.d = $$2;
        this.e = $$0.z_();
    }

    @Override
    protected void a(long $$0) {
        this.c.remove($$0);
    }

    @Override
    protected @Nullable awm.a c() {
        return this.c.size() < this.d ? super.c() : null;
    }

    @Override
    protected void a(awm.a $$0) {
        this.c.add($$0.a());
        super.a($$0);
    }

    @VisibleForTesting
    public String d() {
        return this.e + "=[" + this.c.longStream().mapToObj($$0 -> $$0 + ":" + String.valueOf(new dvu($$0))).collect(Collectors.joining(",")) + "], s=" + this.b;
    }
}

