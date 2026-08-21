/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface dwa
extends dwh,
dwr,
dwt {
    @Override
    default public <T extends elb> Optional<T> a(is $$0, eld<T> $$1) {
        return dwr.super.a($$0, $$1);
    }

    @Override
    default public List<fug> e(@Nullable cgk $$0, fth $$1) {
        return dwh.super.e($$0, $$1);
    }

    @Override
    default public boolean a(@Nullable cgk $$0, fug $$1) {
        return dwh.super.a($$0, $$1);
    }

    @Override
    default public is a(euq.a $$0, is $$1) {
        return dwr.super.a($$0, $$1);
    }
}

