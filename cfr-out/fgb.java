/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

@FunctionalInterface
public interface fgb<C extends fac> {
    public void generatePieces(fgg var1, a<C> var2);

    public record a<C extends fac>(C a, eqg b, fjr c, dvu d, dwq e, evp f, long g) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "config;chunkGenerator;structureTemplateManager;chunkPos;heightAccessor;random;seed", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "config;chunkGenerator;structureTemplateManager;chunkPos;heightAccessor;random;seed", "a", "b", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "config;chunkGenerator;structureTemplateManager;chunkPos;heightAccessor;random;seed", "a", "b", "c", "d", "e", "f", "g"}, this, $$0);
        }
    }
}

