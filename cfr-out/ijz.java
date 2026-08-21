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

public class ijz
implements ikd {
    private final inu a;
    private final hdg b;

    public ijz(inu $$0, hdg $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void a(dlr $$0, fzm $$1, hpo $$2, int $$3, int $$4, boolean $$5, int $$6) {
        $$1.a();
        $$1.a(0.5f, 0.5f, 0.5f);
        $$2.a(this.b, $$1, hrq.b.a(ijt::d), $$3, $$4, this.a.a(hrq.b), false, false, -1, null, $$6);
        $$1.b();
    }

    @Override
    public void a(Consumer<Vector3fc> $$0) {
        fzm $$1 = new fzm();
        $$1.a(0.5f, 0.5f, 0.5f);
        this.b.a($$1, $$0);
    }

    public record a() implements iki.b
    {
        public static final MapCodec<a> a = MapCodec.unit((Object)new a());

        public MapCodec<a> a() {
            return a;
        }

        @Override
        public iki<?> a(iki.a $$0) {
            return new ijz($$0.c(), $$0.b().a(hdf.al));
        }
    }
}

