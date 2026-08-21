/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntLists
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class hw<T extends ef<T>>
implements ht<T> {
    private static final DecimalFormat a = bhs.a(new DecimalFormat("#", DecimalFormatSymbols.getInstance(Locale.ROOT)), (? super T $$0) -> $$0.setMaximumFractionDigits(15));
    private static final int b = 8;
    private final List<String> c;
    private final Object2ObjectLinkedOpenHashMap<List<String>, hv<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25f);
    private final amo e;
    private final List<a<T>> f;

    public hw(amo $$0, List<a<T>> $$1, List<String> $$2) {
        this.e = $$0;
        this.f = $$1;
        this.c = $$2;
    }

    @Override
    public amo a() {
        return this.e;
    }

    @Override
    public hv<T> a(@Nullable uz $$0, CommandDispatcher<T> $$1) throws eg {
        if ($$0 == null) {
            throw new eg(yh.a("commands.function.error.missing_arguments", yh.a(this.a())));
        }
        ArrayList<String> $$2 = new ArrayList<String>(this.c.size());
        for (String $$3 : this.c) {
            vz $$4 = $$0.a($$3);
            if ($$4 == null) {
                throw new eg(yh.a("commands.function.error.missing_argument", yh.a(this.a()), $$3));
            }
            $$2.add(hw.a($$4));
        }
        hv $$5 = (hv)this.d.getAndMoveToLast($$2);
        if ($$5 != null) {
            return $$5;
        }
        if (this.d.size() >= 8) {
            this.d.removeFirst();
        }
        hv<T> $$6 = this.a(this.c, $$2, $$1);
        this.d.put($$2, $$6);
        return $$6;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String a(vz $$0) {
        String string;
        vz vz2 = $$0;
        Objects.requireNonNull(vz2);
        vz vz3 = vz2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{vc.class, va.class, ux.class, vs.class, vh.class, vx.class}, (Object)vz3, n2)) {
            case 0: {
                float $$1;
                vc vc2 = (vc)vz3;
                try {
                    float f2;
                    $$1 = f2 = vc2.n();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                string = a.format($$1);
                return string;
            }
            case 1: {
                double $$2;
                va va2 = (va)vz3;
                {
                    double d2;
                    $$2 = d2 = va2.n();
                }
                string = a.format($$2);
                return string;
            }
            case 2: {
                byte $$3;
                ux ux2 = (ux)vz3;
                {
                    byte by2;
                    $$3 = by2 = ux2.n();
                }
                string = String.valueOf($$3);
                return string;
            }
            case 3: {
                short $$4;
                vs vs2 = (vs)vz3;
                {
                    short s2;
                    $$4 = s2 = vs2.n();
                }
                string = String.valueOf($$4);
                return string;
            }
            case 4: {
                long $$5;
                vh vh2 = (vh)vz3;
                {
                    long l2;
                    $$5 = l2 = vh2.n();
                }
                string = String.valueOf($$5);
                return string;
            }
            case 5: {
                vx vx2 = (vx)vz3;
                {
                    String string2;
                    String $$6;
                    string = $$6 = (string2 = vx2.k());
                    return string;
                }
            }
        }
        string = $$0.toString();
        return string;
    }

    private static void a(List<String> $$0, IntList $$1, List<String> $$22) {
        $$22.clear();
        $$1.forEach($$2 -> $$22.add((String)$$0.get($$2)));
    }

    private hv<T> a(List<String> $$0, List<String> $$12, CommandDispatcher<T> $$2) throws eg {
        ArrayList $$3 = new ArrayList(this.f.size());
        ArrayList<String> $$4 = new ArrayList<String>($$12.size());
        for (a<T> $$5 : this.f) {
            hw.a($$12, $$5.a(), $$4);
            $$3.add($$5.a($$4, $$2, this.e));
        }
        return new hx(this.a().a($$1 -> $$1 + "/" + $$0.hashCode()), $$3);
    }

    static interface a<T> {
        public IntList a();

        public hk<T> a(List<String> var1, CommandDispatcher<T> var2, amo var3) throws eg;
    }

    static class b<T extends ef<T>>
    implements a<T> {
        private final hy a;
        private final IntList b;
        private final T c;

        public b(hy $$0, IntList $$1, T $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public IntList a() {
            return this.b;
        }

        @Override
        public hk<T> a(List<String> $$0, CommandDispatcher<T> $$1, amo $$2) throws eg {
            String $$3 = this.a.a($$0);
            try {
                return ht.a($$1, this.c, new StringReader($$3));
            }
            catch (CommandSyntaxException $$4) {
                throw new eg(yh.a("commands.function.error.parse", yh.a($$2), $$3, $$4.getMessage()));
            }
        }
    }

    static class c<T>
    implements a<T> {
        private final hk<T> a;

        public c(hk<T> $$0) {
            this.a = $$0;
        }

        @Override
        public IntList a() {
            return IntLists.emptyList();
        }

        @Override
        public hk<T> a(List<String> $$0, CommandDispatcher<T> $$1, amo $$2) {
            return this.a;
        }
    }
}

