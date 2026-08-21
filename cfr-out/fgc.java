/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface fgc<C extends fac> {
    public Optional<fgb<C>> createGenerator(a<C> var1);

    public static <C extends fac> fgc<C> simple(Predicate<a<C>> $$0, fgb<C> $$1) {
        Optional $$22 = Optional.of($$1);
        return $$2 -> $$0.test($$2) ? $$22 : Optional.empty();
    }

    public static <C extends fac> Predicate<a<C>> checkForBiomeOnTop(euq.a $$0) {
        return $$1 -> $$1.a($$0);
    }

    public record a<C extends fac>(eqg a, dxs b, eve c, long d, dvu e, C f, dwq g, Predicate<jd<dxo>> h, fjr i, jr j) {
        public boolean a(euq.a $$0) {
            int $$1 = this.e.c();
            int $$2 = this.e.d();
            int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
            jd<dxo> $$4 = this.a.d().getNoiseBiome(jo.a($$1), jo.a($$3), jo.a($$2), this.c.b());
            return this.h.test($$4);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }
    }
}

