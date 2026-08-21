/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.List;

@FunctionalInterface
public interface bfr {
    public static final bfr a = $$0 -> true;

    public boolean accept(bfs var1);

    public static bfr codepoint(int $$0, zf $$1) {
        return $$2 -> $$2.accept(0, $$1, $$0);
    }

    public static bfr forward(String $$0, zf $$1) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$2 -> bhg.a($$0, $$1, $$2);
    }

    public static bfr forward(String $$0, zf $$1, Int2IntFunction $$2) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$3 -> bhg.a($$0, $$1, bfr.decorateOutput($$3, $$2));
    }

    public static bfr backward(String $$0, zf $$1) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$2 -> bhg.b($$0, $$1, $$2);
    }

    public static bfr backward(String $$0, zf $$1, Int2IntFunction $$2) {
        if ($$0.isEmpty()) {
            return a;
        }
        return $$3 -> bhg.b($$0, $$1, bfr.decorateOutput($$3, $$2));
    }

    public static bfs decorateOutput(bfs $$0, Int2IntFunction $$1) {
        return ($$2, $$3, $$4) -> $$0.accept($$2, $$3, (Integer)$$1.apply((Object)$$4));
    }

    public static bfr composite() {
        return a;
    }

    public static bfr composite(bfr $$0) {
        return $$0;
    }

    public static bfr composite(bfr $$0, bfr $$1) {
        return bfr.fromPair($$0, $$1);
    }

    public static bfr composite(bfr ... $$0) {
        return bfr.fromList((List<bfr>)ImmutableList.copyOf((Object[])$$0));
    }

    public static bfr composite(List<bfr> $$0) {
        int $$1 = $$0.size();
        switch ($$1) {
            case 0: {
                return a;
            }
            case 1: {
                return $$0.get(0);
            }
            case 2: {
                return bfr.fromPair($$0.get(0), $$0.get(1));
            }
        }
        return bfr.fromList((List<bfr>)ImmutableList.copyOf($$0));
    }

    public static bfr fromPair(bfr $$0, bfr $$1) {
        return $$2 -> $$0.accept($$2) && $$1.accept($$2);
    }

    public static bfr fromList(List<bfr> $$0) {
        return $$1 -> {
            for (bfr $$2 : $$0) {
                if ($$2.accept($$1)) continue;
                return false;
            }
            return true;
        };
    }
}

