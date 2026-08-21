/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class esv {
    private Int2ObjectMap<cgk> a = new Int2ObjectLinkedOpenHashMap();
    private Int2ObjectMap<cgk> b = new Int2ObjectLinkedOpenHashMap();
    private @Nullable Int2ObjectMap<cgk> c;

    private void a() {
        if (this.c == this.a) {
            this.b.clear();
            for (Int2ObjectMap.Entry $$0 : Int2ObjectMaps.fastIterable(this.a)) {
                this.b.put($$0.getIntKey(), (Object)((cgk)$$0.getValue()));
            }
            Int2ObjectMap<cgk> $$1 = this.a;
            this.a = this.b;
            this.b = $$1;
        }
    }

    public void a(cgk $$0) {
        this.a();
        this.a.put($$0.aA(), (Object)$$0);
    }

    public void b(cgk $$0) {
        this.a();
        this.a.remove($$0.aA());
    }

    public boolean c(cgk $$0) {
        return this.a.containsKey($$0.aA());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Consumer<cgk> $$0) {
        if (this.c != null) {
            throw new UnsupportedOperationException("Only one concurrent iteration supported");
        }
        this.c = this.a;
        try {
            for (cgk $$1 : this.a.values()) {
                $$0.accept($$1);
            }
        }
        finally {
            this.c = null;
        }
    }
}

