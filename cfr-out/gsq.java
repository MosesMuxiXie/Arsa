/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class gsq<T extends asf>
extends gsu<T> {
    public static final int a = 5;

    public gsq(@Nullable gsb $$0, T $$1, gsr $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void a(goy $$0, gss $$12, T $$2, gsr $$3) {
        super.a($$0, $$12, $$2, $$3);
        List<gje> $$4 = this.a($$2, $$3).map($$1 -> $$12.a((ase)$$1).a()).toList();
        $$0.a(gsq.a($$4, $$2.b()));
    }

    protected abstract Stream<ase> a(T var1, gsr var2);

    @Override
    protected void a(gou $$0, gss $$1, T $$22, gsr $$3) {
        super.a($$0, $$1, $$22, $$3);
        $$22.c().ifPresentOrElse($$2 -> $$0.b($$1.a((ase)$$2).a()), () -> $$0.a(5));
    }
}

