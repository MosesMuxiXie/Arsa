/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class ayx
implements ayy {
    private final List<ayy> a = Lists.newArrayList();

    public void a(ayy $$0) {
        this.a.add($$0);
    }

    @Override
    public void a(axg $$0) {
        this.a.forEach($$1 -> $$1.a($$0));
    }

    @Override
    public void b(axg $$0) {
        this.a.forEach($$1 -> $$1.b($$0));
    }

    @Override
    public void a() {
        this.a.forEach(ayy::a);
    }

    @Override
    public void b() {
        this.a.forEach(ayy::b);
    }

    @Override
    public void c() {
        this.a.forEach(ayy::c);
    }

    @Override
    public void d() {
        this.a.forEach(ayy::d);
    }

    @Override
    public void e() {
        this.a.forEach(ayy::e);
    }

    @Override
    public void a(bcc $$0) {
        this.a.forEach($$1 -> $$1.a($$0));
    }

    @Override
    public void b(bcc $$0) {
        this.a.forEach($$1 -> $$1.b($$0));
    }

    @Override
    public void a(bbx $$0) {
        this.a.forEach($$1 -> $$1.a($$0));
    }

    @Override
    public void b(bbx $$0) {
        this.a.forEach($$1 -> $$1.b($$0));
    }

    @Override
    public void a(bbw $$0) {
        this.a.forEach($$1 -> $$1.a($$0));
    }

    @Override
    public void a(String $$0) {
        this.a.forEach($$1 -> $$1.a($$0));
    }

    @Override
    public void a(bch $$0) {
        this.a.forEach($$1 -> $$1.a($$0));
    }

    @Override
    public void c(bbx $$0) {
        this.a.forEach($$1 -> $$1.c($$0));
    }

    @Override
    public <T> void a(etv<T> $$0, T $$1) {
        this.a.forEach($$2 -> $$2.a($$0, $$1));
    }

    @Override
    public void f() {
        this.a.forEach(ayy::f);
    }
}

