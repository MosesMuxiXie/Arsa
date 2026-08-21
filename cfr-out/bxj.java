/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class bxj {
    private final MinecraftServer a;
    private final Map<bxe<?>, List<axg>> b = new HashMap();

    public bxj(MinecraftServer $$0) {
        this.a = $$0;
    }

    private List<axg> b(bxe<?> $$0) {
        return this.b.getOrDefault($$0, List.of());
    }

    public void a() {
        this.b.values().forEach(List::clear);
        for (axg $$02 : this.a.aj().t()) {
            for (bxe<?> $$1 : $$02.an()) {
                this.b.computeIfAbsent($$1, $$0 -> new ArrayList()).add($$02);
            }
        }
        this.b.values().removeIf(List::isEmpty);
    }

    public void a(bxe<?> $$0, aay<?> $$1) {
        for (axg $$2 : this.b($$0)) {
            $$2.g.b($$1);
        }
    }

    public Set<bxe<?>> b() {
        return Set.copyOf(this.b.keySet());
    }

    public boolean a(bxe<?> $$0) {
        return !this.b($$0).isEmpty();
    }

    public boolean a(axg $$0) {
        bbx $$1 = $$0.gJ();
        if (w.aX && this.a.a($$1)) {
            return true;
        }
        return this.a.aj().f($$1);
    }
}

