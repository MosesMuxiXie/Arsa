/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface cid {
    public @Nullable cic a_(int var1);

    default public dve a(IntList $$0) {
        List<cic> $$1 = $$0.intStream().mapToObj(this::a_).filter(Objects::nonNull).toList();
        return dve.a($$1);
    }
}

