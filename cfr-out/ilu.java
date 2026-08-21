/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public interface ilu {
    public static final amm a = new amm("textures", ".png");

    public void a(baz var1, c var2);

    public MapCodec<? extends ilu> a();

    public static interface a
    extends b {
        default public void a() {
        }
    }

    @FunctionalInterface
    public static interface b {
        public @Nullable ilk get(ilt var1);
    }

    public static interface c {
        default public void a(amo $$0, bax $$1) {
            this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
        }

        public void a(amo var1, a var2);

        public void a(Predicate<amo> var1);
    }
}

