/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class iim
implements iiv {
    public static final MapCodec<iim> a = iin.a.xmap(iim::new, $$0 -> $$0.b);
    private final iin b;

    public iim(boolean $$0, iin.a $$1) {
        this(new iin($$0, $$1));
    }

    private iim(iin $$0) {
        this.b = $$0;
    }

    @Override
    public float a(dlt $$0, @Nullable hif $$1, @Nullable chh $$2, int $$3) {
        return this.b.a($$0, $$1, $$2, $$3);
    }

    public MapCodec<iim> a() {
        return a;
    }
}

