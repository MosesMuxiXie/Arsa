/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.joml.Vector3fc
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import org.joml.Vector3fc;

public class ikl
implements ikd {
    private final hhg a;

    public ikl(hhg $$0) {
        this.a = $$0;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        $$1.a();
        $$1.b(1.0f, -1.0f, -1.0f);
        $$2.a(this.a.b(), $$1, this.a.a(hhg.a), $$3, $$4, null, false, $$5, -1, null, $$6);
        $$1.b();
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        $$1.b(1.0f, -1.0f, -1.0f);
        this.a.b().a($$1, $$0);
    }

    public record a() implements iki.b
    {
        public static final MapCodec<a> a = MapCodec.unit((Object)new a());

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ikl(new hhg($$0.b().a(hdf.dL)));
        }
    }
}

