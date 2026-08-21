/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class gmh {
    public static final int a = 105;
    public static final int b = 10;
    private static final int c = 5;
    private final gio d;
    private @Nullable bzk e;
    private String f = "root";
    private int g = 0;

    public gmh(gio $$0) {
        this.d = $$0;
    }

    public void a(@Nullable bzk $$0) {
        this.e = $$0;
    }

    public void a(int $$0) {
        this.g = $$0;
    }

    public void a(gir $$0) {
        if (this.e == null) {
            return;
        }
        List<bzo> $$1 = this.e.a(this.f);
        bzo $$2 = $$1.removeFirst();
        int $$3 = $$0.a() - 105 - 10;
        int $$4 = $$3 - 105;
        int $$5 = $$3 + 105;
        int $$6 = $$1.size() * this.d.b;
        int $$7 = $$0.b() - this.g - 5;
        int $$8 = $$7 - $$6;
        int $$9 = 62;
        int $$10 = $$8 - 62 - 5;
        $$0.a($$4 - 5, $$10 - 62 - 5, $$5 + 5, $$7 + 5, -1873784752);
        $$0.a($$1, $$4, $$10 - 62 + 10, $$5, $$10 + 62);
        DecimalFormat $$11 = new DecimalFormat("##0.00", DecimalFormatSymbols.getInstance(Locale.ROOT));
        String $$12 = bzk.b($$2.d);
        Object $$13 = "";
        if (!"unspecified".equals($$12)) {
            $$13 = (String)$$13 + "[0] ";
        }
        $$13 = $$12.isEmpty() ? (String)$$13 + "ROOT " : (String)$$13 + $$12 + " ";
        int $$14 = -1;
        int $$15 = $$10 - 62;
        $$0.b(this.d, (String)$$13, $$4, $$15, -1);
        $$13 = $$11.format($$2.b) + "%";
        $$0.b(this.d, (String)$$13, $$5 - this.d.b((String)$$13), $$15, -1);
        for (int $$16 = 0; $$16 < $$1.size(); ++$$16) {
            bzo $$17 = $$1.get($$16);
            StringBuilder $$18 = new StringBuilder();
            if ("unspecified".equals($$17.d)) {
                $$18.append("[?] ");
            } else {
                $$18.append("[").append($$16 + 1).append("] ");
            }
            Object $$19 = $$18.append($$17.d).toString();
            int $$20 = $$8 + $$16 * this.d.b;
            $$0.b(this.d, (String)$$19, $$4, $$20, $$17.a());
            $$19 = $$11.format($$17.a) + "%";
            $$0.b(this.d, (String)$$19, $$5 - 50 - this.d.b((String)$$19), $$20, $$17.a());
            $$19 = $$11.format($$17.b) + "%";
            $$0.b(this.d, (String)$$19, $$5 - this.d.b((String)$$19), $$20, $$17.a());
        }
    }

    public void b(int $$0) {
        if (this.e == null) {
            return;
        }
        List<bzo> $$1 = this.e.a(this.f);
        if ($$1.isEmpty()) {
            return;
        }
        bzo $$2 = $$1.remove(0);
        if ($$0 == 0) {
            int $$3;
            if (!$$2.d.isEmpty() && ($$3 = this.f.lastIndexOf(30)) >= 0) {
                this.f = this.f.substring(0, $$3);
            }
        } else if (--$$0 < $$1.size() && !"unspecified".equals($$1.get((int)$$0).d)) {
            if (!this.f.isEmpty()) {
                this.f = this.f + "\u001e";
            }
            this.f = this.f + $$1.get((int)$$0).d;
        }
    }
}

