/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class awy {
    private final Object2BooleanMap<axg> a = new Object2BooleanOpenHashMap();

    public Set<axg> a() {
        return this.a.keySet();
    }

    public void a(axg $$0, boolean $$1) {
        this.a.put((Object)$$0, $$1);
    }

    public void a(axg $$0) {
        this.a.removeBoolean((Object)$$0);
    }

    public void b(axg $$0) {
        this.a.replace((Object)$$0, true);
    }

    public void c(axg $$0) {
        this.a.replace((Object)$$0, false);
    }

    public boolean d(axg $$0) {
        return this.a.getOrDefault((Object)$$0, true);
    }

    public boolean e(axg $$0) {
        return this.a.getBoolean((Object)$$0);
    }
}

