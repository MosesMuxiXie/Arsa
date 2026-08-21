/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gwt {
    private final Reference2ObjectMap<dji, a> a = new Reference2ObjectArrayMap();
    private final gxc b;

    public gwt(gxc $$0) {
        this.b = $$0;
    }

    public void a() {
        this.a.clear();
    }

    private void a(dji $$0, bhx $$1, dse $$2, boolean $$3) {
        List<dlt> $$4 = $$2.a($$1);
        if (!$$4.isEmpty()) {
            this.a.put((Object)$$0, (Object)new a($$4, $$3));
        }
    }

    protected void a(dji $$0, bhx $$1, dse $$2) {
        this.a($$0, $$1, $$2, false);
    }

    protected void b(dji $$0, bhx $$1, dse $$2) {
        this.a($$0, $$1, $$2, true);
    }

    public void a(gir $$0, gfj $$1, boolean $$2) {
        this.a.forEach(($$3, $$4) -> {
            int $$5 = $$3.e;
            int $$6 = $$3.f;
            if ($$4.b && $$2) {
                $$0.a($$5 - 4, $$6 - 4, $$5 + 20, $$6 + 20, 0x30FF0000);
            } else {
                $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 0x30FF0000);
            }
            dlt $$7 = $$4.a(this.b.currentIndex());
            $$0.b($$7, $$5, $$6);
            $$0.a($$5, $$6, $$5 + 16, $$6 + 16, 0x30FFFFFF);
            if ($$4.b) {
                $$0.a($$2.g, $$7, $$5, $$6);
            }
        });
    }

    public void a(gir $$0, gfj $$1, int $$2, int $$3, @Nullable dji $$4) {
        if ($$4 == null) {
            return;
        }
        a $$5 = (a)this.a.get((Object)$$4);
        if ($$5 != null) {
            dlt $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.g, gsb.a($$1, $$6), $$2, $$3, $$6.a(ki.K));
        }
    }

    static final class a
    extends Record {
        private final List<dlt> a;
        final boolean b;

        a(List<dlt> $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public dlt a(int $$0) {
            int $$1 = this.a.size();
            if ($$1 == 0) {
                return dlt.l;
            }
            return this.a.get($$0 % $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "items;isResultSlot", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "items;isResultSlot", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "items;isResultSlot", "a", "b"}, this, $$0);
        }

        public List<dlt> a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }
    }
}

