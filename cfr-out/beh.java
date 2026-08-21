/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class beh {
    public static Map<amt<? extends jq<?>>, a> a(jk<anc> $$02) {
        return ju.b($$02).map($$0 -> Pair.of($$0.a(), (Object)beh.a($$0.b()))).filter($$0 -> !((a)$$0.getSecond()).a()).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
    }

    private static <T> a a(jq<T> $$0) {
        HashMap<amo, IntList> $$1 = new HashMap<amo, IntList>();
        $$0.l().forEach($$2 -> {
            IntArrayList $$3 = new IntArrayList($$2.b());
            for (jd $$4 : $$2) {
                if ($$4.f() != jd.b.a) {
                    throw new IllegalStateException("Can't serialize unregistered value " + String.valueOf($$4));
                }
                $$3.add($$0.a($$4.a()));
            }
            $$1.put($$2.h().b(), (IntList)$$3);
        });
        return new a($$1);
    }

    static <T> beg.c<T> a(jq<T> $$0, a $$1) {
        amt $$2 = $$0.g();
        HashMap $$32 = new HashMap();
        $$1.b.forEach(($$3, $$4) -> {
            bef $$5 = bef.a($$2, $$3);
            List $$6 = $$4.intStream().mapToObj($$0::c).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
            $$32.put($$5, $$6);
        });
        return new beg.c<T>($$2, $$32);
    }

    public static final class a {
        public static final a a = new a(Map.of());
        final Map<amo, IntList> b;

        a(Map<amo, IntList> $$0) {
            this.b = $$0;
        }

        public void a(wx $$0) {
            $$0.a(this.b, wx::a, wx::a);
        }

        public static a b(wx $$0) {
            return new a((Map<amo, IntList>)$$0.a(wx::q, wx::a));
        }

        public boolean a() {
            return this.b.isEmpty();
        }

        public int b() {
            return this.b.size();
        }

        public <T> beg.c<T> a(jq<T> $$0) {
            return beh.a($$0, this);
        }
    }
}

