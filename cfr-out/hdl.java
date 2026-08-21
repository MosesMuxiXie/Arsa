/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class hdl {
    private static final Set<iz> a = EnumSet.allOf(iz.class);
    private final List<hdj> b = Lists.newArrayList();
    private int c;
    private int d;
    private boolean e;

    public hdl a(int $$0, int $$1) {
        this.c = $$0;
        this.d = $$1;
        return this;
    }

    public hdl a() {
        return this.a(true);
    }

    public hdl a(boolean $$0) {
        this.e = $$0;
        return this;
    }

    public hdl a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, hdk $$7, int $$8, int $$9) {
        this.a($$8, $$9);
        this.b.add(new hdj($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public hdl a(String $$0, float $$1, float $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        this.a($$7, $$8);
        this.b.add(new hdj($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, hdk.a, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public hdl a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        this.b.add(new hdj(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, hdk.a, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public hdl a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, Set<iz> $$6) {
        this.b.add(new hdj(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, hdk.a, this.e, 1.0f, 1.0f, $$6));
        return this;
    }

    public hdl a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
        this.b.add(new hdj($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, hdk.a, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public hdl a(String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, hdk $$7) {
        this.b.add(new hdj($$0, this.c, this.d, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public hdl a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, boolean $$6) {
        this.b.add(new hdj(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, hdk.a, $$6, 1.0f, 1.0f, a));
        return this;
    }

    public hdl a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, hdk $$6, float $$7, float $$8) {
        this.b.add(new hdj(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, $$7, $$8, a));
        return this;
    }

    public hdl a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, hdk $$6) {
        this.b.add(new hdj(null, this.c, this.d, $$0, $$1, $$2, $$3, $$4, $$5, $$6, this.e, 1.0f, 1.0f, a));
        return this;
    }

    public List<hdj> b() {
        return ImmutableList.copyOf(this.b);
    }

    public static hdl c() {
        return new hdl();
    }
}

