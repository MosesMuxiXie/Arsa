/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public interface chc {
    public static final chc a = new chc(){

        @Override
        public void a(chd $$0) {
        }

        @Override
        public void a(chd $$0, Consumer<cgk> $$1) {
        }

        @Override
        public void b(chd $$0, Consumer<cgk> $$1) {
        }
    };

    public void a(chd var1);

    public void a(chd var1, Consumer<cgk> var2);

    public void b(chd var1, Consumer<cgk> var2);

    public static class a
    implements chc {
        private static final chd[] b = chd.values();
        private static final int c = -1;
        private final Set<chd> d = EnumSet.noneOf(chd.class);
        private final Map<chd, List<Consumer<cgk>>> e = bhs.a(chd.class, $$0 -> new ArrayList());
        private final Map<chd, List<Consumer<cgk>>> f = bhs.a(chd.class, $$0 -> new ArrayList());
        private final List<Consumer<cgk>> g = new ArrayList<Consumer<cgk>>();
        private int h = -1;

        public void a(int $$0) {
            if (this.h != $$0) {
                this.h = $$0;
                this.a();
            }
        }

        public void a(cgk $$0) {
            this.a();
            for (Consumer<cgk> $$1 : this.g) {
                if (!$$0.cb()) break;
                $$1.accept($$0);
            }
            this.g.clear();
            this.h = -1;
        }

        private void a() {
            for (chd $$0 : b) {
                List<Consumer<cgk>> $$1 = this.e.get((Object)$$0);
                this.g.addAll($$1);
                $$1.clear();
                if (this.d.remove((Object)$$0)) {
                    this.g.add($$0.a());
                }
                List<Consumer<cgk>> $$2 = this.f.get((Object)$$0);
                this.g.addAll($$2);
                $$2.clear();
            }
        }

        @Override
        public void a(chd $$0) {
            this.d.add($$0);
        }

        @Override
        public void a(chd $$0, Consumer<cgk> $$1) {
            this.e.get((Object)$$0).add($$1);
        }

        @Override
        public void b(chd $$0, Consumer<cgk> $$1) {
            this.f.get((Object)$$0).add($$1);
        }
    }
}

