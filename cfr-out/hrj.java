/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

@FunctionalInterface
public interface hrj<T extends elb, S extends hsm> {
    public hri<T, S> create(a var1);

    public record a(hrh a, hpw b, ihk c, hxp d, hwo e, hdc f, gio g, inu h, hou i) {
        public hdg a(hde $$0) {
            return this.f.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockEntityRenderDispatcher;blockRenderDispatcher;itemModelResolver;itemRenderer;entityRenderer;entityModelSet;font;materials;playerSkinRenderCache", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockEntityRenderDispatcher;blockRenderDispatcher;itemModelResolver;itemRenderer;entityRenderer;entityModelSet;font;materials;playerSkinRenderCache", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockEntityRenderDispatcher;blockRenderDispatcher;itemModelResolver;itemRenderer;entityRenderer;entityModelSet;font;materials;playerSkinRenderCache", "a", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }
    }
}

