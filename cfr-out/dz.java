/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.stream.Stream;

public interface dz
extends jf.a {
    public static dz a(final jf.a $$0, final dgz $$1) {
        return new dz(){

            @Override
            public Stream<amt<? extends jq<?>>> b() {
                return $$0.b();
            }

            public <T> Optional<jf.b<T>> a(amt<? extends jq<? extends T>> $$02) {
                return $$0.a($$02).map($$1 -> $$1.a($$1));
            }

            @Override
            public dgz a() {
                return $$1;
            }
        };
    }

    public dgz a();
}

