/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class hue
implements hug.a {
    final gfj a;
    private double b = Double.MIN_VALUE;
    private final int c = 12;
    private @Nullable a d;

    public hue(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        double $$6 = bhs.d();
        if ($$6 - this.b > 3.0E9) {
            this.b = $$6;
            iqa $$7 = this.a.aa();
            this.d = $$7 != null ? new a(this, $$7, $$0, $$2) : null;
        }
        if (this.d != null) {
            Map $$8 = this.d.b.getNow(null);
            double $$9 = this.a.i.p().b().h * 0.85;
            for (Map.Entry<dvu, String> $$10 : this.d.a.entrySet()) {
                dvu $$11 = $$10.getKey();
                Object $$12 = $$10.getValue();
                if ($$8 != null) {
                    $$12 = (String)$$12 + (String)$$8.get($$11);
                }
                String[] $$13 = ((String)$$12).split("\n");
                int $$14 = 0;
                for (String $$15 : $$13) {
                    um.a($$15, new ftm(jw.a($$11.h, 8), $$9 + (double)$$14, jw.a($$11.i, 8)), ur.a.a().a(2.4f)).a();
                    $$14 -= 2;
                }
            }
        }
    }

    final class a {
        final Map<dvu, String> a;
        final CompletableFuture<Map<dvu, String>> b;

        a(hue hue2, iqa $$0, double $$1, double $$2) {
            hif $$3 = hue2.a.r;
            amt<dwo> $$4 = $$3.aq();
            int $$5 = jw.a($$1);
            int $$6 = jw.a($$2);
            ImmutableMap.Builder $$7 = ImmutableMap.builder();
            hhz $$8 = $$3.j();
            for (int $$9 = $$5 - 12; $$9 <= $$5 + 12; ++$$9) {
                for (int $$10 = $$6 - 12; $$10 <= $$6 + 12; ++$$10) {
                    dvu $$11 = new dvu($$9, $$10);
                    Object $$12 = "";
                    eqq $$13 = $$8.a($$9, $$10, false);
                    $$12 = (String)$$12 + "Client: ";
                    if ($$13 == null) {
                        $$12 = (String)$$12 + "0n/a\n";
                    } else {
                        $$12 = (String)$$12 + ($$13.F() ? " E" : "");
                        $$12 = (String)$$12 + "\n";
                    }
                    $$7.put((Object)$$11, $$12);
                }
            }
            this.a = $$7.build();
            this.b = $$0.a(() -> {
                axf $$4 = $$0.a($$4);
                if ($$4 == null) {
                    return ImmutableMap.of();
                }
                ImmutableMap.Builder $$5 = ImmutableMap.builder();
                axc $$6 = $$4.p();
                for (int $$7 = $$5 - 12; $$7 <= $$5 + 12; ++$$7) {
                    for (int $$8 = $$6 - 12; $$8 <= $$6 + 12; ++$$8) {
                        dvu $$9 = new dvu($$7, $$8);
                        $$5.put((Object)$$9, (Object)("Server: " + $$6.a($$9)));
                    }
                }
                return $$5.build();
            });
        }
    }
}

