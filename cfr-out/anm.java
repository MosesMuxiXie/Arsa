/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public class anm
extends fur {
    private final MinecraftServer b;
    private final Set<fuj> c = Sets.newHashSet();
    private boolean d;

    public anm(MinecraftServer $$0) {
        this.b = $$0;
    }

    public void a(fus.a $$02) {
        $$02.a().forEach($$1 -> this.a((fuj.a)$$1));
        $$02.b().forEach($$1 -> this.a((fur.a)$$1));
        $$02.c().forEach(($$0, $$1) -> {
            fuj $$2 = this.a((String)$$1);
            this.a((fui)$$0, $$2);
        });
        $$02.d().forEach($$1 -> this.a((fum.a)$$1));
    }

    private fus.a k() {
        return new fus.a(this.i(), this.g(), this.j(), this.h());
    }

    @Override
    protected void a(fuq $$0, fuj $$1, fuo $$2) {
        super.a($$0, $$1, $$2);
        if (this.c.contains($$1)) {
            this.b.aj().a(new aha($$0.da(), $$1.c(), $$2.a(), Optional.ofNullable($$2.e()), Optional.ofNullable($$2.c())));
        }
        this.a();
    }

    @Override
    protected void a(fuq $$0, fuj $$1) {
        super.a($$0, $$1);
        this.a();
    }

    @Override
    public void a(fuq $$0) {
        super.a($$0);
        this.b.aj().a(new afx($$0.da(), null));
        this.a();
    }

    @Override
    public void b(fuq $$0, fuj $$1) {
        super.b($$0, $$1);
        if (this.c.contains($$1)) {
            this.b.aj().a(new afx($$0.da(), $$1.c()));
        }
        this.a();
    }

    @Override
    public void a(fui $$0, @Nullable fuj $$1) {
        fuj $$2 = this.a($$0);
        super.a($$0, $$1);
        if ($$2 != $$1 && $$2 != null) {
            if (this.h($$2) > 0) {
                this.b.aj().a(new ago($$0, $$1));
            } else {
                this.g($$2);
            }
        }
        if ($$1 != null) {
            if (this.c.contains($$1)) {
                this.b.aj().a(new ago($$0, $$1));
            } else {
                this.e($$1);
            }
        }
        this.a();
    }

    @Override
    public boolean a(String $$0, fum $$1) {
        if (super.a($$0, $$1)) {
            this.b.aj().a(agz.a($$1, $$0, agz.a.a));
            this.f($$0);
            this.a();
            return true;
        }
        return false;
    }

    @Override
    public void b(String $$0, fum $$1) {
        super.b($$0, $$1);
        this.b.aj().a(agz.a($$1, $$0, agz.a.b));
        this.f($$0);
        this.a();
    }

    @Override
    public void a(fuj $$0) {
        super.a($$0);
        this.a();
    }

    @Override
    public void b(fuj $$0) {
        super.b($$0);
        if (this.c.contains($$0)) {
            this.b.aj().a(new agw($$0, 2));
        }
        this.a();
    }

    @Override
    public void c(fuj $$0) {
        super.c($$0);
        if (this.c.contains($$0)) {
            this.g($$0);
        }
        this.a();
    }

    @Override
    public void a(fum $$0) {
        super.a($$0);
        this.b.aj().a(agz.a($$0, true));
        this.a();
    }

    @Override
    public void b(fum $$0) {
        super.b($$0);
        this.b.aj().a(agz.a($$0, false));
        this.e($$0);
        this.a();
    }

    @Override
    public void c(fum $$0) {
        super.c($$0);
        this.b.aj().a(agz.a($$0));
        this.e($$0);
        this.a();
    }

    protected void a() {
        this.d = true;
    }

    public void a(fus $$0) {
        if (this.d) {
            this.d = false;
            $$0.a(this.k());
        }
    }

    public List<aay<?>> d(fuj $$0) {
        ArrayList $$1 = Lists.newArrayList();
        $$1.add(new agw($$0, 0));
        for (fui $$2 : fui.values()) {
            if (this.a($$2) != $$0) continue;
            $$1.add(new ago($$2, $$0));
        }
        for (fuk $$3 : this.i($$0)) {
            $$1.add(new aha($$3.c(), $$0.c(), $$3.d(), Optional.ofNullable($$3.e()), Optional.ofNullable($$3.f())));
        }
        return $$1;
    }

    public void e(fuj $$0) {
        List<aay<?>> $$1 = this.d($$0);
        for (axg $$2 : this.b.aj().t()) {
            for (aay<?> $$3 : $$1) {
                $$2.g.b($$3);
            }
        }
        this.c.add($$0);
    }

    public List<aay<?>> f(fuj $$0) {
        ArrayList $$1 = Lists.newArrayList();
        $$1.add(new agw($$0, 1));
        for (fui $$2 : fui.values()) {
            if (this.a($$2) != $$0) continue;
            $$1.add(new ago($$2, $$0));
        }
        return $$1;
    }

    public void g(fuj $$0) {
        List<aay<?>> $$1 = this.f($$0);
        for (axg $$2 : this.b.aj().t()) {
            for (aay<?> $$3 : $$1) {
                $$2.g.b($$3);
            }
        }
        this.c.remove($$0);
    }

    public int h(fuj $$0) {
        int $$1 = 0;
        for (fui $$2 : fui.values()) {
            if (this.a($$2) != $$0) continue;
            ++$$1;
        }
        return $$1;
    }

    private void f(String $$0) {
        axg $$1 = this.b.aj().a($$0);
        if ($$1 != null) {
            $$1.A().j().d($$1);
        }
    }

    private void e(fum $$02) {
        for (axf $$12 : this.b.P()) {
            $$02.h().stream().map($$0 -> this.b.aj().a((String)$$0)).filter(Objects::nonNull).forEach($$1 -> $$12.j().d((fvx)$$1));
        }
    }
}

