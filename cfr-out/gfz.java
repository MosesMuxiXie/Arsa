/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record gfz(float a, boolean b, Map<String, List<gfy>> c) {
    public ggb a(hdg $$0) {
        return ggb.a($$0, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gfz.class, "lengthInSeconds;looping;boneAnimations", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gfz.class, "lengthInSeconds;looping;boneAnimations", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gfz.class, "lengthInSeconds;looping;boneAnimations", "a", "b", "c"}, this, $$0);
    }

    public static class a {
        private final float a;
        private final Map<String, List<gfy>> b = Maps.newHashMap();
        private boolean c;

        public static a a(float $$0) {
            return new a($$0);
        }

        private a(float $$0) {
            this.a = $$0;
        }

        public a a() {
            this.c = true;
            return this;
        }

        public a a(String $$02, gfy $$1) {
            this.b.computeIfAbsent($$02, $$0 -> new ArrayList()).add($$1);
            return this;
        }

        public gfz b() {
            return new gfz(this.a, this.c, this.b);
        }
    }
}

