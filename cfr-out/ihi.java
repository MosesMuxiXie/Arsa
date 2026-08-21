/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ihi
implements ihj {
    public static final ihj a = new ihi();

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
    }

    public record a() implements ihj.b
    {
        public static final MapCodec<a> a = MapCodec.unit(a::new);

        @Override
        public void a(ioe.a $$0) {
        }

        @Override
        public ihj a(ihj.a $$0) {
            return a;
        }

        public MapCodec<a> a() {
            return a;
        }
    }
}

