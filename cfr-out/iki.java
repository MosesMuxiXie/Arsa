/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public interface iki<T> {
    public void a(@Nullable T var1, dlr var2, fzm var3, hpo var4, int var5, int var6, boolean var7, int var8);

    public void a(Consumer<Vector3fc> var1);

    public @Nullable T b(dlt var1);

    public static interface iki$a {
        public hdc b();

        public inu c();

        public hou d();

        public static final class a
        extends Record
        implements iki$a {
            private final hdc a;
            private final inu b;
            private final hou c;

            public a(hdc $$0, inu $$1, hou $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entityModelSet;materials;playerSkinRenderCache", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entityModelSet;materials;playerSkinRenderCache", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entityModelSet;materials;playerSkinRenderCache", "a", "b", "c"}, this, $$0);
            }

            @Override
            public hdc b() {
                return this.a;
            }

            @Override
            public inu c() {
                return this.b;
            }

            @Override
            public hou d() {
                return this.c;
            }
        }
    }

    public static interface b {
        public @Nullable iki<?> a(a var1);

        public MapCodec<? extends b> a();
    }
}

