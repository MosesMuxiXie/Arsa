/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public abstract class dvo {
    private static final yh a = yh.b("@");
    private static final int b = -1;
    private long c = -1L;
    private boolean d = true;
    private int e;
    private boolean f = true;
    @Nullable yh g;
    private String h = "";
    private @Nullable yh i;

    public int b() {
        return this.e;
    }

    public void a(int $$0) {
        this.e = $$0;
    }

    public yh c() {
        return this.g == null ? yg.a : this.g;
    }

    public void a(fns $$0) {
        $$0.a("Command", this.h);
        $$0.a("SuccessCount", this.e);
        $$0.b("CustomName", yj.a, this.i);
        $$0.a("TrackOutput", this.f);
        if (this.f) {
            $$0.b("LastOutput", yj.a, this.g);
        }
        $$0.a("UpdateLastExecution", this.d);
        if (this.d && this.c != -1L) {
            $$0.a("LastExecution", this.c);
        }
    }

    public void a(fnq $$0) {
        this.h = $$0.a("Command", "");
        this.e = $$0.a("SuccessCount", 0);
        this.a(elb.a($$0, "CustomName"));
        this.f = $$0.a("TrackOutput", true);
        this.g = this.f ? elb.a($$0, "LastOutput") : null;
        this.d = $$0.a("UpdateLastExecution", true);
        this.c = this.d ? $$0.a("LastExecution", -1L) : -1L;
    }

    public void a(String $$0) {
        this.h = $$0;
        this.e = 0;
    }

    public String d() {
        return this.h;
    }

    public boolean b(axf $$02) {
        if ($$02.au() == this.c) {
            return false;
        }
        if ("Searge".equalsIgnoreCase(this.h)) {
            this.g = yh.b("#itzlipofutzli");
            this.e = 1;
            return true;
        }
        this.e = 0;
        if ($$02.Y() && !bhi.b(this.h)) {
            try {
                this.g = null;
                try (a $$12 = this.c($$02);){
                    ec $$2 = Objects.requireNonNullElse($$12, ec.a);
                    ed $$3 = this.a($$02, $$2).a((boolean $$0, int $$1) -> {
                        if ($$0) {
                            ++this.e;
                        }
                    });
                    $$02.s().aF().a($$3, this.h);
                }
            }
            catch (Throwable $$4) {
                m $$5 = m.a($$4, "Executing command block");
                n $$6 = $$5.a("Command to be executed");
                $$6.a("Command", this::d);
                $$6.a("Name", () -> this.e().getString());
                throw new v($$5);
            }
        }
        this.c = this.d ? $$02.au() : -1L;
        return true;
    }

    private @Nullable a c(axf $$0) {
        return this.f ? new a($$0) : null;
    }

    public yh e() {
        return this.i != null ? this.i : a;
    }

    public @Nullable yh f() {
        return this.i;
    }

    public void a(@Nullable yh $$0) {
        this.i = $$0;
    }

    public abstract void a(axf var1);

    public void b(@Nullable yh $$0) {
        this.g = $$0;
    }

    public void a(boolean $$0) {
        this.f = $$0;
    }

    public boolean g() {
        return this.f;
    }

    public abstract ed a(axf var1, ec var2);

    public abstract boolean a();

    protected class a
    implements ec,
    AutoCloseable {
        private final axf c;
        private static final DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ROOT);
        private boolean e;

        protected a(axf $$1) {
            this.c = $$1;
        }

        @Override
        public boolean x_() {
            return !this.e && this.c.U().a(eua.R) != false;
        }

        @Override
        public boolean y_() {
            return !this.e;
        }

        @Override
        public boolean c() {
            return !this.e && this.c.U().a(eua.g) != false;
        }

        @Override
        public void a(yh $$0) {
            if (!this.e) {
                dvo.this.g = yh.b("[" + d.format(ZonedDateTime.now()) + "] ").b($$0);
                dvo.this.a(this.c);
            }
        }

        @Override
        public void close() throws Exception {
            this.e = true;
        }
    }
}

