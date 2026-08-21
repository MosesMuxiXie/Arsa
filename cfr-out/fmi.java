/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public interface fmi {
    public static final iz[] a = new iz[]{iz.e, iz.f, iz.a, iz.b, iz.c, iz.d};

    public void a(iz var1, eoh var2, is var3, is var4, @dzq.b int var5, int var6);

    public void a(is var1, dzq var2, @Nullable fmj var3);

    public void a(eoh var1, is var2, dzq var3, @Nullable fmj var4, boolean var5);

    default public void a(is $$0, dzq $$1, @Nullable iz $$2, @Nullable fmj $$3) {
        for (iz $$4 : a) {
            if ($$4 == $$2) continue;
            this.a($$0.a($$4), $$1, null);
        }
    }

    public static void a(dwp $$0, iz $$1, is $$2, is $$3, eoh $$4, @dzq.b int $$5, int $$6) {
        eoh $$7 = $$0.a_($$2);
        if (($$5 & 0x80) != 0 && $$7.a(dzs.cT)) {
            return;
        }
        eoh $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.G_());
        dzq.a($$7, $$8, $$0, $$2, $$5, $$6);
    }

    public static void a(dwo $$0, eoh $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        try {
            $$1.a($$0, $$2, $$3, $$4, $$5);
        }
        catch (Throwable $$6) {
            m $$7 = m.a($$6, "Exception while updating neighbours");
            n $$8 = $$7.a("Block being updated");
            $$8.a("Source block type", () -> {
                try {
                    return String.format(Locale.ROOT, "ID #%s (%s // %s)", mi.e.b($$3), $$3.z(), $$3.getClass().getCanonicalName());
                }
                catch (Throwable $$1) {
                    return "ID #" + String.valueOf(mi.e.b($$3));
                }
            });
            n.a($$8, $$0, $$2, $$1);
            throw new v($$7);
        }
    }
}

