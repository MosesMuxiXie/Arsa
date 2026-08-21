/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ikb
implements iki<eml> {
    private final hrs a;

    public ikb(hrs $$0) {
        this.a = $$0;
    }

    public @Nullable eml a(dlt $$0) {
        return $$0.a(ki.av);
    }

    @Override
    public void a(@Nullable eml $$0, dlr $$1, fzm $$2, hpo $$3, int $$4, int $$5, boolean $$6, int $$7) {
        this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, eml.a), $$7);
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        this.a.a($$0);
    }

    @Override
    public /* synthetic */ @Nullable Object b(dlt dlt2) {
        return this.a(dlt2);
    }

    public record a() implements iki.b
    {
        public static final MapCodec<a> a = MapCodec.unit((Object)new a());

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ikb(new hrs($$0));
        }
    }
}

