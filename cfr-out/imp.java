/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.time.MonthDay;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class imp
extends bbe<List<yh>> {
    private static final zf d = zf.a.a(-256);
    public static final yh a = imp.a("Merry X-mas!");
    public static final yh b = imp.a("Happy new year!");
    public static final yh c = imp.a("OOoooOOOoooo! Spooky!");
    private static final amo e = amo.b("texts/splashes.txt");
    private static final bgr f = bgr.a();
    private List<yh> g = List.of();
    private final gfx h;

    public imp(gfx $$0) {
        this.h = $$0;
    }

    private static yh a(String $$0) {
        return yh.b($$0).b(d);
    }

    protected List<yh> a(baz $$02, bzm $$1) {
        List<yh> list;
        block8: {
            BufferedReader $$2 = gfj.V().ah().openAsReader(e);
            try {
                list = $$2.lines().map(String::trim).filter($$0 -> $$0.hashCode() != 125780783).map(imp::a).toList();
                if ($$2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$2 != null) {
                        try {
                            $$2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$3) {
                    return List.of();
                }
            }
            $$2.close();
        }
        return list;
    }

    @Override
    protected void a(List<yh> $$0, baz $$1, bzm $$2) {
        this.g = List.copyOf($$0);
    }

    public @Nullable gkm a() {
        MonthDay $$0 = bhd.a();
        if ($$0.equals(bhd.c)) {
            return gkm.a;
        }
        if ($$0.equals(bhd.d)) {
            return gkm.b;
        }
        if ($$0.equals(bhd.a)) {
            return gkm.c;
        }
        if (this.g.isEmpty()) {
            return null;
        }
        if (this.h != null && f.a(this.g.size()) == 42) {
            return new gkm(imp.a(this.h.c().toUpperCase(Locale.ROOT) + " IS YOU"));
        }
        return new gkm(this.g.get(f.a(this.g.size())));
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }
}

