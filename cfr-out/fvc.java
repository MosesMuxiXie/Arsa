/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fvc<T>
implements fvf<T>,
fvh<T> {
    private final List<fvd<T>> a = Lists.newArrayList();
    private final Set<fvd<?>> b = new ObjectOpenCustomHashSet(fvd.a);

    @Override
    public void a(fve<T> $$0) {
        fvd<T> $$1 = new fvd<T>($$0.a(), $$0.b(), 0, $$0.d());
        this.a($$1);
    }

    @Override
    private void a(fvd<T> $$0) {
        if (this.b.add($$0)) {
            this.a.add($$0);
        }
    }

    @Override
    public boolean a(is $$0, T $$1) {
        return this.b.contains(fvd.a($$1, $$0));
    }

    @Override
    public int a() {
        return this.a.size();
    }

    @Override
    public List<fvd<T>> a(long $$0) {
        return this.a;
    }

    public List<fvd<T>> b() {
        return List.copyOf(this.a);
    }

    public static <T> fvc<T> a(List<fvd<T>> $$0) {
        fvc<T> $$1 = new fvc<T>();
        $$0.forEach($$1::a);
        return $$1;
    }
}

