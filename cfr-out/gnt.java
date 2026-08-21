/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gnt(ijs a, ijs b, ijs c, RenderPipeline d) {
    public static gnt a(amo $$0) {
        return new gnt(ijt.v($$0), ijt.z($$0), ijt.x($$0), hpa.N);
    }

    public static gnt b(amo $$0) {
        return new gnt(ijt.u($$0), ijt.y($$0), ijt.w($$0), hpa.K);
    }

    public ijs a(gio.a $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case gio.a.a -> this.a;
            case gio.a.b -> this.b;
            case gio.a.c -> this.c;
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gnt.class, "normal;seeThrough;polygonOffset;guiPipeline", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gnt.class, "normal;seeThrough;polygonOffset;guiPipeline", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gnt.class, "normal;seeThrough;polygonOffset;guiPipeline", "a", "b", "c", "d"}, this, $$0);
    }
}

