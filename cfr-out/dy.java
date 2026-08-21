/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;

public class dy {
    public static final Codec<dy> a = amo.a.xmap(dy::new, dy::a);
    private final amo b;
    private boolean c;
    private Optional<ht<ed>> d = Optional.empty();

    public dy(amo $$0) {
        this.b = $$0;
    }

    public Optional<ht<ed>> a(ani $$0) {
        if (!this.c) {
            this.d = $$0.a(this.b);
            this.c = true;
        }
        return this.d;
    }

    public amo a() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if (!($$0 instanceof dy)) return false;
        dy $$1 = (dy)$$0;
        if (!this.a().equals($$1.a())) return false;
        return true;
    }
}

