/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class cbf {
    private final Set<String> a = new ObjectOpenHashSet();

    public Set<cax> a(Supplier<bzj> $$02) {
        Set<cax> $$12 = $$02.get().e().stream().filter($$0 -> !this.a.contains($$0.getLeft())).map($$1 -> cbf.a($$02, (String)$$1.getLeft(), (caw)((Object)((Object)$$1.getRight())))).collect(Collectors.toSet());
        for (cax $$2 : $$12) {
            this.a.add($$2.d());
        }
        return $$12;
    }

    private static cax a(Supplier<bzj> $$0, String $$1, caw $$2) {
        return cax.a($$1, $$2, () -> {
            bze.a $$2 = ((bzj)$$0.get()).c($$1);
            return $$2 == null ? 0.0 : (double)$$2.b() / (double)bhn.b;
        });
    }
}

