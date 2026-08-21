/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;

public class cbc
implements cbe {
    public static final int a = 10;
    private static @Nullable Consumer<Path> b = null;
    private final Map<cax, List<cbj>> c = new Object2ObjectOpenHashMap();
    private final bzf d;
    private final Executor e;
    private final cbi f;
    private final Consumer<bzk> g;
    private final Consumer<Path> h;
    private final caz i;
    private final LongSupplier j;
    private final long k;
    private int l;
    private bzj m;
    private volatile boolean n;
    private Set<cax> o = ImmutableSet.of();

    private cbc(caz $$0, LongSupplier $$1, Executor $$2, cbi $$3, Consumer<bzk> $$4, Consumer<Path> $$5) {
        this.i = $$0;
        this.j = $$1;
        this.d = new bzf($$1, () -> this.l, () -> false);
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = b == null ? $$5 : $$5.andThen(b);
        this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
        this.m = new bze(this.j, () -> this.l, () -> true);
        this.d.c();
    }

    public static cbc a(caz $$0, LongSupplier $$1, Executor $$2, cbi $$3, Consumer<bzk> $$4, Consumer<Path> $$5) {
        return new cbc($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public synchronized void a() {
        if (!this.e()) {
            return;
        }
        this.n = true;
    }

    @Override
    public synchronized void b() {
        if (!this.e()) {
            return;
        }
        this.m = bzi.a;
        this.g.accept(bzg.a);
        this.a(this.o);
    }

    @Override
    public void c() {
        this.g();
        this.o = this.i.a(() -> this.m);
        for (cax $$0 : this.o) {
            $$0.a();
        }
        ++this.l;
    }

    @Override
    public void d() {
        this.g();
        if (this.l == 0) {
            return;
        }
        for (cax $$02 : this.o) {
            $$02.a(this.l);
            if (!$$02.g()) continue;
            cbj $$1 = new cbj(Instant.now(), this.l, this.m.d());
            this.c.computeIfAbsent($$02, $$0 -> Lists.newArrayList()).add($$1);
        }
        if (this.n || this.j.getAsLong() > this.k) {
            this.n = false;
            bzk $$2 = this.d.e();
            this.m = bzi.a;
            this.g.accept($$2);
            this.a($$2);
            return;
        }
        this.m = new bze(this.j, () -> this.l, () -> true);
    }

    @Override
    public boolean e() {
        return this.d.a();
    }

    @Override
    public bzm f() {
        return bzm.a(this.d.d(), this.m);
    }

    private void g() {
        if (!this.e()) {
            throw new IllegalStateException("Not started!");
        }
    }

    private void a(bzk $$0) {
        HashSet<cax> $$1 = new HashSet<cax>(this.o);
        this.e.execute(() -> {
            Path $$2 = this.f.a($$1, this.c, $$0);
            this.a($$1);
            this.h.accept($$2);
        });
    }

    private void a(Collection<cax> $$0) {
        for (cax $$1 : $$0) {
            $$1.b();
        }
        this.c.clear();
        this.d.b();
    }

    public static void a(Consumer<Path> $$0) {
        b = $$0;
    }
}

