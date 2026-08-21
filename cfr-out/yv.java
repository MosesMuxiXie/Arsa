/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayDeque;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class yv {
    public static final int a = -1;
    private static final int b = 128;
    private final @Nullable yu[] c;

    public yv(int $$0) {
        this.c = new yu[$$0];
    }

    public static yv a() {
        return new yv(128);
    }

    public int a(yu $$0) {
        for (int $$1 = 0; $$1 < this.c.length; ++$$1) {
            if (!$$0.equals(this.c[$$1])) continue;
            return $$1;
        }
        return -1;
    }

    public @Nullable yu a(int $$0) {
        return this.c[$$0];
    }

    public void a(zb $$0, @Nullable yu $$1) {
        List<yu> $$2 = $$0.d().b();
        ArrayDeque<yu> $$3 = new ArrayDeque<yu>($$2.size() + 1);
        $$3.addAll($$2);
        if ($$1 != null) {
            $$3.add($$1);
        }
        this.a($$3);
    }

    @VisibleForTesting
    void a(List<yu> $$0) {
        this.a(new ArrayDeque<yu>($$0));
    }

    private void a(ArrayDeque<yu> $$0) {
        ObjectOpenHashSet $$1 = new ObjectOpenHashSet($$0);
        for (int $$2 = 0; !$$0.isEmpty() && $$2 < this.c.length; ++$$2) {
            yu $$3 = this.c[$$2];
            this.c[$$2] = $$0.removeLast();
            if ($$3 == null || $$1.contains($$3)) continue;
            $$0.addFirst($$3);
        }
    }
}

