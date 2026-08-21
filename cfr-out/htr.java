/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collections;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface htr
extends AutoCloseable {
    default public boolean b(htt $$0) {
        return false;
    }

    default public boolean a() {
        return false;
    }

    default public boolean c() {
        return false;
    }

    default public boolean a(hth $$0) {
        return true;
    }

    default public List<elb> b() {
        return Collections.emptyList();
    }

    public boolean a(iz var1, iz var2);

    default public @Nullable hto b(hth $$0) {
        return null;
    }

    @Override
    default public void close() {
    }
}

