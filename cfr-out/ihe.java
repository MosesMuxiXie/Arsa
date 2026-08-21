/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ihe
implements ihj {
    static final ihj a = new ihe();

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        dlt $$7 = dki.i($$1);
        if (!$$7.f()) {
            $$2.b($$0, $$7, $$3, $$4, $$5, $$6);
        }
    }

    public record a() implements ihj.b
    {
        public static final MapCodec<a> a = MapCodec.unit((Object)new a());

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public ihj a(ihj.a $$0) {
            return a;
        }

        @Override
        public void a(ioe.a $$0) {
        }
    }
}

