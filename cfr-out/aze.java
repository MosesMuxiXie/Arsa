/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class aze
implements azl {
    private final azl c;
    private final List<azl> d;

    public aze(azl $$0, List<azl> $$1) {
        this.c = $$0;
        ArrayList<azl> $$2 = new ArrayList<azl>($$1.size() + 1);
        $$2.addAll(Lists.reverse($$1));
        $$2.add($$0);
        this.d = List.copyOf($$2);
    }

    @Override
    public @Nullable bar<InputStream> a(String ... $$0) {
        return this.c.a($$0);
    }

    @Override
    public @Nullable bar<InputStream> a(azn $$0, amo $$1) {
        for (azl $$2 : this.d) {
            bar<InputStream> $$3 = $$2.a($$0, $$1);
            if ($$3 == null) continue;
            return $$3;
        }
        return null;
    }

    @Override
    public void a(azn $$0, String $$1, String $$2, azl.a $$3) {
        HashMap<amo, bar<InputStream>> $$4 = new HashMap<amo, bar<InputStream>>();
        for (azl $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$4::putIfAbsent);
        }
        $$4.forEach($$3);
    }

    @Override
    public Set<String> a(azn $$0) {
        HashSet<String> $$1 = new HashSet<String>();
        for (azl $$2 : this.d) {
            $$1.addAll($$2.a($$0));
        }
        return $$1;
    }

    @Override
    public <T> @Nullable T a(azy<T> $$0) throws IOException {
        return this.c.a($$0);
    }

    @Override
    public azk a() {
        return this.c.a();
    }

    @Override
    public void close() {
        this.d.forEach(azl::close);
    }
}

