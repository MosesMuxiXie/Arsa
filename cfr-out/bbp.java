/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  it.unimi.dsi.fastutil.objects.ReferenceSet
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.ReferenceSet;

public class bbp
implements bbn {
    private final ReferenceSet<bbn> a = new ReferenceArraySet();

    bbp(bbn $$0, bbn $$1) {
        this.a.add((Object)$$0);
        this.a.add((Object)$$1);
        this.b();
    }

    private bbp(ReferenceSet<bbn> $$0, bbn $$1) {
        this.a.addAll($$0);
        this.a.add((Object)$$1);
        this.b();
    }

    private bbp(ReferenceSet<bbn> $$0, ReferenceSet<bbn> $$1) {
        this.a.addAll($$0);
        this.a.addAll($$1);
        this.b();
    }

    @Override
    public boolean hasPermission(bbi $$0) {
        for (bbn $$1 : this.a) {
            if (!$$1.hasPermission($$0)) continue;
            return true;
        }
        return false;
    }

    @Override
    public bbn a(bbn $$0) {
        if ($$0 instanceof bbp) {
            bbp $$1 = (bbp)$$0;
            return new bbp(this.a, $$1.a);
        }
        return new bbp(this.a, $$0);
    }

    @VisibleForTesting
    public ReferenceSet<bbn> a() {
        return new ReferenceArraySet(this.a);
    }

    private void b() {
        for (bbn $$0 : this.a) {
            if (!($$0 instanceof bbp)) continue;
            throw new IllegalArgumentException("Cannot have PermissionSetUnion within another PermissionSetUnion");
        }
    }
}

