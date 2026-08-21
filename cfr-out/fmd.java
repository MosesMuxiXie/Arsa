/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fmd
implements fmi {
    private static final Logger b = LogUtils.getLogger();
    private final dwo c;
    private final int d;
    private final ArrayDeque<c> e = new ArrayDeque();
    private final List<c> f = new ArrayList<c>();
    private int g = 0;
    private @Nullable Consumer<is> h;

    public fmd(dwo $$0, int $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public void a(@Nullable Consumer<is> $$0) {
        this.h = $$0;
    }

    @Override
    public void a(iz $$0, eoh $$1, is $$2, is $$3, @dzq.b int $$4, int $$5) {
        this.a($$2, new d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
    }

    @Override
    public void a(is $$0, dzq $$1, @Nullable fmj $$2) {
        this.a($$0, new e($$0, $$1, $$2));
    }

    @Override
    public void a(eoh $$0, is $$1, dzq $$2, @Nullable fmj $$3, boolean $$4) {
        this.a($$1, new a($$0, $$1.j(), $$2, $$3, $$4));
    }

    @Override
    public void a(is $$0, dzq $$1, @Nullable iz $$2, @Nullable fmj $$3) {
        this.a($$0, new b($$0.j(), $$1, $$3, $$2));
    }

    private void a(is $$0, c $$1) {
        boolean $$2 = this.g > 0;
        boolean $$3 = this.d >= 0 && this.g >= this.d;
        ++this.g;
        if (!$$3) {
            if ($$2) {
                this.f.add($$1);
            } else {
                this.e.push($$1);
            }
        } else if (this.g - 1 == this.d) {
            b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: {}", (Object)$$0.y());
        }
        if (!$$2) {
            this.a();
        }
    }

    private void a() {
        try {
            block3: while (!this.e.isEmpty() || !this.f.isEmpty()) {
                for (int $$0 = this.f.size() - 1; $$0 >= 0; --$$0) {
                    this.e.push(this.f.get($$0));
                }
                this.f.clear();
                c $$1 = this.e.peek();
                if (this.h != null) {
                    $$1.a(this.h);
                }
                while (this.f.isEmpty()) {
                    if ($$1.a(this.c)) continue;
                    this.e.pop();
                    continue block3;
                }
            }
        }
        finally {
            this.e.clear();
            this.f.clear();
            this.g = 0;
        }
    }

    record d(iz a, eoh b, is c, is d, @dzq.b int e, int f) implements c
    {
        @Override
        public boolean a(dwo $$0) {
            fmi.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
            return false;
        }

        @Override
        public void a(Consumer<is> $$0) {
            $$0.accept(this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "direction;neighborState;pos;neighborPos;updateFlags;updateLimit", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "direction;neighborState;pos;neighborPos;updateFlags;updateLimit", "a", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "direction;neighborState;pos;neighborPos;updateFlags;updateLimit", "a", "b", "c", "d", "e", "f"}, this, $$0);
        }
    }

    static interface c {
        public boolean a(dwo var1);

        public void a(Consumer<is> var1);
    }

    record e(is a, dzq b, @Nullable fmj c) implements c
    {
        @Override
        public boolean a(dwo $$0) {
            eoh $$1 = $$0.a_(this.a);
            fmi.a($$0, $$1, this.a, this.b, this.c, false);
            return false;
        }

        @Override
        public void a(Consumer<is> $$0) {
            $$0.accept(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "pos;block;orientation", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "pos;block;orientation", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "pos;block;orientation", "a", "b", "c"}, this, $$0);
        }
    }

    record a(eoh a, is b, dzq c, @Nullable fmj d, boolean e) implements c
    {
        @Override
        public boolean a(dwo $$0) {
            fmi.a($$0, this.a, this.b, this.c, this.d, this.e);
            return false;
        }

        @Override
        public void a(Consumer<is> $$0) {
            $$0.accept(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "state;pos;block;orientation;movedByPiston", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "state;pos;block;orientation;movedByPiston", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "state;pos;block;orientation;movedByPiston", "a", "b", "c", "d", "e"}, this, $$0);
        }
    }

    static final class b
    implements c {
        private final is a;
        private final dzq b;
        private @Nullable fmj c;
        private final @Nullable iz d;
        private int e = 0;

        b(is $$0, dzq $$1, @Nullable fmj $$2, @Nullable iz $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            if (fmi.a[this.e] == $$3) {
                ++this.e;
            }
        }

        @Override
        public boolean a(dwo $$0) {
            iz $$1 = fmi.a[this.e++];
            is $$2 = this.a.a($$1);
            eoh $$3 = $$0.a_($$2);
            fmj $$4 = null;
            if ($$0.Q().b(dhb.c)) {
                if (this.c == null) {
                    this.c = fmf.a($$0, this.d == null ? null : this.d.g(), null);
                }
                $$4 = this.c.b($$1);
            }
            fmi.a($$0, $$3, $$2, this.b, $$4, false);
            if (this.e < fmi.a.length && fmi.a[this.e] == this.d) {
                ++this.e;
            }
            return this.e < fmi.a.length;
        }

        @Override
        public void a(Consumer<is> $$0) {
            for (iz $$1 : fmi.a) {
                if ($$1 == this.d) continue;
                is $$2 = this.a.a($$1);
                $$0.accept($$2);
            }
        }
    }
}

