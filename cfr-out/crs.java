/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class crs
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.Y);
    }

    @Override
    protected void a(axf $$0, chl $$1) {
        if ($$1.by()) {
            $$1.ev().a(cqw.Y, bhr.a);
        } else {
            $$1.ev().b(cqw.Y);
        }
    }
}

