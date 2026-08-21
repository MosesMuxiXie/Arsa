/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class dlu {
    private static final Hash.Strategy<? super dlt> a = new Hash.Strategy<dlt>(){

        public int a(@Nullable dlt $$0) {
            return dlt.b($$0);
        }

        public boolean a(@Nullable dlt $$0, @Nullable dlt $$1) {
            return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && dlt.c($$0, $$1);
        }

        public /* synthetic */ boolean equals(@Nullable Object object, @Nullable Object object2) {
            return this.a((dlt)object, (dlt)object2);
        }

        public /* synthetic */ int hashCode(@Nullable Object object) {
            return this.a((dlt)object);
        }
    };

    public static Set<dlt> a() {
        return new ObjectLinkedOpenCustomHashSet(a);
    }
}

