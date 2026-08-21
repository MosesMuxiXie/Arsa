/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
import com.google.common.base.MoreObjects;
import java.util.Locale;
import java.util.Optional;
import org.apache.commons.lang3.exception.ExceptionUtils;

class tp
implements td {
    private int a = 0;
    private int b = 0;

    @Override
    public void a(ta $$0) {
        ++this.a;
    }

    private void a(ta $$0, tf $$1, boolean $$2) {
        tq $$3 = $$0.B();
        Object $$4 = String.format(Locale.ROOT, "[Run: %4d, Ok: %4d, Fail: %4d", this.a, this.b, this.a - this.b);
        if (!$$3.b()) {
            $$4 = (String)$$4 + String.format(Locale.ROOT, ", Left: %4d", $$3.d() - this.a);
        }
        $$4 = (String)$$4 + "]";
        String $$5 = String.valueOf($$0.b()) + " " + ($$2 ? "passed" : "failed") + "! " + $$0.l() + "ms";
        String $$6 = String.format(Locale.ROOT, "%-53s%s", $$4, $$5);
        if ($$2) {
            tp.a($$0, $$6);
        } else {
            tp.a($$0.g(), l.m, $$6);
        }
        if ($$3.a(this.a, this.b)) {
            $$1.a($$0);
        }
    }

    @Override
    public void a(ta $$0, tf $$1) {
        ++this.b;
        if ($$0.B().c()) {
            this.a($$0, $$1, true);
            return;
        }
        if (!$$0.y()) {
            tp.a($$0, String.valueOf($$0.b()) + " passed! (" + $$0.l() + "ms / " + $$0.p() + "gameticks)");
            return;
        }
        if (this.b >= $$0.A()) {
            tp.a($$0, String.valueOf($$0) + " passed " + this.b + " times of " + this.a + " attempts.");
        } else {
            tp.a($$0.g(), l.k, "Flaky test " + String.valueOf($$0) + " succeeded, attempt: " + this.a + " successes: " + this.b);
            $$1.a($$0);
        }
    }

    @Override
    public void b(ta $$0, tf $$1) {
        if (!$$0.y()) {
            tp.a($$0, $$0.n());
            if ($$0.B().c()) {
                this.a($$0, $$1, false);
            }
            return;
        }
        tb $$2 = $$0.v();
        String $$3 = "Flaky test " + String.valueOf($$0) + " failed, attempt: " + this.a + "/" + $$2.j();
        if ($$2.k() > 1) {
            $$3 = $$3 + ", successes: " + this.b + " (" + $$2.k() + " required)";
        }
        tp.a($$0.g(), l.o, $$3);
        if ($$0.z() - this.a + this.b >= $$0.A()) {
            $$1.a($$0);
        } else {
            tp.a($$0, new so(this.a, this.b, $$0));
        }
    }

    @Override
    public void a(ta $$0, ta $$1, tf $$2) {
        $$1.a(this);
    }

    public static void a(ta $$02, String $$1) {
        tp.b($$02).ifPresent($$0 -> $$0.y());
        tp.b($$02, $$1);
    }

    private static void b(ta $$0, String $$1) {
        tp.a($$0.g(), l.k, $$1);
        tl.b($$0);
    }

    protected static void a(ta $$0, Throwable $$12) {
        yw $$4;
        if ($$12 instanceof sr) {
            sr $$2 = (sr)$$12;
            yh $$3 = $$2.a();
        } else {
            $$4 = yh.b(bhs.c($$12));
        }
        tp.b($$0).ifPresent($$1 -> $$1.a($$4));
        tp.b($$0, $$12);
    }

    protected static void b(ta $$0, Throwable $$1) {
        String $$2 = $$1.getMessage() + (String)($$1.getCause() == null ? "" : " cause: " + bhs.c($$1.getCause()));
        String $$3 = ($$0.r() ? "" : "(optional) ") + String.valueOf($$0.b()) + " failed! " + $$2;
        tp.a($$0.g(), $$0.r() ? l.m : l.o, $$3);
        Throwable $$4 = (Throwable)MoreObjects.firstNonNull((Object)ExceptionUtils.getRootCause((Throwable)$$1), (Object)$$1);
        if ($$4 instanceof ss) {
            ss $$5 = (ss)$$4;
            $$0.f().a($$5.d(), $$5.b());
        }
        tl.a($$0);
    }

    private static Optional<emz> b(ta $$0) {
        axf $$12 = $$0.g();
        Optional<is> $$2 = Optional.ofNullable($$0.c());
        Optional<emz> $$3 = $$2.flatMap($$1 -> $$12.a((is)$$1, eld.V));
        return $$3;
    }

    protected static void a(axf $$02, l $$1, String $$22) {
        $$02.a((? super axg $$0) -> true).forEach($$2 -> $$2.a(yh.b($$22).a($$1)));
    }
}

