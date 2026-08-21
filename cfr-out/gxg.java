/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class gxg {
    private final hiz a;
    private final hjh b;
    private final Predicate<hjc.a> c;
    private @Nullable zd d = null;
    private int e;
    private int f;
    private @Nullable yy g;

    public gxg(hjn $$0, Predicate<hjc.a> $$1) {
        this.a = $$0.b();
        this.b = new hjh($$0.a().b().leadingContextMessageCount());
        this.c = $$1;
        this.e = this.a.b();
    }

    public void a(int $$0, a $$1) {
        hjb $$3;
        int $$2 = 0;
        while ($$2 < $$0 && ($$3 = this.a.b(this.e)) != null) {
            hjc.a $$5;
            int $$4 = this.e--;
            if (!($$3 instanceof hjc.a) || ($$5 = (hjc.a)$$3).g().equals(this.g)) continue;
            if (this.a($$1, $$5)) {
                if (this.f > 0) {
                    $$1.a(yh.a("gui.chatSelection.fold", this.f));
                    this.f = 0;
                }
                $$1.a($$4, $$5);
                ++$$2;
            } else {
                ++this.f;
            }
            this.g = $$5.g();
        }
    }

    private boolean a(a $$0, hjc.a $$1) {
        yy $$2 = $$1.g();
        boolean $$3 = this.b.b($$2);
        if (this.c.test($$1)) {
            this.b.a($$2);
            if (this.d != null && !this.d.a($$2.k())) {
                $$0.a(yh.a("gui.chatSelection.join", new Object[]{$$1.f().name()}).a(l.o));
            }
            this.d = $$2.k();
            return true;
        }
        return $$3;
    }

    public static interface a {
        public void a(int var1, hjc.a var2);

        public void a(yh var1);
    }
}

