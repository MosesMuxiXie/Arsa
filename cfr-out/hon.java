/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import org.jspecify.annotations.Nullable;

public interface hon {
    public static a a(fzi $$0) {
        return hon.a((SequencedMap<ijs, fzi>)Object2ObjectSortedMaps.emptyMap(), $$0);
    }

    public static a a(SequencedMap<ijs, fzi> $$0, fzi $$1) {
        return new a($$1, $$0);
    }

    public fzp a(ijs var1);

    public static class a
    implements hon {
        protected final fzi a;
        protected final SequencedMap<ijs, fzi> b;
        protected final Map<ijs, fzh> c = new HashMap<ijs, fzh>();
        protected @Nullable ijs d;

        protected a(fzi $$0, SequencedMap<ijs, fzi> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public fzp a(ijs $$0) {
            fzh $$1 = this.c.get($$0);
            if ($$1 != null && !$$0.h()) {
                this.a($$0, $$1);
                $$1 = null;
            }
            if ($$1 != null) {
                return $$1;
            }
            fzi $$2 = (fzi)this.b.get($$0);
            if ($$2 != null) {
                $$1 = new fzh($$2, $$0.c(), $$0.b());
            } else {
                if (this.d != null) {
                    this.b(this.d);
                }
                $$1 = new fzh(this.a, $$0.c(), $$0.b());
                this.d = $$0;
            }
            this.c.put($$0, $$1);
            return $$1;
        }

        public void a() {
            if (this.d != null) {
                this.b(this.d);
                this.d = null;
            }
        }

        public void b() {
            this.a();
            for (ijs $$0 : this.b.keySet()) {
                this.b($$0);
            }
        }

        public void b(ijs $$0) {
            fzh $$1 = this.c.remove($$0);
            if ($$1 != null) {
                this.a($$0, $$1);
            }
        }

        private void a(ijs $$0, fzh $$1) {
            fzl $$2 = $$1.a();
            if ($$2 != null) {
                if ($$0.i()) {
                    fzi $$3 = this.b.getOrDefault($$0, this.a);
                    $$2.a($$3, RenderSystem.getProjectionType().a());
                }
                $$0.a($$2);
            }
            if ($$0.equals(this.d)) {
                this.d = null;
            }
        }
    }
}

