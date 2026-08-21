/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class axb
extends ccs {
    private final Set<axg> h = Sets.newHashSet();
    private final Set<axg> i = Collections.unmodifiableSet(this.h);
    private boolean j = true;

    public axb(yh $$0, ccs.a $$1, ccs.b $$2) {
        super(bgj.a(), $$0, $$1, $$2);
    }

    @Override
    public void a(float $$0) {
        if ($$0 != this.b) {
            super.a($$0);
            this.a(adk::b);
        }
    }

    @Override
    public void a(ccs.a $$0) {
        if ($$0 != this.c) {
            super.a($$0);
            this.a(adk::d);
        }
    }

    @Override
    public void a(ccs.b $$0) {
        if ($$0 != this.d) {
            super.a($$0);
            this.a(adk::d);
        }
    }

    @Override
    public ccs a(boolean $$0) {
        if ($$0 != this.e) {
            super.a($$0);
            this.a(adk::e);
        }
        return this;
    }

    @Override
    public ccs b(boolean $$0) {
        if ($$0 != this.f) {
            super.b($$0);
            this.a(adk::e);
        }
        return this;
    }

    @Override
    public ccs c(boolean $$0) {
        if ($$0 != this.g) {
            super.c($$0);
            this.a(adk::e);
        }
        return this;
    }

    @Override
    public void a(yh $$0) {
        if (!Objects.equal((Object)$$0, (Object)this.a)) {
            super.a($$0);
            this.a(adk::c);
        }
    }

    private void a(Function<ccs, adk> $$0) {
        if (this.j) {
            adk $$1 = $$0.apply(this);
            for (axg $$2 : this.h) {
                $$2.g.b($$1);
            }
        }
    }

    public void a(axg $$0) {
        if (this.h.add($$0) && this.j) {
            $$0.g.b(adk.a(this));
        }
    }

    public void b(axg $$0) {
        if (this.h.remove($$0) && this.j) {
            $$0.g.b(adk.a(this.i()));
        }
    }

    public void b() {
        if (!this.h.isEmpty()) {
            for (axg $$0 : Lists.newArrayList(this.h)) {
                this.b($$0);
            }
        }
    }

    public boolean g() {
        return this.j;
    }

    public void d(boolean $$0) {
        if ($$0 != this.j) {
            this.j = $$0;
            for (axg $$1 : this.h) {
                $$1.g.b($$0 ? adk.a(this) : adk.a(this.i()));
            }
        }
    }

    public Collection<axg> h() {
        return this.i;
    }
}

