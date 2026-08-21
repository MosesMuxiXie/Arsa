/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface ihj {
    public void a(ihm var1, dlt var2, ihk var3, dlr var4, @Nullable hif var5, @Nullable chh var6, int var7);

    public record a(inw a, hdc b, inu c, hou d, ihj e, @Nullable bgs f) implements iki.a
    {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockModelBaker;entityModelSet;materials;playerSkinRenderCache;missingItemModel;contextSwapper", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockModelBaker;entityModelSet;materials;playerSkinRenderCache;missingItemModel;contextSwapper", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockModelBaker;entityModelSet;materials;playerSkinRenderCache;missingItemModel;contextSwapper", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }
    }

    public static interface b
    extends ioe {
        public MapCodec<? extends b> a();

        public ihj a(a var1);
    }
}

