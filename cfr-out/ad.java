/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class ad {
    private final ac a;
    private final @Nullable ad b;
    private final Set<ad> c = new ReferenceOpenHashSet();

    @VisibleForTesting
    public ad(ac $$0, @Nullable ad $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public ab a() {
        return this.a.b();
    }

    public ac b() {
        return this.a;
    }

    public @Nullable ad c() {
        return this.b;
    }

    public ad d() {
        return ad.a(this);
    }

    public static ad a(ad $$0) {
        ad $$1 = $$0;
        ad $$2;
        while (($$2 = $$1.c()) != null) {
            $$1 = $$2;
        }
        return $$1;
    }

    public Iterable<ad> e() {
        return this.c;
    }

    @VisibleForTesting
    public void b(ad $$0) {
        this.c.add($$0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof ad)) return false;
        ad $$1 = (ad)$$0;
        if (!this.a.equals($$1.a)) return false;
        return true;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.a().toString();
    }
}

