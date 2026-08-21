/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class est<T extends esp> {
    private static final Logger a = LogUtils.getLogger();
    private final bev<T> b;
    private ete c;

    public est(Class<T> $$0, ete $$1) {
        this.c = $$1;
        this.b = new bev<T>($$0);
    }

    public void a(T $$0) {
        this.b.add($$0);
    }

    public boolean b(T $$0) {
        return this.b.remove($$0);
    }

    public bem.a a(fth $$0, bem<T> $$1) {
        for (esp $$2 : this.b) {
            if (!$$2.dj().c($$0) || !$$1.accept($$2).a()) continue;
            return bem.a.b;
        }
        return bem.a.a;
    }

    public <U extends T> bem.a a(esw<T, U> $$0, fth $$1, bem<? super U> $$2) {
        Collection<T> $$3 = this.b.a($$0.a());
        if ($$3.isEmpty()) {
            return bem.a.a;
        }
        for (esp $$4 : $$3) {
            esp $$5 = (esp)$$0.a($$4);
            if ($$5 == null || !$$4.dj().c($$1) || !$$2.accept($$5).a()) continue;
            return bem.a.b;
        }
        return bem.a.a;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public Stream<T> b() {
        return this.b.stream();
    }

    public ete c() {
        return this.c;
    }

    public ete a(ete $$0) {
        ete $$1 = this.c;
        this.c = $$0;
        return $$1;
    }

    @bht
    public int d() {
        return this.b.size();
    }
}

