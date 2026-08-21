/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public class bc {
    public static final Codec<bc> a = frm.e.listOf().xmap(bc::new, $$0 -> $$0.b);
    private final List<frm> b;
    private final Predicate<fnz> c;

    bc(List<frm> $$0) {
        this.b = $$0;
        this.c = bhs.a($$0);
    }

    public static bc a(frm ... $$0) {
        return new bc(List.of($$0));
    }

    public boolean a(fnz $$0) {
        return this.c.test($$0);
    }

    public void a(fog $$0) {
        for (int $$1 = 0; $$1 < this.b.size(); ++$$1) {
            frm $$2 = this.b.get($$1);
            $$2.a($$0.a(new bgp.e($$1)));
        }
    }
}

