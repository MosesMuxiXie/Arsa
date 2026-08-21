/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public interface eih {
    public dpa c();

    public static List<eih> d() {
        return mi.h.s().map(eih::a).filter(Objects::nonNull).collect(Collectors.toList());
    }

    public static @Nullable eih a(dwn $$0) {
        dkb $$1;
        dgw dgw2 = $$0.h();
        if (dgw2 instanceof dkb && (dgw2 = ($$1 = (dkb)dgw2).c()) instanceof eih) {
            eih $$2 = (eih)((Object)dgw2);
            return $$2;
        }
        dlp dlp2 = $$0.h();
        if (dlp2 instanceof eih) {
            eih $$3 = (eih)((Object)dlp2);
            return $$3;
        }
        return null;
    }
}

