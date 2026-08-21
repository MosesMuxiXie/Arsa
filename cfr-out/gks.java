/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gks
implements gpe {
    private static final int a = 170;
    private final yh b;
    private @Nullable List<bfr> c;
    private @Nullable uu d;
    private final @Nullable yh e;

    private gks(yh $$0, @Nullable yh $$1) {
        this.b = $$0;
        this.e = $$1;
    }

    public static gks a(yh $$0, @Nullable yh $$1) {
        return new gks($$0, $$1);
    }

    public static gks a(yh $$0) {
        return new gks($$0, $$0);
    }

    @Override
    public void b(gpd $$0) {
        if (this.e != null) {
            $$0.a(gpc.c, this.e);
        }
    }

    public List<bfr> a(gfj $$0) {
        uu $$1 = uu.a();
        if (this.c == null || $$1 != this.d) {
            this.c = gks.a($$0, this.b);
            this.d = $$1;
        }
        return this.c;
    }

    public static List<bfr> a(gfj $$0, yh $$1) {
        return $$0.g.c($$1, 170);
    }
}

