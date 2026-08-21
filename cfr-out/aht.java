/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aht
implements aay<adb> {
    public static final aao<xq, aht> a = aay.a(aht::a, aht::new);
    private final boolean b;
    private final List<ac> c;
    private final Set<amo> d;
    private final Map<amo, ae> e;
    private final boolean f;

    public aht(boolean $$0, Collection<ac> $$1, Set<amo> $$2, Map<amo, ae> $$3, boolean $$4) {
        this.b = $$0;
        this.c = List.copyOf($$1);
        this.d = Set.copyOf($$2);
        this.e = Map.copyOf($$3);
        this.f = $$4;
    }

    private aht(xq $$0) {
        this.b = $$0.readBoolean();
        this.c = (List)ac.b.decode($$0);
        this.d = (Set)((Object)$$0.a(Sets::newLinkedHashSetWithExpectedSize, wx::q));
        this.e = $$0.a(wx::q, ae::b);
        this.f = $$0.readBoolean();
    }

    @Override
    private void a(xq $$02) {
        $$02.a(this.b);
        ac.b.encode($$02, this.c);
        $$02.a(this.d, wx::a);
        $$02.a(this.e, wx::a, ($$0, $$1) -> $$1.a((wx)((Object)$$0)));
        $$02.a(this.f);
    }

    @Override
    public aba<aht> a() {
        return ahz.bk;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public List<ac> b() {
        return this.c;
    }

    public Set<amo> e() {
        return this.d;
    }

    public Map<amo, ae> f() {
        return this.e;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.f;
    }
}

