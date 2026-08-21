/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.joml.Vector3f
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joml.Vector3f;

public class igi {
    private final fzm a = new fzm();

    public void a(hpn $$02, hon.a $$1, hoq $$2, hon.a $$3) {
        b $$4 = $$02.l();
        this.a($$1, $$2, $$4.a, $$3);
        $$4.b.sort(Comparator.comparingDouble($$0 -> -$$0.c().lengthSquared()));
        this.a($$1, $$2, $$4.b, $$3);
    }

    private void a(hon.a $$0, hoq $$1, List<hpp.m<?>> $$2, hon.a $$3) {
        for (hpp.m<?> $$4 : $$2) {
            this.a($$4.a(), $$4.b(), $$0.a($$4.b()), $$1, $$3);
        }
    }

    private void a(hon.a $$0, hoq $$1, Map<ijs, List<hpp.h<?>>> $$2, hon.a $$3) {
        Set<Map.Entry<ijs, List<hpp.h<?>>>> $$6;
        if (w.y) {
            ArrayList $$4 = new ArrayList($$2.entrySet());
            Collections.shuffle($$4);
            ArrayList $$5 = $$4;
        } else {
            $$6 = $$2.entrySet();
        }
        for (Map.Entry entry : $$6) {
            fzp $$8 = $$0.a((ijs)entry.getKey());
            for (hpp.h $$9 : (List)entry.getValue()) {
                this.a($$9, (ijs)entry.getKey(), $$8, $$1, $$3);
            }
        }
    }

    private <S> void a(hpp.h<S> $$0, ijs $$1, fzp $$2, hoq $$3, hon.a $$4) {
        this.a.a();
        this.a.c().a($$0.a());
        gzp<S> $$5 = $$0.b();
        fzp $$6 = $$0.g() == null ? $$2 : $$0.g().a($$2);
        $$5.a($$0.c());
        $$5.a(this.a, $$6, $$0.d(), $$0.e(), $$0.f());
        if ($$0.h() != 0 && ($$1.d().isPresent() || $$1.e())) {
            $$3.a($$0.h());
            fzp $$7 = $$3.a($$1);
            $$5.a(this.a, $$0.g() == null ? $$7 : $$0.g().a($$7), $$0.d(), $$0.e(), $$0.f());
        }
        if ($$0.i() != null && $$1.g()) {
            fzn $$8 = new fzn($$4.a(inx.n.get($$0.i().a())), $$0.i().b(), 1.0f);
            $$5.a(this.a, $$0.g() == null ? $$8 : $$0.g().a($$8), $$0.d(), $$0.e(), $$0.f());
        }
        this.a.b();
    }

    public static class b {
        final Map<ijs, List<hpp.h<?>>> a = new HashMap();
        final List<hpp.m<?>> b = new ArrayList();
        private final Set<ijs> c = new ObjectOpenHashSet();

        public void a(ijs $$02, hpp.h<?> $$1) {
            if ($$02.f().getBlendFunction().isEmpty()) {
                this.a.computeIfAbsent($$02, $$0 -> new ArrayList()).add($$1);
            } else {
                Vector3f $$2 = $$1.a().a().transformPosition(new Vector3f());
                this.b.add(new hpp.m($$1, $$02, $$2));
            }
        }

        public void a() {
            this.b.clear();
            for (Map.Entry<ijs, List<hpp.h<?>>> $$0 : this.a.entrySet()) {
                List<hpp.h<?>> $$1 = $$0.getValue();
                if ($$1.isEmpty()) continue;
                this.c.add($$0.getKey());
                $$1.clear();
            }
        }

        public void b() {
            this.a.keySet().removeIf($$0 -> !this.c.contains($$0));
            this.c.clear();
        }
    }

    public record a(int a, fzm.a b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "progress;cameraPose", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "progress;cameraPose", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "progress;cameraPose", "a", "b"}, this, $$0);
        }
    }
}

