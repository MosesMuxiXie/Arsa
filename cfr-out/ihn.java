/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class ihn
implements ihj {
    private final List<hqa> a;
    private final Supplier<Vector3fc[]> b;
    private final iho c;

    public ihn(List<hqa> $$0, iho $$1) {
        this.a = $$0;
        this.c = $$1;
        this.b = Suppliers.memoize(() -> ihd.a(this.a));
    }

    @Override
    public void a(ihm $$0, dlt $$1, ihk $$2, dlr $$3, @Nullable hif $$4, @Nullable chh $$5, int $$6) {
        $$0.a(this);
        ihm.b $$7 = $$0.a();
        $$7.a(hpj.i());
        this.c.a($$7, $$3);
        $$7.a(this.b);
        $$7.b().addAll(this.a);
    }
}

