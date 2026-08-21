/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 */
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class coq {
    private static final cqe a = new cqe(Integer.MAX_VALUE, new cop(){

        @Override
        public boolean b() {
            return false;
        }
    }){

        @Override
        public boolean h() {
            return false;
        }
    };
    private final Map<cop.a, cqe> b = new EnumMap<cop.a, cqe>(cop.a.class);
    private final Set<cqe> c = new ObjectLinkedOpenHashSet();
    private final EnumSet<cop.a> d = EnumSet.noneOf(cop.a.class);

    public void a(int $$0, cop $$1) {
        this.c.add(new cqe($$0, $$1));
    }

    public void a(Predicate<cop> $$0) {
        this.c.removeIf($$1 -> $$0.test($$1.k()));
    }

    public void a(cop $$0) {
        for (cqe $$12 : this.c) {
            if ($$12.k() != $$0 || !$$12.h()) continue;
            $$12.e();
        }
        this.c.removeIf($$1 -> $$1.k() == $$0);
    }

    private static boolean a(cqe $$0, EnumSet<cop.a> $$1) {
        for (cop.a $$2 : $$0.j()) {
            if (!$$1.contains((Object)$$2)) continue;
            return true;
        }
        return false;
    }

    private static boolean a(cqe $$0, Map<cop.a, cqe> $$1) {
        for (cop.a $$2 : $$0.j()) {
            if ($$1.getOrDefault((Object)$$2, a).a($$0)) continue;
            return false;
        }
        return true;
    }

    public void a() {
        bzm $$02 = bzl.a();
        $$02.a("goalCleanup");
        for (cqe $$1 : this.c) {
            if (!$$1.h() || !coq.a($$1, this.d) && $$1.c()) continue;
            $$1.e();
        }
        this.b.entrySet().removeIf($$0 -> !((cqe)$$0.getValue()).h());
        $$02.c();
        $$02.a("goalUpdate");
        for (cqe $$2 : this.c) {
            if ($$2.h() || coq.a($$2, this.d) || !coq.a($$2, this.b) || !$$2.b()) continue;
            for (cop.a $$3 : $$2.j()) {
                cqe $$4 = this.b.getOrDefault((Object)$$3, a);
                $$4.e();
                this.b.put($$3, $$2);
            }
            $$2.d();
        }
        $$02.c();
        this.a(true);
    }

    public void a(boolean $$0) {
        bzm $$1 = bzl.a();
        $$1.a("goalTick");
        for (cqe $$2 : this.c) {
            if (!$$2.h() || !$$0 && !$$2.X_()) continue;
            $$2.a();
        }
        $$1.c();
    }

    public Set<cqe> b() {
        return this.c;
    }

    public void a(cop.a $$0) {
        this.d.add($$0);
    }

    public void b(cop.a $$0) {
        this.d.remove((Object)$$0);
    }

    public void a(cop.a $$0, boolean $$1) {
        if ($$1) {
            this.b($$0);
        } else {
            this.a($$0);
        }
    }
}

