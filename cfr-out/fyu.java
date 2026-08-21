/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record fyu(int a, int b, boolean c, int d) implements fyv<fxt>
{
    private final int a;
    private final int b;
    private final boolean c;
    private final int d;

    public fxt a() {
        return new fxu(null, this.a, this.b, this.c);
    }

    @Override
    public void a(fxt $$0) {
        if (this.c) {
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$0.c(), this.d, $$0.e(), 1.0);
        } else {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture($$0.c(), this.d);
        }
    }

    @Override
    public void b(fxt $$0) {
        $$0.a();
    }

    @Override
    public boolean a(fyv<?> $$0) {
        if ($$0 instanceof fyu) {
            fyu $$1 = (fyu)$$0;
            return this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
        }
        return false;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fyu.class, "width;height;useDepth;clearColor", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fyu.class, "width;height;useDepth;clearColor", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fyu.class, "width;height;useDepth;clearColor", "a", "b", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    @Override
    public /* synthetic */ void a(Object object) {
        this.b((fxt)object);
    }

    @Override
    public /* synthetic */ void b(Object object) {
        this.a((fxt)object);
    }

    @Override
    public /* synthetic */ Object f() {
        return this.a();
    }
}

