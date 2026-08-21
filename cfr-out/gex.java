/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gex {
    private final List<yn> a = Lists.newArrayList();

    public void a(yn $$0) {
        this.a.add($$0);
    }

    public @Nullable yn a() {
        if (this.a.isEmpty()) {
            return null;
        }
        if (this.a.size() == 1) {
            return this.a.get(0);
        }
        return yn.a(this.a);
    }

    public yn b() {
        yn $$0 = this.a();
        return $$0 != null ? $$0 : yn.b;
    }

    public void c() {
        this.a.clear();
    }
}

