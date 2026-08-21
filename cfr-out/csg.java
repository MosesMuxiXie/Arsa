/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class csg
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.i);
    }

    @Override
    protected void a(axf $$0, chl $$1) {
        $$1.ev().a(cqw.i, this.a($$1));
    }

    private List<chl> a(chl $$0) {
        return ImmutableList.copyOf(this.c($$0).b(this::b));
    }

    private boolean b(chl $$0) {
        return $$0.ay() == cgu.bL && $$0.e_();
    }

    private cqy c(chl $$0) {
        return $$0.ev().c(cqw.h).orElse(cqy.a());
    }
}

