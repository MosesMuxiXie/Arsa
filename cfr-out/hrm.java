/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class hrm<S extends elb>
implements eca.b<S, Int2IntFunction> {
    @Override
    public Int2IntFunction a(S $$0, S $$1) {
        return $$2 -> {
            int $$3 = hoh.a($$0.j(), $$0.aD_());
            int $$4 = hoh.a($$1.j(), $$1.aD_());
            int $$5 = hoj.a($$3);
            int $$6 = hoj.a($$4);
            int $$7 = hoj.b($$3);
            int $$8 = hoj.b($$4);
            return hoj.a(Math.max($$5, $$6), Math.max($$7, $$8));
        };
    }

    @Override
    public Int2IntFunction a(S $$02) {
        return $$0 -> $$0;
    }

    public Int2IntFunction a() {
        return $$0 -> $$0;
    }

    @Override
    public /* synthetic */ Object b() {
        return this.a();
    }
}

