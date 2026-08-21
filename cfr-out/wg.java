/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 */
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class wg
extends wh {
    private int a;
    private final Set<wb<?>> b;
    private final Deque<wj> c = new ArrayDeque<wj>();

    public wg(wi ... $$0) {
        this.a = $$0.length;
        ImmutableSet.Builder $$1 = ImmutableSet.builder();
        wj $$2 = wj.a();
        for (wi $$3 : $$0) {
            $$2.a($$3);
            $$1.add($$3.b());
        }
        this.c.push($$2);
        $$1.add(uz.b);
        this.b = $$1.build();
    }

    @Override
    public vw.b b(wb<?> $$0) {
        if ($$0 != uz.b) {
            return vw.b.c;
        }
        return super.b($$0);
    }

    @Override
    public vw.a a(wb<?> $$0) {
        wj $$1 = this.c.element();
        if (this.e() > $$1.b()) {
            return super.a($$0);
        }
        if (this.a <= 0) {
            return vw.a.c;
        }
        if (!this.b.contains($$0)) {
            return vw.a.b;
        }
        return super.a($$0);
    }

    @Override
    public vw.a a(wb<?> $$0, String $$1) {
        wj $$3;
        wj $$2 = this.c.element();
        if (this.e() > $$2.b()) {
            return super.a($$0, $$1);
        }
        if ($$2.c().remove($$1, $$0)) {
            --this.a;
            return super.a($$0, $$1);
        }
        if ($$0 == uz.b && ($$3 = $$2.d().get($$1)) != null) {
            this.c.push($$3);
            return super.a($$0, $$1);
        }
        return vw.a.b;
    }

    @Override
    public vw.b b() {
        if (this.e() == this.c.element().b()) {
            this.c.pop();
        }
        return super.b();
    }

    public int c() {
        return this.a;
    }
}

