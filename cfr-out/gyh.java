/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record gyh(evo a, jq<esi> b, evl c, jk<anc> d, ane e, dxm f, gyc g) {
    private final evo a;
    private final jq<esi> b;
    private final evl c;
    private final jk<anc> d;
    private final ane e;
    private final dxm f;
    private final gyc g;

    public gyh(evm $$0, jk<anc> $$1, ane $$2, dxm $$3) {
        this($$0.a(), $$0.b(), $$1, $$2, $$3, new gyc(gyj.a.a, etx.a(), null));
    }

    public gyh(evo $$0, evl $$1, jk<anc> $$2, ane $$3, dxm $$4, gyc $$5) {
        this($$0, $$2.a(anc.c).f(mj.bF), $$1, $$2.a(anc.c, new jr.b[0]), $$3, $$4, $$5);
    }

    public gyh a(evo $$0, evl $$1) {
        return new gyh($$0, this.b, $$1, this.d, this.e, this.f, this.g);
    }

    public gyh a(b $$0) {
        return new gyh((evo)$$0.apply(this.a), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public gyh a(a $$0) {
        return new gyh(this.a, this.b, (evl)$$0.apply(this.a(), this.c), this.d, this.e, this.f, this.g);
    }

    public jr.b a() {
        return this.d.a();
    }

    public void b() {
        for (esi $$0 : this.d()) {
            $$0.b().a();
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gyh.class, "options;datapackDimensions;selectedDimensions;worldgenRegistries;dataPackResources;dataConfiguration;initialWorldCreationOptions", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gyh.class, "options;datapackDimensions;selectedDimensions;worldgenRegistries;dataPackResources;dataConfiguration;initialWorldCreationOptions", "a", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gyh.class, "options;datapackDimensions;selectedDimensions;worldgenRegistries;dataPackResources;dataConfiguration;initialWorldCreationOptions", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public evo c() {
        return this.a;
    }

    public jq<esi> d() {
        return this.b;
    }

    public evl e() {
        return this.c;
    }

    public jk<anc> f() {
        return this.d;
    }

    public ane g() {
        return this.e;
    }

    public dxm h() {
        return this.f;
    }

    public gyc i() {
        return this.g;
    }

    public static interface b
    extends UnaryOperator<evo> {
    }

    @FunctionalInterface
    public static interface a
    extends BiFunction<jr.b, evl, evl> {
    }
}

